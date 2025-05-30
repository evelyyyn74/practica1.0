import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingresa tu usuario: ");
        
        App usuario = new App();
        String nombreUsuario = JOptionPane.showInputDialog("Ingresa tu usuario");
        usuario.setNombreUsuario(nombreUsuario);

        String password = JOptionPane.showInputDialog("ingresa tu contraseña");
        usuario.setPassword(password);
        
        if(usuario.getNombreUsuario() == null) {
            JOptionPane.showMessageDialog(null, "El usuario no se ha creado.");
            return;
        }

        String intentPassword = JOptionPane.showInputDialog("Ingresa tu contraseña ");
        if (usuario.autenticar(intentPassword)) {
            JOptionPane.showMessageDialog(null, "Acceso concedido");
        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado");
        }
        
    }
}
