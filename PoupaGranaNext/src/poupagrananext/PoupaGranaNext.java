package poupagrananext;
import java.util.Scanner;

public class PoupaGranaNext {

    public static void main(String[] args) {
        // Teclado
        Scanner teclado = new Scanner(System.in);
        
        Cliente a01 = new Cliente("Sandra Marques", 9800130);
        

        
        //Apresentação e escolha da funcionalidade
        System.out.println("===============Bem vindo(a) ao Next,"+a01.nome+ "!=================== ");
        System.out.println("0- CONSULTAR SEU SALDO");
        System.out.println("1- DEPOSITAR");
        System.out.println("2- RETIRAR");
        System.out.println("3- SIMULAR RENDIMENTO");
        System.out.println("======================================================");
        int escolhaMenu= teclado.nextInt();
        //Menu
        switch (escolhaMenu){
            case 0:
                a01.mostrarSaldo();
            break;
            case 1:
                System.out.println("Digite o valor que você deseja depositar: R$");
                double novoDeposito = teclado.nextDouble();
                a01.fazerDeposito(novoDeposito);
            break;
            
        }
        
        
        
    }
    
}
