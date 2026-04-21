public class PasswordDebilException extends Exception {
    public PasswordDebilException(String motivo) {
        super("Contraseña débil: " + motivo);
    }
}
