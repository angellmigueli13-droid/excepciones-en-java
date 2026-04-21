// Clase con encapsulamiento: el saldo no se puede modificar directamente
public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Solo getter, sin setter para saldo (encapsulamiento)
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser positivo.");
        }
        this.saldo += cantidad;
        System.out.printf("Depósito exitoso de $%.2f. Nuevo saldo: $%.2f%n", cantidad, saldo);
    }

    public void retirar(double cantidad) throws SaldoInsuficienteException {
        // Monto negativo → excepción estándar de Java
        if (cantidad <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser un valor positivo.");
        }
        // Saldo insuficiente → excepción personalizada
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException(saldo, cantidad);
        }
        this.saldo -= cantidad;
        System.out.printf("Retiro exitoso de $%.2f. Saldo restante: $%.2f%n", cantidad, saldo);
    }

    @Override
    public String toString() {
        return String.format("Cuenta de %s | Saldo: $%.2f", titular, saldo);
    }
}
