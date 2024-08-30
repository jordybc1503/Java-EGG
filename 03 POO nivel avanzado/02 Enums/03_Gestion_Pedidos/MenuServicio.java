import java.util.List;
import java.util.Scanner;

public class MenuServicio {
    private PedidoServicio pedidoServicio = new PedidoServicio();
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("Gestión de Pedidos");
            System.out.println("1. Crear nuevo pedido");
            System.out.println("2. Actualizar estado de un pedido");
            System.out.println("3. Buscar pedidos por estado");
            System.out.println("4. Mostrar lista de pedidos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1:
                    crearNuevoPedido();
                    break;
                case 2:
                    actualizarEstadoPedido();
                    break;
                case 3:
                    buscarPedidosPorEstado();
                    break;
                case 4:
                    mostrarListaDePedidos();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    private void crearNuevoPedido() {
        System.out.print("Ingrese el nombre del cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Ingrese la cantidad de productos: ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea

        String[] listaDeProductos = new String[cantidadProductos];
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Producto " + (i + 1) + ": ");
            listaDeProductos[i] = scanner.nextLine();
        }

        Pedido nuevoPedido = pedidoServicio.crearPedido(cliente, listaDeProductos);
        System.out.println("Pedido creado: " + nuevoPedido);
    }

    private void actualizarEstadoPedido() {
        System.out.print("Ingrese el número de pedido: ");
        int numeroDePedido = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea

        System.out.println("Seleccione el nuevo estado:");
        System.out.println("1. PENDIENTE");
        System.out.println("2. ENVIADO");
        System.out.println("3. ENTREGADO");
        int opcionEstado = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea

        EstadoPedido nuevoEstado;
        switch (opcionEstado) {
            case 1:
                nuevoEstado = EstadoPedido.PENDIENTE;
                break;
            case 2:
                nuevoEstado = EstadoPedido.ENVIADO;
                break;
            case 3:
                nuevoEstado = EstadoPedido.ENTREGADO;
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        pedidoServicio.actualizarEstadoPedido(numeroDePedido, nuevoEstado);
    }

    private void buscarPedidosPorEstado() {
        System.out.println("Seleccione el estado de los pedidos que desea buscar:");
        System.out.println("1. PENDIENTE");
        System.out.println("2. ENVIADO");
        System.out.println("3. ENTREGADO");
        int opcionEstado = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea

        EstadoPedido estado;
        switch (opcionEstado) {
            case 1:
                estado = EstadoPedido.PENDIENTE;
                break;
            case 2:
                estado = EstadoPedido.ENVIADO;
                break;
            case 3:
                estado = EstadoPedido.ENTREGADO;
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        List<Pedido> pedidos = pedidoServicio.buscarPedidosPorEstado(estado);
        System.out.println("Pedidos en estado " + estado + ":");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }

    private void mostrarListaDePedidos() {
        List<Pedido> pedidos = pedidoServicio.obtenerListaDePedidos();

        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos.");
            return;
        }

        System.out.println("Seleccione un filtro:");
        System.out.println("1. Sin filtro");
        System.out.println("2. Filtrar por cliente");
        int opcionFiltro = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea

        switch (opcionFiltro) {
            case 1:
                System.out.println("Lista completa de pedidos:");
                for (Pedido pedido : pedidos) {
                    System.out.println(pedido);
                }
                break;
            case 2:
                System.out.print("Ingrese el nombre del cliente: ");
                String cliente = scanner.nextLine();
                List<Pedido> pedidosFiltrados = pedidoServicio.filtrarPedidosPorCliente(cliente);
                if (pedidosFiltrados.isEmpty()) {
                    System.out.println("No se encontraron pedidos para el cliente: " + cliente);
                } else {
                    System.out.println("Pedidos del cliente " + cliente + ":");
                    for (Pedido pedido : pedidosFiltrados) {
                        System.out.println(pedido);
                    }
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
