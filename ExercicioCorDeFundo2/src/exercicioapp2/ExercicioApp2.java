/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioapp2;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Vania Julia
 */
public class ExercicioApp2 extends JFrame{
    public ExercicioApp2(){
        super("Exercício App 2 cor 128,125,150");
        Container tela = getContentPane();
        tela.setBackground(new Color(128,125,150));
        setSize(500,300);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExercicioApp2 app = new ExercicioApp2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
