public class MainAlmacen {
    public static void main(String[] args) {
        System.out.println("=== CONTROL DE INVENTARIO DE ALMACÉN ===");

        Almacen almacen = new Almacen();
        almacen.agregarProducto(new Producto("Laptop", 5));
        almacen.agregarProducto(new Producto("Mouse", 20));
        almacen.agregarProducto(new Producto("Teclado", 3));
        almacen.mostrarInventario();

        // Caso 1: Venta exitosa
        System.out.println("--- Caso 1: Venta válida ---");
        vender(almacen, "Mouse", 5);

        // Caso 2: Producto no encontrado
        System.out.println("\n--- Caso 2: Producto inexistente ---");
        vender(almacen, "Monitor", 1);

        // Caso 3: Stock insuficiente
        System.out.println("\n--- Caso 3: Stock insuficiente ---");
        vender(almacen, "Teclado", 10);

        almacen.mostrarInventario();
    }

    static void vender(Almacen almacen, String nombre, int cantidad) {
        try {
            almacen.venderProducto(nombre, cantidad);
        } catch (ProductoNoEncontradoException e) {
            System.out.println("❌ ProductoNoEncontradoException: " + e.getMessage());
        } catch (StockAgotadoException e) {
            System.out.println("❌ StockAgotadoException: " + e.getMessage());
        }
    }
}
