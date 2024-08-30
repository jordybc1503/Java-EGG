import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PedidoServicio {
    private List<Pedido> listaDePedidos = new ArrayList<>();
    private int contadorDePedidos = 1;

    public Pedido crearPedido(String cliente, String[] listaDeProductos) {
        Pedido nuevoPedido = new Pedido(contadorDePedidos++, cliente, listaDeProductos);
        listaDePedidos.add(nuevoPedido);
        return nuevoPedido;
    }

    public void actualizarEstadoPedido(int numeroDePedido, EstadoPedido nuevoEstado) {
        for (Pedido pedido : listaDePedidos) {
            if (pedido.getNumeroDePedido() == numeroDePedido) {
                pedido.setEstadoDelPedido(nuevoEstado);
                System.out.println("Estado del pedido actualizado a " + nuevoEstado);
                return;
            }
        }
        System.out.println("Pedido no encontrado.");
    }

    public List<Pedido> buscarPedidosPorEstado(EstadoPedido estado) {
        return listaDePedidos.stream()
                .filter(pedido -> pedido.getEstadoDelPedido() == estado)
                .collect(Collectors.toList());
    }

    public List<Pedido> obtenerListaDePedidos() {
        return listaDePedidos;
    }

    public List<Pedido> filtrarPedidosPorCliente(String cliente) {
        return listaDePedidos.stream()
                .filter(pedido -> pedido.getCliente().equalsIgnoreCase(cliente))
                .collect(Collectors.toList());
    }
}
