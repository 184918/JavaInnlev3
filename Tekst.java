package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Tekst extends Innlegg {

	// TODO: objektvariable 
	private String tekst; 
	
	public Tekst () {
		
	}
	
	//Konstruktør
	public Tekst(int id, String bruker, String dato, String tekst) {
		super(id,bruker,dato);
		this.tekst = tekst;
	}
	
	//Konstruktør
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super(id,bruker,dato,likes);
		this.tekst = tekst; 
	}
	
	public String getTekst() {
		return tekst; 

	}

	public void setTekst(String tekst) {
		this.tekst = tekst; 
	}

	@Override
	public String toString() {
		return super.getId() + '\n' + super.getBruker() + '\n' + super.getDato() + '\n' + super.getLikes() + tekst + '\n';

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
