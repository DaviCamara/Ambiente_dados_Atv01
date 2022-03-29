/*Esse cen�rio foi escolhido como exemplo pois com o advento de surgimento de concerssionarias
 * de carros esportivos em Fortaleza, foi teorizado a necessidade de um sistema que
 * realizasse a convers�o de velocidade aparesentada de um padr�o estrangeiro, para um 
 * padr�o nacional. Portanto a cria��o de um Adapter de convers�o de MPh para Kmh.
 */
/*
 * As vantagens dessa implementa��o s�o vistas a medida que � poss�vel a cria��o de uma
 * interface �nica para o sistema de carros, sendo necess�rio a cria��o apenas de classes
 * especificas para cada modelo, contendo informa��es pertinentes ao modelo do carro, nesse
 * caso a simula��o da sua velocidade corrente. Caso seja necess�rio a inclus�o de outros
 * padr�es externos no futuro, a interface, permite a adi��o de novos m�todos de convers�o
 * sem alterar o c�digo j� implementado, tornando assim a interface escalavel. Pois os
 * m�todos de convers�o est�o sobre responsabilidade da Adapter e s�o implementados atrav�s
 * da suas respectivas classes de implementa��o.Portanto com a adi��o de novos modelos, �
 * � poss�vel apenas criar novas classes para tais e  repassar para o m�todo de convers�o no
 * Adapter a medida do necess�rio
 */




package Atividade04.Adapter;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

//Main de execu��o
public class Main {

	public static void main(String args[]) {
		//Instancia��o do carro Ferrari que ter� velocidade convertida de Mph para Kmh
		Interface ferrari = new Ferrari();
		
		//Intancia��o do Adapter, passando a a instanc��o da implementa��o do adapter
		//tendo como parametro o modelo de carro desejado
		Adapter ferrariAdapter = new AdapterImpl(ferrari);
		
		//Prova de conceito da convers�o de velocidade.
		System.out.println("Ferrari top speed is " + ferrariAdapter.getSpeed() + " Kmph.");
	}
}