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
public class Generatore_Pg_Pathfinder{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();

        String[] Razze = new String[] {"Elfo", "Halfling", "Nano", "Umano", "Dragonide", "Gnomo",
                "Mezzelfo", "Mezzorco", "Tiefling"};
        String[] Allineamenti = new String[] {"Legale Buono", "Legale Neutrale", "Legale Malvagio",
                "Neutrale Buono", "Neutrale Neutrale", "Neutrale Malvagio", "Caotico Buono",
                "Caotico Neutrale", "Caotico malvagio"};
        String[] Classi = new String[] {"Barbaro", "Bardo", "Chierico", "Druido", "Guerriero",
                "Ladro", "Mago", "Monaco", "Paladino", "Ranger", "Stregone", "Warlock"};
        int minimo = 10;
        int massimo = 20;
        int Forza = random.nextInt(massimo - minimo) + minimo;
        int Carisma = random.nextInt(massimo - minimo) + minimo;
        int Destrezza = random.nextInt(massimo - minimo) + minimo;
        int Saggezza = random.nextInt(massimo - minimo) + minimo;
        int Intelligenza = random.nextInt(massimo - minimo) + minimo;
        int Costituzione = random.nextInt(massimo - minimo) + minimo;
        int razza = random.nextInt(Razze.length);
        System.out.println("Razza : " + Razze[razza]);
        int Classe = random.nextInt(Classi.length);
        System.out.println("Classe : " + Classi[Classe]);
        int Allineamento = random.nextInt(Allineamenti.length);
        System.out.println("Allineamento : " + Allineamenti[Allineamento]);
        System.out.println("Forza : " + Forza);
        System.out.println("Destrezza : " + Destrezza);
        System.out.println("Costituzione: " + Costituzione);
        System.out.println("Intelligenza : " + Intelligenza);
        System.out.println("Saggezza : " + Saggezza);
        System.out.println("Carisma : " + Carisma);
    }
}
