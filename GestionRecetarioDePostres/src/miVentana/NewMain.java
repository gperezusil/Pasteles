/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miVentana;

import ListaEnlazada.ListaLEG;
import Pila.ArrayPila;
import miGestion.GestionarPostres;
import misClases.Ingrediente;
import misClases.Postre;

/**
 *
 * @author Gherson
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ListaLEG<Ingrediente> listaIngredientes = new ListaLEG<>();
    ArrayPila<Postre> listaPostre= new ArrayPila<>();
     Ingrediente ingre ;
     Postre pos;
    GestionarPostres ges= new GestionarPostres();
    ingre = new  Ingrediente("azucar", 50);
    
    listaIngredientes.agregarIngrediente(ingre);
    
    pos = new Postre("01", "carlos", listaIngredientes);
    ges.agregarPostre(pos);
    
       
        System.out.println(ges.MostrarIngredientes("01"));
     
        listaIngredientes.eliminarIngrediente("azucar");
        System.out.println("---------------------------");
        System.out.println(listaIngredientes.mostarLista());
    
    }
    
}
