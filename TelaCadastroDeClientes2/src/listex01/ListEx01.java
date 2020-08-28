package listex01;
import java.awt.*; //Bibliotecas importadas
import javax.swing.*;
/**
 *
 * @author Vania Julia
 */
public class ListEx01 extends JFrame{
    
    JLabel rotulo1,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6,rotulo7,rotulo8,rotulo9; //Declaração de atributos de inserção de texto
    JTextField texto1,texto2,texto3,texto4,texto5,texto6,texto7,texto8; //Declaração de atributos de inserção de caixa de texto
    JButton botao1,botao2; //Declaração de atributos de botões
    
    public ListEx01 (){
        super("Cadastro de Clientes"); //chamada inplicita, Título da tela
        Container tela = getContentPane(); //Atribui características na tela
        setLayout(null); //Atribui posição nos objetos. (Null) Os objetos tem posições independentes
        
        rotulo1 = new JLabel("Cadastro de Clientes"); //instanciando o texto e danto atributos ao texto
        rotulo2 = new JLabel("Nome");
        rotulo3 = new JLabel("Endereço");
        rotulo4 = new JLabel("CPF");
        rotulo5 = new JLabel("Cidade");
        rotulo6 = new JLabel("Estado");
        rotulo7 = new JLabel("Celular");
        rotulo8 = new JLabel("CEP");
        rotulo9 = new JLabel("Sexo");
        
        texto1 = new JTextField(20); //instanciando a caixa de texto e danto atributos a caixa de texto
        texto2 = new JTextField(20);
        texto3 = new JTextField(20);
        texto4 = new JTextField(20);
        texto5 = new JTextField(20);
        texto6 = new JTextField(20);
        texto7 = new JTextField(20);
        texto8 = new JTextField(20);
        
        botao1 = new JButton("Cadastrar"); //instanciando o botão e danto atributos ao botão
        botao2 = new JButton("Limpar");
                
        rotulo1.setBounds(250,10,200,50); //Define a posição do texto
        rotulo2.setBounds(50,70,100,20);
        rotulo3.setBounds(330,70,100,20);
        rotulo4.setBounds(50,135,100,20);
        rotulo5.setBounds(330,135,100,20);
        rotulo6.setBounds(520,135,100,20);
        rotulo7.setBounds(50,200,100,20);
        rotulo8.setBounds(330,200,100,20);
        rotulo9.setBounds(480,200,100,20);
                
        texto1.setBounds(50,95,270,25); //Define a posição da caixa de texto
        texto2.setBounds(330,95,290,25);
        texto3.setBounds(50,160,200,25);
        texto4.setBounds(330,160,130,25);
        texto5.setBounds(530,160,90,25);
        texto6.setBounds(50,225,200,25);
        texto7.setBounds(330,225,80,25);
        texto8.setBounds(480,225,140,25);
        
        botao1.setBounds(140,280,110,25); //Define a posição do botão
        botao2.setBounds(420,280,90,25);
        
        rotulo1.setForeground(Color.red);
        rotulo1.setFont(new Font("Arial",Font.BOLD,16)); //Define o tamanho e fonte do objeto
        rotulo2.setFont(new Font("Arial",Font.BOLD,16));
        rotulo3.setFont(new Font("Arial",Font.BOLD,16));
        rotulo4.setFont(new Font("Arial",Font.BOLD,16));
        rotulo5.setFont(new Font("Arial",Font.BOLD,16));
        rotulo6.setFont(new Font("Arial",Font.BOLD,16));
        rotulo7.setFont(new Font("Arial",Font.BOLD,16));
        rotulo8.setFont(new Font("Arial",Font.BOLD,16));
        rotulo9.setFont(new Font("Arial",Font.BOLD,16));
        
        botao1.setFont(new Font("Arial",Font.BOLD,16)); //Define o tamanho e fonte do objeto
        botao2.setFont(new Font("Arial",Font.BOLD,16));
            
        tela.add(rotulo1); //método que adiciona os métodos de texto na tela
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);
        tela.add(rotulo8);
        tela.add(rotulo9);
        
        tela.add(texto1); //método que adiciona os métodos da caixa de texto na tela
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        tela.add(texto7);
        tela.add(texto8);
        
        tela.add(botao1); //método que adiciona os métodos do botão na tela
        tela.add(botao2);
        
        setSize(650,400); //insere tamanho da tela
        setVisible(true); //Torna a tela vizível
        setLocationRelativeTo(null); //Centraliza a tela na página
          
    }
            
    public static void main(String[] args) {
        ListEx01 app = new ListEx01 ();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
