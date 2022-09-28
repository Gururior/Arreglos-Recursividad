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
public class Ejercicio_recursividad_DDR_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declaramos como entero la matriz lo ubicamos entre parentesis los numeros 
int[][] m = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};
//llamada inicial
recorrerMatrizRecursivo(m, 0, 0);
}
//Aqui ponemos i y j como entero para llamarlo en cada fila
public static void recorrerMatrizRecursivo(int[][] m, int i, int j) {
//Muestro el numero (sin salto de linea)
System.out.print(m[i][j] + " ");
//
if (i != m.length - 1 || j != m[i].length - 1) {
//Indico si llego al final de la fila
if (j == m[i].length - 1) {
//Paso a la siguiente fila con los simbolos ++
i++;
//Reinicio la j
j = 0;
//Salto de linea (solo formato)
System.out.println("");
} else {
//Paso a la siguiente columna
j++;
}
//Volvemos a llamar la función recursivamente para recorrer los numeros
recorrerMatrizRecursivo(m, i, j);
}
}
}
