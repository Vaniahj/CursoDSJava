/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamanhofixo;
import javax.swing.*;
/**
 *
 * @author Aluno
 */
public class TamanhoFixo extends JFrame{
    public TamanhoFixo(){
        super("Uma Janela não dimensionável");
        setResizable(false);//False significa que não está habilitado para redimensionamento
        setSize(400,150);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TamanhoFixo app = new TamanhoFixo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // TODO code application logic here
    }
    
}
