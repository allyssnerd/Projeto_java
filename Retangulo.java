
package projetointer;


public class Retangulo extends Figura2D{
    private double largura;
    private double altura;
    
    public Retangulo(int codigo, double largura, double altura){
        setCodigo(codigo);
        this.setLargura(largura);
        this.setAltura(altura);
    }//----------------------------construtor
    
    public double getlargura(){
        return largura;
    }
    
    public void setLargura(double largura){
        this.largura = largura;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    //----@override
    public double getArea(){
        return getLargura() * getAltura;
    }
    
    public static String getDesenho(){
        return "";
    }
}
