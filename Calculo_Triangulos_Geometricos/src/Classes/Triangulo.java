
package Classes;

public class Triangulo {

    
    private double lado1,lado2,lado3,altura;

   
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

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
 
    public double getAltura() {
        return altura;
    }

  
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    public void cadastrarLados(double lado1, double lado2, double lado3, double altura)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
    }
    
    
    
}
