package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

public class ServicioAhorcado {

    //Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
    //Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
    //Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. 
    //Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
//char[] aCaracteres = sCadena.toCharArray();
    Ahorcado n = new Ahorcado();
    
    public void crearJuego(Ahorcado n) {
        Scanner leer = new Scanner(System.in);
//        System.out.println("Ingresa la palabra a buscar");
//        String palabra = leer.next();
        
       
        int tamanio;
        System.out.println("ingrese la palabra a adivinar");
        String aux=leer.next();
        tamanio=aux.length();
        String[] palabraN = new String[tamanio];        
        
        for(int i=0;i<tamanio;i++){
           palabraN[i]=aux.substring(i, i+1);
           //System.out.println(palabraN[i]);
        }
        
        n.setpSecreta(palabraN);
        
        
        
        
        
//        for(int i=0;i<tamanio;i++){
//            System.out.println("*"+n.getpSecreta()[i]);
//        }
        
        
    }
        
   // Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.

    
    public void longitud(Ahorcado n){
        System.out.println("La longitud de la palabra es de : " + n.getpSecreta().length + " caracteres");
        
    }
    
    
    
    
} 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        
//        for (int i = 0; i < n.getpSecreta().length; i++) {
//            n.getpSecreta()[i]=String.valueOf(palabra.charAt(i));
//            
//            
//        }
//        
//       
//    }
//    
//    public void mostrar(Ahorcado n) {
//        for (int i = 0; i < n.getpSecreta().length; i++) {
//            System.out.println(n.getpSecreta()[i]);
//        }
//        
//    }
//}
