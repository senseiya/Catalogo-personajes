/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author maicol
 */
public class PanelAccesorios extends JPanel {
    
    public JLabel picArma;
    public JLabel desArma;
    
    public JLabel picHerramienta;
    public JLabel desHerramienta;
    

    private Ventana ventana;

    public PanelAccesorios(Ventana pVentana){
        ventana = pVentana;
        setSize(500,300);
        setLayout(null);
        setBorder(new TitledBorder("Informacion Accesorios"));
        
        picArma = new JLabel("");
        desArma= new JLabel("");
        picHerramienta = new JLabel("");
        desHerramienta= new JLabel("");
        
        desArma.setForeground(Color.black);
        desArma.setFont(new java.awt.Font("Dubai Medium", 2, 18)); 

        picArma.setBounds(25,40,200,200);
        desArma.setBounds(280, 25, 200, 200);
        picHerramienta.setBounds(25, 350, 200, 200);
        
        desHerramienta.setForeground(Color.black);
        desHerramienta.setFont(new java.awt.Font("Dubai Medium", 2, 18)); 
        desHerramienta.setBounds(280,350,200,200);


        add(picArma);
        add(desArma);
        add(picHerramienta);
        add(desHerramienta);
        
    }
    
    
}
