/**
 * 31/08/2019 07:33:09 PM
 * Autor: Santiago Roa
 */
package Personajes;

public class Guerrero extends Heroe {

    public Guerrero(String nombre, int hp, int mp) {
        this.nombre = nombre;
        this.mp = mp;
        this.hp = hp;
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
