/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2vania;

import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class JavaApplication2vania {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int B = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da base maior"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da base menor"));
        int h = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor da altura"));
        int a = 0;
        a = ((B+b)*h)/2;
        JOptionPane.showMessageDialog(null,"O valor da área é: "+a);
        // TODO code application logic here
    }
    
}
