public class Curso extends Persona{

    private  String codigo;
    private String nombre;
    private Estudiante[] inscritos;

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getnombre() {
        return nombre;
    }
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    public Estudiante[] getInscritos() {
        return inscritos;
    }
    public void setInscritos(Estudiante[] inscritos) {
        this.inscritos = inscritos;
    }
    public Curso(String codigo, String nombre, int capacidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.inscritos = new Estudiante[capacidad];

    }
   
     public void inscribir(Estudiante estudiante) {
        for (int i = 0; i < inscritos.length; i++) {
            if (inscritos[i] == null) {
                inscritos[i] = estudiante;
                return;
            }
        }
    }
    public double calcularPromedioGrupo(){
        double suma =0;
        int contador =0;

        for(int i = 0; i < inscritos.length; i++) {
            if (inscritos[i] != null) {
                suma += inscritos[i].getPromedio();
                contador++;
            }
        }
        if(contador > 0){
            return suma/contador;
        }else{
            return 0;
        }
    }
    

    
    
}