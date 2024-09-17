package Atividade03.Singleton;

public class AcessoDBSingleton {
	private boolean conexao;
	private static AcessoDBSingleton uniqueInstance;

	private AcessoDBSingleton() {
		conexao = true;
	}

	public static AcessoDBSingleton getInstance() {
		if (uniqueInstance == null) {
			System.out.println("Criando uma conexão com o banco de dados.");
			uniqueInstance = new AcessoDBSingleton();
		} else if (uniqueInstance != null) {
			System.out.println("Conexão com o banco de dados já iniciada, impossível criar" + " uma conexão única");
		}
		System.out.println("Retomando uma Instância de conexão com o banco de dados.");
		return uniqueInstance;
	}

	public void disconnect() {
		if (conexao == true) {
			System.out.println("Fechando  conexão  com o banco de dados");
			conexao = false;
			uniqueInstance = null;
		}
	}

	public boolean isConnected() {
		try {

			if (conexao == true) {
				System.out.println("Conexão com o banco ainda está ativa. Estado de conexão: " + conexao);
				return conexao;

			} else if (conexao == false) {
				System.out.println("Conexão com o banco não  está ativa. Estado de conexão: " + conexao);
				return conexao;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conexao;

	}
}
