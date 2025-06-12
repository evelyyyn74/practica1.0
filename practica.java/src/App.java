public class App {
    public static void main(String[] args) throws Exception {
       cuenta CuentaComun = new CuentaComun("12345", "Juan Perez", 1000.0);
       CuentaComun.depositar(500.0);
       CuentaComun.retirar(200.0);

       CuentaAhorros CuentaAhorros = new CuentaAhorros("67890", "Maria Lopez", 2000.0, 0.05);  
         CuentaAhorros.depositar(700);
         CuentaAhorros.retirar(300.0);
         CuentaAhorros.aplicaInteres();

    }
}
