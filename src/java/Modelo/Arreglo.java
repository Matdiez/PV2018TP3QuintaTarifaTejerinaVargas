package Modelo;

import java.util.Scanner;

public class Arreglo {

    public Arreglo() {
    }
    private int[] arreglo;

    public void ingresarNum() {
        arreglo = new int[10];
        Scanner lec = new Scanner(System.in);
        int i, lim;
        for(i=0;i<10;i++) {
            System.out.println("Ingrese un número (2 veces): ");
            //jejox
            lim = lec.nextInt();
            getArreglo()[i] = lec.nextInt();
        }
    }

        
    public void mostrarNum() {
        int num = getArreglo().length;
        double prom = 0;
        int i, j, may, men;
        for(i=0;i<10;i++) {
            System.out.println(getArreglo()[i]);
            prom = prom+getArreglo()[i];
        }
        prom = prom/10;
        may=men=arreglo[0];
        for(j=1;j<10;j++) {
            if(arreglo[j]>may) {
                may = arreglo[j];
            }
            if(arreglo[j]<men) {
                men = arreglo[j];
            }
        }
        System.out.println("El n° mayor es: " + may);
        System.out.println("El n° menor es: " + men);
        System.out.println("El promedio es: " + prom);
    }
    /**
     * @return the arreglo
     */
    public int[] getArreglo() {
        return arreglo;
    }

    /**
     * @param arreglo the arreglo to set
     */
    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }
    
}