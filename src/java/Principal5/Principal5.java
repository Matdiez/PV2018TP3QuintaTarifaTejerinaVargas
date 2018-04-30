package Principal5;

import Controlador.AutoBean;

public class Principal5 {
    
    public static void main(String[] args) {
        AutoBean autito = new AutoBean();
        autito.crearAuto(null , null, null, null, null);
        autito.llenarListado();
        autito.visualizarListado();
        autito.modificarAuto();
    }
}
