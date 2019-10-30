
package projetointer;


public class Triangulo extends Figura2D{
    private double base;
    private double altura;
    
    public Triangulo(int condigo, double base, double altura){
        setCodigo(codigo);
        this.setBase(base);
        this.setAltura(altura);
    }
    
    public double getBase(){
        return base;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    //----@override
    public double getArea(){
        return (getBase() * getAltura())/2;
    }
    
    public static String getDesenho(){
        return "";
    }
}
