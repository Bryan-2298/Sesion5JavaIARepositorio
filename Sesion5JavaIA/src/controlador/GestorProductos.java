package controlador;

import java.util.ArrayList;
import java.util.List;      
import modelo.Producto;     //Llamada del paquete modelo y clase producto

public class GestorProductos
{//Inicia clase
    
    //Generamos un arrayList como un almacenamiento
    List<Producto> productos = new ArrayList<>();
    
    
    //GENERAMOS EL CRUD
    
    public void agregarProducto(Producto p)
    {//Inicia el metodo para agregar objetos productos Lista
        
        //Agrega objetos producto a la lista o ArrayList
        productos.add(p);
        
    }//Termina metodo agregarProducto()
    
    public void listarProductos()
    {//Inicia metodo prara consultar
        
        if(productos.isEmpty())
        {//Si la lista esta vacia...
            System.out.println("No hay productor registrados...");
            return;
        }//Termina if
        
        //Imprime la lista de productos
        productos.forEach(System.out::println);
        
    }//Termina metodo para consultar
    
    public Producto buscarId(int id)
    {//Inicia metodo buscar por campo distintivo ID
        
        //Buscamos el producto 
        //Utilizamos formato JAVA 25 con identacion de Python
        for (Producto p : productos)
            if(p.getId() == id) return p;
        return null;
        
    }//Termina metodo buscar por campo distintivo ID
    
    public void eliminarProducto(int id)
    {//Inicia metodo eliminar 
        
        //Buscamos el producto
        Producto p = buscarId(id);
        if(p != null)
        {//Si se encuentra el producto....
            productos.remove(p);
            System.out.println("Producto borrado del sistema...");
        }//Termina if
        else
        {//SI no se encuentra el producto....
            System.out.println("Error! No existe el producto...");
        }//Termina else
        
    }//Termina el metodo eliminar

}//Termina clase
