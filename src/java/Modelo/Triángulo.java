package Modelo;

import java.util.Scanner;

public class Triángulo {
    private int[] lados;

    public Triángulo() {
    }
    
    public void ingresarLados() {
        setLados(new int[3]);
        Scanner lec = new Scanner(System.in);
        for(int i=0;i<getLados().length;i++) {
            System.out.println("Ingrese un lado: ");
            getLados()[i] = lec.nextInt();
        }
    }
    
    public Boolean verificarLados() {
        if (getLados()[0]+getLados()[1] > getLados()[2]) {
            if (getLados()[0]+getLados()[2] > getLados()[1]) {
                return getLados()[2]+getLados()[1] > getLados()[0];
            }
            return false;
        }
        return false;
    }
    
    public void calcularPerímetro() {
        ingresarLados();
        Boolean a = verificarLados();
        if(a==true) {
            System.out.println(getLados()[0]+getLados()[1]+getLados()[2]);
        }
    }

    /**
     * @return the lados
     */
    public int[] getLados() {
        return lados;
    }

    /**
     * @param lados the lados to set
     */
    public void setLados(int[] lados) {
        this.lados = lados;
    }
}
