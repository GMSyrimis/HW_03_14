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
        //ArrayList of type String that reads all lines of a file and returns a string array.
        //I wanted to build my rhymebooks and Rhyme Rating Machine with this...
        List <String> savegame = Files.readAllLines(Paths.get("savegame1.txt"), Charset.defaultCharset());
        //Savegame feature, We are writing to the file the values of the inventory
        //Inventory Defaults:
        int points=10000;
        int max=4;
        boolean hasFatCap=false;
        boolean hasBoots=false;
        boolean hasBaggyJeans=false;
        boolean hasHoody=false;

        //Checking the savegame. Loading...
        //Loop through each line in savegame
        for(String line : savegame){
            String[] data = line.split(" ");
                String variable = data[0];
                String value = data[1];

            //We made a string array called data from the each line of save game. each line a row.
            //line is then split at the spaces giving us a 5x2 array
            if(variable.equalsIgnoreCase("max")){
                max=Integer.parseInt(value);
            }
            else if(variable.equalsIgnoreCase("points")){
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
//END OF THE SAVEGAME LOADING LOOP

        if(max==0){
            System.out.println("Store is closed for renovations");
            return;
        }
        //This closes the store if everything is bought.

// I was trying a different approach to exit the loop. I think I'll try a while loop later

        //ITEM STORE
        System.out.println("STORE:");
        System.out.println("");
        for(int i=1;i<=4;i++) {
            System.out.println("What would you like to buy?");
            System.out.println("Credit: $" + points);
            System.out.println("");
            //UPDATING INVENTORY
            if (!hasFatCap) {
                System.out.println("Fat Cap: $100");
            }
            if (!hasBoots) {
                System.out.println("Boots: $200");
            }
            if (!hasBaggyJeans) {
                System.out.println("Baggy Jeans: $300");
            }
            if (!hasHoody) {
                System.out.println("Hoody: $300");
            }
            //USER INPUT IF BRANCH:
            Scanner keyboard=new Scanner(System.in);
            String response = keyboard.nextLine();
            if (response.equalsIgnoreCase("nothing")) {
                break;
            }
            else if (response.equalsIgnoreCase("Fat Cap")) {
                if((points-100)<0){
                    System.out.println("");
                    System.out.println(">I'm sorry your credit card was declined.");
                    System.out.println("");
                }
                else {
                    points = points - 100;
                    hasFatCap = true;
                }
            }
            else if (response.equalsIgnoreCase("Boots")) {
                if((points-200)<0){
                    System.out.println("");
                    System.out.println(">I'm sorry your credit card was declined.");
                    System.out.println("");
                }
                else {
                    points = points - 200;
                    hasBoots = true;
                }
            }
            else if (response.equalsIgnoreCase("Baggy Jeans")) {
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
            }
            else {
                System.out.println("We don't carry that yet.");
                System.out.println("");
                i--;
                continue;
            }

            /*END OF A LONG IF BRANCH THAT WORKS WITH THE USERS CHOICE OF ITEMS*/

            if(i!=4&&(points-100)>=0) {
                System.out.println("");
                System.out.println("Great choice! Would you like anything else?");
                System.out.println("");
            }
            //THANK YOUR CUSTOMERS

        }
        //END OF STORE

        //SAVEGAME:
        PrintWriter writer = new PrintWriter("savegame1.txt", "UTF-8");
        writer.println("points " +points);
        writer.println("hasFatCap "+hasFatCap);
        writer.println("hasBoots "+hasBoots);
        writer.println("hasBaggyJeans "+hasBaggyJeans);
        writer.println("hasHoody "+hasHoody);
        writer.println("max "+max);
        writer.close();


        System.out.println("Thank you for your business. See you next time!");

    }
}

