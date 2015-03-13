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

//I would have liked to use the file read and write capabilites better.

public class RhymeBook {
    public static void main(String[] args) throws IOException {
        Scanner keyboard=new Scanner(System.in);

        System.out.println("Welcome to your Rhyme Book.");
        System.out.println("");
        System.out.println("This is your bible! In here you will find words that rhyme with one another and will have the duty of adding more words to enrich your arsenal.");
        System.out.println("Which rhyme will you be expanding on in this book?");
        System.out.println("");
        System.out.print("Rhyme:");
        String rhyme=keyboard.nextLine();
        System.out.println("");
        System.out.println("");
        System.out.println("Start rhyming with "+rhyme);
        System.out.println("You can save and close your book by typing EXIT.");

        List<String> rhymeBook = Files.readAllLines(Paths.get("RhymeBook.txt"), Charset.defaultCharset());

        PrintWriter writer = new PrintWriter("RhymeBook.txt", "UTF-8");
// THIS IS FOR A SINGLE LINE WITH RHYMES. I WANT TO MAKE IT CHANGE LINES FOR DIFFERENT RHYMES
        //SOMEHOW WE NEED TO CHECK IF RHYME ALREADY EXISTS IN RHYMEBOOK AND START PRINTING ON THAT LINE.
        for(String line : rhymeBook){
            String[] data = line.split(" ");

            int dataLength=data.length;

            for(int i=0; i < dataLength ; i++ ){
                String word = data[i];
                writer.print(word + " ");
                System.out.println(data[i]);
            }
        }
//WE JUST LOADED THE RHYMES ALREADY WRITTEN

//WE NOW CAN START WRITING RHYMES:
        writer.println( rhyme + " ");
        while(true){
            String newWord=keyboard.next();
            if(newWord.equals("EXIT")){
                writer.close();
                System.out.println("You closed your Rhyme Book");
                break;
            }
            else{
                writer.print( newWord + " ");
            }
        }
    }
}
