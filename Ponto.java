
package Projetointer;


public class Ponto{
    private double area;
    private int codigo;
    
    public Ponto () {
        
    }
    
    public double getArea() {
        return area;
    }
    
    public void setArea(double area){
        this.area = area;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public static String getDesenho(){
        return "A figura não tem desenho. ";
    }
}
