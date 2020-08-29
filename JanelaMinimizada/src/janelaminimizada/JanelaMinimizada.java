/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelaminimizada;
import javax.swing.*;
/**
 *
 * @author Aluno
 */
public class JanelaMinimizada extends JFrame{
public JanelaMinimizada(){
    super("Como exibir a janela minimizada");
    setSize(300,150);
    setVisible(true);
    setExtendedState(ICONIFIED);
    
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JanelaMinimizada app = new JanelaMinimizada();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // TODO code application logic here
    }
    
}
