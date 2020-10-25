package generatore_pg;
import java.util.Random;

public class Background (){
    Random random=new Random();
    String[] Background = new String[] {};
    int b=random.nextInt(Background.length);
        System.out.println("Background : "+Background[b]);
}
