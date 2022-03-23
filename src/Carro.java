
public class Carro extends Veiculo {

	private int potenciaMotor;

	public int getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(int potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	
	@Override
	public void acelerar() {
		System.out.println("Estou pisando no acelerador do carro...");
	}
		
}
