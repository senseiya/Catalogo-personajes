/**
 * 31/08/2019 07:32:53 PM
 * Autor: Santiago Roa
 */
package Personajes;

public class Arquero extends Heroe {

    public Arquero(String nombre, int hp, int mp) {
        this.nombre = nombre;
        this.hp = hp;
        this.mp = mp;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }
}
