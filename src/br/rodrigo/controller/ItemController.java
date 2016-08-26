package br.rodrigo.controller;

/*                      CLASSE DE CONTROLE DA APLICAÇÃO
*       Esta classe contém os métodos responsáveis pelo funcionamento do aplicativo.
*/

import br.rodrigo.model.Item;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class ItemController {
    
    EntityManager em = JPAController.getEntityManager();
    EntityTransaction tx = em.getTransaction();

    //Construção da Lista de Itens a partir da URL JSON fornecida.
    public List<Item> constroiListaDeItens(){
        List<Item> lista = new ArrayList<>();
        try {
            JsonParser parser = new JsonParser();
            URL url = new URL("http://bpixel.com.br/teste/itens.json");
            Reader reader = new InputStreamReader(url.openStream());
            JsonObject jsonObjeto = (JsonObject) parser.parse(reader);
            JsonArray arrItens = jsonObjeto.getAsJsonArray("itens");
            for (JsonElement arrIten : arrItens) {
                Gson g = new Gson();
                Item i = g.fromJson(arrIten, Item.class);
                lista.add(i);
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        gravaListaNoBanco(lista);
        List<Item> listaFinal = recuperaListaDoBanco();
        return listaFinal;
    }
    
    //Gravação da Lista no BD.
    public void gravaListaNoBanco(List<Item> lista) {
        for (Item it : lista) {
            Query qry = em.createQuery("SELECT i FROM Item i WHERE i.nome = :nome");
            qry.setParameter("nome", it.getNome());
            List<Item> resQuery = qry.getResultList();
            if (resQuery.isEmpty()) {
                tx.begin();
                em.persist(it);
                tx.commit();
            }
        }
    }
    
    //Geração da Lista que é fornecida ao Modelo de Tabela para exibição.
    private List<Item> recuperaListaDoBanco() {
        Query qry = em.createQuery("SELECT i FROM Item i");
        tx.begin();
        List<Item> lista = qry.getResultList();
        tx.commit();
        return lista;
    }
    
    //Recupera um item da lista a partir do nome
    public Item buscaItemPorNome(String nome){
        Query qry = em.createQuery("SELECT i FROM Item i WHERE i.nome = :nome");
        qry.setParameter("nome", nome);
        tx.begin();
        Item resp = (Item)qry.getSingleResult();
        tx.commit();
        return resp;
    }

    //Inserção de data, hora e seleção no registro do Item selecionado na tabela.
    public void atualizaItemNoBanco(Item i) {
        Query qry = em.createQuery("SELECT i FROM Item i WHERE i.nome = :nome");
        qry.setParameter("nome", i.getNome());
        Item atualizar = (Item) qry.getSingleResult();
        atualizar.setDataSel(i.getDataSel());
        atualizar.setHoraSel(i.getHoraSel());
        atualizar.setSelec(i.getSelec());
        tx.begin();
        em.merge(atualizar);
        tx.commit();
    }
}
