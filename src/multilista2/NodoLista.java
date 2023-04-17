package multilista2;

import java.io.Serializable;

public class NodoLista<T>  implements Serializable{

    String etiqueta;
    Object TObj;
    NodoLista sig;
    NodoLista ant;
    NodoLista abajo;

    public NodoLista(String etiqueta, Object TObj) {
        this.etiqueta = etiqueta;
        this.TObj = TObj;
        this.sig = null;
        this.ant = null;
        this.abajo= null;
    }

    public NodoLista(String etiqueta, Object TObj, NodoLista sig, NodoLista ant, NodoLista abajo) {
        this.etiqueta = etiqueta;
        this.TObj = TObj;
        this.sig = sig;
        this.ant = ant;
        this.abajo = abajo;
    }

    public NodoLista getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoLista abajo) {
        this.abajo = abajo;
    }

    public NodoLista() {
    }

    @Override
    public String toString() {
        return  etiqueta + ";" + TObj + ";" + sig + ";" + ant + ';';
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Object getTObj() {
        return TObj;
    }

    public void setTObj(Object TObj) {
        this.TObj = TObj;
    }

    public NodoLista getSig() {
        return sig;
    }

    public void setSig(NodoLista sig) {
        this.sig = sig;
    }

    public NodoLista getAnt() {
        return ant;
    }

    public void setAnt(NodoLista ant) {
        this.ant = ant;
    }
}
