package nyc.c4q.gmsyrimis;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

/**
 * Created by c4q-george on 3/11/15.
 */
public class Stage1_Items {
    public static void main(String[] args) throws IOException {

        List<String> savegame = Files.readAllLines(Paths.get("savegame1.txt"), Charset.defaultCharset());

        boolean hasFatCap=false;
        boolean hasBoots=false;
        boolean hasBaggyJeans=false;
        boolean hasHoody=false;
        int points=10000;
        int max=4;

        for(String line : savegame){
            String[] data = line.split(" ");
            String variable = data[0];
            String value=data[1];
            if(variable.equalsIgnoreCase("points")){
                points=Integer.parseInt(value);
            }
            else if(variable.equalsIgnoreCase("hasFatCap")){
                hasFatCap=value.equals("true");
                if(value.equals("true")){
                    max=max-1;
                }
            }
            else if(variable.equalsIgnoreCase("hasBoots")){
                hasBoots=value.equals("true");
                if(value.equals("true")){
                    max=max-1;
                }
            }
            else if(variable.equalsIgnoreCase("hasBaggyJeans")){
                hasBaggyJeans=value.equals("true");
                if(value.equals("true")){
                    max=max-1;
                }
            }
            else if(variable.equalsIgnoreCase("hasHoody")){
                hasHoody=value.equals("true");
                if(value.equals("true")){
                    max=max-1;
                }
            }
        }


        Scanner keyboard=new Scanner(System.in);
        String response;


        if(max==0){
            System.out.println("Store is closed for renovations.");
            return;
        }

        for(int i=1;i<=4;i++) {
            System.out.println("What would you like to buy?");
            System.out.println("Credit: $" + points);
            System.out.println("");

            if (hasFatCap == false) {
                System.out.println("FatCap: $100");
            }
            if (hasBoots == false) {
                System.out.println("Boots: $200");
            }
            if (hasBaggyJeans == false) {
                System.out.println("BaggyJeans: $300");
            }
            if (hasHoody == false) {
                System.out.println("Hoody: $300");
            }
            response = keyboard.nextLine();


            if (response.equalsIgnoreCase("nothing")) {
                break;
            } else if (response.equalsIgnoreCase("FatCap")) {
                if((points-100)<0){
                    System.out.println("");
                    System.out.println(">I'm sorry your credit card was declined.");
                    System.out.println("");
                }
                else {
                    points = points - 100;
                    hasFatCap = true;

                }
            } else if (response.equalsIgnoreCase("Boots")) {
                if((points-200)<0){
                    System.out.println("");
                    System.out.println(">I'm sorry your credit card was declined.");
                    System.out.println("");
                }
                else {
                    points = points - 200;
                    hasBoots = true;

                }
            } else if (response.equalsIgnoreCase("BaggyJeans")) {
                if((points-300)<0){
                    System.out.println("");
                    System.out.println(">I'm sorry your credit card was declined.");
                    System.out.println("");
                }
                else {
                    points = points - 300;
                    hasBaggyJeans = true;

                }
            } else if (response.equalsIgnoreCase("Hoody")) {
                if((points-300)<0){
                    System.out.println("");
                    System.out.println(">I'm sorry your credit card was declined.");
                    System.out.println("");
                }
                else {
                    points = points - 300;
                    hasHoody = true;

                }
            } else {
                System.out.println("We don't carry that yet.");
                System.out.println("");
                i--;
                continue;
            }
            if(i!=4&&(points-100)>=0) {
                System.out.println("");
                System.out.println("Great choice! Would you like anything else?");
                System.out.println("");
            }
        }
        PrintWriter writer = new PrintWriter("savegame1.txt", "UTF-8");
        writer.println("points " +points);
        writer.println("hasFatCap "+hasFatCap);
        writer.println("hasBoots "+hasBoots);
        writer.println("hasBaggyJeans "+hasBaggyJeans);
        writer.println("hasHoody "+hasHoody);
        writer.close();
        System.out.println("Thank you for your business. See you next time!");

    }
    //we need to save choices to the saved game file
}

