
package projetointer;


public class MovFigura {
    private static Ponto[] figuras = new Ponto[];
    
    private static int qtdutilizada  = 0;
    private static int qtdquadrado   = 0;
    private static int qtduretangulo = 0;
    private static int qtdtriangulo  = 0;
    private static int qtdcirculo    = 0;
    private static int qtdcubo       = 0;
    private static int qtdesfera     = 0;
    
    private Ponto figura = null;
    
    private static void Salvar(Ponto figura){
        figuras[qtdutilizada] = figura;
        qtdutilizada++; 
    }
    
    public void cadastrarQuadrado(int codigo, double lado){
        figura = new Quadrado(codigo, lado);
        Salvar(figura);
    }
    public void cadastrarRetangulo(int codigo, double largura, double altura){
        figura = new Retangulo(codigo, largura, altura);
        Salvar(figura);
    }
    public void cadastrarTriangulo(int codigo, double base, double altura){
        figura = new Triangulo(codigo, base, altura);
        Salvar(figura);
    }
    public void cadastrarCirculo(int codigo, double raio){
        figura = new Circulo(codigo, raio);
        Salvar(figura);
    }
    public void cadastrarCubo(int codigo, double lado){
        figura = new Cubo(codigo, lado);
        Salvar(figura);
    }
    public void cadastrarEsfera(int codigo, double raio){
        figura = new Esfera(codigo, lado);
        Salvar(figura);
    }
    
    public void Remover(int codigo){
        for(int i=0; i<qtdutilizada; i++){
            if(figuras[i].getCodigo().equals(codigo)){
                for(int j=i; j<qtdutilizada; j++){
                    figuras[j] = figuras[j+1];
                }
                qtdutilizada--;
                break;
            }
        }
    }
    
    public String getFigura(int codigo){
        String resposta = "";
        for(int i=0; i<qtdutilizada; i++){
            Ponto f = figuras[i];
            if(f.getCodigo().equalsIgnorecase(codigo)){
                resposta = f.getDesenho()+"\nArea: "+f.getArea();
            } else{
                reposta = "Figura não encontrada"
            }
        }
        return resposta;
    }
    
    public String getListaFigura(){
        String resposta = "";
        for(int i=0; i<qtdutilizada; i++){
            Ponto f = figuras[i];
            if(f instanceof Quadrado){
                reposta += "\nQuadrado --> Area: "+f.getArea();
            }else if(f instanceof Retangulo){
                resposta += "\nRetangulo --> Area: "+f.getArea();
            }else if(f instanceof Triangulo){
                resposta += "\nTriangulo --> Area: "+f.getArea();
            }else if(f instanceof Circulo){
                resposta += "\nCirculo --> Area: "+f.getArea();
            }else if(f instanceof Cubo){
                resposta += "\nCubo --> Area: "+f.getArea();
            }else if(f instanceof Esfera){
                resposta += "\nEsfera --> Area: "+f.getArea();
            }
        }
        return reposta;
    }
    
    public double getAreaTotoal(){
        double areatotal = 0;
        for(int i=0; i<qtdutilizada; i++){
            areatotal += figuras[i].getArea();
        }
        return areatotal;
    }
    
    public String getTotalTipo(){
        for (int i=0; i<qtdutilizada; i++){
            Ponto f = figuras[i];
            if(f instanceof Quadrado){
                qtdquadrado++;
            }else if(f instanceof Retangulo){
                qtduretangulo;
            }else if(f instanceof Triangulo){
                qtdtriangulo;
            }else if(f instanceof Circulo){
                qtdcirculo;
            }else if(f instanceof Cubo){
                qtdcubo;
            }else if(f instanceof Esfera){
                qtdesfera;
            }
        }
        return "Quadrados: "+qtdquadrado
                +"\nRetangulo: "+qtduretangulo
                +"\nTriangulo: "+qtdtriangulo
                +"\nCirculo: "+qtdcirculo
                +"\nCubo: "+qtdcubo
                +"\nEsfera: "+qtdesfera;
    }
}
