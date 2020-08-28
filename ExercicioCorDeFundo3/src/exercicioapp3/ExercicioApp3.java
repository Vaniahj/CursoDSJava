/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioapp3;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Vania Julia
 */
public class ExercicioApp3 extends JFrame{
    public ExercicioApp3(){
        super("Exercício App 3 cor yellow");
        Container tela = getContentPane();
        tela.setBackground(Color.yellow);
        setSize(500,300);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExercicioApp3 app = new ExercicioApp3();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
