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
public class Generatore_Pg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Random random=new Random();
         
         String[] razze=new String[]{"Elfo","Halfling","Nano","Umano","Dragonide","Gnomo","Mezzelfo","Mezzorco","Tiefling"};
         String[] allineamenti=new String[]{"Legale Buono","Legale Neutrale","Legale Malvagio",
             "Neutrale Buono","Neutrale Neutrale","Neutrale Malvagio",
         "Caotico Buono","Caotico Neutrale","Caotico malvagio"};
         String [] Classi=new String[]{"Barbaro","Bardo","Chierico","Druido","Guerriero","Ladro","Mago","Monaco","Paladino","Ranger","Stregone","Warlock"};
        int Forza=random.nextInt(19);
        int Carisma=random.nextInt(19);
        int Destrezza=random.nextInt(19);
        int Saggezza=random.nextInt(19);
        int Intelligenza=random.nextInt(19);
        int Costituzione=random.nextInt(19);
        int razza=random.nextInt(razze.length);
       System.out.println("Razza : "+razze[razza]);
       int classe=random.nextInt(Classi.length);
       System.out.println("classe : "+Classi[classe]);
       int allineamento=random.nextInt(allineamenti.length);
       System.out.println("Allineamento : "+allineamenti[allineamento]);
       System.out.println("Forza : "+Forza); 
       System.out.println("Carisma : "+Carisma); 
       System.out.println("Destrezza : "+Destrezza); 
       System.out.println("Saggezza : "+Saggezza); 
       System.out.println("Intelligenza : "+Intelligenza); 
       System.out.println("Costituzione: "+Costituzione); 
    }
    
}
