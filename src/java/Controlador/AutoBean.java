package Controlador;

import Modelo.Auto;
import Modelo.ListaAuto;
import java.util.Scanner;

public class AutoBean {
    Auto auto;
    ListaAuto listaAuto;

    public AutoBean() {
        listaAuto = new ListaAuto();
    }
    
    public Auto crearAuto(String patente, String marca, String modelo, String comb, String color) {
        Auto unAuto = new Auto();
        unAuto.setPatente(patente);
        unAuto.setModelo(modelo);
        unAuto.setMarca(marca);
        unAuto.setComb(comb);
        unAuto.setColor(color);
        return unAuto;
    }
    
    public void llenarListado() {
        listaAuto.getListadoAuto().add(auto);
    }
    
    public void visualizarListado() {
        for(Auto cadaAuto: listaAuto.getListadoAuto()) {
            System.out.println("Auto - Patente: " + cadaAuto.getPatente() + " - Marca: " + cadaAuto.getMarca() + " - Modelo: " + cadaAuto.getModelo() + " - Tipo de Combustible: " + cadaAuto.getComb() + " - Color: " + cadaAuto.getColor());
        }
    }
    
    public void modificarAuto() {
        Scanner lec = new Scanner(System.in);
        String pat;
        System.out.println("Ingrese la patente del auto: ");
        pat = lec.next();
        for(Auto cadaAuto: listaAuto.getListadoAuto()) {
            if(cadaAuto.getPatente() == pat) {
                Scanner lect = new Scanner(System.in);
                int m = lect.nextInt();
                System.out.println("- Seleccione lo que quiera modificar -");
                System.out.println("1. Marca");
                System.out.println("2. Modelo");
                System.out.println("3. Color");
                System.out.println("4. Tipo de combustible");
                switch(m) {
                    case 1:
                        String newMarca = lec.next();
                        cadaAuto.setMarca(newMarca);
                    case 2:
                        String newModelo = lec.next();
                        cadaAuto.setModelo(newModelo);
                    case 3:
                        String newColor = lec.next();
                        cadaAuto.setColor(newColor);
                    case 4:
                        String newTip = lec.next();
                        cadaAuto.setComb(newTip);
                }
            }
        }
    }
}
