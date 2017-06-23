package ListaEnlazada;

import javax.swing.JOptionPane;
import misClases.Ingrediente;

public class ListaLEG <E extends Ingrediente >{
    private Nodo<E> primero;
    private int talla; 

    public ListaLEG() {
        this.primero=null;
        this.talla=0;
    }

    public Nodo<E> getPrimero() {
        return primero;
    }

    public int getTalla() {
        return talla;
    }
    
    //método insertar al inicio
    public void insertarAlInicio(E x){
        Nodo<E> nuevo=new Nodo<E>(x);
        
        nuevo.setSiguiente(primero);
        primero=nuevo;
        talla++;       
    }
    
    //método insertar al final
    public void insertarAlFinal(E x){
        Nodo<E> nuevo =new Nodo<E>(x);
        Nodo<E> aux;
        
        if(primero==null){
            primero=nuevo;
        }else{
            aux=primero;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();          //mover puntero
            }
            aux.setSiguiente(nuevo);            
        }
        talla++;               
    }
    
    //método que elimina un nodo especifico
    public void eliminarDato(E x){
        Nodo<E> ant=null, aux=primero;
        
        while(aux!=null && !aux.getDato().equals(x)){
            ant=aux;
            aux=aux.getSiguiente();
        }
        
        if(aux!=null){
            talla--;
            if(ant==null){
                primero=primero.getSiguiente();
            }else{
                ant.setSiguiente(aux.getSiguiente());
            }
        }       
    }
    
    //método redefinido toString()
    public String toString(){
        String cad="";
        Nodo<E> aux=primero;
        
        while(aux!=null){
            cad+=aux.getDato().toString()+"\n";
            aux=aux.getSiguiente();
        }        
        return cad;
    }
    
    //método que elimine el ultimo nodo de la lista
    // precondicion : lista no vacia
    public void eliminarUltimo(){
        Nodo<E> ant=null,aux=primero;
        
        while(aux.getSiguiente()!=null){
            ant=aux;
            aux=aux.getSiguiente();
        }  
        if(primero.getSiguiente()!=null){
            ant.setSiguiente(null);
        }else{
            primero=null;
        }        
        talla--;        
    }
    
     public void agregarIngrediente(E x)
    {
         Nodo<E> nuevo=new Nodo<>(x);
         Nodo<E> aux=primero, r=null;
       
        if(primero==null)
        {
            insertarAlInicio(x);
        }
        else
        {            
            while(aux!=null && aux.getDato().getNombreIngrediente().compareTo(x.getNombreIngrediente())<0 )
            {
                r=aux;
                aux=aux.getSiguiente();
            }
           if(aux==primero)
            {
                insertarAlInicio(x);
            }
            else if(aux==null)
            {
                insertarAlFinal(x);
            }
            else if(aux.getDato().getNombreIngrediente()== x.getNombreIngrediente())
            {
                JOptionPane.showMessageDialog(null, "Ingrediente ya existe ");
            }
            else
            {
                r.setSiguiente(nuevo);
                nuevo.setSiguiente(aux);
                talla++;
            }           
        }        
    }
      public String mostarLista()
      {
         
        String contenido="";
        Nodo<E> aux=primero;
         
        while(aux!=null){
            contenido+=aux.getDato()+"\n"; //guardamos el dato
            aux=aux.getSiguiente();
        }
         
        return contenido;
    }

    
}
