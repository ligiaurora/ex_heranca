package Exercicio08;

public class Main {

	public static void main(String[] args) {
        
        Quarto quarto = new Quarto();
        quarto.setArea(20);
        quarto.setCapacidade(4);

        Sala sala = new Sala();
        sala.setArea(30);
        sala.setTv(true);

        Banheiro banheiro = new Banheiro();
        banheiro.setArea(10);
        banheiro.setBanheira(false);

        Cozinha cozinha = new Cozinha();
        cozinha.setArea(15);
        cozinha.setMicroondas(true);

        // Informações do ambiente
        System.out.println("Informações sobre os ambientes:");
        System.out.println("Quarto: " + quarto);
        System.out.println("Sala: " + sala);
        System.out.println("Banheiro: " + banheiro);
        System.out.println("Cozinha: " + cozinha);
    }
}
