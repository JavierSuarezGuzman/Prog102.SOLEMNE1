package evaluacion1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;
        do {
            System.out.print("Ingrese la cantidad de nuestro arreglo      : ");
            n = Integer.parseInt(br.readLine());
        } while (n <= 0);
        int num[] = new int[n];
        System.out.print("El arreglo contendrá los siguientes números : ");
        for (int i = 0; i < n; i++) {
            num[i] = (int) (Math.random() * 60 + 10);
            System.out.print("[" + num[i] + "]");
        }
        System.out.println("");
        System.out.println("Estos se encuetran entre el 10 y el 70.\n");
        System.out.println("A continuación una estadística con el arreglo.\n");
        int contaPar = 0, contaImpar = 0;
        for (int i = 0; i < n; i++) {
            if (num[i] % 2 == 0) {
                contaPar++;
            } else {
                contaImpar++;
            }
        }
        int contaDiv3 = 0;
        for (int i = 0; i < n; i++) {
            if (num[i] % 3 == 0) {
                contaDiv3++;
            }
        }
        int contaDiv5 = 0;
        for (int i = 0; i < n; i++) {
            if (num[i] % 5 == 0) {
                contaDiv5++;
            }
        }
        System.out.println("Cantidad de números pares                   : " + contaPar);
        System.out.println("Cantidad de números impares                 : " + contaImpar);
        System.out.println("Cantidad de números divisibles por 3        : " + contaDiv3);
        System.out.println("Cantidad de números divisibles por 5        : " + contaDiv5);
        System.out.println("");
    }
}
