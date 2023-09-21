package Exercicio09;

public class MillenniumFalcon extends Apolo11 {
	private float classeHiperpropulsor;

	public float getClasseHiperpropulsor() {
		return classeHiperpropulsor;
	}

	public void setClasseHiperpropulsor(float classeHiperpropulsor) {
		this.classeHiperpropulsor = classeHiperpropulsor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MillenniumFalcon [classeHiperpropulsor=");
		builder.append(classeHiperpropulsor);
		builder.append(", getTipoCombustivel()=");
		builder.append(getTipoCombustivel());
		builder.append(", getVelocidadeMaxima()=");
		builder.append(getVelocidadeMaxima());
		builder.append("]");
		return builder.toString();
	}
}
