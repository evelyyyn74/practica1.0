public class App {
    public static void main(String[] args)throws Exception {
        computadora  miComputadora = new computadora("Dell", "XPS 15");
        miComputadora.setModelo("XPS 15");

        System.out.println("Marca: " + miComputadora.getmarca());
        System.out.println("Modelo: " + miComputadora.getmodelo());
        miComputadora.encender();
        miComputadora.encender();
        miComputadora.apagar();
    
    }
}