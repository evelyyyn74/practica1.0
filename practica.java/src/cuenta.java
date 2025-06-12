public  abstract class cuenta {

    private String numeroCuenta;
    private String titular;
    protected double saldo;
    

    public cuenta(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("No se puede hacer un deposito:" + cantidad);
        }
    }
    public void retirar(double cantidad){
        if(cantidad > 0 && saldo >= cantidad){
            if(cantidad%100==0){
                saldo -= cantidad;

            }else{
                System.out.println("Solo pueddes retirar multiplod de 100: " );
            } 
        }else{
            System.out.println("No se puede hacer el deposito de: ");
        }
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public String getTitula() {
        return titular;
    }
    public void setTitula(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}
