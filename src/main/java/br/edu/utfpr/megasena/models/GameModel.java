package br.edu.utfpr.megasena.models;

import java.util.TreeSet;

public class GameModel {
	
	private int[] bet = {};
	private TreeSet<Integer> raffle;
	private String result;
	
	public GameModel(int[] bet, TreeSet <Integer> raffle,  String result) {
		setBet(bet);
		setRaffle(raffle);
		setResult(result);
	}
	
	public int[] getBet() {
		return bet;
	}
	public void setBet(int[] bet) {
		this.bet = bet;
	}

	public TreeSet<Integer> getRaffle() {
		return raffle;
	}

	public void setRaffle(TreeSet<Integer> raffle) {
		this.raffle = raffle;
	}

	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	

}
