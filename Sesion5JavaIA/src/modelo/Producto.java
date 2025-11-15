package modelo;

public class Producto
{//Iinicia clase
    
    //Atributos
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    
    //Generamos el constructor
    public Producto(int id, String nombre, double precio, int stock)
    {//Inicia constructor
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }//Termina constructor
    
    //Metodos Getters y Setters
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int stock)
    {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + '}';
    }
    
}//Termina clase
