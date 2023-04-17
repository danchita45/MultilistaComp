package multilista2;

import java.io.Serializable;

public class NodoMultilista<T>  implements Serializable{

    String etiqueta;
    Object TObj;
    NodoMultilista sig;
    NodoMultilista ant;
    NodoMultilista abajo = null;
    

    public NodoMultilista(String etiqueta, Object TObj) {
        this.etiqueta = etiqueta;
        this.TObj = TObj;
        this.sig = null;
        this.ant = null;
        this.abajo=null;
        
    }

    public NodoMultilista(String etiqueta, Object TObj, NodoMultilista sig, NodoMultilista ant) {
        this.etiqueta = etiqueta;
        this.TObj = TObj;
        this.sig = sig;
        this.ant = ant;
    }

    public NodoMultilista getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoMultilista abajo) {
        this.abajo = abajo;
    }

    public NodoMultilista() {
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

    public NodoMultilista getSig() {
        return sig;
    }

    public void setSig(NodoMultilista sig) {
        this.sig = sig;
    }

    public NodoMultilista getAnt() {
        return ant;
    }

    public void setAnt(NodoMultilista ant) {
        this.ant = ant;
    }
}
