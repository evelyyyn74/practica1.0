public  abstract class Persona {

    private String nombre;
    private String email;


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email, String nombre) {
        this.email = email;
        this.nombre = nombre;
    }

    
}
