public class LaCafeteria {
    public static void main(String[] args) {


        String productoUno = "Pan rollo";
        double precioUnitario = 100.0;
        int stock = 10;
        boolean estaDisponible = true;
        char codigoProducto = 'P';


        System.out.println(String.format("Nombre del producto: %s", productoUno));
        System.out.println(String.format("Precio unitario: $%.2f", precioUnitario));
        System.out.println(String.format("Cantidad en inventario: %d", stock));
        System.out.println(String.format("¿Está disponible?: %b", estaDisponible));
        System.out.println(String.format("Código del producto: %c", codigoProducto));
    }
}