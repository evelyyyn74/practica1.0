public class App {

    private String nombreUsuario;
    private String password;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario == null || nombreUsuario.isEmpty()) {
            System.out.println("El nombre de usuario no puede ser nulo o vacío.");
            return;
        }
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
            return;
        }

        boolean Mayuscula = false;
        boolean Minuscula = false;
        boolean Numero = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                Mayuscula = true;
            } else if (Character.isLowerCase(c)) {
                Minuscula = true;
            } else if (Character.isDigit(c)) {
                Numero = true;
            }
        }
        this.password = password;
    }
    public boolean autenticar(String intentPassword) {
        return intentPassword.equals(password);
        
    }
}
