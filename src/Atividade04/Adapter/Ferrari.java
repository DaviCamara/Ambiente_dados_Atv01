package Atividade04.Adapter;




//Classe que ir� sofrer adapta��o
public class Ferrari implements Interface {
	 
	
	//Override do m�todo de velocidade da interface, retornando a velocidade de 268 mp/h
    @Override
    public double getSpeed() {
		return 268;
    }
}
