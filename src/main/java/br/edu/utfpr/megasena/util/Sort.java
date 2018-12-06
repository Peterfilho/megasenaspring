package br.edu.utfpr.megasena.util;

import java.util.Random;
import java.util.TreeSet;

import br.edu.utfpr.megasena.models.GameModel;


// gerando 6 numeros de 60 aleatoriamente

public class Sort {

	private static final int MAX_LIMIT_NUMBER = 60;
	private static final int REPLACE_TO_60 = 0;
	private static final int TOTALNUMBERS = 60;
	private static final int MAXNUMBERS = 6;

	public GameModel sort (GameModel gameModel) {

		Random rand = new Random();

		TreeSet<Integer> resultSet = new TreeSet<Integer>();

		while(resultSet.size() < MAXNUMBERS) {
			int number = rand.nextInt(TOTALNUMBERS);
			if (number == REPLACE_TO_60) {
				number = MAX_LIMIT_NUMBER;
			}
				resultSet.add(number);
		}
		gameModel.setRaffle(resultSet);
		
		return gameModel;
	}
	
//
//	gameBean.setBet(apostaOrdenada);
//
//	request.setAttribute("gameBean", gameBean);			
//
//	request.getRequestDispatcher("/WEB-INF/view/result.jsp").forward(request, response);
//

}

