package br.rodrigo.model;

//Classe de Entidade de Persistência no Banco de Dados. Utiliza JPA.
//Responsável por gravar a lista de Itens no BD;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item implements Serializable {

    //Atributos
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String foto;
    private String nome;
    private String descricao;
    private String dataSel;
    private String horaSel;
    private Boolean selec;

    //Getters e Setters
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getFoto() {return foto;}
    public void setFoto(String foto) {this.foto = foto;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}
    public String getDataSel() {return dataSel;}
    public void setDataSel(String dataSel) {this.dataSel = dataSel;}
    public String getHoraSel() {return horaSel;}
    public void setHoraSel(String horaSel) {this.horaSel = horaSel;}
    public Boolean getSelec() {return selec;}
    public void setSelec(Boolean selec) {this.selec = selec;}

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        return !((this.id == null && other.id != null) 
                || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "br.rodrigo.model.Item[ id=" + id + " ]";
    }

}
