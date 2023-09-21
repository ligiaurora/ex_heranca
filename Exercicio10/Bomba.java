package Exercicio10;

public class Bomba {
	private double totalLitros;
	private float valorLitro;
	
	public Bomba(double totalLitros, float valorLitro) {
        this.totalLitros = totalLitros;
        this.valorLitro = valorLitro;
    }

    public boolean abastecerPorLitro(double litros) {
        if (litros > 0 && litros <= totalLitros) {
            double valorAbastecido = litros * valorLitro;
            totalLitros -= litros;
            System.out.println("Abastecido por litro: " + litros + " litros, Valor: R$" + valorAbastecido);
            return true;
        } else {
            System.out.println("Abastecimento por litro inválido.");
            return false;
        }
    }

    public boolean abastecerPorValor(double valor) {
        if (valor > 0 && valor <= (totalLitros * valorLitro)) {
            double litrosAbastecidos = valor / valorLitro;
            totalLitros -= litrosAbastecidos;
            System.out.println("Abastecido por valor: R$" + valor + ", Litros: " + litrosAbastecidos);
            return true;
        } else {
            System.out.println("Abastecimento por valor inválido.");
            return false;
        }
    }

    public double getTotalLitros() {
        return totalLitros;
    }

    public void setTotalLitros(double totalLitros) {
        this.totalLitros = totalLitros;
    }

    public float getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [totalLitros=");
		builder.append(totalLitros);
		builder.append(", valorLitro=");
		builder.append(valorLitro);
		builder.append("]");
		return builder.toString();
	}
}
