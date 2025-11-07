# Istruzioni per Agenti AI - Generatore_Pg

Questo documento fornisce le linee guida essenziali per lavorare con il progetto Generatore_Pg, un generatore di personaggi per D&D 5e.

## Panoramica del Progetto

Il progetto è un'applicazione Java che genera casualmente personaggi per D&D 5e, includendo:
- Razza e sottorazza
- Classe e sottoclasse/archetipo
- Allineamento
- Livello del personaggio

### Struttura del Progetto

```
src/
  generatore_pg/
    generatore_pg/
      Generatore_Pg_DnD_5E.java  // File principale dell'applicazione
```

## Convenzioni e Pattern

1. **Struttura Dati**
   - I dati di gioco sono memorizzati in array di stringhe statici
   - Le opzioni disponibili sono limitate al Player's Handbook (PHB)
   - I nomi degli array seguono il pattern: `Tipo_Sottotipo` (es. `Sottorazze_Elfo`)

2. **Logica di Generazione**
   - Utilizzo di `Random` per la selezione casuale
   - Switch statements per la gestione delle sottoclassi basate sul livello

## Workflow di Sviluppo

### Build
Il progetto utilizza Apache Ant per il build system. Per compilare:
- Usa il task "build" configurato in `build.xml`
- Il file JAR viene generato nella directory `build/`

### Note Importanti
1. Le sottoclassi sono disponibili solo per personaggi di livello 3 o superiore
2. La validazione del livello avviene prima della generazione della sottoclasse

## Estensioni del Progetto

Quando si aggiungono nuove funzionalità:
1. Mantenere la compatibilità con le regole del PHB
2. Seguire il pattern esistente per l'aggiunta di nuove opzioni
3. Aggiungere le nuove opzioni negli array appropriati

## File Chiave
- `Generatore_Pg_DnD_5E.java`: Contiene tutta la logica di generazione e i dati
- `build.xml`: Configurazione del build system