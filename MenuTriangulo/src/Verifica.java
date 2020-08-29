/**
 *
 * @author Vania Julia
 */
public class Verifica {
    
    private String tipo;
    private double area;
    private double perimetro;
    
    public Verifica(){
        this(0,0);
    }
    
    public Verifica(double area, double perimetro){
        this.area = area;
        this.perimetro = perimetro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public void verificarTipo(Triangulo t){
        double valor1 = t.getLado1();
        double valor2 = t.getLado2();
        double valor3 = t.getBase();
        
        if (valor1 == valor2 && valor2 == valor3 && valor3 == valor1){
            this.setTipo("Este triângulo é Equilátero");
        }else if (valor1 == valor2 && valor2 != valor3 && valor3 != valor1){
            this.setTipo("Este triângulo é Isóceles");
        }else if (valor1 != valor2 && valor2 != valor3 && valor3 != valor1){
            this.setTipo("Este triângulo é Escaleno");
        }
        
    }
    public void calcularArea(Triangulo t){
        double valor1 = t.getBase();
        double valor2 = t.getAltura();
        
        this.setArea((valor1*valor2)/2);
        
    }
    public void calcularPerimetro(Triangulo t){
        double valor1 = t.getLado1();
        double valor2 = t.getLado2();
        double valor3 = t.getBase();
        
        this.setPerimetro(valor1 + valor2 + valor3);
        
    }
}
