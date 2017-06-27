/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misClases;

/**
 *
 * @author USUARIO
 */
public class Ingrediente {
    
    private String NombreIngrediente;
    private int Cantidad;

    public Ingrediente(String NombreIngrediente, int Cantidad) {
        this.NombreIngrediente = NombreIngrediente;
        this.Cantidad = Cantidad;
    }

    public String getNombreIngrediente() {
        return NombreIngrediente;
    }

    public void setNombreIngrediente(String NombreIngrediente) {
        this.NombreIngrediente = NombreIngrediente;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    @Override
    public String toString(){
        
        return "\n Nombre del ingrediente :"+NombreIngrediente+
                "\n Cantidad:"+Cantidad+"gr.";
        
    }
    
    
}
