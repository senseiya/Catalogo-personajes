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
public class PanelPersonaje extends JPanel{

    public JLabel picPersonaje;
    public JLabel desPersonaje;
    private JLabel info;
    
    public JButton mago;
    public JButton guerrero;
    public JButton arquero;
    public Ventana ventana;
    
    public PanelPersonaje(Ventana pVentana){
        
        ventana = pVentana;
        
        setSize(500, 300);
        setLayout(null);
        setBorder(new TitledBorder("Informacion Personaje"));
        
        picPersonaje = new JLabel("");
        desPersonaje= new JLabel("");
        info= new JLabel("Especialidad del soldado:");
        mago = new JButton("Mago");
        guerrero = new JButton("Guerrero");
        arquero = new JButton("Arquero");
        
        desPersonaje.setForeground(Color.black);
        desPersonaje.setFont(new java.awt.Font("Dubai Medium", 2, 18)); 
               
        picPersonaje.setBounds(130,80,250,250);
        desPersonaje.setBounds(30,300,250,250);
        
        info.setBounds(10,640,150,25);
        mago.setBounds(160,640,100,25);
        guerrero.setBounds(270,640,100,25);
        arquero.setBounds(380,640,100,25);
        
        add(info);
        add(picPersonaje);
        add(desPersonaje);
        add(mago);
        add(arquero);
        add(guerrero);
       
    }
    
 
    
    
}
