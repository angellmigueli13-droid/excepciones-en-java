// Excepción personalizada para saldo insuficiente
public class SaldoInsuficienteException extends Exception {
    private double saldoActual;
    private double montoSolicitado;

    public SaldoInsuficienteException(double saldoActual, double montoSolicitado) {
        super(String.format(
            "Saldo insuficiente. Saldo disponible: $%.2f | Monto solicitado: $%.2f",
            saldoActual, montoSolicitado
        ));
        this.saldoActual = saldoActual;
        this.montoSolicitado = montoSolicitado;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public double getMontoSolicitado() {
        return montoSolicitado;
    }
}
