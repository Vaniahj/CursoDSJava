/**
 *
 * @author Vania Julia
 */
public class MenuTriangulo {
    private Triangulo triangulo;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;
    private Verifica verifica;
    
    public MenuTriangulo(){
        this.triangulo = new Triangulo();
        this.opcao = -1;
        this.conversor = new ConversorNumeros();
        this.io = new EntradaSaidaDados();
        this.verifica = new Verifica();
    }
    
    public void executarTriangulo(){
        do{
            this.executarMenuPrincipal();
            this.avaliarOpcaoEscolhida();
        }while(this.opcao!=0);
    }
    
    public void executarMenuPrincipal(){
        String mensagemMenu = "Digite cada número na sequência:"
                +"\n 1 - Cadastrar lados"
                +"\n 2 - Verificar lados cadastrados"
                +"\n 3 - Verificar tipo de triângulo"
                +"\n 4 - Calcular perímetro"
                +"\n 5 - Calcular área"
                +"\n 0 - Sair";
        String entradaDados = io.entradaDados(mensagemMenu);
        this.opcao = conversor.StringToInt(entradaDados);
    }
    
    public void avaliarOpcaoEscolhida(){
        
        double lado1=0,lado2=0,base=0,altura=0;
        
        if(this.opcao==1){
            String mensagemEntrada = "Digite o valor do 1º lado";
            lado1 = conversor.StringToDouble(io.entradaDados(mensagemEntrada));
            triangulo.setLado1(lado1);
            mensagemEntrada = "Digite o valor do 2º lado";
            lado2 = conversor.StringToDouble(io.entradaDados(mensagemEntrada));
            triangulo.setLado2(lado2);
            mensagemEntrada = "Digite o valor da base";
            base = conversor.StringToDouble(io.entradaDados(mensagemEntrada));
            triangulo.setBase(base);
        }
        switch(this.opcao){
            case 1:
                io.saidaDados("Dados Cadastrados com sucesso!");
                break;
            case 2:
                String s = "Lado 1: " + triangulo.getLado1()
                        + "\nLado 2: " + triangulo.getLado2()
                        + "\nBase: " + triangulo.getBase();
                io.saidaDados(s);
                break;
            case 3:
                verifica.verificarTipo(triangulo);
                io.saidaDados(verifica.getTipo());
                break;
            case 4:
                verifica.calcularPerimetro(triangulo);
                io.saidaDados("O perímetro é: " + verifica.getPerimetro());
                break;
            case 5:
                String d = "Digite o valor da altura do triângulo";
                altura = conversor.StringToDouble(io.entradaDados(d));
                triangulo.setAltura(altura);
                verifica.calcularArea(triangulo);
                io.saidaDados("A área do triângulo é: " + verifica.getArea());
                break;
            case 0:
                triangulo.sair();
            default:
                io.saidaDados("Opção inválida");
                break;
        }
        
    }
    
}
