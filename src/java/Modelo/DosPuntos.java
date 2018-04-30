package Modelo;

import java.util.Scanner;

public class DosPuntos {
    double x1, x2, y1, y2, dis;

    public DosPuntos() {
    }

    public DosPuntos(double x1, double x2, double y1, double y2, double dis) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.dis = dis;
    }
    
    public void ingresarPuntos() {
        Scanner lec = new Scanner(System.in);
        System.out.println("Ingrese el x1: ");
        x1 = lec.nextDouble();
        System.out.println("Ingrese el y1: ");
        y1 = lec.nextDouble();
        System.out.println("Ingrese el x2: ");
        x2 = lec.nextDouble();
        System.out.println("Ingrese el y2: ");
        y2 = lec.nextDouble();
    }
    
    public void calcularDistancia() {
        double pi = Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
        dis = Math.sqrt(pi);
        System.out.println("La distancia entre los dos puntos es: " + dis);
    }
}
