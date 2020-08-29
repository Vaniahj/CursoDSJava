import java.text.DecimalFormat;
/**
 *
 * @author Vania Julia
 */
public class MenuImc {
    
    private Imc imc;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;
    private Situacao situacao;
    private DecimalFormat df;
    
    public MenuImc(){
        this.imc = new Imc();
        this.opcao = -1;
        this.conversor = new ConversorNumeros();
        this.io = new EntradaSaidaDados();
        this.situacao = new Situacao();
        this.df = new DecimalFormat("###,##0.0");
    }
    
    public void executarImc(){
        do{
            this.executarMenuPrincipal();
            this.avaliarOpcaoEscolhida();
        }while(this.opcao!=0);
    }
    private void executarMenuPrincipal(){
        String mensagemMenu = "Digite cada número em sequência: "
                +"\n 1 - Cadastrar Peso e Altura"
                +"\n 2 - Consultar dados cadastrados"
                +"\n 3 - IMC"
                +"\n 4 - Verificar situação"
                +"\n 0 - Sair";    
        String entradaDados = io.entradaDados(mensagemMenu);
        this.opcao = conversor.StringToInt(entradaDados);
    }
    public void avaliarOpcaoEscolhida(){
        
        double valorPeso=0,valorAltura=0;
        
        if(this.opcao==1){
            String mensagemEntrada = "Digite o seu peso";
            valorPeso = conversor.StringToDouble(io.entradaDados(mensagemEntrada));
            imc.setPeso(valorPeso);
            mensagemEntrada = "Digite a sua altura usando ponto. Ex: 1.60";
            valorAltura = conversor.StringToDouble(io.entradaDados(mensagemEntrada));
            imc.setAltura(valorAltura);
            
        }
           
        switch(this.opcao){
            case 1:
                io.saidaDados("Dados Cadastrados com sucesso!");
                break;
            case 2:
                String s = "Peso: " + imc.getPeso()
                        + "\nAltura: " + imc.getAltura();
                io.saidaDados(s);
                break;
            case 3:
                imc.calcularImc(valorPeso, valorAltura);
                io.saidaDados("O seu IMC é: " + (df.format(imc.getImc())));
                break;
            case 4:
                situacao.verificarSituacao(imc);
                io.saidaDados(situacao.getSituacao());
                break;
            case 0:
                imc.sair();
            default:
                io.saidaDados("Opção inválida");
                break;
            
        }
    }
}
