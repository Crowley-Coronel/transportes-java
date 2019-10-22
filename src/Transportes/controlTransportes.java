package Transportes;

import Aereos.Avion;
import Terrestres.Carro;
import Acuaticos.Lancha;

public class controlTransportes {

    public static void main(String[] args) {

        Carro jetta = new Carro("Jetta");
        jetta.arrancar();
        jetta.set_velocidad(60);

        Avion avioneta = new Avion("Avioneta");
        avioneta.setear_velocidad(100);
        int velocidad_avioneta = avioneta.obtener_velocidad();
        System.out.println("La velocidad que se ha seteado para avioneta es : " + velocidad_avioneta + "km/h");

        Lancha lanchita = new Lancha("Pequeña lancha");
        lanchita.set_velocidad(50);
        lanchita.arrancar();
    }
}
