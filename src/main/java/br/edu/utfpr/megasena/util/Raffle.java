package br.edu.utfpr.megasena.util;

import br.edu.utfpr.megasena.models.GameModel;

public class Raffle {

	
	public Raffle (int first, int second, int third, int fourth, int fifth, int sixth) {
		
		Sort sort = new Sort();
		GameModel gameModel = new GameModel();
		
		gameModel.setFirst(first);
		gameModel.setSecond(second);
		gameModel.setThird(third);
		gameModel.setFourth(fourth);
		gameModel.setFifth(fifth);
		gameModel.setSixth(sixth);
		
		
		sort.sort(gameModel);
		
		
		System.out.println("numero: "+ gameModel.getRaffle());
		

	
	}
		
		
}


