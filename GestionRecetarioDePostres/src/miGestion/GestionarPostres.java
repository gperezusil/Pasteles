/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miGestion;

import Pila.ArrayPila;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import misClases.Postre;

/**
 *
 * @author USUARIO
 */
public class GestionarPostres {
    private  ArrayPila<Postre> listaPostre;

    public GestionarPostres() {
        listaPostre= new ArrayPila<Postre>();
    }

    public ArrayPila<Postre> getListaPostre() {
        return listaPostre;
    }
    
    public void agregarPostre(Postre pos)
    {
        listaPostre.apilar(pos);
       
    }
    
     public Postre buscarPostre(String codigo){
        Postre refV=null;        
        ArrayPila<Postre> pAux=new ArrayPila<Postre>();
        boolean estado =false;
        while(listaPostre.pilaVacia()==false  && estado==false){
            Postre v=listaPostre.desapilar();
            if(v.getCodigoPostre().equalsIgnoreCase(codigo)){
                refV=v;
                estado=true;
            }else{
                 pAux.apilar(v);   
            }                    
        }          
        while(pAux.pilaVacia()==false){
            listaPostre.apilar(pAux.desapilar());
        }
        
        return refV;
    }
     
     public String MostrarIngredientes(String cod){
        String cad="";
        Postre veh=buscarPostre(cod);
        
        if(veh==null){
            cad="Postre no se encuentra "
                    + "\n en la Lista";
        }else{            
            cad="Datos del Postre: " +
                 veh.toString();
        }
        return cad;        
    }
     
     public String MostrarPostresConIngredientes(String ingre)
     {
         String cad ="";
         
         return cad;
     }       
     public String MostrarPostres()
     {
         String res="";
        
        ArrayPila<Postre> pAux=new ArrayPila<>();
        Postre valor;
        while(listaPostre.pilaVacia()==false){
            valor=listaPostre.desapilar();
            res+=valor+"\n";
            pAux.apilar(valor);
        }
        while(pAux.pilaVacia()==false){
            valor=pAux.desapilar();
            listaPostre.apilar(valor);
        }       
        return res;
     }
    
}
