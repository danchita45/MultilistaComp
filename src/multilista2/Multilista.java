/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multilista2;

/**
 *
 * @author Danchita45
 */
public class Multilista
{

    NodoLista r = null;

    public NodoLista getR()
    {
        return r;
    }

    public void setR(NodoLista r)
    {
        this.r = r;
    }

    public NodoLista inserta(String[] s, int nivel, NodoLista n, NodoLista r)
    {
        if (nivel == s.length - 1) {
            ListaDoblementeLigada lista = new ListaDoblementeLigada();
            lista.setr(r);
            lista.inserta(n);
            return lista.getr();
        } else {
            ListaDoblementeLigada lista = new ListaDoblementeLigada();
            lista.setr(r);
            NodoLista nodo = lista.buscar(s[nivel]);
            if (nodo == null) {
                System.out.println("Error");
            } else {
                nodo.setAbajo(inserta(s, nivel + 1, n, nodo.getAbajo()));
            }
            return r;
        }
    }

    public void Borra(String[] s, int nivel, NodoLista r, NodoLista n[])
    {
        ListaDoblementeLigada l = new ListaDoblementeLigada();
        l.setr(r);

        if (nivel == s.length - 1) {

            NodoLista nuevo = l.buscar(s[nivel]);
            n[1] = l.eliminar(s[nivel]);
            n[0] = l.getr();
            
            

        } else {
            NodoLista aux = l.buscar( s[nivel]);
            if (aux != null) {
                Borra(s, nivel + 1, aux.getAbajo(), n);
                aux.setAbajo(n[0]);
            } else {
                n[0] = r;
            }
        }

    }

}
