package Exercicio04;

public class Main {
    public static void main(String[] args) {
      
        Caminhao caminhao = new Caminhao();
        caminhao.setMotor(true);
        caminhao.setEixos(4);

        Carro carro = new Carro();
        carro.setMotor(true);
        carro.setPortas(4);

        Moto moto = new Moto();
        moto.setMotor(true);
        moto.setCilindradas(250);

        System.out.println("Informações sobre os veículos:");
        System.out.println("Caminhão: " + caminhao);
        System.out.println("Carro: " + carro);
        System.out.println("Moto: " + moto);
    }
}
