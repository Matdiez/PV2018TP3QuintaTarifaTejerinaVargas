package Controlador;

import Modelo.ListaRectángulo;
import Modelo.Rectángulo;

public class RectánguloBean {
    private Rectángulo rectángulo;
    private ListaRectángulo listaRectángulo;

    public RectánguloBean() {
        listaRectángulo = new ListaRectángulo();
    }
    
    public Rectángulo crearRectángulo(int base, int altura) {
        Rectángulo unRectángulo = new Rectángulo();
        unRectángulo.setBase(base);
        unRectángulo.setAltura(altura);
        unRectángulo.setPer(unRectángulo.getBase()*2+unRectángulo.getAltura()*2);
        unRectángulo.setSup(unRectángulo.getBase()*unRectángulo.getAltura());
        return unRectángulo;
    }

    public void llenarListado() {
        listaRectángulo.getListadoRectángulo().add(crearRectángulo(4,6));
        listaRectángulo.getListadoRectángulo().add(crearRectángulo(3,7));
        listaRectángulo.getListadoRectángulo().add(crearRectángulo(5,10));
    }
    
    public void visualizarListado() {
        for(Rectángulo cadaRectángulo : listaRectángulo.getListadoRectángulo()) {
            System.out.println("Rectángulo - Base: " + cadaRectángulo.getBase() + " - Altura: " + cadaRectángulo.getAltura() + " - Perímetro: " + cadaRectángulo.getPer() + " - Superficie: " + cadaRectángulo.getSup());
        }
    }
    
    public void eliminarRectángulo(int i) {
        listaRectángulo.getListadoRectángulo().remove(i);
    }
    /**
     * @return the rectángulo
     */
    public Rectángulo getRectángulo() {
        return rectángulo;
    }

    /**
     * @param rectángulo the rectángulo to set
     */
    public void setRectángulo(Rectángulo rectángulo) {
        this.rectángulo = rectángulo;
    }

    /**
     * @return the listaRectángulo
     */
    public ListaRectángulo getListaRectángulo() {
        return listaRectángulo;
    }

    /**
     * @param listaRectángulo the listaRectángulo to set
     */
    public void setListaRectángulo(ListaRectángulo listaRectángulo) {
        this.listaRectángulo = listaRectángulo;
    }
    
}
