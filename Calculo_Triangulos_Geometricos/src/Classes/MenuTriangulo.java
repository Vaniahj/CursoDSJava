
package Classes;

public class MenuTriangulo {
    private Triangulo           triangulo;
    private Verifica            verifica;
    private int                 op;
    private EntradaSaidadeDados io;
    private ConversorNumeros    conversor;

    public MenuTriangulo() 
    {
        triangulo = new Triangulo();
        verifica  = new Verifica();
        op        = -1;
        io        = new EntradaSaidadeDados();
        conversor = new ConversorNumeros();
    }
    
    public void executarTriangulo()
    {
        do 
        {            
            executarMenuPrincipal();
            avaliarOpcaoEscolhida();
        } while (op != 0);
    }
    
    public void executarMenuPrincipal()
    {
        String menu = "Digite na sequência os números abaixo:"
                + "\n 1- Cadastrar Lados e Altura"
                + "\n 2- Verificar Lados e Altura Cadastrados"
                + "\n 3- Verificar Tipo de Triangulo"
                + "\n 4- Calcular Perimetro"
                + "\n 5- Calcular Area"
                + "\n 0- Sair";
        String request = io.entradaDados(menu);
        this.op = conversor.stringToInt(request);
    }
    
    public void avaliarOpcaoEscolhida()
    {
        
        //Lados e altura:
        String l1 ="Digite o 1° lado", l2 ="Digite 2° lado", l3 ="Digite base do triangulo", altura ="Digite a altura do Triangulo";
        
        switch(this.op)
        {
            case 1:
                
             triangulo.setLado1(conversor.stringToDouble(io.entradaDados(l1)));
             triangulo.setLado2(conversor.stringToDouble(io.entradaDados(l2)));
             triangulo.setLado3(conversor.stringToDouble(io.entradaDados(l3)));
             triangulo.setAltura(conversor.stringToDouble(io.entradaDados(altura)));
             break;
            
            case 2:
                String response = "Triangulo Cadastrado: "
                        + "\n 1°       Lado: "+triangulo.getLado1()
                        + "\n 2°       Lado: "+triangulo.getLado2()
                        + "\n          Base: "+triangulo.getLado3()
                        + "\n        Altura: "+triangulo.getAltura();
                
                io.saidaDados(response);
            break;
            
            case 3:
                verifica.verificarTipo(triangulo);
                io.saidaDados(verifica.getTipo());
            break;
            
            case 4:
                String res = "O Perimetro do seu Triangulo é: ";
                verifica.calcularPerimetro(triangulo);
                io.saidaDados(res+verifica.getPerimetro());
            break;
            
            case 5:
                String res1 = "A area do seu Triangulo é: ";
                verifica.calcularArea(triangulo);
                io.saidaDados(res1+verifica.getArea());
            break;
            
            case 0:
                System.exit(0);
             break;
                                
        }
    }
    
    
    
    
}
