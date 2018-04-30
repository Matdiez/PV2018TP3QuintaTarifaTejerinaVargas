package aplicación.modelo;

import java.util.ArrayList;

public class ListaLibro {
    private ArrayList<Libro> listadoLibro;

    public ListaLibro() {
        listadoLibro = new ArrayList();
    }

    public ListaLibro(ArrayList<Libro> listadoLibro) {
        this.listadoLibro = listadoLibro;
    }

    /**
     * @return the listadoLibro
     */
    public ArrayList<Libro> getListadoLibro() {
        return listadoLibro;
    }

    /**
     * @param listadoLibro the listadoLibro to set
     */
    public void setListadoLibro(ArrayList<Libro> listadoLibro) {
        this.listadoLibro = listadoLibro;
    }
    
}
