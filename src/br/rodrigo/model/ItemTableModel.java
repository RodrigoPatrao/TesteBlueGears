package br.rodrigo.model;

//Modelo de Tabela para a população da tabela de Itens. 

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ItemTableModel extends AbstractTableModel{
    
    private List<Item> linhas;
    private String[] colunas = new String[]{"Nome", "Selecionar"};
    private static final int NOME=0;
    private static final int SELE=1;
    
    public ItemTableModel(){linhas = new ArrayList<>();}
    public ItemTableModel(List<Item> lista){linhas = new ArrayList<>(lista);}

    @Override
    public int getRowCount() {return linhas.size();}

    @Override
    public int getColumnCount() {return colunas.length;}
    
    @Override
    public String getColumnName(int columnIndex) {return colunas[columnIndex];}
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {return columnIndex == SELE;}
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case NOME:
                return String.class;
            case SELE:
                return Boolean.class;
            default:
                throw new IndexOutOfBoundsException("Índice de coluna fora de escopo");
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Item i = linhas.get(rowIndex);
        switch(columnIndex){
            case NOME:
                return i.getNome();
            case SELE:
                return i.getSelec();
            default:
                throw new IndexOutOfBoundsException("Índice de coluna fora de escopo");
        }
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Item i = linhas.get(rowIndex);
        switch (columnIndex) {
            case NOME:
                i.setNome((String) aValue);
                break;
            case SELE:
                i.setSelec((Boolean) aValue);
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    
    public Item getItem(int indiceLinha){return linhas.get(indiceLinha);}
}
