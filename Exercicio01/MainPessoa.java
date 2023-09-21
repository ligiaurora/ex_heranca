package Exercicio01;

public class MainPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Lígia Aurora");
		pf.setCpf("359.977.420-08");
		pf.setEstadoCivil("Solteira");
		System.out.println(pf);	
		
		
		PessoaJuridica pessoaJ = new PessoaJuridica();
		pessoaJ.setCnpj("86.951.692/0001-79");
		pessoaJ.setEndereco("R. Abraham Lincoln, 210");	
		pessoaJ.setTipoEmpresa("Educacional");	
		pessoaJ.setNome("Colégio");
		System.out.println(pessoaJ);

	}
}
