/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package definiricone;
import javax.swing.*;
/**
 *
 * @author Vania Julia
 */
public class DefinirIcone extends JFrame{ 
    public DefinirIcone(){
        super("Como definir o ícone para a janela");
        ImageIcon icone = new ImageIcon("F:\\Arquivos\\Desenvolvimento de Sistemas\\Logo DS Vania.png");
        setIconImage(icone.getImage());
        setSize(500,150);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DefinirIcone app = new DefinirIcone();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // TODO code application logic here
    }
       
}
