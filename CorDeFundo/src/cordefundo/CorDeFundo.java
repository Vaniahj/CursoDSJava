/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cordefundo;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Vania Julia
 */
public class CorDeFundo extends JFrame{
    public CorDeFundo(){
        super("Definindo a cor de fundo para a janela");
        Container tela = getContentPane();
        tela.setBackground(Color.blue);
        setSize(500,400);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CorDeFundo app = new CorDeFundo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
