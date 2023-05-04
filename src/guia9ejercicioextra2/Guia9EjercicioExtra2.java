package guia9ejercicioextra2;

import Entidad.Ahorcado;
import Servicio.ServicioAhorcado;

public class Guia9EjercicioExtra2 {

    public static void main(String[] args) {

        ServicioAhorcado p = new ServicioAhorcado();
        Ahorcado n = new Ahorcado();
        p.crearJuego(n);
        //p.mostrar(n);
        p.longitud(n);
    }

}
