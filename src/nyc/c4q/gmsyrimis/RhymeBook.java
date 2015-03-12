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


public class RhymeBook {
    public static void main(String[] args) throws IOException {
        Scanner keyboard=new Scanner(System.in);

        System.out.println("Welcome to your Rhyme Book.");
        System.out.println("");
        System.out.println("This is your bible! In here you will find words that rhyme with one another and will have the duty of adding more words to enrich your arsenal.");
        System.out.println("Which rhyme will you be expanding on in this book?");
        System.out.println("");
        System.out.print("Filename:");
        String filename=keyboard.nextLine();
        System.out.println("");
        System.out.println("");
        System.out.println("Start rhyming with "+filename);
        System.out.println("You can save and close your book by typing EXIT.");



        List<String> rhymes = Files.readAllLines(Paths.get(filename+".txt"), Charset.defaultCharset());
        PrintWriter writer = new PrintWriter(filename+".txt", "UTF-8");
        for(String line : rhymes){
            String[] data = line.split(" ");
            int dataLength=data.length;
            for(int i=0;i<dataLength;i++){
                String word=data[i];
                writer.print(word+" ");
                System.out.println(data[i]);
            }
        }



        while(true){
            String newWord=keyboard.next();
            if(newWord.equals("EXIT")){
                writer.close();
                System.out.println("You closed your Rhyme Book");
                break;
            }
            else{
                writer.print(newWord + " ");
            }
        }
    }
}
