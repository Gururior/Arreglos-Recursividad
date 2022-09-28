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
public class Ejercicio_recursividad_DDR_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int[] array={1,2,3,4,5}; //Declaramos tres funciones la primera es una array en entero
int elementoBuscar=3;   //La segunda es para buscar el resultado
int posElementoEncontrado=posicionElementoRecursivo(array, elementoBuscar,0);
System.out.println(posElementoEncontrado); //Y por ultimo esta funcion es para encontrar y mostrar mediante de println del resultado
}
public static int posicionElementoRecursivo(int[] array, int elementoBuscar ,int indice){
//aqui hacemos la condicion if y llamamos la funcion "elementoBuscar" para que busque la array del 1 al 5 que los declaramos antes 
if(indice==array.length || array[indice]==elementoBuscar){
//Hacemos otra condicion pero la funcion del resultado del "posElementoEncontrado"
if(indice==array.length){
//Despues ponemos la condicion return
return -1;
//Abrimos el primer else para otra indicacion con su respectivo return
}else{
return indice;
}
}else{
return posicionElementoRecursivo(array, elementoBuscar, indice+1); //Por ulttima accion es de posicionar los elementos para la array mientras busca el resultado y lo imprima con el indice +1
}
}
}