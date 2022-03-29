package Atividade04.Adapter;


//Implementa��o do Adapter
public class AdapterImpl implements Adapter {
	
	//Interface gen�rica
	private Interface luxuryCars;
	
	
	//Implementa��o do adapter, utilizando a interface g�nerica
	public AdapterImpl(Interface luxuryCars) {
		this.luxuryCars = luxuryCars;
	}

	
	//@Override do m�todo de retorno de velocidade.
	//Altera��o do m�todo de calculo de velocidade de Mph para Kmh
	@Override
	public double getSpeed() {
		double mph = luxuryCars.getSpeed();
		return convertMPHtoKMPH(mph);
	}

	//C�lcuo da convers�o de MPH para MMHs
	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}
}
