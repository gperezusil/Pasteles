/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misClases;

import ListaEnlazada.ListaLEG;

/**
 *
 * @author USUARIO
 */
public class Postre {
    private String codigoPostre;
    private String nombrePostre;
    private ListaLEG<Ingrediente> listaIngrediente;
    private Postre sig;

    public Postre getSig() {
        return sig;
    }

    public void setSig(Postre sig) {
        this.sig = sig;
    }

    public Postre(String codigoPostre, String nombrePostre, ListaLEG<Ingrediente> listaIngrediente) {
        this.codigoPostre = codigoPostre;
        this.nombrePostre = nombrePostre;
        this.listaIngrediente = listaIngrediente;
        this.sig=null;
    }

    public String getCodigoPostre() {
        return codigoPostre;
    }

    public void setCodigoPostre(String codigoPostre) {
        this.codigoPostre = codigoPostre;
    }

    public String getNombrePostre() {
        return nombrePostre;
    }

    public void setNombrePostre(String nombrePostre) {
        this.nombrePostre = nombrePostre;
    }

    public ListaLEG<Ingrediente> getListaIngrediente() {
        return listaIngrediente;
    }

    public void setListaIngrediente(ListaLEG<Ingrediente> listaIngrediente) {
        this.listaIngrediente = listaIngrediente;
    }
    
    @Override
    public String toString()
    {
        String cad = "";
        cad = "\n Codigo de Postre: " + codigoPostre+
                "\n Nombre de Postre : " + nombrePostre+
                "\n Lista de Ingredientes: " + 
                "\n" +listaIngrediente.mostarLista() ;
        
        return cad;
        
    }
    
}
