package poupagrananext;

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
       }
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
           };
           somaSaldo = somaSaldo + saldoUnitario;
       }
       System.out.println("DEPÓSITO CONCLUÍDO");
       System.out.println("NOVO SALDO R$"+ somaSaldo);
       
       return depositoFeito;
   }
    
}
