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



        char categoriaPedida = 'B';

        switch (categoriaPedida) {
            case 'B':
                System.out.println("Categoría: Bebida caliente | IVA: 0%");
                break;
            case 'F':
                System.out.println("Categoría: Bebida fría | IVA: 5%");
                break;
            case 'C':
                System.out.println("Categoría: Comida | IVA: 8%");
                break;
            case 'P':
                System.out.println("Categoría: Postre | IVA: 8%");
                break;
            default:
                System.out.println("Error: El código ingresado no corresponde a una categoría válida.");
                break;


        }


        int cafemolido = 50;

        while (cafemolido > 10) {
            System.out.println("En stock de cafe molido queda " + cafemolido);
            cafemolido -= 2;
        }


    }


}