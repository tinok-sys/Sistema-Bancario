#  Sistema Bancario

##  Descrizione

Questo progetto rappresenta un semplice sistema di gestione bancaria strutturato secondo un'architettura modulare (ispirata al pattern MVC).  
L’obiettivo è modellare le principali entità di una banca e le loro interazioni.

---

##  Struttura del progetto

Il sistema è composto da quattro componenti principali:

### 🔹 Banca
Rappresenta l'entità principale del sistema.  
Gestisce l’insieme dei conti correnti e dei correntisti.

**Responsabilità:**
- Creazione e gestione dei conti
- Associazione tra correntisti e conti
- Supervisione generale delle operazioni bancarie

---

### 🔹 Correntista
Modella il cliente della banca.

**Responsabilità:**
- Contiene i dati anagrafici del cliente
- Può possedere uno o più conti correnti
- Interagisce con il sistema tramite operazioni bancarie

---

### 🔹 Conto Corrente
Rappresenta un conto bancario.

**Responsabilità:**
- Gestione del saldo
- Operazioni di deposito e prelievo
- Collegamento a uno o più correntisti

---

### 🔹 BancaCtrl
È il controller del sistema (logica applicativa).

**Responsabilità:**
- Gestione delle richieste dell’utente
- Coordinamento tra le entità (Banca, Correntista, Conto Corrente)
- Implementazione delle regole di business

---

##  Relazioni tra le componenti

- Un **Correntista** può possedere uno o più **Conti Correnti**
- Un **Conto Corrente** è associato a uno o più **Correntisti**
- La **Banca** gestisce tutti i conti e i clienti
- **BancaCtrl** funge da intermediario tra l’utente e il modello dati

---

##  Funzionalità principali

- Creazione di un correntista
- Apertura di un conto corrente
- Deposito di denaro
- Prelievo di denaro
- Visualizzazione del saldo
- Gestione delle relazioni cliente-conto

---

##  Possibili estensioni

- Supporto per conti con più intestatari
- Sistema di autenticazione utenti
- Persistenza dei dati (database)
- Interfaccia grafica (GUI o Web)
- Gestione delle transazioni e storico operazioni

---

##  Tecnologie 

- Linguaggio: Java 
- Pattern: MVC
- Database: MySQL 
---

