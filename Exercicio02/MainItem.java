package Exercicio02;

public class MainItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Livro livroNovo = new Livro();
		livroNovo.setAutor("Sylvia plath");
		livroNovo.setDescricao("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer pellentesque mi vel odio feugiat suscipit.");
		
		VHS novoVHS = new VHS();
		novoVHS.setTitulo("Star Wars - O retorno do Jedi");
		novoVHS.setDuracao(131);
		novoVHS.setDescricao("Luke Skywalker tenta trazer seu pai de volta ao lado bom da Força. "
				+ "Ao mesmo tempo, os rebeldes traçam um plano para destruir a segunda Estrela da Morte.");
		
		CD novoCD = new CD();
		novoCD.setArtista("The Cure");
		novoCD.setAlbum("Disintegration");
		novoCD.setFaixas(12);
		novoCD.setGravadora("Fiction Records");
		novoCD.setDescricao("8 Album do grupo The Cure");
	}
}
