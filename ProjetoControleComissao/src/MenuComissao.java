import java.text.DecimalFormat;
/**
 *
 * @author Vania Julia
 */
public class MenuComissao {
    
    private Vendedor vendedor;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;
    private DecimalFormat df;
    
    public MenuComissao(){
        this.vendedor = new Vendedor();
        this.opcao = -1;
        this.conversor = new ConversorNumeros();
        this.io = new EntradaSaidaDados();
        this.df = new DecimalFormat("###,##0.00");
        
    }
    public void executarVendedor1(){
        do{
            this.executarMenuPrincipal();
            this.avaliarOpcaoEscolhida();
        }while(this.opcao!=0);
    }
    private void executarMenuPrincipal(){
        String mensagemMenu = "Selecione a opção 2"
                +"\n 1 - Criar vendedor"
                +"\n 2 - Realizar cálculo de comissão de vendedor"
                +"\n 3 - Exibir vendedor"
                +"\n 0 - Sair";    
        String entradaDados = io.entradaDados(mensagemMenu);
        this.opcao = conversor.stringToInt(entradaDados);
    }
    public void avaliarOpcaoEscolhida(){
        String saida;
        double valorVendido=0,salarioBase=0;
        if(this.opcao==2){
            String mensagemEntrada = "Digite o valor vendido";
            valorVendido = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
            vendedor.setValor(valorVendido);
            mensagemEntrada = "Digite o valor do salário base";
            salarioBase = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
            vendedor.setSalario(salarioBase);
        }
        
        switch(this.opcao){
            case 1:
                io.saidaDados("Esta opção está teporariamente indisponível");
                break;
            case 2:
                vendedor.calculoComissao(valorVendido,salarioBase);
                saida="A sua comissão é: R$ " + (df.format(vendedor.getResultado()));
                io.saidaDados(saida);
                break;
            case 3:
                io.saidaDados("Esta opção está teporariamente indisponível");
                break;
            case 0:
                vendedor.sair();
            default:
                io.saidaDados("Opção inválida");
                break;
            
        }
    }
}
    
    
