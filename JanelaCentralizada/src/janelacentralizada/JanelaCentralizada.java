/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelacentralizada;
import javax.swing.*;

/**
 *
 * @author Vania Julia
 */
public class JanelaCentralizada extends JFrame{
    public JanelaCentralizada(){
        super("JanelaCentralizada");
        setSize(300,150);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JanelaCentralizada app = new JanelaCentralizada();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
