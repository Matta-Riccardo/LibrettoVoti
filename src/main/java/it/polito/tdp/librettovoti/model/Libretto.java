package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.librettovoti.db.LibrettoDAO;

public class Libretto {

	private List<Voto> voti;
	
	public Libretto() {
		//this.voti = new ArrayList<Voto>(); //qua definisco l'interfaccia che gestisce la lista, inizialmente non conterrà nessun voto
		
		
	}
	public boolean add(Voto v) {
		LibrettoDAO dao = new LibrettoDAO();
		boolean result = dao.creaVoto(v);
		return result;
	}
	
	public List<Voto> getVoti(){
		LibrettoDAO dao = new LibrettoDAO();
		return dao.readAllVoto();
	}
	/*
	public boolean add(Voto v) {
		//this.voti.add(v); //uso il metodo add della lista per aggiungere in coda un elemento della stessa classe (delego alla List l'operazione che dovrei fare io)
	    if(!isDuplicate(v) && !isConflitto(v)) {
	    	this.voti.add(v);
	    	return true;
	    }else {
	    	return false;
	    }
	}
	
	
	 
	 
	//creo un metodo che restituisce un nuovo libretto filtrando sul voto
	public Libretto filtraPunti(int punti) {
		Libretto result = new Libretto();
		for(Voto v: this.voti) {
			if(v.getPunti()==punti) {
				result.add(v);
				}
		}
		return result;
	}
	
	
	//implemento la documentazione del metodo:
	/**
	 * Restituisce il punteggio ottenuto all'esame di cui
	 * specifico il nome
	 * @param nome Nome dell'esame
	 * @return punteggio numerico, oppure null se l'esame non esiste
	 */
	
	/*
	public Integer puntiEsame(String nome) {
		for(Voto v: this.voti) {
			if(v.getNome().equals(nome)) {
				return v.getPunti();
			}
		}
		//return -1; restituendo interi il -1 potrà poi essere usado erronaamente come un volore lecitp abbassandomi la media
		
		return null; //(ricordando di restituire un Integer e non un int normale)
		//posso usare anche un'eccezione 
		//throw new IllegalArgumentException("Corso non trovato");
	}
	
	public boolean isDuplicate(Voto v) {
		for (Voto v1: this.voti) {
			if(v1.equals(v))
				return true;
		}
		return false;
	}
	
	public boolean isConflitto(Voto v) {
		Integer punti = this.puntiEsame(v.getNome());
		if (punti!= null && punti!=v.getPunti())
			return true;
		else
			return  false;
	}
	
	
	public List<Voto> getVoti(){
		return this.voti;
	}
	
	public Libretto votiMigliorati(){
		Libretto nuovo = new Libretto();
		for(Voto v: voti) {
			int punti =v.getPunti();
			if(punti >= 24) {
				punti +=2;
			}else {
				punti ++;
			}
			
			if(punti > 30) {
				punti = 30;
			}
			
			//v.setPunti(punti);
			//nuovo.add(v);     così non va bene sennò cambierei anche nell'altro libretto il punteggio(cambieri l'oggetto), avrei due liste che puntano allo stesso oggetto
			
			nuovo.add(new Voto(v.getNome(), punti));
		}
		return nuovo;
	}
	
	public void cancellaVotiMinori(int punti) {
		//come cancello i voti dalla lista? (quale remove?)
		for(Voto v: this.voti) {
			if(v.getPunti()<punti) {  //però questo metodo non funziona
				this.voti.remove(v);
			}
		}
	}
	
	*/
	
	public String toString() {
		return this.voti.toString(); //delego alla list il compito di stamparsi
	}
}
