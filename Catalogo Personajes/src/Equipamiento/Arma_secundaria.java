/**
 * 31/08/2019 07:30:14 PM
 * Autor: Santiago Roa
 */
package Equipamiento;

public abstract class Arma_secundaria {

    protected String nombre;
    protected int defensaFisica;
    protected int defensaMagica;

    public String getNombre() {
        return nombre;
    }

    public int getDefensaFisica() {
        return defensaFisica;
    }

    public int getDefensaMagica() {
        return defensaMagica;
    }
}
