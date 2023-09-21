package Exercicio11;

public class Main {
	public static void main(String[] args) {
       
        Peca peca = new Peca(1, 1, true, 0);
        System.out.println("Peca:");
        System.out.println(peca);

        Peao peao = new Peao(2, 2, true, 0);
        System.out.println("\nPeao:");
        System.out.println(peao);
        peao.mover(3, 2);

    
        Torre torre = new Torre(4, 4, true, 0);
        System.out.println("\nTorre:");
        System.out.println(torre);
        torre.mover(4, 6);

      
        Rei rei = new Rei(5, 5, true, 0);
        System.out.println("\nRei:");
        System.out.println(rei);

      
        Rainha rainha = new Rainha(6, 6, true, 0);
        System.out.println("\nRainha:");
        System.out.println(rainha);

      
        Cavalo cavalo = new Cavalo(7, 7, true, 0);
        System.out.println("\nCavalo:");
        System.out.println(cavalo);

  
        Bispo bispo = new Bispo(8, 8, true, 0);
        System.out.println("\nBispo:");
        System.out.println(bispo);
    }

}
