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
public class Ejercicio_recursividad_DDR_6 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
//Serie fibonacci
// 1 1 2 3 5 8 13 21 34 55
//llamada inicial en entero para la posicion y para el resultado
int posicion = 5;
int resultado = fibonacciRecursivo(posicion);
//luego se imprime el resultado
System.out.println(resultado);
}
public static int fibonacciRecursivo(int n) {
//CASO BASE, si es cero devuelve un cero
//Puedes poner n<=0 tambien para incluir negativos
if (n == 0) {
return 0;
//CASO BASE, si es 1 devuelve un 1
} else if (n == 1) {
return 1;
} else {
//Hago la suma
return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
}
}
}
