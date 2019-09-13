/**
 * 31/08/2019 07:32:06 PM
 * Autor: Santiago Roa
 */
package Fabricas;

import Equipamiento.Arma;
import Equipamiento.Arma_secundaria;
import Personajes.Heroe;

public interface AbstractFactory {

    public abstract Arma crearArma();

    public abstract Arma_secundaria crearArmadura();

    public abstract Heroe crearHeroe();
}
