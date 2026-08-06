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


                double montoApertura = -5000.0;
                int intentos = 0;

                do {
                    intentos++;
                    System.out.printf("Intento %d: Ingrese el monto de apertura de caja...%n", intentos);

                    if (montoApertura <= 0) {
                        System.out.println("Error: El monto debe ser mayor a $0.");

                        montoApertura = 50000.0;
                    }
                } while (montoApertura <= 0);

                System.out.printf("Monto de apertura registrado con éxito: $%.2f%n", montoApertura);


        String[] productos = {"Café americano", "Capuchino", "Jugo de naranja", "Tostada",
                "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};


        double suma = 0;

        System.out.println("MENÚ DEL DÍA");
        for (int i = 0; i < productos.length; i++) {
            System.out.printf("%d. %s - $%.2f%n", (i + 1), productos[i], precios[i]);
            suma += precios[i];
        }

        double promedio = suma / precios.length;

        System.out.printf("Precio promedio: $%.2f%n", promedio);



        //ejercicio 7

                int cantidadVendida = 5;
                double precioUnitario2 = 4500;
                double total = cantidadVendida * precioUnitario2;
                boolean aplicaDescuento2 = (total > 20000);

                if (aplicaDescuento2 == true) {
                    total = total - (total * 0.10);
                }

                System.out.println("Total: " + total);




                //parte dos ejercicio  final






        String[] nombres = {"Café americano", "Capuchino", "Jugo naranja", "Tostada", "Brownie"};
        double[] precios3 = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B', 'B', 'F', 'C', 'P'};

        int[] pedidoProducto = {0, 2, 1, 4, 0, 3};
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2};

        double montoApertura2 = -10000.0;
        int intento = 0;

        System.out.println("=== APERTURA DE CAJA ===");
        do {
            intento++;
            System.out.printf("Intento %d: Registrando monto de apertura...%n", intento);
            if (montoApertura2 <= 0) {
                System.out.println("Error: El monto de apertura debe ser mayor a $0.");
                montoApertura2 = 50000.0;
            }
        } while (montoApertura2 <= 0);

        System.out.printf("Caja abierta con éxito. Monto inicial: $%.2f%n%n", montoApertura2);

        int stockBrownie = 10;
        int pedidosProcesados = 0;
        double totalRecaudado = 0;
        double mayorValorPedido = 0;
        int numeroPedidoMayor = 0;

        System.out.println("=== PROCESAMIENTO DE PEDIDOS ===");

        for (int i = 0; i < pedidoProducto.length; i++) {
            int indiceProd = pedidoProducto[i];
            int cantidad = pedidoCantidad[i];

            String nombreProd = nombres[indiceProd];
            double precioProd = precios3[indiceProd];
            char catCodigo = categorias[indiceProd];

            System.out.printf("--- Pedido #%d ---%n", (i + 1));

            if (indiceProd == 4) {
                if (stockBrownie < cantidad) {
                    System.out.println("Producto agotado: No hay suficiente stock de Brownie para este pedido.");
                    System.out.println("---------------------------");
                    continue;
                } else {
                    stockBrownie -= cantidad;
                }
            }

            String descripcionCategoria;
            switch (catCodigo) {
                case 'B':
                    descripcionCategoria = "Bebida caliente";
                    break;
                case 'F':
                    descripcionCategoria = "Bebida fría";
                    break;
                case 'C':
                    descripcionCategoria = "Comida";
                    break;
                case 'P':
                    descripcionCategoria = "Postre";
                    break;
                default:
                    descripcionCategoria = "Desconocida";
                    break;
            }

            double subtotal3 = precioProd * cantidad;

            System.out.printf("Producto: %s | Cantidad: %d%n", nombreProd, cantidad);
            System.out.printf("Categoría: %s%n", descripcionCategoria);
            System.out.printf("Subtotal: $%.2f%n", subtotal3);

            double totalFinalPedido = subtotal3;
            if (subtotal3 > 12000) {
                double descuento = subtotal3 * 0.10;
                totalFinalPedido = subtotal3 - descuento;
                System.out.printf("¡Aplica descuento del 10%%! Descuento: $%.2f | Total con descuento: $%.2f%n", descuento, totalFinalPedido);
            } else {
                System.out.println("No aplica descuento.");
            }

            pedidosProcesados++;
            totalRecaudado += totalFinalPedido;

            if (totalFinalPedido > mayorValorPedido) {
                mayorValorPedido = totalFinalPedido;
                numeroPedidoMayor = i + 1;
            }

            System.out.println("---------------------------");
        }

        System.out.println("\n=== REPORTE DE CIERRE DE TURNO ===");
        System.out.printf("Total de pedidos procesados con éxito: %d%n", pedidosProcesados);
        System.out.printf("Total recaudado en ventas: $%.2f%n", totalRecaudado);
        System.out.printf("Pedido con mayor valor cobrado: Pedido #%d ($%.2f)%n", numeroPedidoMayor, mayorValorPedido);
        System.out.println("===================================");














        }


    }


