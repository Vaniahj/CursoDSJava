package listex4;
import javax.swing.*; //Bibliotecas importadas
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Vania Julia
 */
public class ListEx4 extends JFrame {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20, //Declaração de atributos de botões
            b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40,
            b41,b42,b43,b44,b45,b46,b47,b48,b49,b50,b51,b52,b53;
    JTextField texto1; //Declaração de atributos de inserção de caixa de texto
    ImageIcon icone; //Declaração de atributos de inserção de ícones na tela
    JMenuBar barra; //Declaração de atributos de inserção de barra de menus
    JMenu exibir,editar,ajuda; //Declaração de atributos dos menus
    JRadioButton graus,radianos,grados; //Declaração de atributos de botões do tipo Radio
    
    public ListEx4 (){
        super("Calculadora"); //chamada inplicita, Título da tela
        Container tela = getContentPane(); //Atribui características na tela
        ImageIcon icone = new ImageIcon("calculadora.png"); //Instanciando os ícones na tela
        setIconImage(icone.getImage()); //método que adiciona os ícones na tela
        setBackground(new Color(217,228,241)); //Método que atribui cor de fundo na tela
        setLayout(null); //Atribui posição nos objetos. (Null) Os objetos tem posições independentes
        
        graus = new JRadioButton("Graus"); //Instanciando os botões tipo rádio
        radianos = new JRadioButton("Radianos");
        grados = new JRadioButton("Grados");
        graus.setBounds(30,105,100,25); //Método que atribui cor de fundo na janela
        radianos.setBounds(140,105,100,25);
        grados.setBounds(260,105,100,25);
        graus.setFont(new Font("Arial",Font.PLAIN,16)); //Define o tamanho e fonte do texto
        radianos.setFont(new Font("Arial",Font.PLAIN,16));
        grados.setFont(new Font("Arial",Font.PLAIN,16));
        
        barra = new JMenuBar(); //Instanciando a barra de menu
        setJMenuBar(barra); //método que adiciona a barra de menu na tela
        exibir = new JMenu("Exibir"); //Instanciando as opções do menu
        editar = new JMenu("Editar");
        ajuda = new JMenu("Ajuda");
        barra.add(exibir); //método que adiciona os métodos da barra de menu na tela
        barra.add(editar);
        barra.add(ajuda);
        
        exibir.setMnemonic(KeyEvent.VK_B); //método que atribui atalho das opções do menu
        editar.setMnemonic(KeyEvent.VK_E);
        ajuda.setMnemonic(KeyEvent.VK_U);
        
        exibir.setFont(new Font("Arial",Font.PLAIN,16)); //Define o tamanho e fonte do texto
        editar.setFont(new Font("Arial",Font.PLAIN,16));
        ajuda.setFont(new Font("Arial",Font.PLAIN,16));
        
        b1 = new JButton("MC");     b2 = new JButton("MR");     b3 = new JButton("MS"); //instanciando o botão e danto atributos ao botão
        b4 = new JButton("M+");     b5 = new JButton("M-");     b6 = new JButton("←");
        b7 = new JButton("CE");     b8 = new JButton("C");      b9 = new JButton("±");
        b10 = new JButton("√");     b11 = new JButton("7");     b12 = new JButton("8");
        b13 = new JButton("9");     b14 = new JButton("/");     b15 = new JButton("%");
        b16 = new JButton("4");     b17 = new JButton("5");     b18 = new JButton("6");
        b19 = new JButton("*");     b20 = new JButton("1/x");   b21 = new JButton("1");
        b22 = new JButton("2");     b23 = new JButton("3");     b24 = new JButton("-");
        b25 = new JButton("=");     b26 = new JButton("0");     b27 = new JButton(",");
        b28 = new JButton("+");     b29 = new JButton("");      b30 = new JButton("Inv");
        b31 = new JButton("In");    b32 = new JButton("(");     b33 = new JButton(")");
        b34 = new JButton("Int");   b35 = new JButton("sinh");  b36 = new JButton("sin");
        b37 = new JButton("x²");    b38 = new JButton("n!");    b39 = new JButton("dms");
        b40 = new JButton("cosh");  b41 = new JButton("cos");   b42 = new JButton("<html>x<sup>y</sup></html>");
        b43 = new JButton("<html>√<sup>y</sup></html>x");       b44 = new JButton("π");   
        b45 = new JButton("tanh");  b46 = new JButton("tan");   b47 = new JButton("x³");  
        b48 = new JButton("<html>√<sup>3</sup></html>x");       b49 = new JButton("F-E"); 
        b50 = new JButton("Exp");   b51 = new JButton("Mod");   b52 = new JButton("log");
        b53 = new JButton("<html>10<sup>x</sup></html>");
        
        b29.setEnabled(false); //Desabilita esta caixa de texto
        
        texto1 = new JTextField (20); //instanciando a caixa de texto e danto atributos a caixa de texto
        texto1.setFont(new Font("Consolas",Font.PLAIN,30)); //Define o tamanho e fonte do texto
        texto1.setHorizontalAlignment(texto1.LEFT); //Define a posição do caractere e a direção da escrita, da esquerda para a direita
        texto1.setHorizontalAlignment(texto1.CENTER); 
        texto1.setHorizontalAlignment(texto1.RIGHT);
        texto1.setBounds(20,15,635,70); //Define a posição da caixa de texto
        texto1.setBackground(new Color(245,249,253)); //Método que atribui cor de fundo na janela
       
        b1.setBounds(341,95,55,40);       b2.setBounds(405,95,55,40);       b3.setBounds(469,95,55,40); //Define a posição dos botões
        b4.setBounds(533,95,55,40);       b5.setBounds(597,95,55,40);       b6.setBounds(341,145,55,40);
        b7.setBounds(405,145,55,40);      b8.setBounds(469,145,55,40);      b9.setBounds(533,145,55,40);
        b10.setBounds(597,145,55,40);     b11.setBounds(341,195,55,40);     b12.setBounds(405,195,55,40);
        b13.setBounds(469,195,55,40);     b14.setBounds(533,195,55,40);     b15.setBounds(597,195,55,40);
        b16.setBounds(341,245,55,40);     b17.setBounds(405,245,55,40);     b18.setBounds(469,245,55,40);
        b19.setBounds(533,245,55,40);     b20.setBounds(597,245,55,40);     b21.setBounds(341,295,55,40);
        b22.setBounds(405,295,55,40);     b23.setBounds(469,295,55,40);     b24.setBounds(533,295,55,40);
        b25.setBounds(597,295,55,90);     b26.setBounds(341,345,120,40);    b27.setBounds(469,345,55,40);
        b28.setBounds(533,345,55,40);     b29.setBounds(20,145,60,40);      b30.setBounds(85,145,60,40);   
        b31.setBounds(149,145,60,40);     b32.setBounds(213,145,60,40);     b33.setBounds(277,145,60,40);  
        b34.setBounds(20,195,60,40);      b35.setBounds(85,195,60,40);      b36.setBounds(149,195,60,40);  
        b37.setBounds(213,195,60,40);     b38.setBounds(277,195,60,40);     b39.setBounds(20,245,60,40);  
        b40.setBounds(85,245,60,40);      b41.setBounds(149,245,60,40);     b42.setBounds(213,245,60,40); 
        b43.setBounds(277,245,60,40);     b44.setBounds(20,295,60,40);      b45.setBounds(85,295,60,40);  
        b46.setBounds(149,295,60,40);     b47.setBounds(213,295,60,40);     b48.setBounds(277,295,60,40); 
        b49.setBounds(20,345,60,40);      b50.setBounds(85,345,60,40);      b51.setBounds(149,345,60,40);  
        b52.setBounds(213,345,60,40);     b53.setBounds(277,345,60,40); 
        
        
        tela.add(b1);       tela.add(b2);        tela.add(b3); //método que adiciona os métodos do botão na tela
        tela.add(b4);       tela.add(b5);        tela.add(b6);
        tela.add(b7);       tela.add(b8);        tela.add(b9);
        tela.add(b10);      tela.add(b11);       tela.add(b12);
        tela.add(b13);      tela.add(b14);       tela.add(b15);
        tela.add(b16);      tela.add(b17);       tela.add(b18);
        tela.add(b19);      tela.add(b20);       tela.add(b21);
        tela.add(b22);      tela.add(b23);       tela.add(b24);
        tela.add(b25);      tela.add(b26);       tela.add(b27);
        tela.add(b28);      tela.add(b29);       tela.add(b30);  
        tela.add(b31);      tela.add(b32);       tela.add(b33);   
        tela.add(b34);      tela.add(b35);       tela.add(b36);   
        tela.add(b37);      tela.add(b38);       tela.add(b39);  
        tela.add(b40);      tela.add(b41);       tela.add(b42);  
        tela.add(b43);      tela.add(b44);       tela.add(b45);  
        tela.add(b46);      tela.add(b47);       tela.add(b48);    
        tela.add(b49);      tela.add(b50);       tela.add(b51);   
        tela.add(b52);      tela.add(b53);   
        
        tela.add(texto1); //método que adiciona os métodos da caixa de texto na tela
        
        tela.add(graus);      tela.add(radianos);      tela.add(grados); //método que adiciona os métodos do botão tipo rádio na tela
        
        setSize(690,480); //insere tamanho da tela
        setVisible(true); //Torna a tela vizível
        setLocationRelativeTo(null); //Centraliza a tela na página
        
    }

    public static void main(String[] args) {
        ListEx4 app = new ListEx4();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
