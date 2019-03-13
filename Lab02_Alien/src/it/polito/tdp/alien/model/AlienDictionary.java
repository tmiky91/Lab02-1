package it.polito.tdp.alien.model;

import java.util.LinkedList;
import java.util.List;

public class AlienDictionary {
	
	private List<Parola> dizionario = new LinkedList<Parola>();
	
	public void addWord(String alienWord, String traduzione) {
		Parola newWord = new Parola(alienWord, traduzione);
		
		for(Parola p: dizionario) {
			if(p.getWord().equals(newWord.getWord())) {
				dizionario.remove(p);
				dizionario.add(newWord);
			}
			
		}
		dizionario.add(newWord);
		
	}
	
	public String translateWord(String alienWord) {
		String risultato=null;
		for(Parola p: dizionario) {
			if(p.getWord().equals(alienWord)) {
				risultato=p.getTraduzione();
				break;
			}
		}
		return risultato;
	}
	
	public void resettaDizionario() {
		dizionario.clear();
	}
	
	public List getDizionario() {
		return dizionario;
	}

}
