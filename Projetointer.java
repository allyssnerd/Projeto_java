
package Projetointer;

import java.util.Scanner;

public class Projetointer {
    static Scanner entrada = new Scanner(System.in);
    
    public static void menuInicial(){
        System.out.println("        MENU INICIAL      ");
        System.out.println("1. Cadastrar Figura");
        System.out.println("2. Procurar Figura");
        System.out.println("3. Excluir Figura");
        System.out.println("4. Area Total");
        System.out.println("5. Quantidade por Figura");
        System.out.println("6. Imprimir lista de Figuras");
        System.out.print("0. SAIR ");
        
    }
   
    public static void main(String[] args) {
        MovFigura mov = new MovFigura();
        int opcao = 0;
        
          do{
            menuInicial();
            opcao = entrada.nextInt();
            switch(opcao){
                case 1: //cadastrar
                //--------------------------------------------------
                   int opDesenho = 0;
                   do{
                      menuDesenhos();
                      opDesenho = entrada.nextInt();
                      switch(opDesenho){
                         
                          case 1://quadrado
                              System.out.println("\nAdicionando Quadrado");
                              System.out.println(Quadrado.getDesenho());
                              System.out.print("informe Código: ");
                              String codigoQ = entrada.next();
                              System.out.print("informe Lado: ");
                              double lado = entrada.nextDouble();
                              f.cadastrarQuadrado(codigoQ, lado);
                              break;
                             
                          case 2://retangulo
                              System.out.println("\nAdicionando Retangulo");
                              System.out.println(Retangulo.getDesenho());
                              System.out.print("informe Código: ");
                              String codigoR = entrada.next();
                              System.out.print("informe Largura: ");
                              double largura = entrada.nextDouble();
                              System.out.print("informe Altura: ");
                              double altura = entrada.nextDouble();
                              f.cadastrarRetangulo(codigoR, largura, altura);
                              break;
                             
                          case 3://triangulo
                              System.out.println("\nAdicionando Triangulo");
                              System.out.println(Triangulo.getDesenho());
                              System.out.print("informe Código: ");
                              String codigoT = entrada.next();
                              System.out.print("informe Base: ");
                              double base = entrada.nextDouble();
                              System.out.print("informe Altura: ");
                              double alturaT = entrada.nextDouble();
                              f.cadastrarTriangulo(codigoT, base, alturaT);
                              break;
                          case 4://circulo
                              System.out.println("\nAdicionando Circulo");
                              System.out.println(Circulo.getDesenho());
                              System.out.print("informe Código: ");
                              String codigoC = entrada.next();
                              System.out.print("informe Raio: ");
                              double raio = entrada.nextDouble();
                              f.cadastrarCirculo(codigoC, raio);
                              break;
                             
                          case 5://cubo
                              System.out.println("\nAdicionando Cubo");
                              System.out.println(Cubo.getDesenho());
                              System.out.print("informe Código: ");
                              String codigoCb = entrada.next();
                              System.out.print("informe Lado");
                              double ladoCb = entrada.nextDouble();
                              f.cadastrarCubo(codigoCb, ladoCb);
                              break;
                             
                          case 6://esfera
                              System.out.println("\nAdicionando Esfera");
                              System.out.println(Esfera.getDesenho());
                              System.out.print("informe Código: ");
                              String codigoE = entrada.next();
                              System.out.print("informe o Raio: ");
                              double raioE = entrada.nextDouble();
                              f.cadastrarEsfera(codigoE, raioE);
                              break;
                             
                          default:
                              System.out.println("Opção invália!");
                              break;    
                      }
                   
                   }while(opDesenho != 7);
                //--------------------------------------------------    
                    break;
                   
                case 2: // procurar
                    System.out.println("\n   Procurar FIGURA ");
                    System.out.print("informe o Código: ");
                    String codFigura = entrada.next();
                    System.out.println(f.getFigura(codFigura));
                    System.out.println("------------------------------");
                    break;
                   
                case 3: //excluir
                    System.out.println("\n   Excluir FIGURA ");
                    System.out.print("informe o Código: ");
                    String codFig = entrada.next();
                    f.Remover(codFig);
                    break;
                   
                case 4: //Área total utilizada
                    System.out.println(f.getAreaTotal());
                    break;
                   
                case 5: // qtd por tipo
                    System.out.println(f.getQtdPorTipo());
                    break;
                   
                case 6: //lista
                    System.out.println(f.getListaFiguras());
                    break;
                   
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while(opcao != 0);
     
    }
}
    

