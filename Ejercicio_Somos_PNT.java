/*
 * Realizado por Gustavo Arias Contreras (gustavo.ariasc@hotmail.com)
 * Ejercicio de https://somospnt.com/candidatos.html
 * 
 */
package ejercicio_somos_pnt;
import java.util.*;
import ejercicio_somos_pnt.Producto;

public class Ejercicio_Somos_PNT {

    
    public static void main(String[] args) {
        List<Producto> Lista = new ArrayList<Producto>();
        
        Producto P1 = new Producto(1, "Coca-Cola Zero","1.5",20);
        Producto P2 = new Producto(1, "Coca-Cola","1.5",18);
        Producto P3 = new Producto(2, "Shampoo Sedal","500ml",19);
        Producto P4 = new Producto(3, "Frutillas","kilo",64);
        
        Lista.add(P1);
        Lista.add(P2);
        Lista.add(P3);
        Lista.add(P4);
        
        for(int i = 0; i < Lista.size();i++)
        {
                System.out.println (Lista.get(i).toString());
        }
        System.out.println("=============================");
        Collections.sort(Lista);
        System.out.println ("Producto más caro: " + Lista.get(0).getNombre());
        System.out.println ("Producto más barato: " + Lista.get(Lista.size()-1).getNombre());
    }
    
}
