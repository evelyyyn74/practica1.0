public class App {
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[5];

        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new Estudiante();
            estudiantes[i].setNombre("Estudiante " + (i + 1));
            estudiantes[i].setMatricula("2024" + (i + 1));

            for (int j = 0; j < 5; j++) {
                double nota = 60 + Math.random() * 40;
                estudiantes[i].setNota(j, nota);
            }
        }

        for (Estudiante est : estudiantes) {
            System.out.println("Nombre: " + est.getNombre());
            System.out.printf("Promedio: %.2f%n", est.calcularPromedio());
            System.out.println("¿Aprobado?: " + (est.aprobado() ? "Si" : "No"));
            System.out.println("------------------------");
        }
    }
}
