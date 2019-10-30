
package projetointer;


public class Esfera extends Figura3D{
    private double raio;
 
    public Esfera(int codigo, double raio){
        setCodigo(codigo);
        this.setRaio(raio);
    }//----------------------------------------
   
    public double getRaio() {
        return raio;
    }
 
    public void setRaio(double raio) {
        this.raio = raio;
    }
   
    
    public double getArea(){
        return 4 * 3.14 * (getRaio() * 2);
    }//----------------------------------------
   
    public static String getDesenho(){
        return "   ░░░░░░░░░░░░░\n"+
               " ░░░░░░░░░░░░░░░░░\n"+
               "░░░░░Isso é uma░░░░\n"+
               "░░░░░░░░░░░░░░░░░░░\n"+
               "░░░░░░ ESFERA ░░░░░\n"+
               "░░░░░░░░░░░░░░░░░░░\n"+
               " ░░░SEM CURVAS░░░░\n"+
               "   ░░░░░░░░░░░░░";
    }//-------------------------------------Desenhando Quandrado
}
