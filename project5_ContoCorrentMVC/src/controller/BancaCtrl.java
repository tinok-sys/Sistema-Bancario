package controller;

import model.Banca;
import model.ContoCorrente;
import model.Correntista;

public class BancaCtrl {

	private Banca banca;

	public BancaCtrl(Banca banca) {
		this.banca = banca;
	}

	public void creaNuovoConto(String nome, String cognome, String codFisc, double importoIniziale) {
		
		Correntista nuovoCorrentista = banca.getOrCreateCorrentista(nome, cognome, codFisc);
		ContoCorrente nuovoConto = banca.creaConto("A001", importoIniziale, nuovoCorrentista);
		
		System.out.println("Dettagli nuovo conto:\n " + nuovoConto);
	}
	
	
	
}
