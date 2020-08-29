/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1vania;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class JavaApplication1vania {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro valor"));
        int s = 0;
        s = a + b;
        JOptionPane.showMessageDialog(null,"A soma é: "+s);
                // TODO code application logic here
    }
    
}
