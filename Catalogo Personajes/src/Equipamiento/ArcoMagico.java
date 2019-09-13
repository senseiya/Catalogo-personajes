/**
 * 31/08/2019 07:30:45 PM
 * Autor: Santiago Roa
 */
package Equipamiento;

public class ArcoMagico extends Arma {

    public ArcoMagico(String nombre, int dañoFisico, int dañoMagico) {
        this.nombre = nombre;
        this.dañoFisico = dañoFisico;
        this.dañoMagico = dañoMagico;
    }

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
