package Classes;

public class ConversorNumeros {
    
    public int stringToInt(String data)
    {
        int convert = Integer.parseInt(data);      
        return convert;
    } 
    
    public double stringToDouble(String data)
    {
        double convert = Double.parseDouble(data);
        return convert;
    }
}
