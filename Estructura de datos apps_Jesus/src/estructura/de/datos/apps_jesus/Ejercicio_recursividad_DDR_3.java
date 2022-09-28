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
public class Ejercicio_recursividad_DDR_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int[] array={1,2,3,4,5}; //Creamos un array y tambien declaramos como valor entero
mostrarArrayRecursivo(array, 0); //Pasamos el array y la posicion donde empieza para que muestre
}
public static void mostrarArrayRecursivo(int[] array, int indice){
/*1º forma*/
//Muestra con la condicion else para llamarlo
/*
if (indice == (array.length-1)){
System.out.println(array[indice]);
}else{
//Lo llama el funcion del inicio pero con else
System.out.println(array[indice]);
mostrarArrayRecursivo(array, indice+1);
}
*/

/*2º forma*/
/*Es similar pero sin else con la etiqueta System para imprimir el resultado y llamar la funcion ya declarado*/
if (indice != array.length){
//Mostramos el valor en ese indice a la que declaramos al inicio
System.out.println(array[indice]);
//Llamamos recursivamente a la función de la segunda linea 
mostrarArrayRecursivo(array, indice+1);
}
}
}
