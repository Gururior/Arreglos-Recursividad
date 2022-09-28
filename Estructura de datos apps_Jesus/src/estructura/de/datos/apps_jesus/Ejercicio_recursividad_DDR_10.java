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
public class Ejercicio_recursividad_DDR_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//declaramos la funcion en entero los numeros 123
int numero = 123;
//Se imprime la accion de "sumaDigitos" con la funcion numero
System.out.println(sumaDigitos(numero));
}

public static int sumaDigitos(int numero){
//los llamamos con if 
if(numero < 10){ //caso base de <10 
return numero; //devuelve el resultado en este caso es el numero

}else{
return (numero % 10) + sumaDigitos(numero/10); //Agarra el digito, lo llamo a la funcion y lo suma
}
}
}
