package view;

import controller.BancaCtrl;
import model.Banca;

public class Main {
	public static void main(String[] args) {
	
		Banca nuovaSede = new Banca("Intesa San Paolo - Torino");
		BancaCtrl bancaCtrl = new BancaCtrl(nuovaSede);
		
		bancaCtrl.creaNuovoConto("Papperino", "Marco", "PPMARC9384ZAGSF", 350);
				
	}
}
