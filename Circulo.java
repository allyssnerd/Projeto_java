
package projetointer;



public class Circulo extends Figura2D {
    private double raio;
    
    public Circulo(int codigo, double raio){
        setCodigo(codigo);
        this.setRaio(raio);
    }
    
    public double getRaio(){
        return raio;
    }
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    public double getRaio(){
        return 3.14*(getRaio()*getRaio());
    }
    
    public static String getDesenho(){
        return "Circulo";
    }
}
