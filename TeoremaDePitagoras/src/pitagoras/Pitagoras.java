package pitagoras;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
/**
 *
 * @author Vania Julia
 */
public class Pitagoras extends JFrame {
    
    JLabel rot1,rot2,rot3,exibir1,exibir2;
    JTextField txt1,txt2;
    JButton calcular;

    public Pitagoras(){
        super("Cálculo do Teorema de Pitágoras");
        Container tela = getContentPane();
        setLayout(null);
        
        rot1 = new JLabel("Cálculo da Hipotenusa");
        rot2 = new JLabel("Cateto a");
        rot3 = new JLabel("Cateto b");
                
        txt1 = new JTextField(10);
        txt2 = new JTextField(10);
                
        calcular = new JButton("Calcular");
        
        exibir1 = new JLabel("");
        exibir2 = new JLabel("");
        
        rot1.setBounds(130,10,200,25);
        rot2.setBounds(50,50,200,25);
        rot3.setBounds(200,50,200,25);
                
        txt1.setBounds(110,50,50,25);
        txt2.setBounds(260,50,50,25);
                
        calcular.setBounds(100,150,200,25);
        
        exibir1.setBounds(100,80,200,25);
        exibir2.setBounds(100,100,200,25);
        
        calcular.addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a,b,res1,res2;
                res1 = 0;
                res2 = 0;
                a = Double.parseDouble(txt1.getText());
                b = Double.parseDouble(txt2.getText());
                res1 = (a*a)+(b*b);
                res2 = (Math.sqrt (res1));
                exibir1.setVisible(true);
                exibir2.setVisible(true);
                exibir1.setText("O quadrado da Hipotenusa é: "+ res1);
                exibir2.setText("A Hipotenusa é: "+ res2);
                
            }
        });
        
        exibir1.setVisible(false);
        exibir2.setVisible(false);
        
        tela.add(rot1);
        tela.add(rot2);
        tela.add(rot3);
                
        tela.add(txt1);
        tela.add(txt2);
        
        tela.add(calcular);
        tela.add(exibir1);
        tela.add(exibir2);
            
        
        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null);
        
        
    }
    public static void main(String[] args) {
        Pitagoras app = new Pitagoras();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
