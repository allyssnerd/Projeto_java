
package projetointer;

/**
 *
 * @author Angelo
 */
public class Cubo extends Figura3D{
    private double lado;
    
    public Cubo(String codigo, double lado){
        setCodigo(codigo);
        this.setLado(lado);
    }
    
    public double getLado(){
        return lado;
    }
    
    public void setLado(double lado){
        this.lado = lado;
    }
    
    public double getArea(){
        return getLado() * getLado() * getLado();
    }
    
    public static String setDesenho(){
        return "Cubo";        
    }
}
