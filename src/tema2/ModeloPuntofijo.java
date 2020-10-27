
package tema2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloPuntofijo extends AbstractTableModel {
    
    private String []columnas={"i", "Xo", "Xi", "Error"};
    private ArrayList<csFilaPuntoFijo> lista;

    public ModeloPuntofijo() {
        
    }

    public ModeloPuntofijo(ArrayList<csFilaPuntoFijo> lista) {
        this.lista = lista;
    }
    
    
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return this.lista.size();
    
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return this.columnas.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    switch(columna){
        case 0: return this.lista.get(fila).getIter();
        case 1: return this.lista.get(fila).getXo();
        case 2: return this.lista.get(fila).getFxo();
        case 3: return this.lista.get(fila).getError();
        default: return null;
        
    }
    }
     @Override
    public String getColumnName(int i) {
        //return super.getColumnName(i); //To change body of generated methods, choose Tools | Templates.
      return this.columnas[i];
    }
    
}
