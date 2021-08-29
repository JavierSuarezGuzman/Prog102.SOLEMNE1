package evaluacion1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad3 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Ingrese la cantidad de personas       : ");
        int n = Integer.parseInt(br.readLine());
        int num = n;
        int mujS = 0, homS = 0, mujC = 0, homC = 0, mujV = 0, homV = 0, mujD = 0, homD = 0;
        for (int i = 0; i < n; i++) {
            int caso = (int) (Math.random() * 8 + 1);
            if (caso == 1){
                mujS++;
            }
            if (caso == 2){
                homS++;
            }
            if (caso == 3){
                mujC++;
            }
            if (caso == 4){
                homC++;
            }
            if (caso == 5){
                mujV++;
            }
            if (caso == 6){
                homV++;
            }
            if (caso == 7){
                mujD++;
            }
            if (caso == 8){
                homD++;
            }
        }
        switch(n){
                case 1: mujS++;break;
                case 2: homS++;break;
                case 3: mujC++;break;
                case 4: homC++;break;
                case 5: mujV++;break;
                case 6: homV++;break;
                case 7: mujD++;break;
                case 8: homD++;break;
        }
        System.out.println("");
        System.out.println("La cantidad de mujeres solteras es    : " + mujS);
        System.out.println("La cantidad de hombres solteros es    : " + homS);
        System.out.println("La cantidad de mujeres casadas es     : " + mujC);
        System.out.println("La cantidad de hombres casados es     : " + homC);
        System.out.println("La cantidad de mujeres viudas es      : " + mujV);
        System.out.println("La cantidad de hombres viudos es      : " + homV);
        System.out.println("La cantidad de mujeres divorciadas es : " + mujD);
        System.out.println("La cantidad de hombres divorciados es : " + homD);
        System.out.println("");
    }
}
