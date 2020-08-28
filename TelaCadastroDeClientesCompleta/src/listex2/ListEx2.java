package listex2;
import javax.swing.*; //Bibliotecas importadas
import java.awt.*;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Vania Julia
 */
public class ListEx2 extends JFrame{
    
    JLabel rotulo1,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6, //Declaração de atributos de inserção de texto
            rotulo7,rotulo8,rotulo9,rotulo10,rotulo11,rotulo12;
    JTextField texto1,texto2,texto3,texto4,texto5,texto6,texto7; //Declaração de atributos de inserção de caixa de texto
    JButton botao1,botao2,botao3,botao4,botao5; //Declaração de atributos de botões
    JComboBox lista; //Declaração de atributos de lista de opções
    String estados[] = {"","São Paulo","Minas Gerais","Espírito Santo","Rio de Janeiro"}; //Declaração de atributos de opções da lista
    JRadioButton primeira,segunda; //Declaração de atributos de botões do tipo Radio
    JFormattedTextField cep,cel,tel; //Declaração de atributos que mostra um formato específico para o objeto
    MaskFormatter maskcep,maskcel,masktel; //Declaração de atributos que cria máscaras para o objeto
      
    public ListEx2 (){
        super("Cadastro de Cliente"); //chamada inplicita, Título da tela
        Container tela = getContentPane(); //Atribui características na tela
        ImageIcon icone = new ImageIcon("CadCli.png"); //Instanciando os ícones na tela
        ImageIcon icone1 = new ImageIcon("Incluir.png");
        ImageIcon icone2 = new ImageIcon("Limpar.png");
        ImageIcon icone3 = new ImageIcon("Sair.png");
        ImageIcon icone4 = new ImageIcon("Consultar.png");
        ImageIcon icone5 = new ImageIcon("Consultar Todos.png");
       
        primeira = new JRadioButton("Feminino"); //Instanciando os botões tipo rádio
        segunda = new JRadioButton("Masculino");
        primeira.setBounds(200,215,100,25);
        segunda.setBounds(300,215,100,25);
        
        lista = new JComboBox(estados); //Instanciando a lista de opções
        lista.setMaximumRowCount(5); //Define o tamanho da barra de rolagem
        lista.setBounds(200,155,190,25); //Define a posição da lista de opções
        
        setIconImage(icone.getImage()); //método que adiciona os ícones na tela
        setLayout(null); //Atribui posição nos objetos. (Null) Os objetos tem posições independentes
        
        rotulo1 = new JLabel ("Código do cliente");    rotulo2 = new JLabel ("Nome completo"); //instanciando o texto e danto atributos ao texto
        rotulo3 = new JLabel ("Endereço");             rotulo4 = new JLabel ("Bairro");
        rotulo5 = new JLabel ("Cidade");               rotulo6 = new JLabel ("Estado");
        rotulo7 = new JLabel ("C.E.P.");               rotulo8 = new JLabel ("Sexo");
        rotulo9 = new JLabel ("Celular");              rotulo10 = new JLabel ("Telefone");
        rotulo11 = new JLabel ("Data do Aniversário"); rotulo12 = new JLabel ("Data de Cadastro");
        
        texto1 = new JTextField(20);     texto2 = new JTextField(20);     texto3 = new JTextField(20); //instanciando a caixa de texto e danto atributos a caixa de texto
        texto4 = new JTextField(20);     texto5 = new JTextField(20);     texto6 = new JTextField(20);
        texto7 = new JTextField(20);
        
        botao1 = new JButton("Incluir",icone1);     botao2 = new JButton("Limpar",icone2);    botao3 = new JButton("Sair",icone3); //instanciando o botão e danto atributos ao botão
        botao4 = new JButton("Consultar",icone4);   botao5 = new JButton("Consultar Todos",icone5);
        
        texto1.setEnabled(false); //Desabilita esta caixa de texto
        
        texto7.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis()))); //Define o formato específico de data para a caixa de texto
        
        try{
            maskcep = new MaskFormatter("#####-###");      //Método que coloca a máscara, um formato específico para a caixa de texto
            maskcel = new MaskFormatter("(##)#####-####");
            masktel = new MaskFormatter("(##)####-####");
        }
        catch(ParseException excp){}
                
        cep = new JFormattedTextField(maskcep); //Instanciando as máscaras pra o formato de caixa de texto específico
        cel = new JFormattedTextField(maskcel);
        tel = new JFormattedTextField(masktel);
        
        cep.setBounds(200,185,190,25); //Define a posição das caixas de textos com formato específico
        cel.setBounds(200,245,190,25);
        tel.setBounds(200,275,190,25);
                
        rotulo1.setBounds(10,05,100,20);     rotulo2.setBounds(10,35,100,20);    rotulo3.setBounds(10,65,100,20); //Define a posição do texto
        rotulo4.setBounds(10,95,100,20);     rotulo5.setBounds(10,125,100,20);   rotulo6.setBounds(10,155,100,20);
        rotulo7.setBounds(10,185,100,20);    rotulo8.setBounds(10,215,100,20);   rotulo9.setBounds(10,245,100,20);
        rotulo10.setBounds(10,275,100,20);   rotulo11.setBounds(10,305,150,20);  rotulo12.setBounds(10,335,100,20);
        
        texto1.setBounds(200,05,190,25);     texto2.setBounds(200,35,190,25);    texto3.setBounds(200,65,190,25); //Define a posição da caixa de texto
        texto4.setBounds(200,95,190,25);     texto5.setBounds(200,125,190,25);   texto6.setBounds(200,305,190,25);
        texto7.setBounds(200,335,190,25);
        
        botao1.setBounds(10,365,160,25);     botao2.setBounds(180,365,160,25);   botao3.setBounds(350,365,160,25); //Define a posição do botão
        botao4.setBounds(10,395,160,25);     botao5.setBounds(180,395,160,25);
        
        tela.add(rotulo1);   tela.add(rotulo2);   tela.add(rotulo3); //método que adiciona os métodos de texto na tela
        tela.add(rotulo4);   tela.add(rotulo5);   tela.add(rotulo6);
        tela.add(rotulo7);   tela.add(rotulo8);   tela.add(rotulo9);
        tela.add(rotulo10);  tela.add(rotulo11);  tela.add(rotulo12);
        
        tela.add(texto1);    tela.add(texto2);    tela.add(texto3); //método que adiciona os métodos da caixa de texto na tela
        tela.add(texto4);    tela.add(texto5);    tela.add(texto6);
        tela.add(texto7);
        
        tela.add(botao1);    tela.add(botao2);    tela.add(botao3); //método que adiciona os métodos do botão na tela
        tela.add(botao4);    tela.add(botao5);
        
        tela.add(lista); //método que adiciona os métodos da lista na tela
        tela.add(primeira);  tela.add(segunda); //método que adiciona os métodos das opções da lista na tela
        
        tela.add(cep); tela.add(cel); tela.add(tel); //método que adiciona os métodos das caixas de textos com formato específico na tela
        
        setSize(600,500); //insere tamanho da tela
        setVisible(true); //Torna a tela vizível
        setLocationRelativeTo(null); //Centraliza a tela na página
        
    }
    
    public static void main(String[] args) {
        ListEx2 app = new ListEx2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
