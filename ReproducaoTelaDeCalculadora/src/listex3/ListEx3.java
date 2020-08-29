package listex3;
import javax.swing.*; //Bibliotecas importadas
import java.awt.*;
/**
 *
 * @author Vania Julia
 */
public class ListEx3 extends JFrame {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20, //Declaração de atributos de botões
            b21,b22,b23,b24,b25,b26,b27,b28;
    JTextField texto1,texto2; //Declaração de atributos de inserção de caixa de texto
    ImageIcon icone; //Declaração de atributos de inserção de ícones na tela
    
    public ListEx3 (){
        super("Calculadora"); //chamada inplicita, Título da tela
        Container tela = getContentPane(); //Atribui características na tela
        ImageIcon icone = new ImageIcon("calculadora.png"); //Instanciando os ícones na tela
        setIconImage(icone.getImage()); //método que adiciona os ícones na tela
        setBackground(new Color(217,228,241)); //Método que atribui cor de fundo na tela
        setLayout(null); //Atribui posição nos objetos. (Null) Os objetos tem posições independentes
        
        b1 = new JButton("MC");    b2 = new JButton("MR");    b3 = new JButton("MS"); //instanciando o botão e danto atributos ao botão
        b4 = new JButton("M+");    b5 = new JButton("M-");    b6 = new JButton("←");
        b7 = new JButton("CE");    b8 = new JButton("C");     b9 = new JButton("±");
        b10 = new JButton("√");    b11 = new JButton("7");    b12 = new JButton("8");
        b13 = new JButton("9");    b14 = new JButton("/");    b15 = new JButton("%");
        b16 = new JButton("4");    b17 = new JButton("5");    b18 = new JButton("6");
        b19 = new JButton("*");    b20 = new JButton("1/x");  b21 = new JButton("1");
        b22 = new JButton("2");    b23 = new JButton("3");    b24 = new JButton("-");
        b25 = new JButton("=");    b26 = new JButton("0");    b27 = new JButton(",");
        b28 = new JButton("+");
        
        texto1 = new JTextField (20);    texto2 = new JTextField (20); //instanciando a caixa de texto e danto atributos a caixa de texto
        
        texto2.setFont(new Font("Consolas",Font.BOLD,30)); //Define o tamanho e fonte do texto
        
        texto2.setHorizontalAlignment(texto2.LEFT); //Define a posição do caractere e a direção da escrita, da esquerda para a direita
        texto2.setHorizontalAlignment(texto2.CENTER); 
        texto2.setHorizontalAlignment(texto2.RIGHT);
        
        texto1.setEnabled(false); //Desabilita esta caixa de texto
        
        texto1.setBackground(new Color(195,195,195));    texto2.setBackground(new Color(245,249,253)); //Método que atribui cor de fundo na janela
        
        texto1.setBounds(05,10,340,25);      texto2.setBounds(20,50,315,70); //Define a posição dos botões
        
        b1.setBounds(20,130,55,40);     b2.setBounds(85,130,55,40);     b3.setBounds(149,130,55,40); //Define a posição dos botões
        b4.setBounds(213,130,55,40);    b5.setBounds(277,130,55,40);    b6.setBounds(20,180,55,40);
        b7.setBounds(85,180,55,40);     b8.setBounds(149,180,55,40);    b9.setBounds(213,180,55,40);
        b10.setBounds(277,180,55,40);   b11.setBounds(20,230,55,40);    b12.setBounds(85,230,55,40);
        b13.setBounds(149,230,55,40);   b14.setBounds(213,230,55,40);   b15.setBounds(277,230,55,40);
        b16.setBounds(20,280,55,40);    b17.setBounds(85,280,55,40);    b18.setBounds(149,280,55,40);
        b19.setBounds(213,280,55,40);   b20.setBounds(277,280,55,40);   b21.setBounds(20,330,55,40);
        b22.setBounds(85,330,55,40);    b23.setBounds(149,330,55,40);   b24.setBounds(213,330,55,40);
        b25.setBounds(277,330,55,90);   b26.setBounds(20,380,120,40);   b27.setBounds(149,380,55,40);
        b28.setBounds(213,380,55,40);
        
        tela.add(texto1);      tela.add(texto2); //método que adiciona os métodos da caixa de texto na tela
        
        tela.add(b1);       tela.add(b2);       tela.add(b3); //método que adiciona os métodos do botão na tela
        tela.add(b4);       tela.add(b5);       tela.add(b6);
        tela.add(b7);       tela.add(b8);       tela.add(b9);
        tela.add(b10);      tela.add(b11);      tela.add(b12);
        tela.add(b13);      tela.add(b14);      tela.add(b15);
        tela.add(b16);      tela.add(b17);      tela.add(b18);
        tela.add(b19);      tela.add(b20);      tela.add(b21);
        tela.add(b22);      tela.add(b23);      tela.add(b24);
        tela.add(b25);      tela.add(b26);      tela.add(b27);
        tela.add(b28);
        
        setSize(365,480); //insere tamanho da tela
        setVisible(true); //Torna a tela vizível
        setLocationRelativeTo(null); //Centraliza a tela na página
        
    }
    
    public static void main(String[] args) {
        ListEx3 app = new ListEx3();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
