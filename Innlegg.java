package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable
	private int id; 
	private String bruker; 
	private String dato; 
	private int likes; 
	
	public Innlegg() {
		
	}
	
	//Konstruktør med tre parametere
	public Innlegg(int id, String bruker, String dato) {

		this.id = id; 
		this.bruker = bruker; 
		this.dato = dato; 
		likes = 0; 
	}

	//Konstruktør
	public Innlegg(int id, String bruker, String dato, int likes) {

		this(id, bruker, dato); //Her kalles den første konstruktøren
		this.likes = likes; 
	}
	
	public int getId() {
		return id; 
	}
	
	public String getBruker() {
		return bruker; 
	}
	
	public String getDato() {
		return dato; 	
	}
	
	public void setId(int id) {
		this.id = id; 
	}
	
	
	public void setBruker(String bruker) {
		this.bruker = bruker; 
	}

	

	public void setDato(String dato) {
		this.dato = dato; 
	}


	public int getLikes() {
		return likes; 

	}
	
	public void doLike () {
		likes += 1; 
	}
	
	public boolean erLik(Innlegg innlegg) {
		boolean sjekkLik = false; 
		if(innlegg.getId() == id ) {
			sjekkLik =  true; 
		}
		return sjekkLik; 
	}
	
	@Override
	public String toString() {
		
		return id + '\n' + bruker + '\n' + dato + '\n' + likes;  
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
