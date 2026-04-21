public class StockAgotadoException extends Exception {
    public StockAgotadoException(String nombre, int stockDisponible, int cantidadPedida) {
        super(String.format(
            "Stock insuficiente para '%s'. Disponible: %d | Solicitado: %d",
            nombre, stockDisponible, cantidadPedida
        ));
    }
}
