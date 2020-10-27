/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

/**
 *
 * @author ana8e
 */
public class csFilaPuntoFijo {
    private double xo;
    private double error;
    private double iter;
    private double Fxo;
    

    public double getFxo() {
        return Fxo;
    }

    public void setFxo(double Fxo) {
        this.Fxo = Fxo;
    }

    @Override
    public String toString() {
        return "csFilaPuntoFijo{" + "xo=" + xo + ", error=" + error + ", iter=" + iter + ", Fxo=" + Fxo + '}';
    }
    

    

    public double getXo() {
        return xo;
    }

    public void setXo(double xo) {
        this.xo = xo;
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }

    public double getIter() {
        return iter;
    }

    public void setIter(double iter) {
        this.iter = iter;
    }
    
    
}//fin clase 
