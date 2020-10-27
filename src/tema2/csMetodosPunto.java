package tema2;

import java.util.ArrayList;

public class csMetodosPunto {

    /////////////////////////////////////////////////////////////////////////
    public ArrayList<csFilaPuntoFijo> Punto(double xo, double errorDeseado, int iteraciones) {

        double fxi = this.funcion2(xo);
        double errorCalculado = 1;
        double xanterior; //Variable que clona a la variable Xi

        ArrayList<csFilaPuntoFijo> lista;

        int i = 1; //Contador
        lista = new ArrayList<csFilaPuntoFijo>();
        while (i < iteraciones && errorCalculado > errorDeseado) {
            csFilaPuntoFijo fila = new csFilaPuntoFijo();
            fila.setIter(i); //Asignar contador a primera columna titulo
            fila.setXo(xo); //Asignar el parametro del metodo a Xo
            fila.setFxo(this.funcion2(fila.getXo()));
            //xanterior = fxi; //Clonar el calculo de Fxi a xanterior
            xo = fila.getFxo(); //Darle el nuevo valor de          
            if (i > 1) {
                //fila.setXo(xanterior);       
                errorCalculado = Math.abs((this.funcion2(fila.getXo()) - fila.getXo()) / this.funcion2(fila.getXo()));
                fila.setError(errorCalculado);
            } else {
                fila.setError(errorCalculado);
            }
            lista.add(fila);
            //System.out.println;
            i++;
            
        }
        return lista;
    }
    //////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////
    public double funcion2(double x) {
        return Math.pow(2.7182818284590452353602874713527, -x);
    }

}
