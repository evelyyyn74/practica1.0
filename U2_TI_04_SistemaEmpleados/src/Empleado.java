public abstract class Empleado {
    
    private String id;
    private String nombre;
    private double SalarioBase;

    public Empleado(String id, String nombre, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        SalarioBase = salarioBase;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalarioBase() {
        return SalarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        SalarioBase = salarioBase;
    }

    public abstract double calcularSalario();
    
}
