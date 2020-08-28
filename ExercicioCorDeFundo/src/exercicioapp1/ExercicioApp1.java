/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioapp1;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Vania Julia
 */
public class ExercicioApp1 extends JFrame{
    public ExercicioApp1(){
        super("Exercício App 1 cor 255,120,120");
        Container tela = getContentPane();
        tela.setBackground(new Color(255,120,120));
        setSize(500,300);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExercicioApp1 app = new ExercicioApp1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
