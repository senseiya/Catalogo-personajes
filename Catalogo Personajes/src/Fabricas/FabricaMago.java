/**
 * 31/08/2019 07:32:39 PM
 * Autor: Santiago Roa
 */
package Fabricas;

import Equipamiento.Arma;
import Equipamiento.Arma_secundaria;
import Equipamiento.Baston;
import Equipamiento.Orbe;
import Personajes.Heroe;
import Personajes.Mago;

public class FabricaMago implements AbstractFactory {

    @Override
    public Arma crearArma() {
        return (Arma) new Baston("Grán Bastón de Archimago", 0, 475);
    }

    @Override
    public Arma_secundaria crearArmadura() {
        return (Arma_secundaria) new Orbe("Orbe rojo de Sabio", 20, 150);
    }

    @Override
    public Heroe crearHeroe() {
        return new Mago("Ainz Ooal Gown \"El rey Liche\"", 450, 850);
    }

}
