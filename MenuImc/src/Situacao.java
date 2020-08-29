/**
 *
 * @author Vania Julia
 */
public class Situacao {
    
    private String situacao;

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public void verificarSituacao(Imc p){
        double valor = p.getImc();
                        
        if (valor <= 14.5){
            this.setSituacao("Desnutrição");            
        }
        else if (valor > 14.5 && valor <= 20){
            this.setSituacao("Peso abaixo do normal");            
        }
        else if (valor > 20 && valor <= 24.9){
            this.setSituacao("Peso normal");            
        }
        else if (valor > 25 && valor <= 29.9){
            this.setSituacao("Sobrepeso");            
        }
        else if (valor > 30 && valor <= 39.9){
            this.setSituacao("Obesidade");            
        }
        else if (valor > 40 || valor == 40){
            this.setSituacao("Obesidade Mórbida");            
        }
              
    }
        
}


