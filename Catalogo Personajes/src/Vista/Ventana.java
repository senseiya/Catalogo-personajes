/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Control;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Vista.PanelFondo;
import java.awt.Color;

/**
 *
 * @author maicol
 */
public class Ventana extends JFrame implements InterfazVista {

    public PanelPersonaje panelPersonaje;
    public PanelAccesorios panelAccesorios;
    public PanelFondo fondo;
    private Control control;

    public Ventana() {

        setTitle("Seleccion de personajes");

        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        fondo = new PanelFondo();
               
        panelPersonaje = new PanelPersonaje(this);
        panelAccesorios = new PanelAccesorios(this);

        add(fondo);
        
        fondo.add(panelPersonaje);
        fondo.add(panelAccesorios);
        
        
        panelPersonaje.mago.setActionCommand(MAGO);
        panelPersonaje.guerrero.setActionCommand(GUERRERO);
        panelPersonaje.arquero.setActionCommand(ARQUERO);

    }

    public void setControlador(Control c) {
        panelPersonaje.mago.addActionListener(c);
        panelPersonaje.arquero.addActionListener(c);
        panelPersonaje.guerrero.addActionListener(c);
    }

    public void arranca() {
        pack();
        setVisible(true);
        this.setLayout(null);
        this.setSize(1000, 700);
        this.setLocationRelativeTo(null);
                
        this.fondo.setBounds(0, 0, 1000, 7000);

        this.panelPersonaje.setBounds(0, 0, 500, 690);
        this.panelAccesorios.setBounds(505, 0, 500, 690);
        this.panelPersonaje.setOpaque(false);
        this.panelAccesorios.setOpaque(false);
       
    }

    public void cambioDesPersojane(String s) {
        panelPersonaje.desPersonaje.setText(s);
    }

    public void cambioPicPersonaje(Icon i) {
        panelPersonaje.picPersonaje.setIcon(i);
    }

    public void cambioDesArma(String s) {
        panelAccesorios.desArma.setText(s);
    }

    public void cambioDesArmadura(String s) {
        panelAccesorios.desHerramienta.setText(s);
    }

    public void cambioPicArma(Icon i) {
        panelAccesorios.picArma.setIcon(i);
    }

    public void cambioPicArmadura(Icon i) {
        panelAccesorios.picHerramienta.setIcon(i);
    }

}
