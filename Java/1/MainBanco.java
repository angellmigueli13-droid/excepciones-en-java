public class MainBanco {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN BANCARIA ===\n");

        CuentaBancaria cuenta = new CuentaBancaria("Ana García", 500.00);
        System.out.println("Cuenta creada: " + cuenta);
        System.out.println();

        // Caso 1: Retiro exitoso
        System.out.println("--- Caso 1: Retiro válido ($200) ---");
        try {
            cuenta.retirar(200.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        // Caso 2: Saldo insuficiente
        System.out.println("--- Caso 2: Retiro mayor al saldo ($400) ---");
        try {
            cuenta.retirar(400.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println("❌ SaldoInsuficienteException: " + e.getMessage());
        }
        System.out.println();

        // Caso 3: Monto negativo
        System.out.println("--- Caso 3: Monto negativo (-50) ---");
        try {
            cuenta.retirar(-50.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("❌ IllegalArgumentException: " + e.getMessage());
        }
        System.out.println();

        System.out.println("Estado final: " + cuenta);
    }
}
