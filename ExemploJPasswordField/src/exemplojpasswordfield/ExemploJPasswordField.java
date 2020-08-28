package exemplojpasswordfield; //Nome do doretório
import javax.swing.*; //Biblioteca importada
import java.awt.*; //Biblioteca importada
import java.awt.event.*;

/**
 *
 * @author Vania Julia
 */
public class ExemploJPasswordField extends JFrame{ // Classe publica; nome da classe;extends: erdada; JFrame: classe pai
    JPasswordField caixa; //Declaração de atributos de objetos
    JLabel rotulo; //Declaração de atributos de objetos
        public ExemploJPasswordField(){ //Método construtor
            super ("Exemplo com JPasswordField"); //chamada inplicita.
            Container tela = getContentPane(); //Atribui características na tela
            setLayout(null); //Atribui posição nos objetos. (Null) Os objetos tem posições independentes
            rotulo = new JLabel ("Senha"); //instanciando o objeto e danto atributos ao objeto
            caixa = new JPasswordField(10); //instanciando o objeto e danto atributos ao objeto
            
            rotulo.setBounds(50,20,100,20); //Define a posição do objeto
            caixa.setBounds(50,60,100,20); //Define a posição do objeto
            
            tela.add(rotulo); //método que adiciona os métodos acima na janela
            tela.add(caixa); //método que adiciona os métodos acima na janela
            setSize(400,250); //insere tamanho da janela
            setVisible(true); //Torna a janela vizível
            setLocationRelativeTo(null); // Centraliza a janela na página
        }

    
    public static void main(String[] args) {
        ExemploJPasswordField app = new ExemploJPasswordField();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Método que fecha a janela
        
    }
    
}
