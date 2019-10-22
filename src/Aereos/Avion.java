package Aereos;

public class Avion {

    private String nombre;
    private int velocidad;

    public Avion(String nombre_avion) {
        nombre = nombre_avion;
    }

    public void setear_velocidad(int velocidad_avion) {
        velocidad = velocidad_avion;
        System.out.println("Velocidad de " + nombre + "seteada");
    }

    public int obtener_velocidad() {
        return velocidad;
    }

}
