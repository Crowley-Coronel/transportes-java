package Acuaticos;

public class Lancha {

    private final String nombre;

    public Lancha(String nombre_lancha) {
        nombre = nombre_lancha;
    }

    public void arrancar() {
        System.out.println("Arrancando  " + nombre);
    }

    public void set_velocidad(int velocidad) {
        System.out.println("Velocidad  " + nombre + " " + velocidad + "km/h");
    }

}
