/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.datos.apps_jesus;

/**
 *
 * @author helte
 */
public class Ejercicio_recursividad_DDR_8 {

    /**
     * @param args the command line arguments
     */
    
public static void main(String[] args) {
//Declaramos pero en ves de numero ahora toca de con palabras
//su valor sera String
    String palabra = "Hola";
//es para mostrar el resultado
System.out.println(invertirPalabra(palabra, palabra.length()-1));
}
//Aqui llamamos la funcion invertirPalabra y metemos String para la palabra y la longitud es para cuanto mide la palabra
public static String invertirPalabra(String palabra, int longitud){
//Luego iniciamos con if para la condicion con la longitud ==0
    if(longitud==0){

return palabra.charAt(longitud)+"";
}else{
//Por ultimo aqui concatenamos la longitud con "invertirPalabra" para hacer la acción
return palabra.charAt(longitud) + (invertirPalabra(palabra, longitud-1));
}
}
}