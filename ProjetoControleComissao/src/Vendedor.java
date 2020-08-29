    
/**
 *
 * @author Vania Julia
 */
public class Vendedor {
    
    private double valor;
    private double salario;
    private double resultado;
    
    public Vendedor(){
        this(0,0,0);
    }
    public Vendedor(double valor,double salario,double resultado){
        this.valor = valor;
        this.salario = salario;
        this.resultado = resultado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public void calculoComissao(double valor,double salario){
        setResultado(this.getValor()*(0.03+(this.getSalario()*0.00001)));
    }
    public void sair(){
        System.exit(0);
    }

}
