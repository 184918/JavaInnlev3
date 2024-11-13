package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg{

	// TODO: objektvariable 
	private Innlegg[] innleggtabell;
	private int nesteledig; 

	public Blogg() {
		this.innleggtabell = new Innlegg[20];
		this.nesteledig =0;
	
	}

	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg[lengde];
		this.nesteledig = 0; 
	}

	public int getAntall() {
		return nesteledig; 
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell; 

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for(int i = 0; i<nesteledig; i++) {
			if(innleggtabell[i].erLik(innlegg)) {
				return i;
			}
		}
		
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for(int i = 0; i<nesteledig; i++) {
			if(innleggtabell[i].erLik(innlegg)) {
				return true;
			}
		}
		
		return false;
	}

	public boolean ledigPlass() {
		return nesteledig < innleggtabell.length; 

	}
	
	public boolean leggTil(Innlegg innlegg) {
		if(!finnes(innlegg) && ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}
		return false; 
		
	}
	
	public String toString() {
		String s = nesteledig + "\n";
		for(int i = 0; i < nesteledig; i++) {
			s+= innleggtabell[i].toString();
		}
		
		return s;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}