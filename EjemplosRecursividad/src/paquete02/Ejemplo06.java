/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

public class Ejemplo06 {

    public static void main(String[] args) {

        int[] valor1 = {100, 1000, 200, 2000, 3000};
        int[] valor2 = {1, 2, 3, 4, 5};
        
        // Encontrar la suma de las posiciones
        // [0][0]
        // [1][1]
        // hasta el final
        // en el primerr for estamos haciendo que el for recorra por todos los arreglos y se guarda
        // en obtener suma y de ahi s e presenta 
        for (int i = 0; i < valor1.length; i++) {
            System.out.printf("El valor es: %d\n", 
                    obtenerSuma(valor1[i], valor2[i]));
        }
        /*
        en este for se deeclara las variables de tipo entero y depediendo de la posicion luego se va hacer la suma
        */
        for (int i = 0; i < valor1.length; i++) {
            int num1 = valor1[i];
            int num2 = valor2[i];
            System.out.printf("El valor es: %d\n", 
                    obtenerSuma(num1, num2));
        }
        /*
        en este for se declara otra variable mas de tipo entero y se realiza la suma  y de ahi se la presenta
        */
        for (int i = 0; i < valor1.length; i++) {
            int num1 = valor1[i];
            int num2 = valor2[i];
            int suma = obtenerSuma(num1, num2); 
            System.out.printf("El valor es: %d\n", suma);
        }
        
        

    }

    public static int obtenerSuma(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            if (a == 0) {
                return b;
            } else {
                return 1 + obtenerSuma(a, b - 1);
            }
        }
    }

}
