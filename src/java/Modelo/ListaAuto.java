package Modelo;

import java.util.ArrayList;

public class ListaAuto {
    private ArrayList<Auto> listadoAuto;

    public ListaAuto() {
        listadoAuto = new ArrayList();
    }

    public ListaAuto(ArrayList<Auto> listadoAuto) {
        this.listadoAuto = listadoAuto;
    }

    /**
     * @return the listadoAuto
     */
    public ArrayList<Auto> getListadoAuto() {
        return listadoAuto;
    }

    /**
     * @param listadoAuto the listadoAuto to set
     */
    public void setListadoAuto(ArrayList<Auto> listadoAuto) {
        this.listadoAuto = listadoAuto;
    }

}
