public class Producto {
    private String nombre;
    private int stock;

    public Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    public String getNombre() { return nombre; }
    public int getStock()     { return stock; }

    public void reducirStock(int cantidad) {
        this.stock -= cantidad;
    }

    @Override
    public String toString() {
        return String.format("%-20s | Stock: %d", nombre, stock);
    }
}
