/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplolabel;
import javax.swing.*; //Biblioteca importada
import java.awt.*;
/**
 *
 * @author Vania Julia
 */
public class ExemploLabel extends JFrame{
    JLabel rotulo1,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6,rotulo7,rotulo8; //Criação de objetos em JLabel
    JTextField texto1,texto2,texto3,texto4,texto5,texto6,texto7; //Criação de textos em JTextField
    public ExemploLabel(){ //método construtor
        super("Exemplo com Label"); //Título da Janela
        Container tela = getContentPane(); //Atribui características na tela
        setLayout(null); //Atribui posição nos objetos. (Null) Os objetos tem posições independentes
            rotulo1 = new JLabel("Nome"); //Entre aspas o nome do objeto
            rotulo2 = new JLabel("CPF"); //Entre aspas o nome do objeto
            rotulo3 = new JLabel("RG"); //Entre aspas o nome do objeto
            rotulo4 = new JLabel("Endereço"); //Entre aspas o nome do objeto
            rotulo5 = new JLabel("Cidade"); //Entre aspas o nome do objeto
            rotulo6 = new JLabel("Estado"); //Entre aspas o nome do objeto
            rotulo7 = new JLabel("CEP"); //Entre aspas o nome do objeto
            rotulo8 = new JLabel("Cadastro de Cliente");
            
            texto1 = new JTextField(50); //Método que insere uma caixa de texto na tela com a quantidade de caracteres
            texto2 = new JTextField(50); //Método que insere uma caixa de texto na tela com a quantidade de caracteres
            texto3 = new JTextField(50); //Método que insere uma caixa de texto na tela com a quantidade de caracteres
            texto4 = new JTextField(50); //Método que insere uma caixa de texto na tela com a quantidade de caracteres
            texto5 = new JTextField(50); //Método que insere uma caixa de texto na tela com a quantidade de caracteres
            texto6 = new JTextField(50); //Método que insere uma caixa de texto na tela com a quantidade de caracteres
            texto7 = new JTextField(50); //Método que insere uma caixa de texto na tela com a quantidade de caracteres
            
            rotulo1.setBounds(50,50,80,20); //Define a posição do objeto
            rotulo2.setBounds(50,100,80,20); //Define a posição do objeto
            rotulo3.setBounds(50,150,80,20); //Define a posição do objeto
            rotulo4.setBounds(50,200,80,20); //Define a posição do objeto
            rotulo5.setBounds(50,250,80,20); //Define a posição do objeto
            rotulo6.setBounds(50,300,80,20); //Define a posição do objeto
            rotulo7.setBounds(50,350,80,20); //Define a posição do objeto
            rotulo8.setBounds(100,20,300,20); //Define a posição do objeto
            
            texto1.setBounds(50,75,250,20); //Define a posição do texto
            texto2.setBounds(50,125,150,20); //Define a posição do texto
            texto3.setBounds(50,175,90,20); //Define a posição do texto
            texto4.setBounds(50,225,250,20); //Define a posição do texto 
            texto5.setBounds(50,275,220,20); //Define a posição do texto
            texto6.setBounds(50,325,210,20); //Define a posição do texto
            texto7.setBounds(50,375,100,20); //Define a posição do texto
            
            rotulo1.setForeground(Color.black); //Define a cor do objeto
            rotulo2.setForeground(Color.black); //Define a cor do objeto
            rotulo3.setForeground(Color.black); //Define uma nova cor do objeto
            rotulo4.setForeground(Color.black); //Define uma nova cor do objeto
            rotulo5.setForeground(Color.black); //Define uma nova cor do objeto
            rotulo6.setForeground(Color.black); //Define uma nova cor do objeto
            rotulo7.setForeground(Color.black); //Define uma nova cor do objeto
            rotulo8.setForeground(Color.red); //Define uma nova cor do objeto
            
            texto1.setForeground(Color.black); //Define uma nova cor do objeto
            texto2.setForeground(Color.black); //Define uma nova cor do objeto
            texto3.setForeground(Color.black); //Define uma nova cor do objeto
            texto4.setForeground(Color.black); //Define uma nova cor do objeto
            texto5.setForeground(Color.black); //Define uma nova cor do objeto
            texto6.setForeground(Color.black); //Define uma nova cor do objeto
            texto7.setForeground(Color.black); //Define uma nova cor do objeto
            
            rotulo1.setFont(new Font("Arial",Font.BOLD,14)); //Define o tamanho e fonte do objeto
            rotulo2.setFont(new Font("Arial",Font.BOLD,14)); //Define o tamanho e fonte do objeto
            rotulo3.setFont(new Font("Arial",Font.BOLD,14)); //Define o tamanho e fonte do objeto
            rotulo4.setFont(new Font("Arial",Font.BOLD,14)); //Define o tamanho e fonte do objeto
            rotulo5.setFont(new Font("Arial",Font.BOLD,14)); //Define o tamanho e fonte do objeto
            rotulo6.setFont(new Font("Arial",Font.BOLD,14)); //Define o tamanho e fonte do objeto
            rotulo7.setFont(new Font("Arial",Font.BOLD,14)); //Define o tamanho e fonte do objeto
            rotulo8.setFont(new Font("Arial",Font.BOLD,14)); //Define o tamanho e fonte do objeto
            
            tela.add(rotulo1); //método que adiciona os métodos acima no programa
            tela.add(rotulo2); //método que adiciona os métodos acima no programa
            tela.add(rotulo3); //método que adiciona os métodos acima no programa
            tela.add(rotulo4); //método que adiciona os métodos acima no programa
            tela.add(rotulo5); //método que adiciona os métodos acima no programa
            tela.add(rotulo6); //método que adiciona os métodos acima no programa
            tela.add(rotulo7); //método que adiciona os métodos acima no programa
            tela.add(rotulo8); //método que adiciona os métodos acima no programa
            
            tela.add(texto1); //método que adiciona os métodos acima no programa
            tela.add(texto2); //método que adiciona os métodos acima no programa
            tela.add(texto3); //método que adiciona os métodos acima no programa
            tela.add(texto4); //método que adiciona os métodos acima no programa
            tela.add(texto5); //método que adiciona os métodos acima no programa
            tela.add(texto6); //método que adiciona os métodos acima no programa
            tela.add(texto7); //método que adiciona os métodos acima no programa
            
            setSize(400,500); //tamanho da janela
            setVisible(true); //tela vizível
            setLocationRelativeTo(null); //Posicionamento da tela
             //slide 49 50 51 (55comentado linha por linha)
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExemploLabel app = new ExemploLabel();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Método que fecha a janela
    }
    
}
