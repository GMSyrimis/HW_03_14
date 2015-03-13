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
public class Stage3_Items {
    public static void main(String[] args) throws IOException {

        List<String> savegame = Files.readAllLines(Paths.get("savegame3.txt"), Charset.defaultCharset());

        boolean hasProducer=false;
        boolean hasRecordDeal=false;
        boolean hasMansion=false;
        boolean hasPrivateJet=false;
        int points=300000;
        int max=4;

        for(String line : savegame){
            String[] data = line.split(" ");
            String variable = data[0];
            String value=data[1];
            if(variable.equalsIgnoreCase("points")){
                points=Integer.parseInt(value);
            }
            else if(variable.equalsIgnoreCase("hasProducer")){
                hasProducer=value.equals("true");
                if(value.equals("true")){
                    max=max-1;
                }
            }
            else if(variable.equalsIgnoreCase("hasRecordDeal")){
                hasRecordDeal=value.equals("true");
                if(value.equals("true")){
                    max=max-1;
                }
            }
            else if(variable.equalsIgnoreCase("hasMansion")){
                hasMansion=value.equals("true");
                if(value.equals("true")){
                    max=max-1;
                }
            }
            else if(variable.equalsIgnoreCase("hasPrivateJet")){
                hasPrivateJet=value.equals("true");
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

            if (hasProducer == false) {
                System.out.println("Producer: $3000");
            }
            if (hasRecordDeal == false) {
                System.out.println("RecordDeal: $5000");
            }
            if (hasMansion == false) {
                System.out.println("Mansion: $6000");
            }
            if (hasPrivateJet == false) {
                System.out.println("PrivateJet: $10000");
            }
            response = keyboard.nextLine();


            if (response.equalsIgnoreCase("nothing")) {
                break;
            } else if (response.equalsIgnoreCase("Producer")) {
                if((points-3000)<0){
                    System.out.println("");
                    System.out.println(">I'm sorry your credit card was declined.");
                    System.out.println("");
                }
                else {
                    points = points - 3000;
                    hasProducer = true;

                }
            } else if (response.equalsIgnoreCase("RecordDeal")) {
                if((points-5000)<0){
                    System.out.println("");
                    System.out.println(">I'm sorry your credit card was declined.");
                    System.out.println("");
                }
                else {
                    points = points - 5000;
                    hasRecordDeal = true;

                }
            } else if (response.equalsIgnoreCase("Mansion")) {
                if((points-6000)<0){
                    System.out.println("");
                    System.out.println(">I'm sorry your credit card was declined.");
                    System.out.println("");
                }
                else {
                    points = points - 6000;
                    hasMansion = true;

                }
            } else if (response.equalsIgnoreCase("PrivateJet")) {
                if((points-10000)<0){
                    System.out.println("");
                    System.out.println(">I'm sorry your credit card was declined.");
                    System.out.println("");
                }
                else {
                    points = points - 10000;
                    hasPrivateJet = true;

                }
            } else {
                System.out.println("We don't carry that yet.");
                System.out.println("");
                i--;
                continue;
            }
            if(i!=4&&(points-3000)>=0) {
                System.out.println("");
                System.out.println("Great choice! Would you like anything else?");
                System.out.println("");
            }
        }
        PrintWriter writer = new PrintWriter("savegame3.txt", "UTF-8");
        writer.println("points " +points);
        writer.println("hasProducer "+hasProducer);
        writer.println("hasRecordDeal "+hasRecordDeal);
        writer.println("hasMansion "+hasMansion);
        writer.println("hasPrivateJet "+hasPrivateJet);
        writer.close();
        System.out.println("Thank you for your business. See you next time!");

    }
    //we need to save choices to the saved game file
}

