
import java.io.IOException;
import java.util.Scanner;



/**
 *
 * @author Davi
 */
public class InstrucoesSwitch {
    
    public static void main(String[]args)throws IOException{
    System.out.println("Digite um dos Comandos abaixo do Menu: ");
    System.out.println("1: Comprar; 2: Vender; 3: Listar; 4: Sair");
    //le do teclado um caracter
   Scanner scan = new Scanner(System.in);
    int opcao = scan.nextInt();
    
    switch (opcao){
        case 1:
            System.out.println("Você acessou COMPRAR!");
            break;
            
        case 2:
            System.out.println("Você acessou VENDER!");
            break;
        case 3:
            System.out.println("Você acessou LISTAR!");
            break;
        default:
            System.out.println("Saindo do Sistema");
    }
    
    }
}
