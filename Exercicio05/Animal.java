package Exercicio05;

public class Animal {
	private String nome;
    private String cor;
    private String tamanho;
    private int idade;
    
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [nome=");
		builder.append(nome);
		builder.append(", cor=");
		builder.append(cor);
		builder.append(", tamanho=");
		builder.append(tamanho);
		builder.append(", idade=");
		builder.append(idade);
		builder.append("]");
		return builder.toString();
	}	
}
