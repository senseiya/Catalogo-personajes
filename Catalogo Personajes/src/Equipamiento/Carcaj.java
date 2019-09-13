/**
 * 31/08/2019 07:31:32 PM
 * Autor: Santiago Roa
 */
package Equipamiento;

public class Carcaj extends Arma_secundaria {

    public Carcaj(String nombre, int defensaFisica, int defensaMagica) {
        this.nombre = nombre;
        this.defensaFisica = defensaFisica;
        this.defensaMagica = defensaMagica;
    }

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
