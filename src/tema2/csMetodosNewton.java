package tema2;

import java.util.ArrayList;

public class csMetodosNewton {

    /////////////////////////////////////////////////////////////////////////
    public ArrayList<csFilaNewton> Newton(double xo, double errorDeseado) {

        //double fxo = this.funNormal(xo);
        //double fxdo = this.funDerivado(xo);
        double errorCalculado = 1;
        double xanterior; //Variable que clona a la variable Xi

        ArrayList<csFilaNewton> lista;

        int i = 1; //Contador
        lista = new ArrayList<csFilaNewton>();
        while (errorCalculado > errorDeseado) {
            csFilaNewton fila = new csFilaNewton();
            fila.setI(i); //Asignar contador a primera columna titulo
            fila.setXo(xo); //Asignar el parametro del metodo a Xo
            double fxo = this.funNormal(fila.getXo());
            double fxdo = this.funDerivado(fila.getXo());
            fila.setFxo(fxo); //Asignar la funcion normal
            fila.setFxdo(fxdo); //Asignar la funcion derivada
            fila.setXimas(fila.getXo() - (fxo / fxdo)); //Asignar la division de F(x)/F´(x)
            xanterior = fila.getXo(); //Clonar el calculo de Fxi a xanterior
            xo = fila.getXimas(); //Darle el nuevo valor de          
            if (i > 1) {
                //fila.setXo(xanterior);       
                errorCalculado = Math.abs((fila.getXimas() - fila.getXo()) / fila.getXimas());
                fila.setError(errorCalculado);

            } else {
                fila.setError(errorCalculado);
            }
            lista.add(fila);
            i++;
        }
        if (errorCalculado < errorDeseado) {
            return lista;
        } else {
            return null;
        }

    }
    //////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////
    public double funNormal(double x) {
        return Math.pow(2.7182818284590452353602874713527, -x) - x;
    }

    public double funDerivado(double x) {
        return -Math.pow(2.7182818284590452353602874713527, -x) - 1;
    }

}
