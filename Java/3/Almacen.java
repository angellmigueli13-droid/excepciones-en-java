import java.util.HashMap;
import java.util.Map;

public class Almacen {
    // HashMap para búsqueda eficiente por nombre
    private Map<String, Producto> productos = new HashMap<>();

    public void agregarProducto(Producto p) {
        productos.put(p.getNombre().toLowerCase(), p);
    }

    public void venderProducto(String nombre, int cantidad)
            throws ProductoNoEncontradoException, StockAgotadoException {

        String clave = nombre.toLowerCase();

        // Excepción 1: producto no existe
        if (!productos.containsKey(clave)) {
            throw new ProductoNoEncontradoException(nombre);
        }

        Producto p = productos.get(clave);

        // Excepción 2: stock insuficiente
        if (cantidad > p.getStock()) {
            throw new StockAgotadoException(p.getNombre(), p.getStock(), cantidad);
        }

        p.reducirStock(cantidad);
        System.out.printf("✅ Venta exitosa: %d unidad(es) de '%s'. Stock restante: %d%n",
                cantidad, p.getNombre(), p.getStock());
    }

    public void mostrarInventario() {
        System.out.println("\n📦 INVENTARIO ACTUAL:");
        System.out.println("-".repeat(35));
        if (productos.isEmpty()) {
            System.out.println("  (Sin productos)");
        } else {
            productos.values().forEach(System.out::println);
        }
        System.out.println();
    }
}
