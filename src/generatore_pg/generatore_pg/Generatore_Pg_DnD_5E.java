package generatore_pg;

import java.util.Random;
import java.util.Scanner;
public class Generatore_Pg_DnD_5E{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        //Creazione Array Razze,Allineamenti,Classi
    String[] Razze=new String[]{"Elfo","Halfling"/*,"Nano","Umano","Dragonide","Gnomo","Mezzelfo","Mezzorco","Tiefling"*/};
        String[] Allineamenti=new String[]{"Legale Buono","Legale Neutrale","Legale Malvagio","Neutrale Buono","Neutrale","Neutrale Malvagio","Caotico Buono","Caotico Neutrale","Caotico malvagio"};
        String[] Classi=new String[]{"Barbaro","Bardo","Chierico","Druido","Guerriero","Ladro","Mago","Monaco","Paladino","Ranger","Stregone","Warlock"};
        //Creazione Array Archetipi ecc.
        String[] Cammini_Barbaro=new String[]{"Cammino del Berserk","Cammino del Combattente Totemico"};
        String[] Collegi_Bardico=new String[]{"Collegio della Sapienza","Collegio del valore"};
        String[] Domini_Chierico=new String[]{"Dominio della Conoscenza","Dominio della Guerra","Dominio dell'Inganno","Dominio della Luce ","Dominio della Natura","Dominio della Tempesta","Dominio della Vita"};
        String[] Circoli_Chierico = new String[] {"Circolo della Terra","Circolo della Luna"};
        String[] Archetipi_Marziali= new String[] {"Campione","Maestro di Battaglia","Cavaliere Mistico"};
        String[] Archetipi_Ladreschi=new String[]{"Furfante","Assassino","Mistificatore Arcano"};
        String[] Scuole_Magia=new String[]{"Scuola di Abiiurazione","Scuola di Ammaliamento","Scuola di Divinazione","Scuola di Evocazione","Scuola di Invocazione","Scuola di Necromanzia","Scuola di Trasmutazione"};
        String[] Vie_Monaco= new String[] {"Via della Mano Aperta","Via dei quattro Elementi"};
        String[] Giuramenti_Paladino=new String[]{"Giuramento di Devozione","Giuramento degli antichi","Giuramento di Vendetta"};
        String[] Archetipi_Ranger=new String[]{"Cacciatore","Signore delle Bestie"};
        String[] Stirpe_Stregone=new String[]{"Discendenza Draconica","Magia Selvaggia"};
        String[] Patti_Warlock = new String[] {"Il Signore Fatato","L'Immondo","Il Grande Antico"};
        //Creazione Array Sottorazze 
        String[] SottoRazze_Elfo = new String[] {"Alto", "Dei Boschi", "Oscuro(Drow)"};
        String[] Sottorazze_Halfling=new String[] {"Piedelesto","Tozzo"};
        String[] Sottorazze_Nano=new String[]{"Sgrodolo","Sgredolo"};

        //Random Razza,Classe,Allineamento
        int razza=random.nextInt(Razze.length);
        System.out.println("Razza : "+Razze[razza]);

        int sottorazza_elfo = random.nextInt(SottoRazze_Elfo.length);
        int sottorazza_halfling = random.nextInt(Sottorazze_Halfling.length);
        int sottorazze_nano=random.nextInt(Sottorazze_Nano.length);
        
        switch(razza){
            case 0:
                System.out.println("Sottorazza : " + SottoRazze_Elfo[sottorazza_elfo]);
                break;
            case 1:
                System.out.println("Sottorazza : " + Sottorazze_Halfling[sottorazza_halfling]);
                break;
            case 2:
                System.out.println("Sottorazza : "+ Sottorazze_Nano[sottorazze_nano]);

        }
        
        int Classe=random.nextInt(Classi.length);
        System.out.println("Classe : "+Classi[Classe]);
        int Allineamento=random.nextInt(Allineamenti.length);
        System.out.println("Allineamento : "+Allineamenti[Allineamento]);

        // Cammino Barbaro
        int Cammino=random.nextInt(Cammini_Barbaro.length);
        //Collegio Bardico
        int collegio=random.nextInt(Collegi_Bardico.length);
        //Dominio Chierico 
        int dominio=random.nextInt(Domini_Chierico.length);
        //Circoli Druido
        int circolo = random.nextInt(Circoli_Chierico.length);
        //Archetipi Marziali(Guerriero)
        int archetipo_marziale = random.nextInt(Archetipi_Marziali.length);
        //Archetipi Ladro
        int archetipo=random.nextInt(Archetipi_Ladreschi.length);
        //Scuola di Magia
        int scuola=random.nextInt(Scuole_Magia.length);
        //Vie Monastiche
        int via = random.nextInt(Vie_Monaco.length);
        //Giuramenti Paladino
        int giuramento=random.nextInt(Giuramenti_Paladino.length);
        //Archetipo Ranger
        int archetipo_ranger = random.nextInt(Archetipi_Ranger.length);
        //Stirpe Stregone 
        int stirpe=random.nextInt(Stirpe_Stregone.length);
        //Patto Warlock
        int patto = random.nextInt(Patti_Warlock.length);

        System.out.println("Inserire il lvl della classe");
        int lvl=input.nextInt();

        if(lvl>=3&&lvl<=20){
            switch (Classe) {
                case 0:
                    System.out.println("Cammino Barbaro : " + Cammini_Barbaro[Cammino]);
                    break;
                case 1:
                    System.out.println("Collegio Bardico : " + Collegi_Bardico[collegio]);
                    break;
                case 2:
                    System.out.println("Dominio Chierico : " + Domini_Chierico[dominio]);
                    break;
                case 3:
                    System.out.println("Circolo Chierico : " + Circoli_Chierico[circolo]);
                    break;
                case 4:
                    System.out.println("Archetipo Marziale : " + Archetipi_Marziali[archetipo_marziale]);
                    break;
                case 5:
                    System.out.println("Archetipo Ladresco : " + Archetipi_Ladreschi[archetipo]);
                    break;
                case 6:
                    System.out.println("Scuola di Magia : " + Scuole_Magia[scuola]);
                    break;
                case 7:
                    System.out.println("Via Monastica : " + Vie_Monaco[via]);
                    break;
                case 8:
                    System.out.println("Giuramento Paladino : " + Giuramenti_Paladino[giuramento]);
                    break;
                case 9:
                    System.out.println(" Archetipo Ranger : " + Archetipi_Ranger[archetipo_ranger]);
                    break;
                case 10:
                    System.out.println("Origine Stregonesca : " + Stirpe_Stregone[stirpe]);
                    break;
                case 11:
                    System.out.println("Vincolo Warlock : " + Patti_Warlock[patto]);
                    break;
                default:
                    System.out.println("Classe non trovata");
            }
            
        }else
        {
            System.out.println("Livello troppo basso o tropppo alto per avere una sottoclasse");
        }
    }
}

