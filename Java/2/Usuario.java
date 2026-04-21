public class Usuario {
    private String nombre;
    private String email;
    private String password;

    public Usuario(String nombre, String email, String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    // Valida ambos datos y lanza la excepción correspondiente
    public void validarDatos() throws EmailInvalidoException, PasswordDebilException {
        validarEmail();
        validarPassword();
    }

    private void validarEmail() throws EmailInvalidoException {
        if (!email.contains("@") || !email.contains(".")) {
            throw new EmailInvalidoException(email);
        }
    }

    private void validarPassword() throws PasswordDebilException {
        if (password.length() < 8) {
            throw new PasswordDebilException("debe tener al menos 8 caracteres (tiene " + password.length() + ").");
        }
        boolean tieneNumero = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                tieneNumero = true;
                break;
            }
        }
        if (!tieneNumero) {
            throw new PasswordDebilException("debe contener al menos un número.");
        }
    }

    public String getNombre() { return nombre; }
    public String getEmail()   { return email; }

    @Override
    public String toString() {
        return "Usuario{nombre='" + nombre + "', email='" + email + "'}";
    }
}
