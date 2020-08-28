
package Classes;

public class Verifica 
{
    private String tipo;
    private double area,perimetro;
    
    
    
    
    public void verificarTipo(Triangulo t)
    {
        double lado1 = t.getLado1(), lado2 = t.getLado2(), lado3 = t.getLado3();
        
        if(lado3 != lado1 && lado3 != lado2 && lado1 == lado2)
        {
            this.setTipo("Este Triangulo é Isósceles");  
        }else if(lado1 == lado2 && lado2 == lado3 && lado3 == lado1)
        {
            this.setTipo("Este Triangulo é Equilátero");
        }else
        {
            this.setTipo("Este Triangulo é Escaleno");
        }
    }
    
    public void calcularArea(Triangulo t)
    {
        double result = t.getLado3()*t.getAltura()/2;
        this.setArea(result);
    }
    
    public void calcularPerimetro(Triangulo t)
    {
        double base = t.getLado3(), lado1 = t.getLado1(), lado2 = t.getLado2();
        double result = base+lado1+lado2; 
        this.setPerimetro(result);
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * @return the perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
}
