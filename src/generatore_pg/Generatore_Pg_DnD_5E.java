/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generatore_pg;

/**
 *
 * @author leleg
 */
import java.util.Random;
public class Generatore_Pg_DnD_5E{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Random random=new Random();
         
        String[] Razze=new String[]{"Elfo","Gnomo","Halfling","Mezzorco","Mezzelfo","Nano","Umano"};
        String[] Allineamenti=new String[]{"Legale Buono","Legale Neutrale","Legale Malvagio","Neutrale Buono","Neutrale","Neutrale Malvagio","Caotico Buono","Caotico Neutrale","Caotico malvagio"};
        String[] Classi=new String[]{"Barbaro","Bardo","Chierico","Druido","Guerriero","Ladro","Mago","Monaco","Paladino","Ranger","Stregone"};
        String[] Cammini_Barbaro=new String[]{"Cammino del Berserk","Cammino del Combattente Totemico"};
        String[] Archetipi_Ladreschi=new String[]{"Furfante","Assassino","Mistificatore Arcano"};
        String[] Scuole_Magia=new String[]{"Scuola1"};
        String[] Stirpe_Stregone=new String[]{"Stirpe1"};
        int razza=random.nextInt(Razze.length);
        System.out.println("Razza : "+Razze[razza]);
        int Classe=random.nextInt(Classi.length);
        System.out.println("Classe : "+Classi[Classe]);
        int Allineamento=random.nextInt(Allineamenti.length);
        System.out.println("Allineamento : "+Allineamenti[Allineamento]);
        // Cammino Barbaro
        int Cammino=random.nextInt(Cammini_Barbaro.length);
        //Archetipi Ladro
        int archetipo=random.nextInt(Archetipi_Ladreschi.length);
        //Scuola di Magia
        int scuola=random.nextInt(Scuole_Magia.length);
        //Stirpe Stregone 
        int stirpe=random.nextInt(Stirpe_Stregone.length);
        //Random Cammini Barbaro
        if(Classe==0){
            System.out.println("Cammino Barbaro : "+Cammini_Barbaro[Cammino]);
        }
        //Random Collegi Bardo
        if(Classe==1){
            System.out.println("Collegio Bardico : ");
        }
        //Random Archetipo Ladro
        if(Classe==5){
            System.out.println("Archetipo : "+Archetipi_Ladreschi[archetipo]);
        }
        //Random Scuola di Magia 
        if (Classe==6){
            System.out.println("Scuola di Magia : "+Scuole_Magia[scuola]);
        }
        //Random Stirpe Stregone
        if(Classe==10){
            System.out.print("Stirpe : "+Stirpe_Stregone[stirpe]);
        }
        
        int minimo=10,massimo=20;
        int Forza=random.nextInt(massimo-minimo)+minimo;
        int Carisma= random.nextInt(massimo - minimo) + minimo;
        int Destrezza= random.nextInt(massimo - minimo) + minimo;
        int Saggezza= random.nextInt(massimo - minimo) + minimo;
        int Intelligenza= random.nextInt(massimo - minimo) + minimo;
        int Costituzione= random.nextInt(massimo - minimo) + minimo;
        System.out.println("Forza : "+Forza);
        System.out.println("Destrezza : " + Destrezza);
        System.out.println("Costituzione: " + Costituzione);
        System.out.println("Intelligenza : " + Intelligenza);
        System.out.println("Saggezza : "+Saggezza); 
        System.out.println("Carisma : "+Carisma); 
    }
}

