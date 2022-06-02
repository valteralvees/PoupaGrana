package poupagrananext;

import java.util.Arrays;

public class Cliente {
    String nome;
    long rg;
    static double [] saldoTotal = {154,658,5478,0};

    
    
    //Construtor
    Cliente(String nome, long rg){
        this.nome = nome;
        this.rg = rg;
    }
    
    //Método 1
   double mostrarSaldo(){
       double somaSaldo = 0;
       for (double saldoUnitario: saldoTotal){
           System.out.println(saldoUnitario);
           somaSaldo = somaSaldo + saldoUnitario;
           saldoTotal[0] = somaSaldo;
          
       }
       saldoTotal[1]=0;
       saldoTotal[2]=0;
       saldoTotal[3]=0;
       
       System.out.println(Arrays.toString(saldoTotal));
       System.out.println("SALDO ATUAL:R$"+ somaSaldo);
       
       return somaSaldo;
   }    
   
   //Método 2
   double fazerDeposito(double novoDeposito){
       double depositoFeito =0;
       double somaSaldo=0;
       mostrarSaldo();
       for (double saldoUnitario: saldoTotal){
           if (saldoUnitario ==0){
               saldoUnitario = novoDeposito; 
           }
           somaSaldo = somaSaldo + saldoUnitario;
       }
       System.out.println("DEPÓSITO CONCLUÍDO");
       System.out.println("NOVO SALDO R$"+ somaSaldo);
       
       return depositoFeito;
   }
   
   //Método 3
   double fazerSaque(double novoSaque){
       mostrarSaldo();
       System.out.println("===========ARRAY PRÉ-SAQUE===============");
       System.out.println(Arrays.toString(saldoTotal));
       System.out.println("=========================================");
       double novoSaldo =0;
       double saqueFeito = 0;
       for (double saldoUnitario: saldoTotal){
           if(novoSaque < saldoTotal[0] ){
               novoSaldo = saldoTotal[0] - novoSaque;
           }else if(novoSaque > saldoTotal[0]){
               System.out.println("Você não tem saldo suficiente para essa transação.");
           }
       }
       saldoTotal[0]= novoSaldo;
       System.out.println("SAQUE REALIZADO! Seu saldo total é de R$"+ novoSaldo);

       System.out.println("===========ARRAY PÓS-SAQUE===============");
       System.out.println(Arrays.toString(saldoTotal));
       System.out.println("=========================================");
       return saqueFeito;   
   }
   
   double simularRendimento(double porcentagem, int numMeses){
       double simulacaoFeita=0;
       mostrarSaldo(); //Pra juntar o valor dos elementos do array em um só.
       double rendimentoEsperado = (saldoTotal[0]/ 100 * porcentagem) * numMeses;
       double valorTotal = saldoTotal[0]+ rendimentoEsperado;
       System.out.println("O rendimento esperado, do valor de "+saldoTotal[0]+" no tempo de "+numMeses+" meses, a "+porcentagem+"% é de R$"+ rendimentoEsperado+" O valor total ficaria em R$"+valorTotal);
       return simulacaoFeita;
   }
    
}
