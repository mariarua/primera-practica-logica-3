/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 *
 * @author Juan
 */
public class carta {
    boolean i;
    JLabel carta = new JLabel();
    
    public boolean isI() {
        return i;
    }

    public void setI(boolean i) {
        this.i = i;
    }

    public JLabel getCarta() {
        return carta;
    }

    public void setCarta(JLabel carta) {
        this.carta = carta;
    }
    
    public carta(boolean i, JLabel carta) {
        this.i = i;
        this.carta=carta;
        
    }


    
}
