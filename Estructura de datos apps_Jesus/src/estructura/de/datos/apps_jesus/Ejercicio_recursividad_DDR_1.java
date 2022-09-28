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
public class Ejercicio_recursividad_DDR_1 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
      
        int n=10;
//guardamos el resultado en una variable
int resultado=sumaRecursiva(n);
//Mostramos el resultado
System.out.println(resultado);
}
public static int sumaRecursiva(int numero){
int res;
if(numero==1){
//Se termina la recursion
return 1;
}else{
//Se llama a si misma la función con el parametro numero menos 1
res = numero+sumaRecursiva(numero-1);
}
//Devuelve el resultado
return res;

    }
    
}
