/**
 * 31/08/2019 07:30:59 PM
 * Autor: Santiago Roa
 */
package Equipamiento;

public class Escudo extends Arma_secundaria {

    public Escudo(String nombre, int defensaFisica, int defensaMagica) {
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
