package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	private String url; 
	
	//Konstruktør
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super(id,bruker,dato,tekst);
		this.url = url;
	}

	//Konstruktør
	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id,bruker,dato,likes,tekst);
		this.url = url;
	}
	
	public String getUrl() {
		return url; 

	}

	public void setUrl(String url) {
		this.url = url; 
	}

	@Override
	public String toString() {
		return super.getId() + '\n' + super.getBruker() + '\n' + super.getDato() + '\n' + super.getLikes() + '\n' + super.getTekst() + '\n' + url + '\n';

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}