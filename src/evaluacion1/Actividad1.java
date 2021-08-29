package evaluacion1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sueldoBruto, v1, v2, v3, ventasTotales, comision, totalLiquido;
        System.out.println("Su sueldo líquido será: El sueldo bruto más la suma del 10% de sus 3 mejores ventas :) \n");
        System.out.print("Ingrese sueldo bruto o base   : $ ");
        sueldoBruto = Integer.parseInt(br.readLine());
        System.out.print("Ingrese primera venta         : $ ");
        v1 = Integer.parseInt(br.readLine());
        System.out.print("Ingrese segunda venta         : $ ");
        v2 = Integer.parseInt(br.readLine());
        System.out.print("Ingrese tercera venta         : $ ");
        v3 = Integer.parseInt(br.readLine());
        ventasTotales = v1 + v2 + v3;
        comision = (int) (ventasTotales * 0.1);
        totalLiquido = sueldoBruto + comision;
        System.out.println("");
        System.out.println("Total comisión                : $ " + comision);
        System.out.println("Total a pagar                 : $ " + totalLiquido);
    }
}
