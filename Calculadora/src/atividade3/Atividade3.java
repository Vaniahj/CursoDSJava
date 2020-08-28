package atividade3;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
/**
 *
 * @author Vania Julia
 */
public class Atividade3 extends JFrame{
    JLabel rotulo1,rotulo2,exibir;
    JTextField texto1,texto2;
    JButton somar,multiplicar,dividir,subtrair;
    
    public Atividade3(){
        super("Exemplo de calculadora");
        Container tela = getContentPane();
        setLayout(null);
        
        rotulo1 = new JLabel("1º número: ");
        rotulo2 = new JLabel("2º número: ");
        
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        
        exibir = new JLabel("");
        somar = new JButton("Somar");
        multiplicar = new JButton("Multiplicar");
        dividir = new JButton("Dividir");
        subtrair = new JButton("Subtrair");
        
        rotulo1.setBounds(50,20,100,20);
        rotulo2.setBounds(50,60,100,20);
        texto1.setBounds(120,20,200,20);
        texto2.setBounds(120,60,200,20);
        exibir.setBounds(50,120,200,20); 
        somar.setBounds(20,100,80,20);
        multiplicar.setBounds(140,100,80,20);
        dividir.setBounds(250,100,80,20);
        subtrair.setBounds(350,100,80,20);
        
        somar.addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1,numero2,soma;
                soma=0;
                numero1 = Integer.parseInt(texto1.getText());
                numero2 = Integer.parseInt(texto2.getText());
                soma = numero1 + numero2;
                exibir.setVisible(true);
                exibir.setText("A soma é: "+ soma);
                
            }
        });
        
        multiplicar.addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1,numero2,multiplicar;
                multiplicar=0;
                numero1 = Integer.parseInt(texto1.getText());
                numero2 = Integer.parseInt(texto2.getText());
                multiplicar = numero1 * numero2;
                exibir.setVisible(true);
                exibir.setText("A multiplicação é: "+ multiplicar);
                
            }
        });
        
        dividir.addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float numero1,numero2,dividir;
                dividir=0;
                numero1 = Float.parseFloat(texto1.getText());
                numero2 = Float.parseFloat(texto2.getText());
                dividir = numero1 / numero2;
                exibir.setVisible(true);
                exibir.setText("A divisão é: "+ dividir);
                
            }
        });
        
        subtrair.addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1,numero2,subtrair;
                subtrair=0;
                numero1 = Integer.parseInt(texto1.getText());
                numero2 = Integer.parseInt(texto2.getText());
                subtrair = numero1 - numero2;
                exibir.setVisible(true);
                exibir.setText("A subtração é: "+ subtrair);
                
            }
        });
                
        exibir.setVisible(false);
        
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(exibir);
        tela.add(somar);
        tela.add(multiplicar);
        tela.add(dividir);
        tela.add(subtrair);
        
        setSize(500,250);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }

    public static void main(String[] args) {
        Atividade3 app = new Atividade3();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
