package ListaEnlazada;

import javax.swing.JOptionPane;
import misClases.Ingrediente;

public class ListaLEG <E extends Ingrediente >{
    private Nodo<E> primero;
    private int talla; 

    public void setPrimero(Nodo<E> primero) {
        this.primero = primero;
    }

    public ListaLEG() {
        this.primero=null;
        this.talla=0;
    }
  public boolean esVacia(){
        if(primero==null){
            return true;
        }else{
            return false;
        }
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
    public Ingrediente encontrarDato(String nom)
    {   Ingrediente ingre=null;
        Nodo<E> aux = getPrimero();

        while(aux!=null)
        {
            
            if(aux.getDato().getNombreIngrediente().equalsIgnoreCase(nom))
            {
                return ingre;

            }
            aux=aux.getSiguiente();
        }
        return ingre;
    }
    
    
    //método que elimina un nodo especifico
    public void eliminarIngrediente(String cod){
        Nodo<E> ant=null, aux=primero;
        
        while(aux!=null && !aux.getDato().getNombreIngrediente().equalsIgnoreCase(cod)){
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
            else 
                if(aux.getDato().getNombreIngrediente()==x.getNombreIngrediente())
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
         String res="";
        
        for(Nodo<E> aux=primero; aux!=null; aux=aux.getSiguiente()){
            res+=aux.getDato().toString() + "\n";
        }
        return res;
       
    }

    
}
