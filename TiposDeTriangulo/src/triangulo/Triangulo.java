package triangulo;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
/**
 *
 * @author Vania Julia
 */
public class Triangulo extends JFrame{
    JLabel rot1,rot2,rot3,exibir;
    JTextField txt1,txt2,txt3;
    JButton verificar;
    
    public Triangulo (){
        super ("Tipos de Triângulos");
        Container tela = getContentPane();
        setLayout(null);
        
        rot1 = new JLabel("Lado 1");
        rot2 = new JLabel("Lado 2");
        rot3 = new JLabel("Lado 3");
        
        txt1 = new JTextField(10);
        txt2 = new JTextField(10);
        txt3 = new JTextField(10);
        
        verificar = new JButton("Verificar Tipo");
        exibir = new JLabel("");
                
        rot1.setBounds(20,20,150,25);
        rot2.setBounds(20,50,150,25);
        rot3.setBounds(20,80,150,25);
        
        txt1.setBounds(70,20,100,25);
        txt2.setBounds(70,50,100,25);
        txt3.setBounds(70,80,100,25);
        
        verificar.setBounds(20,130,150,25);
        
        exibir.setBounds(200,50,150,25);
        
        verificar.addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a,b,c;
                a = Integer.parseInt(txt1.getText());
                b = Integer.parseInt(txt2.getText());
                c = Integer.parseInt(txt3.getText());
                
                if (a==b && a==c) {
                    exibir.setText("Triângulo Equilátero");
                }else if (a==b || a==c || b==c) {
                    exibir.setText("Triângulo Isóceles");
                }else if (a!=b && a!=c && b!=c){
                    exibir.setText("Triângulo Escaleno");
                }else if (a<1 && b<1 && c<1){
                    exibir.setText("Valores Inválidos");
                }
                
                exibir.setVisible(true);
               
            }
        });
        
        exibir.setVisible(false);
               
        tela.add(rot1);
        tela.add(rot2);
        tela.add(rot3);
                
        tela.add(txt1);
        tela.add(txt2);
        tela.add(txt3);
        
        tela.add(verificar);
        
        tela.add(exibir);
              
        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null);
       
    }

    public static void main(String[] args) {
        Triangulo app = new Triangulo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
