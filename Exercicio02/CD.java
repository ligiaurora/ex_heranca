package Exercicio02;

public class CD extends Midia {
	private int faixas;
	private String artista;
	private String album;
	
	public int getFaixas() {
		return faixas;
	}
	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CD [faixas=");
		builder.append(faixas);
		builder.append(", artista=");
		builder.append(artista);
		builder.append(", album=");
		builder.append(album);
		builder.append(", getGravadora()=");
		builder.append(getGravadora());
		builder.append(", getDuracao()=");
		builder.append(getDuracao());
		builder.append(", getCodigo()=");
		builder.append(getCodigo());
		builder.append(", getDescricao()=");
		builder.append(getDescricao());
		builder.append("]");
		return builder.toString();
	}
}
