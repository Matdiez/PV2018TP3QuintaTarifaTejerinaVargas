package Modelo;

public class Rectángulo {
    private int base;
    private int altura;
    private int per;
    private int sup;

    public Rectángulo() {
    }

    public Rectángulo(int base, int altura, int per, int sup) {
        this.base = base;
        this.altura = altura;
        this.per = per;
        this.sup = sup;
    }

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the per
     */
    public int getPer() {
        return per;
    }

    /**
     * @param per the per to set
     */
    public void setPer(int per) {
        this.per = per;
    }

    /**
     * @return the sup
     */
    public int getSup() {
        return sup;
    }

    /**
     * @param sup the sup to set
     */
    public void setSup(int sup) {
        this.sup = sup;
    }
    
}
