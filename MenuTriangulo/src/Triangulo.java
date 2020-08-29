/**
 *
 * @author Vania Julia
 */
public class Triangulo {
    
    private double lado1;
    private double lado2;
    private double base;
    private double altura;
    private String tipo;
    
    public Triangulo(){
        this(0,0,0,0);
    }
    public Triangulo(double lado1, double lado2, double base, double altura){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void cadastrarLados(double lado1, double lado2, double base, double altura){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
        
    }
    public void sair(){
        System.exit(0);
    }
           
}
    