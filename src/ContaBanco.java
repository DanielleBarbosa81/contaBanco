import java.util.Scanner;

public class ContaBanco {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
        	 
		 double saldo = 1000.00;
		 int numeroConta = 1;
		 int proximaConta = numeroConta;
         boolean executar = true;4

         while(executar){
            System.out.println("Escolha entre uma das opcoes abaixo: " );
        
            String menu = """
                    1) Abrir conta
                    2) Realizar Deposito
                    3) Realizar Saque
                    4) Transferencia
                    5) Saldo
                    6) Sair
                    """;
         
            System.out.println(menu);
         
         

		 int opcao = scan.nextInt();
		 scan.nextLine();
	
		 
		 		 
		 switch (opcao) {
		case 1: {
			
			System.out.println("Digite seu nome e sobrenome ");
			String nome = scan.nextLine();
			System.out.println("Digite o numero da sua Agencia: ");
			int numeroAgencia = scan.nextInt();
		
	
			System.out.println("Bem vindo  " + nome + " O numero da sua agencia e  " + numeroAgencia + " Sua nova conta  " + proximaConta);
			proximaConta++;
		}
		break;
			
		 case 2: {
			 System.out.println("Digite o valor para deposito");
			 Double valorDeposito = scan.nextDouble();
			 saldo +=valorDeposito;
			 System.out.println("O novo saldo e : " + saldo);
		 }
		 break;
		 
		 case 3: {
			 System.out.println("Digite o valor do saque: ");
			 Double valorSaque = scan.nextDouble();
			 if (valorSaque > saldo) {
				 System.out.println("Saldo insuficiente");
				 
			 }else {
				 saldo -= valorSaque;
				 System.out.println("Saque realizado com sucesso, seu novo saldo e : " + saldo);
			 }
		
			 
		 }
		 break;
		
		 case 4: 
			 
			 System.out.println("Digite o numero da  Agenca para transferencia ");
			 int numeroAgencia = scan.nextInt();
			 System.out.println("Digite o numero da conta para transferencia: ");
			 int numeroContaTRansferencia = scan.nextInt();
			 System.out.println("Digite o valor para transferencia: ");
			 Double valorTransferencia = scan.nextDouble();
			 if(valorTransferencia > saldo) {
				 System.out.println("Não é possivel realizar transferencia, saldo insuficiente! ");
			 }
			 else {
				 saldo -= valorTransferencia;
				 System.out.println("Transferencia realizada com sucesso, seu novo saldo e :  " + saldo);
			 }
			
		    break;
		 
		 case 5: 
			 System.out.println("Seu saldo atual e de R$ : " + saldo);
             break;

             case 6:
                System.out.println("Voce saiu do sistema, obrigado por usar nosso sistema!");
                executar = false;
                break;
		 
		 default:  {
		        System.out.println("Opcao invalida");
		   }
			 
		 }
		

		
	
       
        
		 
	
	}
    scan.close(); 


}

}
