package atividade2;
import javax.swing.text.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.text.ParseException;

/**
 *
 * @author Vania Julia
 */
public class Atividade2 extends JFrame{
    JLabel rotulo1,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6,rotulo7,rotulo8,rotulo9;
    JButton botao1,botao2,botao3;
    ImageIcon icone,icone2,icone3;
    JFormattedTextField nome,id,tel,cel,cpf,cep,est;
    JTextField texto1,texto2;
    MaskFormatter maskid,masktel,maskcel,maskcpf,maskcep,maskest;
    
    public Atividade2 (){
        super("Cadastro de Clientes");
        Container tela = getContentPane();
        ImageIcon icone = new ImageIcon("icone.png");
        ImageIcon icone2 = new ImageIcon("save.png");
        ImageIcon icone3 = new ImageIcon("print.png");
        setIconImage(icone.getImage());
        setLayout(null);
        
        rotulo1 = new JLabel ("Nome");
        rotulo2 = new JLabel ("Idade");
        rotulo3 = new JLabel ("Telefone");
        rotulo4 = new JLabel ("Celular");
        rotulo5 = new JLabel ("CPF");
        rotulo6 = new JLabel ("Endereço");
        rotulo7 = new JLabel ("CEP");
        rotulo8 = new JLabel ("Estado");
        rotulo9 = new JLabel ("Cadastro de Clientes");
        
        texto1 = new JTextField(100);
        texto2 = new JTextField(100);
        
        tela.setBackground(new Color(220,232,246));
        rotulo1.setBounds(30,60,80,20);
        rotulo2.setBounds(30,100,80,20);
        rotulo3.setBounds(30,140,80,20);
        rotulo4.setBounds(30,180,80,20);
        rotulo5.setBounds(30,220,80,20);
        rotulo6.setBounds(30,260,80,20);
        rotulo7.setBounds(30,300,80,20);
        rotulo8.setBounds(30,340,80,20);
        rotulo9.setBounds(150,20,200,20);
        
        texto1.setBounds(120,60,330,20);
        texto2.setBounds(120,260,330,20);
            
        try{
            maskid = new MaskFormatter("##");
            masktel = new MaskFormatter("(##)####-####");
            maskcel = new MaskFormatter("(##)#####-####");
            maskcpf = new MaskFormatter("###.###.###-##");
            maskcep = new MaskFormatter("#####-###");
            maskest = new MaskFormatter("UU");
            
            maskid.setPlaceholderCharacter('_');
            masktel.setPlaceholderCharacter('_');
            maskcel.setPlaceholderCharacter('_');
            maskcpf.setPlaceholderCharacter('_');
            maskcep.setPlaceholderCharacter('_');
            maskest.setPlaceholderCharacter('_');
        }
        catch(ParseException excp){}
                
        id = new JFormattedTextField(maskid);
        tel = new JFormattedTextField(masktel);
        cel = new JFormattedTextField(maskcel);
        cpf = new JFormattedTextField(maskcpf);
        cep = new JFormattedTextField(maskcep);
        est = new JFormattedTextField(maskest);
        
        id.setBounds(120,100,25,20);
        tel.setBounds(120,140,90,20);
        cel.setBounds(120,180,100,20);
        cpf.setBounds(120,220,100,20);
        cep.setBounds(120,300,70,20);
        est.setBounds(120,340,25,20);
        
        botao1 = new JButton("<< Voltar");
        botao2 = new JButton("Salvar", icone2);
        botao3 = new JButton(icone3);
               
        botao1.setBounds(50,400,100,20);
        botao2.setBounds(200,400,100,20);
        botao3.setBounds(350,400,100,20);
                       
        rotulo1.setForeground(new Color(25,82,135));
        rotulo2.setForeground(new Color(25,82,135));
        rotulo3.setForeground(new Color(25,82,135));
        rotulo4.setForeground(new Color(25,82,135));
        rotulo5.setForeground(new Color(25,82,135));
        rotulo6.setForeground(new Color(25,82,135));
        rotulo7.setForeground(new Color(25,82,135));
        rotulo8.setForeground(new Color(25,82,135));
        rotulo9.setForeground(Color.red);
        
        texto1.setForeground(Color.black);
        id.setForeground(Color.black);
        tel.setForeground(Color.black);
        cel.setForeground(Color.black);
        cpf.setForeground(Color.black);
        texto2.setForeground(Color.black);
        cep.setForeground(Color.black);
        est.setForeground(Color.black);
        
        texto1.setBackground(new Color(243,247,250));
        id.setBackground(new Color(243,247,250));
        tel.setBackground(new Color(243,247,250));
        cel.setBackground(new Color(243,247,250));
        cpf.setBackground(new Color(243,247,250));
        texto2.setBackground(new Color(243,247,250));
        cep.setBackground(new Color(243,247,250));
        est.setBackground(new Color(243,247,250));
                
        botao1.setBackground(new Color(52,116,175));
        botao2.setBackground(new Color(52,116,175));
        botao3.setBackground(new Color(52,116,175));
        
        botao1.setMnemonic(KeyEvent.VK_V);
        botao2.setMnemonic(KeyEvent.VK_S);
        botao3.setMnemonic(KeyEvent.VK_I);
        
        rotulo1.setFont(new Font("Arial",Font.BOLD,14));
        rotulo2.setFont(new Font("Arial",Font.BOLD,14));
        rotulo3.setFont(new Font("Arial",Font.BOLD,14));
        rotulo4.setFont(new Font("Arial",Font.BOLD,14));
        rotulo5.setFont(new Font("Arial",Font.BOLD,14));
        rotulo6.setFont(new Font("Arial",Font.BOLD,14));
        rotulo7.setFont(new Font("Arial",Font.BOLD,14));
        rotulo8.setFont(new Font("Arial",Font.BOLD,14));
        rotulo9.setFont(new Font("Arial",Font.BOLD,16));
        
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);
        tela.add(rotulo8);
        tela.add(rotulo9);
        
        tela.add(texto1);
        tela.add(id);
        tela.add(tel);
        tela.add(cel);
        tela.add(cpf);
        tela.add(texto2);
        tela.add(cep);
        tela.add(est);
        
        tela.add(botao1);
        tela.add(botao2);
        tela.add(botao3);
        
        setIconImage(icone.getImage());       
        setSize(500,500);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }

    
    public static void main(String[] args) {
        Atividade2 app = new Atividade2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
