public class App {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso("CS101", "calculo", 3);

        Estudiante estudiante1 = new Estudiante("evelyn", "evelyn@utez.edu.mx", 8.5);
        Estudiante estudiante2 = new Estudiante("juan", "juan@utez.edu.mx", 9.0);
        Estudiante estudiante3 = new Estudiante("maria", "maria@utez.edu.mx", 8.0);

        curso.inscribir(estudiante1);
        curso.inscribir(estudiante2);  
        curso.inscribir(estudiante3);  
        System.out.println("Promedio del grupo: " + curso.calcularPromedioGrupo());

    }
}
