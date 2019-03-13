package it.polito.tdp.alien.model;

import java.util.HashMap;
import java.util.Map;

public class Parola {
	
	private String word;
	private String traduzione;
	
	public Parola(String word, String traduzione) {
		
		this.word = word;
		this.traduzione = traduzione;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getTraduzione() {
		return traduzione;
	}

	public void setTraduzione(String traduzione) {
		this.traduzione = traduzione;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parola other = (Parola) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}
	
	
	
	
	

}
