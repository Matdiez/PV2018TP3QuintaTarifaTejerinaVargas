package aplicación.controlador;

import aplicación.modelo.Libro;
import aplicación.modelo.ListaLibro;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class LibroBean implements Serializable {
    private Libro libro;
    private ListaLibro listaLibro;
    private String A;
    private String B;
    private String C;
    private String D;

    public LibroBean() {
        listaLibro = new ListaLibro();
    }
    
    public void guardarLibro() {
        setLibro(new Libro(getA(),getB(),getC(),getD()));
        getListaLibro().getListadoLibro().add(getLibro());
    }
    
    /**
     * @return the libro
     */
    public Libro getLibro() {
        return getLibro();
    }

    /**
     * @param unLibro the unLibro to set
     */
    public void setLibro(Libro unLibro) {
        this.setLibro(unLibro);
    }

    /**
     * @return the listaLibro
     */
    public ListaLibro getListaLibro() {
        return listaLibro;
    }

    /**
     * @param listaLibro the listaLibro to set
     */
    public void setListaLibro(ListaLibro listaLibro) {
        this.listaLibro = listaLibro;
    }

    /**
     * @return the A
     */
    public String getA() {
        return A;
    }

    /**
     * @param A the A to set
     */
    public void setA(String A) {
        this.A = A;
    }

    /**
     * @return the B
     */
    public String getB() {
        return B;
    }

    /**
     * @param B the B to set
     */
    public void setB(String B) {
        this.B = B;
    }

    /**
     * @return the C
     */
    public String getC() {
        return C;
    }

    /**
     * @param C the C to set
     */
    public void setC(String C) {
        this.C = C;
    }

    /**
     * @return the D
     */
    public String getD() {
        return D;
    }

    /**
     * @param D the D to set
     */
    public void setD(String D) {
        this.D = D;
    }
}
