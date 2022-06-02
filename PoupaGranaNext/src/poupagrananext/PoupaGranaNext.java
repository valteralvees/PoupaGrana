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
            case 2:
                System.out.println("Digite o valor que deseja sacar: R$");
                double novoSaque =teclado.nextDouble();
                a01.fazerSaque(novoSaque);
            break;
            case 3:
                System.out.println("Você deseja ver o rendimento do seu saldo atual a quantos %?");
                double porcentagem = teclado.nextDouble();
                System.out.println("Agora, me diz em quantos meses você deseja ver esse dinheiro rendendo:");
                int numMeses = teclado.nextInt();
                a01.simularRendimento(porcentagem, numMeses);
            break;
                
            
        }
        
        
        
    }
    
}
