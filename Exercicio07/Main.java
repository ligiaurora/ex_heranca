package Exercicio07;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Criação Aluno
		Aluno estudante = new Aluno();
		estudante.setNome("Fulano de tal");
		estudante.setCodigo(001);
		estudante.setEndereco("Rua Herculano Nunes Teixeira");
		estudante.setMatricula(2023);
		System.out.println(estudante);
		
		//Criação Professor
		Professor docente = new Professor();
		docente.setNome("Afonso");
		docente.setCodigo(100);
		docente.setEndereco("Nunes Teixeira");
		docente.setDisciplina("História");
		System.out.println(docente);
	}
}
