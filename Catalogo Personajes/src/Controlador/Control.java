/*
 * Universidad Distrital Francisco José De Caldas
 * Nelson Santiago Roa Garzón
 * Código: 20172020099
 * 31/08/2019 07:28:21 PM
 */
package Controlador;
import Fabricas.AbstractFactory;
import Equipamiento.Arma;
import Equipamiento.Arma_secundaria;
import Fabricas.FabricaArquero;
import Fabricas.FabricaGuerrero;
import Fabricas.FabricaMago;
import Personajes.Heroe;
import Vista.InterfazVista;
import Vista.PanelAccesorios;
import Vista.PanelPersonaje;
import Vista.Ventana;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Control implements ActionListener {

    private InterfazVista vista;
    private Ventana v;

    public Control(InterfazVista vista) {

        this.vista = vista;
        this.v = v;

    }

  
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(InterfazVista.MAGO)) {

            AbstractFactory fabrica = null;
            Arma arma;
            Arma_secundaria armadura;
            Heroe heroe;

            fabrica = new FabricaMago();

            arma = fabrica.crearArma();
            armadura = fabrica.crearArmadura();
            heroe = fabrica.crearHeroe();

          
            vista.cambioDesPersojane("<html><body>Heroe: " + heroe.getNombre() + "<br> HP: " + heroe.getHp() + "<br> Mana points: " + +heroe.getMp() + "</body></html>");
            vista.cambioPicPersonaje(new ImageIcon(getClass().getResource("/imagenes/mago.png")));        //AQUI PONE LA RUTA DE LA IMAGEN
            vista.cambioDesArma("<html><body>Arma : " + arma.getNombre() + "<br> Daño Físico: " + arma.getDañoFisico() + "<br> Daño Mágico: " + arma.getDañoMagico() + "</body></html>");
            vista.cambioPicArma(new ImageIcon(getClass().getResource("/imagenes/Baston.png")));        //AQUI PONE LA RUTA DE LA IMAGEN
            vista.cambioDesArmadura("<html><body>Armadura:" + armadura.getNombre() + "<br> Defensa Física:" + armadura.getDefensaFisica() + "<br>Defensa Mágica:" + armadura.getDefensaMagica() + "</body></html>");
            vista.cambioPicArmadura(new ImageIcon(getClass().getResource("/imagenes/orbe.png")));         //AQUI PONE LA RUTA DE LA IMAGEN
         }
        
        if (e.getActionCommand().equals(InterfazVista.GUERRERO)) {
        
            AbstractFactory fabrica = null;
            Arma arma;
            Arma_secundaria armadura;
            Heroe heroe;

            fabrica = new FabricaGuerrero();

            arma = fabrica.crearArma();
            armadura = fabrica.crearArmadura();
            heroe = fabrica.crearHeroe();
            
            vista.cambioDesPersojane("<html><body>Heroe: " + heroe.getNombre() + "<br> HP: " + heroe.getHp() + "<br> Mana points: " + +heroe.getMp() + "</body></html>");
            vista.cambioPicPersonaje(new ImageIcon(getClass().getResource("/imagenes/guerrero.png")));          //AQUI PONE LA RUTA DE LA IMAGEN
            vista.cambioDesArma("<html><body>Arma : " + arma.getNombre() + "<br> Daño Físico: " + arma.getDañoFisico() + "<br> Daño Mágico: " + arma.getDañoMagico() + "</body></html>");
            vista.cambioPicArma(new ImageIcon(getClass().getResource("/imagenes/espada.png")));            //AQUI PONE LA RUTA DE LA IMAGEN
            vista.cambioDesArmadura("<html><body>Armadura:" + armadura.getNombre() + "<br> Defensa Física:" + armadura.getDefensaFisica() + "<br>Defensa Mágica:" + armadura.getDefensaMagica() + "</body></html>");
            vista.cambioPicArmadura(new ImageIcon(getClass().getResource("/imagenes/escudo.png")));         //AQUI PONE LA RUTA DE LA IMAGEN
        }   
        
        if (e.getActionCommand().equals(InterfazVista.ARQUERO)) {
        
            AbstractFactory fabrica = null;
            Arma arma;
            Arma_secundaria armadura;
            Heroe heroe;

            fabrica = new FabricaArquero();

            arma = fabrica.crearArma();
            armadura = fabrica.crearArmadura();
            heroe = fabrica.crearHeroe();
            
            vista.cambioDesPersojane("<html><body>Heroe: " + heroe.getNombre() + "<br> HP: " + heroe.getHp() + "<br> Mana points: " + +heroe.getMp() + "</body></html>");
            vista.cambioPicPersonaje(new ImageIcon(getClass().getResource("/imagenes/arquero.png")));             //AQUI PONE LA RUTA DE LA IMAGEN
            vista.cambioDesArma("<html><body>Arma : " + arma.getNombre() + "<br> Daño Físico: " + arma.getDañoFisico() + "<br> Daño Mágico: " + arma.getDañoMagico() + "</body></html>");
            vista.cambioPicArma(new ImageIcon(getClass().getResource("/imagenes/arco.png")));          //AQUI PONE LA RUTA DE LA IMAGEN
            vista.cambioDesArmadura("<html><body>Armadura:" + armadura.getNombre() + "<br> Defensa Física:" + armadura.getDefensaFisica() + "<br>Defensa Mágica:" + armadura.getDefensaMagica() + "</body></html>");
            vista.cambioPicArmadura(new ImageIcon(getClass().getResource("/imagenes/carcaj.png")));         //AQUI PONE LA RUTA DE LA IMAGEN
        }       
        
        
    }
    

}
