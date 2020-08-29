/**
 *
 * @author Vania Julia
 */
public class Imc {
    
    private double peso;
    private double altura;
    private double imc;
    
    public Imc(){
        this(0,0,0);
    }
    
    public Imc(double peso, double altura, double imc){
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
    
    public void calcularImc(double peso, double altura){
        this.setImc(imc);setImc(this.getPeso() / ((this.getAltura() * this.getAltura())));
    }
    
    public void cadastrarDados(double peso, double altura){
        this.peso = peso;
        this.altura = altura;        
    }
    
    public void sair(){
        System.exit(0);
    }
}
