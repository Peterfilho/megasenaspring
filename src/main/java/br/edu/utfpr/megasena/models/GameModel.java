package br.edu.utfpr.megasena.models;

import java.util.TreeSet;

public class GameModel {
	
	private int[] bet = {};
	private int first;
	private int second;
	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getThird() {
		return third;
	}

	public void setThird(int third) {
		this.third = third;
	}

	public int getFourth() {
		return fourth;
	}

	public void setFourth(int fourth) {
		this.fourth = fourth;
	}

	public int getFifth() {
		return fifth;
	}

	public void setFifth(int fifth) {
		this.fifth = fifth;
	}

	public int getSixth() {
		return sixth;
	}

	public void setSixth(int sixth) {
		this.sixth = sixth;
	}
	private int third;
	private int fourth;
	private int fifth;
	private int sixth;
	private TreeSet<Integer> raffle;
	private String result;
	
	public GameModel(int[] bet, TreeSet <Integer> raffle,  String result) {
		setBet(bet);
		setRaffle(raffle);
		setResult(result);
	}
	
	public GameModel () {
		
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
