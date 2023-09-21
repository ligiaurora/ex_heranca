package Exercicio03;

public class MainConta {

	public static void main(String[] args) {
      
		//Criação Conta
        Conta conta = new Conta();
        conta.deposito(1000.0);
        conta.saque(500.0);
        System.out.println("Informações da Conta:");
        System.out.println(conta.toString());
        
        
       //Criação Conta Simples
        ContaSimples contaSimples = new ContaSimples();
        contaSimples.setBanco("Banco B");
        contaSimples.setAgencia(456);
        contaSimples.setNumeroconta(201);
        contaSimples.deposito(2000.0);
        contaSimples.saque(1000.0);
        contaSimples.depositoPoupanca(500.0);
        contaSimples.saquePoupanca(200.0);
        System.out.println("\nInformações da ContaSimples:");
        System.out.println(contaSimples.toString());

        // Criar Conta Especial
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setBanco("Banco C");
        contaEspecial.setAgencia(789);
        contaEspecial.setNumeroconta(3001);
        contaEspecial.setDiasSemJuros(30);
        contaEspecial.setLimite(1000.0);
        contaEspecial.deposito(3000.0);
        contaEspecial.saque(1500.0);
        System.out.println("\nInformações da ContaEspecial:");
        System.out.println(contaEspecial.toString());
    }

}
