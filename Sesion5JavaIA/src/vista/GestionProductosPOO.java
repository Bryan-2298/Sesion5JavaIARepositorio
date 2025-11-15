package vista;
import modelo.Producto;                 //Gestion de datos
import controlador.GestorProductos;     //Modificacion de datos
import java.util.Scanner;               //Leer datos desde consola

public class GestionProductosPOO
{//Inicia clase
    
    public static void main(String[] args)
    {//Inicia main
        
        //Captura cualquier tipo de datos
        Scanner entradaDato = new Scanner(System.in);
        
        //Para uso y llamado de los metodos
        GestorProductos gestor = new GestorProductos();
        
        //Para alta de productos
        System.out.println("Sistema de productos\nCaptura ID: ");
        int id = entradaDato.nextInt();
        
        System.out.println("Captura Nombre: ");
        String nombre = entradaDato.next();
        
        System.out.println("Captura Precio: ");
        double precio = entradaDato.nextDouble();
        
        System.out.println("Captura Stock: ");
        int stock = entradaDato.nextInt();
        
        //Almacena N datos
        gestor.agregarProducto(new Producto(id, nombre, precio, stock));
        
        //Consultar productos
        gestor.listarProductos();
        
        //Buscar por id
        System.out.println("ID a buscar: ");
        Producto p = gestor.buscarId(entradaDato.nextInt());
        System.out.println(p != null ? p : "Producto no encontrado.");
        
        //Eliminar producto
        System.out.println("Id a eliminar: ");
        gestor.eliminarProducto(entradaDato.nextInt());
        
    }//Termina main
    
    
    
}//Termina clase
