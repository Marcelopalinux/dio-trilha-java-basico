import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
 * Atributo	Tipo	Exemplo
Numero	Inteiro	1021
Agencia	Texto	067-8
Nome Cliente	Texto	MARIO ANDRADE
Saldo	Decimal	237.48
 */
	
   int numero;
   String agencia;
   String nomecliente;
   double saldo;
   try (Scanner dados = new Scanner(System.in)) {
	System.out.println("\"Por favor, digite o número da Conta !\"");
	   numero = dados.nextInt();
	   System.out.println("\"Por favor, digite o número da Agencia!\"");
	   agencia = dados.next();
	   System.out.println("\"Por favor, digite o nome da Cliente !\"");
	   nomecliente = dados.next();
	   System.out.println("\"Por favor, digite o Saldo do Cliete !\"");
	   saldo = dados.nextDouble();
}	
   System.out.println("Olá "+nomecliente
		   +", obrigado por criar uma conta em nosso banco, sua agência é "
		   +agencia+", conta "+ numero+" e seu saldo "+saldo +" já está disponível para saque");

	}

}
