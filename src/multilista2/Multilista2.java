/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multilista2;

/**
 *
 * @author Danchita45
 */
public class Multilista2
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Multilista multilista = new Multilista();
        NodoLista r = null;

        NodoLista n1 = new NodoLista();
        n1.setEtiqueta("Abuelo");
        NodoLista n2 = new NodoLista();
        n2.setEtiqueta("Abuela");
        NodoLista n1_1 = new NodoLista();
        n1_1.setEtiqueta("Papa");
        NodoLista n2_1 = new NodoLista();
        n2_1.setEtiqueta("Mama");
        NodoLista n1_1_1 = new NodoLista();
        n1_1_1.setEtiqueta("Hijo");
        NodoLista n2_1_1 = new NodoLista();
        n2_1_1.setEtiqueta("Hija");

        String arr[] = new String[1];
        arr[0] = "Abuelo";
        r = multilista.inserta(arr, 0, n1, r);
        arr[0] = "Abuela";
        r = multilista.inserta(arr, 0, n2, r);
        String arr2[] = new String[2];
        arr2[0] = "Abuelo";
        arr2[1] = "Papa";
        r = multilista.inserta(arr2, 0, n1_1, r);
        String arr3[] = new String[3];
        arr3[0] = "Abuelo";
        arr3[1] = "Papa";
        r = multilista.inserta(arr3, 0, n1_1_1, r);
        
        String arrDel[] = new String[3];
        arrDel[0]="Abuelo";
        arrDel[1]= "Papa";
        arrDel[2]="Hijo";
        NodoLista nr[]= new NodoLista[2];
        
        multilista.Borra(arrDel, 0, r, nr);
        r = nr[0];
        ListaDoblementeLigada ldl = new ListaDoblementeLigada();
        ldl.inserta(r);
        ldl.muestras();
    }

}
