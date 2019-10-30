
package projetointer;


public class Quadrado extends Figura2D{
    private double lado;
    
    public Quadrado(int codigo, double lado){
        setCodigo(codigo);
        this.setLado(lado);
    }
    
    public double getLado(){
        return lado;
    }
    
    public void setLado(double lado){
        this.lado = lado;
    }
    
    //----@override
    public double getArea(){
        return getLado() * getLado();
    }
    
    public static String getDesenho(){
        return "";
    }
}
