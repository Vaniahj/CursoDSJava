
package Classes;

import javax.swing.JOptionPane;

public class EntradaSaidadeDados 
{
    public String entradaDados(String mensagemEntrada)
    {
        return JOptionPane.showInputDialog(mensagemEntrada);
    }
    
    public void saidaDados(String mensagemSaida)
    {
        JOptionPane.showMessageDialog(null, mensagemSaida);
    }
}
