package Modelo;

import java.util.ArrayList;

public class ListaRectángulo {
    private ArrayList<Rectángulo> listadoRectángulo;

    public ListaRectángulo() {
        listadoRectángulo = new ArrayList();
    }

    public ListaRectángulo(ArrayList<Rectángulo> listadoRectángulo) {
        this.listadoRectángulo = listadoRectángulo;
    }

    /**
     * @return the listadoRectángulo
     */
    public ArrayList<Rectángulo> getListadoRectángulo() {
        return listadoRectángulo;
    }

    /**
     * @param listadoRectángulo the listadoRectángulo to set
     */
    public void setListadoRectángulo(ArrayList<Rectángulo> listadoRectángulo) {
        this.listadoRectángulo = listadoRectángulo;
    }
    
}
