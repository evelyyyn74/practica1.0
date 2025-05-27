public class Computadora {
    private String marca;
    private String modelo;
    private boolean encendida;

    public Computadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.encendida = false;
    }
    public void encender(){
        if (encendida){
            encendida = true;
        }else{
            System.out.println("Esta encendido.");
            encendida = true;
        }
    }
    public void apagar(){
        if (encendida){
            System.out.println("Esta apagado.");
            encendida = false;
        }else{
            encendida = false;
        }
    }
    public String getmarca() {
        return marca;
    }
    public String getmodelo() {
        return modelo;
    }
    public boolean isEncendida() {
        return encendida;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}

