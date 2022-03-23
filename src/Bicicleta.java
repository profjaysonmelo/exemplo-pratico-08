
public class Bicicleta extends Veiculo {

	private int tamanhoAro;

	public int getTamanhoAro() {
		return tamanhoAro;
	}

	public void setTamanhoAro(int tamanhoAro) {
		this.tamanhoAro = tamanhoAro;
	}

	@Override
	public void acelerar() {
		System.out.println("Estou aumentando a cadência de pedaladas...");
	}
}
