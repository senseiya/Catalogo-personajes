/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.Control;
import javax.swing.Icon;


/**
 *
 * @author maicol
 */
public interface InterfazVista {
    
    public void setControlador(Control c);
    public void arranca();
    
    void cambioDesPersojane(String s);
    void cambioDesArma(String s);
    void cambioDesArmadura(String s);
    void cambioPicPersonaje(Icon i);
    void cambioPicArma(Icon i);
    void cambioPicArmadura(Icon i);
    
    static final String GUERRERO = "warrior";
    static final String MAGO = "wizard";
    static final String ARQUERO = "archer";
    
}
