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
public class Ejercicio_recursividad_DDR_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Aqui ponemos las variables de base y exponente
int base = 10;
int exponente = -2;
//Despues ponemos para imprimir el resultado de las variable ya declaradas
System.out.println(potencia(base, exponente));
}
public static double potencia(int base, int exponente) {
if (exponente == 0) { //caso base sea == 0
return 1; //10^0 = 1
} else if (exponente == 1) { //caso base ==1
return base; //10^1 = 10
} else if (exponente < 0) { //este es cuando el exponente es negativo
return potencia(base, exponente + 1) / base;
} else { //este else es el caso si el exponente es positivo
return base * potencia(base, exponente - 1);
}
}
}