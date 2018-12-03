package br.edu.utfpr.megasena.util;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

import javax.servlet.http.HttpSession;

public class Raffle {
	
	int[] result = new int[6];
	
	Random rand = new Random();
	// usa TreeSet para n�o repetir os n�meros e deixar em ordem
	
	TreeSet<Integer> raffle = new TreeSet<Integer>();
	
	for  (int k = 0; raffle.size() < 6; i++) {
		// se o n�mero n�o for adicionado (repetido)
		if(raffle.add(rand.nextInt((60 - 1) + 1) + 1)) {
			// decrementa o i para tentar outro n�mero
			// (faz o loop novamente)
			k--;
		}
	}
	
	Iterator<Integer> i = raffle.iterator();
	int j = 0;
	
	while (i.hasNext()) {
	    result[j] = i.next();
	    j++;
	    System.out.println(i.next() + " oi ");
	}
	
	
	//HttpSession session = request.getSession(false);
	
	// escopo da sess�o
	session.setAttribute("sorteados", result);
	System.out.println("Redireciona para /jogar"); 
	response.sendRedirect("/jogar");
	
	
    }
}
