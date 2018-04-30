package Principal4;

import Controlador.RectánguloBean;
import java.util.Scanner;

public class Principal4 {
    
    public static void main(String[] args) {
        RectánguloBean jajaxd = new RectánguloBean();
        jajaxd.llenarListado();
        jajaxd.visualizarListado();
        Scanner tab = new Scanner(System.in);
        System.out.println("Ingrese el número del rectángulo que desea eliminar");
        int i = tab.nextInt();
        jajaxd.eliminarRectángulo(i);
        jajaxd.visualizarListado();
    }
}
