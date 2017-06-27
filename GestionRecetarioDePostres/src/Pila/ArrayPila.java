package Pila;


import Pila.Pila;
import misClases.Postre;


public class ArrayPila <E> implements Pila<E>{
    protected static final int TAMAÑO=50;
    protected E []arP;
    protected int tope;


    public ArrayPila() {
        arP=(E[])new Object[TAMAÑO];
        tope=-1;
    }
    
    public void apilar(E x){
        if(tope==TAMAÑO-1){
            System.out.println("Pila Llena .......");
        }else{
            tope++;
            arP[tope]=x;
        }        
    }
    public E desapilar(){
        E elUltimo=arP[tope];
        tope--;
        
        return elUltimo;
    }
    
    public E tope(){
        return arP[tope];
    }
    
    public boolean pilaVacia(){
        return (tope==-1);
    }
    
    public boolean pilaLlena(){
        return (tope==TAMAÑO-1);
    }
    
    public String mostrarPila(){
        String res="";
        
        ArrayPila<E> pAux=new ArrayPila<E>();
        E valor;
        
        while(!pilaVacia()){
            valor=desapilar();
            res+=valor+"\n";
            pAux.apilar(valor);
        }
        while(!pAux.pilaVacia()){
            valor=pAux.desapilar();
            apilar(valor);
        }       
        return res;
    }  
   
}
