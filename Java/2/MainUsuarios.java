public class MainUsuarios {
    public static void main(String[] args) {
        System.out.println("=== VALIDADOR DE REGISTRO DE USUARIOS ===\n");

        // Caso 1: Email inválido
        System.out.println("--- Caso 1: Email sin '@' ---");
        registrar(new Usuario("Carlos", "carlosgmail.com", "segura123"));

        // Caso 2: Password sin número
        System.out.println("\n--- Caso 2: Password sin número ---");
        registrar(new Usuario("Laura", "laura@correo.com", "sinNumeros"));

        // Caso 3: Password muy corta
        System.out.println("\n--- Caso 3: Password muy corta ---");
        registrar(new Usuario("Pedro", "pedro@mail.com", "abc1"));

        // Caso 4: Registro exitoso
        System.out.println("\n--- Caso 4: Datos válidos ---");
        registrar(new Usuario("María", "maria@gmail.com", "Segura2024"));
    }

    // Método auxiliar que encapsula el bloque try-catch con múltiples catch
    static void registrar(Usuario u) {
        try {
            u.validarDatos();
            System.out.println("✅ Usuario registrado exitosamente: " + u);
        } catch (EmailInvalidoException e) {
            System.out.println("❌ EmailInvalidoException: " + e.getMessage());
        } catch (PasswordDebilException e) {
            System.out.println("❌ PasswordDebilException: " + e.getMessage());
        }
    }
}
