public class App {
   
   public static void main(String[] args) {
      CuentaBancaria cuenta = new CuentaBancaria();
      cuenta.setTitular("Evelyn");
      System.out.println("Titular: " + cuenta.getTitular());

      cuenta.depositar(1000);
      System.out.println("Saldo: " + cuenta.getSaldo());
      cuenta.retirar(200);
      System.out.println("Saldo actual: " + cuenta.getSaldo());
      cuenta.retirar(10000);
      System.out.println("Saldo actual: " + cuenta.getSaldo());

   } 
   
}
