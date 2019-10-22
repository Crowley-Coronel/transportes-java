package Terrestres;

public class Carro {

    private final String nombre;

    public Carro(String nombre_carro) {
        nombre = nombre_carro;
    }

    public void arrancar() {
        System.out.println("Arrancando  " + nombre);
    }

    public void set_velocidad(int velocidad) {
        System.out.println("Velocidad de " + nombre + "seteada");
    }

}
