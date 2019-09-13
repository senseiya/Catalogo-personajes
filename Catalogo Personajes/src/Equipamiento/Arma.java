/**
 * 31/08/2019 07:31:22 PM
 * Autor: Santiago Roa
 */
package Equipamiento;

public abstract class Arma {

    protected String nombre;
    protected int dañoFisico;
    protected int dañoMagico;

    public String getNombre() {
        return nombre;
    }

    public int getDañoFisico() {
        return dañoFisico;
    }

    public int getDañoMagico() {
        return dañoMagico;
    }
}
