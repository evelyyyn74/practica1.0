public class CuentaBancaria {
    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito exitoso de: " + monto);
        } else {
            System.out.println("El deposito no fue exitoso.");
        }
    } 

    public boolean retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro exitoso de: " + monto);
            
            return true;
        }else {
            System.out.println("Retiro fallido: " + monto );
        }
        return false;
    }
}