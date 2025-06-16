public class Estudiante extends Persona{

    private double promedio;

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Estudiante(String nombre, String email, double promedio ) {
        this.promedio = promedio;
    }

    

    
}