import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        //scope
        String cal1 = JOptionPane.showInputDialog("Ingresa tu primer calificacion:");
        String cal2 = JOptionPane.showInputDialog("Ingresa tu segunda calificacion:");
        String cal3 = JOptionPane.showInputDialog("Ingresa tu tercera calificacion:");

        double calificacion1 = Double.parseDouble(cal1);
        double calificacion2 = Double.parseDouble(cal2);
        double calificacion3 = Double.parseDouble(cal3);

        double total = (calificacion1 + calificacion2 + calificacion3) / 3;
        JOptionPane.showMessageDialog(null, "Tu promedio es: " + total);
}
}