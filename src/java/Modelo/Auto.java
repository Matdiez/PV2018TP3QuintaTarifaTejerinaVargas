package Modelo;

public class Auto {
    private String patente;
    private String marca;
    private String modelo;
    private String comb;
    private String color;

    public Auto() {
    }

    public Auto(String patente, String marca, String modelo, String comb, String color) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.comb = comb;
        this.color = color;
    }

    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the comb
     */
    public String getComb() {
        return comb;
    }

    /**
     * @param comb the comb to set
     */
    public void setComb(String comb) {
        this.comb = comb;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
}
