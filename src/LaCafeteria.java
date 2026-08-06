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

        double subtotal = 42500.0;


        boolean aplicaDescuento = subtotal > 30000;

        double valorDescuento = 0.0;


        if (aplicaDescuento) {
            valorDescuento = subtotal * 0.15;
        }


        double totalAPagar = subtotal - valorDescuento;


        System.out.printf("¿Tiene descuento?: %b%n", aplicaDescuento);
        System.out.printf("Valor del descuento: $%.2f%n", valorDescuento);
        System.out.printf("Total a pagar: $%.2f%n", totalAPagar);



        char catebebidascalientes = 'B';
        char catebebidasfries = 'F';
        char catecomida = 'C';
        char catepostre = 'P';

        char categoriapedida = 'B';

        switch (categoriapedida) {
            case 'B':
                System.out.println(" Su categoria es de bebidas calientes y tiene un iva del 0%");
                break;

            case 'F':
                System.out.println("Su categoria es bebidas calientes y tiene un iva del 5%");
                break;

                case 'C':
                    System.out.println("Su categoria es de comida y tiene un iva del 8%");
                    break;

            case 'P':
                System.out.println("Su  categoria es postres y tiene un iva del 8%");

                break;


            default:
                System.out.println("Su codigo no es una categoria valida");

        }
    }
}