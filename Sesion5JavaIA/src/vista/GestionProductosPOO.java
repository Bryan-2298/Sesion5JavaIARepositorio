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
        
        int ciclo;
        
        do
        {//Inicia do
            System.out.println("Menu Productos\n1.- Agregar.\n2.- Consultar.\n3.- Eliminar.\n4.- Salir.");
            ciclo = entradaDato.nextInt();
            
            switch (ciclo) 
            {//Inicia switch
                
                case 1: 
                    
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
              
                    break;
                    
                case 2: 
                    
                    //Consultar productos
                    gestor.listarProductos();
                    
                    break;
                case 3: 
                    
                    //Buscar por id
                    System.out.println("ID a buscar: ");
                    Producto p = gestor.buscarId(entradaDato.nextInt());
                    System.out.println(p != null ? p : "Producto no encontrado.");
        
                    //Eliminar producto
                    System.out.println("Id a eliminar: ");
                    gestor.eliminarProducto(entradaDato.nextInt());
        
                    //Consultar par actualizar
                    gestor.listarProductos();
                    
                    break;
                case 4: 
                    
                    System.out.println("Saliendo del sistema...");
                    
                    break;
                default: 
                    
                    System.out.println("Error! Solo tengo opcion 1, 2, 3 y 4...");
                    
                    break;
            
            }//Termina switch
            
        }while(ciclo != 4);//Termina do
                
        
        


    }//Termina main
    
    
    
}//Termina clase
