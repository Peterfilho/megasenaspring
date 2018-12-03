package br.edu.utfpr.megasena.models;

public class GameModel {
	
	private int[] bet = {};
	private int[] raffle = {};
	private String result;
	
	public GameModel(int[] bet, int[]raffle,  String result) {
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
	public int[] getRaffle() {
		return raffle;
	}
	public void setRaffle(int[] raffle) {
		this.raffle = raffle;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	

}
