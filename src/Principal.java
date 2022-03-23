
public class Principal {

	public static void main(String[] args) {
		
		Carro c = new Carro();
		c.setModelo("FUSCA");
		c.acelerar();
		System.out.println(c.toString());
		
		Bicicleta b = new Bicicleta();
		b.setModelo("CALOI");
		b.acelerar();
		System.out.println(b.toString());
		
	}
	
}
