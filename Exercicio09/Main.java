package Exercicio09;

public class Main {

	public static void main(String[] args) {
      
        NaveEspacial nave = new NaveEspacial();
        nave.setVelocidadeMaxima(50000.0);

        Apolo11 apolo11 = new Apolo11();
        apolo11.setVelocidadeMaxima(25000.0);
        apolo11.setTipoCombustivel("Hidrogênio Líquido");

        MillenniumFalcon falcon = new MillenniumFalcon();
        falcon.setVelocidadeMaxima(100000.0);
        falcon.setTipoCombustivel("Coaxium");
        falcon.setClasseHiperpropulsor(7);

       
        System.out.println("Informações sobre as naves espaciais:");
        System.out.println("Nave Espacial: " + nave);
        System.out.println("Apolo11: " + apolo11);
        System.out.println("Millennium Falcon: " + falcon);
    }
}
