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
public class ejercicio_recursividad_DDR_7 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        int a = 254; //400 + 50 + 2
        System.out.println(invertirNum(a, 2));
        }
        public static int invertirNum(int num, int pos){
        //Si es menor que 10 devuelvo el numero (el ultimo numero)
        if(num < 10){
        return num;
        }else{
        //modulo del numero y se multiplica por la potencia (4 * 100) por ejemplo con la accion Math.pow 
        return (num % 10) * (int) Math.pow(10, pos) + (invertirNum(num/10, pos-1));
        }
    }
}
