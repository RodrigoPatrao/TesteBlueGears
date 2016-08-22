package br.rodrigo.view;

/*                          APLICAÇÃO PRINCIPAL
*       Implementa um JFrame que contém os demais elementos da aplicação.
*       Também é responsável por chamar os métodos para a geração da lista de Itens,
*       bem como os métodos para inserção de data, hora e seleção quando um item da
*       lista é selecionado.
*       O form foi montado usando o gerador de form do Netbeans.
 */
import br.rodrigo.controller.ItemController;
import br.rodrigo.model.Item;
import br.rodrigo.model.ItemTableModel;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Principal extends javax.swing.JFrame {

    private final List<Item> lista = new ItemController().constroiListaDeItens();
    private final ItemTableModel tbm = new ItemTableModel(lista);
    private final ItemController itC = new ItemController();
    private final SimpleDateFormat sdfData = new SimpleDateFormat("dd/MM/yyyy");
    private final SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm:ss");

    public Principal() {
        initComponents();
        listaDeItens.setModel(tbm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAplicacao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDeItens = new javax.swing.JTable();
        imagemItem = new javax.swing.JLabel();
        lblNomeItem = new javax.swing.JLabel();
        lnlDescricaoItem = new javax.swing.JLabel();
        lblSelecaoItem = new javax.swing.JLabel();
        lblDataSelecaoItem = new javax.swing.JLabel();
        lblHoraSelecaoItem = new javax.swing.JLabel();
        nomeItem = new javax.swing.JTextField();
        selecaoItem = new javax.swing.JTextField();
        dataSelecaoItem = new javax.swing.JTextField();
        horaSelecaoItem = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descricaoItem = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teste BlueGears");
        setMaximumSize(new java.awt.Dimension(650, 480));
        setMinimumSize(new java.awt.Dimension(650, 480));
        setPreferredSize(new java.awt.Dimension(650, 480));
        setResizable(false);

        lblAplicacao.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblAplicacao.setText("LISTA DE ITENS");

        jScrollPane1.setMaximumSize(new java.awt.Dimension(616, 200));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(616, 200));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(616, 200));

        listaDeItens.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        listaDeItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        listaDeItens.setFillsViewportHeight(true);
        listaDeItens.setRowHeight(30);
        listaDeItens.setRowMargin(5);
        listaDeItens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaDeItensMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaDeItens);

        imagemItem.setMaximumSize(new java.awt.Dimension(100, 100));
        imagemItem.setMinimumSize(new java.awt.Dimension(100, 100));
        imagemItem.setPreferredSize(new java.awt.Dimension(100, 100));

        lblNomeItem.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblNomeItem.setText("Nome:");

        lnlDescricaoItem.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lnlDescricaoItem.setText("Descrição:");

        lblSelecaoItem.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblSelecaoItem.setText("Selecionado:");

        lblDataSelecaoItem.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblDataSelecaoItem.setText("Data:");

        lblHoraSelecaoItem.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblHoraSelecaoItem.setText("Hora:");

        nomeItem.setEditable(false);
        nomeItem.setMaximumSize(new java.awt.Dimension(120, 27));
        nomeItem.setMinimumSize(new java.awt.Dimension(120, 27));
        nomeItem.setPreferredSize(new java.awt.Dimension(120, 27));

        selecaoItem.setEditable(false);
        selecaoItem.setMaximumSize(new java.awt.Dimension(60, 27));
        selecaoItem.setMinimumSize(new java.awt.Dimension(60, 27));
        selecaoItem.setPreferredSize(new java.awt.Dimension(60, 27));

        dataSelecaoItem.setEditable(false);
        dataSelecaoItem.setMaximumSize(new java.awt.Dimension(120, 27));
        dataSelecaoItem.setMinimumSize(new java.awt.Dimension(120, 27));
        dataSelecaoItem.setPreferredSize(new java.awt.Dimension(120, 27));

        horaSelecaoItem.setEditable(false);
        horaSelecaoItem.setPreferredSize(new java.awt.Dimension(120, 27));

        descricaoItem.setColumns(20);
        descricaoItem.setRows(5);
        jScrollPane2.setViewportView(descricaoItem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagemItem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lnlDescricaoItem, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSelecaoItem, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDataSelecaoItem, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHoraSelecaoItem, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNomeItem, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(dataSelecaoItem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(selecaoItem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(horaSelecaoItem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAplicacao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblAplicacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nomeItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeItem, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lnlDescricaoItem)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selecaoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSelecaoItem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dataSelecaoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDataSelecaoItem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(horaSelecaoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHoraSelecaoItem)))
                    .addComponent(imagemItem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listaDeItensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaDeItensMouseClicked
        int linha = listaDeItens.getSelectedRow();
        String nome = tbm.getValueAt(linha, 0).toString();
        Boolean selec = tbm.getItem(linha).getSelec();
        Date data = Calendar.getInstance().getTime();
        if (selec == true) {
            Item i = itC.buscaItemPorNome(nome);
            i.setDataSel(sdfData.format(data));
            i.setHoraSel(sdfHora.format(data));
            i.setSelec(true);
            itC.atualizaItemNoBanco(i);
            preencherDescricaoDoItem(i);

        } else {
            Item i = itC.buscaItemPorNome(nome);
            i.setDataSel("");
            i.setHoraSel("");
            i.setSelec(false);
            itC.atualizaItemNoBanco(i);
            preencherDescricaoDoItem(i);

        }
    }//GEN-LAST:event_listaDeItensMouseClicked

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    //<editor-fold defaultstate="collapsed" desc="Declaração de Variáveis">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dataSelecaoItem;
    private javax.swing.JTextArea descricaoItem;
    private javax.swing.JTextField horaSelecaoItem;
    private javax.swing.JLabel imagemItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAplicacao;
    private javax.swing.JLabel lblDataSelecaoItem;
    private javax.swing.JLabel lblHoraSelecaoItem;
    private javax.swing.JLabel lblNomeItem;
    private javax.swing.JLabel lblSelecaoItem;
    public javax.swing.JTable listaDeItens;
    private javax.swing.JLabel lnlDescricaoItem;
    private javax.swing.JTextField nomeItem;
    private javax.swing.JTextField selecaoItem;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>

    private void preencherDescricaoDoItem(Item i) {
        nomeItem.setText(i.getNome());
        descricaoItem.setText(i.getDescricao());
        if (i.getSelec()) {
            selecaoItem.setText("Sim");
        } else {
            selecaoItem.setText("Não");
        }
        dataSelecaoItem.setText(i.getDataSel());
        horaSelecaoItem.setText(i.getHoraSel());
        try {
            URL urlImg = new URL(i.getFoto());
            ImageIcon img = new ImageIcon(urlImg);
            imagemItem.setIcon(new ImageIcon(img.getImage().getScaledInstance(imagemItem.getWidth(), imagemItem.getHeight(), Image.SCALE_DEFAULT)));
        } catch (MalformedURLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
