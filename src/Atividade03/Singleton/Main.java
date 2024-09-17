package Atividade03.Singleton;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {

			AcessoDBSingleton AcessoDB = AcessoDBSingleton.getInstance();
			System.out.println("------------------------------------------------------------");
			AcessoDB.isConnected();
			AcessoDB.disconnect();
			AcessoDB.isConnected();
			System.out.println("------------------------------------------------------------");
		}
	}

}
