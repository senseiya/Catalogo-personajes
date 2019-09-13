/**
 * 31/08/2019 07:32:33 PM
 * Autor: Santiago Roa
 */
package Personajes;

public class Mago extends Heroe {

    public Mago(String nombre, int hp, int mp) {
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
