public class ProductoNoEncontradoException extends Exception {
    public ProductoNoEncontradoException(String nombre) {
        super("Producto '" + nombre + "' no encontrado en el almacén.");
    }
}
