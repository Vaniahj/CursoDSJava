package bhaskara;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Vania Julia
 */
public class Bhaskara extends JFrame {
    JLabel rot1,rot2,rot3,rot4,rot5,exibir1,exibir2;
    JTextField tex1,tex2,tex3;
    JButton calcular;
    
    public Bhaskara (){
        super ("Calculadora de Equação do 2º Grau");
        Container tela = getContentPane();
        setLayout(null);
        
        rot1 = new JLabel("Cálculo de Equação do 2º Grau");
        rot2 = new JLabel("Digite o valor de A, B e C respectivamente nos quadros abaixo:");
        rot3 = new JLabel("x²");
        rot4 = new JLabel("x");
        rot5 = new JLabel("= 0");
        
        tex1 = new JTextField(5);
        tex2 = new JTextField(5);
        tex3 = new JTextField(5);
        
        calcular = new JButton("Calcular");
        exibir1 = new JLabel("");
        exibir2 = new JLabel("");
        
        rot1.setBounds(100,10,200,25);
        rot2.setBounds(15,30,400,25);
        rot3.setBounds(150,60,20,25);
        rot4.setBounds(195,60,20,25);
        rot5.setBounds(235,60,20,25);
        
        tex1.setBounds(120,60,25,25);
        tex2.setBounds(165,60,25,25);
        tex3.setBounds(205,60,25,25);
        
        calcular.setBounds(130,100,100,25);
        
        exibir1.setBounds(20,60,100,25);
        exibir2.setBounds(20,90,100,25);
        
        calcular.addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a,b,c,r1,r2;
                r1=0;
                r2=0;
                a = Double.parseDouble(tex1.getText());
                b = Double.parseDouble(tex2.getText());
                c = Double.parseDouble(tex3.getText());
                r1 = (-b+(Math.sqrt((b*b)-(4*a*c))))/(2*a);
                r2 = (-b-(Math.sqrt((b*b)-(4*a*c))))/(2*a);
                exibir1.setVisible(true);
                exibir2.setVisible(true);
                exibir1.setText("x1 = "+ r1);
                exibir2.setText("x2 = "+ r2);
                
            }
        });
        
        exibir1.setVisible(false);
        exibir2.setVisible(false);
        
        tela.add(rot1);
        tela.add(rot2);
        tela.add(rot3);
        tela.add(rot4);
        tela.add(rot5);
        
        tela.add(tex1);
        tela.add(tex2);
        tela.add(tex3);
        
        tela.add(calcular);
        
        tela.add(exibir1);
        tela.add(exibir2);
        
        setSize(400,200);
        setVisible(true);
        setLocationRelativeTo(null);
       
    }
    
    public static void main(String[] args) {
        Bhaskara app = new Bhaskara();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
