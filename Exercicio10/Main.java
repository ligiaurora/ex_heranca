package Exercicio10;

public class Main {
	public static void main(String[] args) {
       
		
        BombaDiesel bombaD = new BombaDiesel(100, 5);
        BombaEtanol bombaE = new BombaEtanol(500, 10);
        BombaGasolina bombaG = new BombaGasolina(250,15);
        System.out.println(bombaD);
        System.out.println(bombaE);
        System.out.println(bombaG);
        
        
        bombaD.abastecerPorLitro(20);
        bombaE.abastecerPorValor(50.0);
        bombaG.abastecerPorLitro(15);  
    }
}

