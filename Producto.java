
package ejercicio_somos_pnt;


public class Producto implements Comparable<Producto> {

    private int Tipo,Precio;
    private String Nombre,Contenido,Mensaje;
    
    public Producto(int tipo,String nombre, String contenido, int precio){
        this.Tipo = tipo;
        this.Nombre = nombre;
        this.Contenido = contenido;
        this.Precio = precio;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public int getPrecio(){
        return Precio;
    }
    
    private void SeleccionarMensaje(){
         switch(this.Tipo)
        {
            case 1: Mensaje = "Nombre: " + this.Nombre + " /// Litros: " + this.Contenido + " /// Precio: $" + this.Precio;
                    break;
            case 2: Mensaje = "Nombre: " + this.Nombre + " /// Contenido: " + this.Contenido + " /// Precio: $" + this.Precio;
                    break;
            case 3: Mensaje = "Nombre: " + this.Nombre + " /// Precio: $" + this.Precio + " /// Inidad de venta: " + this.Contenido;
                    break;
        }
    }
    
    @Override
    public String toString(){
        SeleccionarMensaje();
       return Mensaje;
    }
    
   
    
    @Override
    public int compareTo(Producto o) {
        int resultado;
        
        if (o.getPrecio() > this.Precio){
            resultado = 1;
        }else if(o.getPrecio() < this.Precio){
            resultado = -1;
        }else{
            resultado = 0;
        }
        
        return resultado;
    }
    
    
}
