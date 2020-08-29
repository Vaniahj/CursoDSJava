package listex;
import javax.swing.*;//Biblioteca importada
import java.awt.*;//Biblioteca importada
/**
 *
 * @author Aluno
 */
public class ListEx extends JFrame{ // Classe publica; nome da classe;extends: erdada; JFrame: classe pai
    JLabel rotulo1,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6,rotulo7,rotulo8,rotulo9, //Declaração de atributos de inserção de texto
            rotulo10,rotulo11,rotulo12,rotulo13,rotulo14,rotulo15,rotulo16,rotulo17,rotulo18,
            rotulo19,rotulo20,rotulo21,rotulo22,rotulo23,rotulo24;
    
    JTextField texto1,texto2,texto3,texto4,texto5,texto6,texto7,texto8,texto9,texto10, //Declaração de atributos de caixa de texto
            texto11,texto12,texto13,texto14,texto15,texto16,texto17,texto18,texto19,texto20,
            texto21,texto22,texto23;
    JButton botao1,botao2,botao3; //Declaração de atributos de botões
    
    ImageIcon icone; //Declaração de atributos de inserção de ícones na tela
    
    public ListEx (){
        super("X Gnuplot Front End"); //chamada inplicita na tela, Título da tela
        Container tela = getContentPane(); //Atribui características na tela
        ImageIcon icone = new ImageIcon("LogoX.png"); //Instanciando o ícone na tela
        tela.setBackground(new Color(195,195,195)); //Método que atribui cor de fundo na janela
        setLayout(null); //Atribui posição nos objetos. (Null) Os objetos tem posições independentes
                      
        rotulo1 = new JLabel ("Matrix Screem");  rotulo2 = new JLabel ("Filename");           rotulo3 = new JLabel ("Function"); //instanciando o texto e danto atributos ao texto
        rotulo4 = new JLabel ("Multiple Files"); rotulo5 = new JLabel ("Multiple Functions");  rotulo6 = new JLabel ("Variable X:");
        rotulo7 = new JLabel ("Variable Y:");    rotulo8 = new JLabel ("Variable Z:");         rotulo9 = new JLabel ("Start");
        rotulo10 = new JLabel ("Start");         rotulo11 = new JLabel ("Start");              rotulo12 = new JLabel ("End:");
        rotulo13 = new JLabel ("End:");          rotulo14 = new JLabel ("End:");               rotulo15 = new JLabel ("X");
        rotulo16 = new JLabel ("Y");             rotulo17 = new JLabel ("X Labe1:");           rotulo18 = new JLabel ("Y Labe1:");
        rotulo19 = new JLabel ("Z Labe1:");      rotulo20 = new JLabel ("Title:");             rotulo21 = new JLabel ("Output:");
        rotulo22 = new JLabel ("stdout");        rotulo23 = new JLabel ("Terminal:");          rotulo24 = new JLabel ("x11");
        
        texto1 = new JTextField (50);   texto2 = new JTextField (50);  texto3 = new JTextField (50); //instanciando a caixa de texto e danto atributos a caixa de texto
        texto4 = new JTextField (50);   texto5 = new JTextField (50);  texto6 = new JTextField (50);
        texto7 = new JTextField (50);   texto8 = new JTextField (50);  texto9 = new JTextField (50);
        texto10 = new JTextField (50);  texto11 = new JTextField (50); texto12 = new JTextField (50);
        texto13 = new JTextField (50);  texto14 = new JTextField (50); texto15 = new JTextField (50);
        texto16 = new JTextField (50);  texto17 = new JTextField (50); texto18 = new JTextField (50);
        texto19 = new JTextField (50);  texto20 = new JTextField (50); texto21 = new JTextField (50);
        texto22 = new JTextField (50);  texto23 = new JTextField (50);
        
        botao1 = new JButton ("Plot");  botao2 = new JButton ("Replot");  botao3 = new JButton ("Quit"); //instanciando o botão e danto atributos ao botão
        
        rotulo1.setFont(new Font("Arial",Font.TYPE1_FONT,20));   rotulo2.setFont(new Font("Consolas",Font.BOLD,12)); //Define o tamanho e fonte do texto
        rotulo3.setFont(new Font("Consolas",Font.BOLD,12));   rotulo4.setFont(new Font("Consolas",Font.BOLD,12));
        rotulo5.setFont(new Font("Consolas",Font.BOLD,12));   rotulo6.setFont(new Font("Consolas",Font.BOLD,12));
        rotulo7.setFont(new Font("Consolas",Font.BOLD,12));   rotulo8.setFont(new Font("Consolas",Font.BOLD,12));
        rotulo9.setFont(new Font("Consolas",Font.BOLD,12));   rotulo10.setFont(new Font("Consolas",Font.BOLD,12));
        rotulo11.setFont(new Font("Consolas",Font.BOLD,12));  rotulo12.setFont(new Font("Consolas",Font.BOLD,12));
        rotulo13.setFont(new Font("Consolas",Font.BOLD,12));  rotulo14.setFont(new Font("Consolas",Font.BOLD,12));
        rotulo15.setFont(new Font("Consolas",Font.BOLD,12));  rotulo16.setFont(new Font("Consolas",Font.BOLD,12));
        rotulo17.setFont(new Font("Consolas",Font.BOLD,12));  rotulo18.setFont(new Font("Consolas",Font.BOLD,12));
        rotulo19.setFont(new Font("Consolas",Font.BOLD,12));  rotulo20.setFont(new Font("Consolas",Font.BOLD,12));
        rotulo21.setFont(new Font("Consolas",Font.BOLD,12));  rotulo22.setFont(new Font("Consolas",Font.BOLD,12));
        rotulo23.setFont(new Font("Consolas",Font.BOLD,12));  rotulo24.setFont(new Font("Consolas",Font.BOLD,12));
        
        botao1.setFont(new Font("Consolas",Font.BOLD,12)); //Define o tamanho e fonte do texto
        botao2.setFont(new Font("Consolas",Font.BOLD,12));
        botao3.setFont(new Font("Consolas",Font.BOLD,12));
        
        rotulo1.setBounds(160,05,200,20);   rotulo2.setBounds(10,40,100,20);    rotulo3.setBounds(10,65,100,20); //Define a posição do texto
        rotulo4.setBounds(110,90,100,20);   rotulo5.setBounds(300,90,200,20);   rotulo6.setBounds(10,125,100,20);
        rotulo7.setBounds(10,155,100,20);   rotulo8.setBounds(10,185,100,20);   rotulo9.setBounds(155,125,100,20);
        rotulo10.setBounds(155,155,100,20); rotulo11.setBounds(155,185,100,20); rotulo12.setBounds(300,125,100,20);
        rotulo13.setBounds(300,155,100,20); rotulo14.setBounds(300,185,100,20); rotulo15.setBounds(355,215,100,20);
        rotulo16.setBounds(405,215,100,20); rotulo17.setBounds(10,240,100,20);  rotulo18.setBounds(10,270,100,20);
        rotulo19.setBounds(10,300,100,20);  rotulo20.setBounds(10,330,100,20);  rotulo21.setBounds(10,360,100,20);
        rotulo22.setBounds(100,360,100,20); rotulo23.setBounds(10,390,100,20);  rotulo24.setBounds(100,390,100,20);
        
        rotulo22.setForeground(Color.blue); //Define a cor do texto
        rotulo24.setForeground(Color.blue);
        
        texto1.setBounds(100,30,330,25);     texto2.setBounds(100,60,330,25);     texto3.setBounds(100,120,50,25); //Define a posição da caixa de texto
        texto4.setBounds(195,120,100,25);    texto5.setBounds(330,120,100,25);    texto6.setBounds(100,150,50,25);
        texto7.setBounds(195,150,100,25);    texto8.setBounds(330,150,100,25);    texto9.setBounds(100,180,50,25);
        texto10.setBounds(195,180,100,25);   texto11.setBounds(330,180,100,25);   texto12.setBounds(100,235,230,25);
        texto13.setBounds(335,235,45,25);    texto14.setBounds(385,235,45,25);    texto15.setBounds(100,265,230,25);
        texto16.setBounds(335,265,45,25);    texto17.setBounds(385,265,45,25);    texto18.setBounds(100,295,230,25);
        texto19.setBounds(335,295,45,25);    texto20.setBounds(385,295,45,25);    texto21.setBounds(100,325,230,25);
        texto22.setBounds(335,325,45,25);    texto23.setBounds(385,325,45,25);
        
        botao1.setBounds(40,420,100,30); //Define a posição do botão
        botao2.setBounds(170,420,100,30);
        botao3.setBounds(300,420,100,30);
        
        tela.add(rotulo1);  tela.add(rotulo2);  tela.add(rotulo3);  tela.add(rotulo4); //método que adiciona os métodos de texto na tela
        tela.add(rotulo5);  tela.add(rotulo6);  tela.add(rotulo7);  tela.add(rotulo8);
        tela.add(rotulo9);  tela.add(rotulo10); tela.add(rotulo11); tela.add(rotulo12);
        tela.add(rotulo13); tela.add(rotulo14); tela.add(rotulo15); tela.add(rotulo16);
        tela.add(rotulo17); tela.add(rotulo18); tela.add(rotulo19); tela.add(rotulo20);
        tela.add(rotulo21); tela.add(rotulo22); tela.add(rotulo23); tela.add(rotulo24);
        
        tela.add(texto1);   tela.add(texto2);   tela.add(texto3);   tela.add(texto4); //método que adiciona os métodos da caixa de texto na tela
        tela.add(texto5);   tela.add(texto6);   tela.add(texto7);   tela.add(texto8);
        tela.add(texto9);   tela.add(texto10);  tela.add(texto11);  tela.add(texto12);
        tela.add(texto13);  tela.add(texto14);  tela.add(texto15);  tela.add(texto16);
        tela.add(texto17);  tela.add(texto18);  tela.add(texto19);  tela.add(texto20);
        tela.add(texto21);  tela.add(texto22);  tela.add(texto23);
        
        tela.add(botao1); tela.add(botao2); tela.add(botao3); //método que adiciona os métodos do botão na tela
        
        setIconImage(icone.getImage()); //método que adiciona os ícones na tela
        setSize(455,500); //insere tamanho da tela
        setVisible(true); //Torna a tela vizível
        setLocationRelativeTo(null); // Centraliza a tela na página
        
    }

    
    public static void main(String[] args) {
        ListEx app = new ListEx();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
