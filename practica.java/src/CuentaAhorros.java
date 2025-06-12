public class CuentaAhorros extends cuenta {

    private double tasaInteresAnual;


    public void aplicaInteres(){
        double interes=saldo*(tasaInteresAnual/12);
        saldo = saldo + interes;
        setSaldo(getSaldo() + interes);
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
    }

    public CuentaAhorros(String numeroCuenta,String titular, double saldo, double tasaInteresAnual) {
        super(numeroCuenta, titular, saldo);
        this.tasaInteresAnual = tasaInteresAnual;
    }
    
}
