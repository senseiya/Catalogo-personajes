/**
 * 31/08/2019 07:32:14 PM
 * Autor: Santiago Roa
 */
package Fabricas;

import Equipamiento.ArcoMagico;
import Equipamiento.Arma;
import Equipamiento.Arma_secundaria;
import Equipamiento.Carcaj;
import Personajes.Arquero;
import Personajes.Heroe;

public class FabricaArquero implements AbstractFactory {

    @Override
    public Arma crearArma() {
        return new ArcoMagico("Arco Mágico de Jinete", 250, 150);
    }

    @Override
    public Arma_secundaria crearArmadura() {
        return new Carcaj("Carcaj ligero Encantado", 75, 52);
    }

    @Override
    public Heroe crearHeroe() {
        return (Heroe) new Arquero("Imina Elfrieden \"Principe Elfo\"", 750, 320);
    }

}
