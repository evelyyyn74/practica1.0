public class App {
    public static void main(String[] args) throws Exception {
       EmpleadoPorHoras Empleado1 = new EmpleadoPorHoras("001", "Juan Perez", 20.0, 40);
       Empleado1.calcularSalario();
       System.out.println("El nombre del empleado es: " + Empleado1.getNombre());
       System.out.println("El salario de " + Empleado1.calcularSalario());
       
        
        EmpleadoTiempoCompleto Empleado2 = new EmpleadoTiempoCompleto("002", "Maria Lopez", 3000.0, "Seguro de salud");
         Empleado2.calcularSalario();
         System.out.println("El nombre del empleado es: " + Empleado2.getNombre());
         System.out.println("El salario de " + Empleado2.calcularSalario());
    }
}
