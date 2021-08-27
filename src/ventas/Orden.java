package ventas;

public class Orden {
    private int idOrden;
    private static final int max_productos = 10;
    private int productos[] = new int[max_productos];
    private static int contadorOrdenes;

    public Orden(){
        idOrden = contadorOrdenes++;
    }

    public void agregarProducto(Producto producto){
        
    }

    public double calcularTotal(){
        return 0d;
    }

    public void mostrarOrden(){

    }
}
