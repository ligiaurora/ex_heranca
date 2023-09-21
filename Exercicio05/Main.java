package Exercicio05;

public class Main {

	public static void main(String[] args) {
		
		
        Cao cao = new Cao();
        cao.setNome("Lara");
        cao.setCor("Caramelo");
        cao.setTamanho("Pequena");
        cao.setIdade(3);
        cao.setTipoPelo("Pêlo Curto");
        cao.setRaca("Dachshund");

       
        System.out.println(cao);
        cao.amamentar();
        cao.iniciarBuscaBola();
        cao.buscarBola();
        cao.pararBuscaBola();

       
        Gato gato = new Gato();
        gato.setNome("Whiskers");
        gato.setCor("Cinza");
        gato.setTamanho("Pequeno");
        gato.setIdade(2);
        gato.setTipoPelo("Peludo");
        gato.setPersonalidade("Curioso");

       
        System.out.println(gato);
        gato.amamentar();
        gato.iniciarSoneca();
        gato.Dormindo();
        gato.pararBuscaBola();

        
        Tartaruga tartaruga = new Tartaruga();
        tartaruga.setNome("Tartarugão");
        tartaruga.setCor("Verde");
        tartaruga.setTamanho("Grande");
        tartaruga.setIdade(10);
        tartaruga.setTipoEscama("Escamado");
        tartaruga.setTamanhoCasco("Grande");

       
        System.out.println(tartaruga);
        tartaruga.iniciarRegulagem();
        tartaruga.regularTemperatura();
        tartaruga.pararRegulagem();

       
        Lagarto lagarto = new Lagarto();
        lagarto.setNome("Lizzy");
        lagarto.setCor("Verde");
        lagarto.setTamanho("Pequeno");
        lagarto.setIdade(3);
        lagarto.setTipoEscama("Escamado");
        lagarto.setSoltaCauda(true);

        
        System.out.println(lagarto);
        lagarto.iniciarRegulagem();
        lagarto.regularTemperatura();
        lagarto.pararRegulagem();

	}

}
