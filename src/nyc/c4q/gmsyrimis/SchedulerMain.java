package nyc.c4q.gmsyrimis;

import java.util.Timer;

/**
 *
 * @author Dhinakaran P.
 */

//Main class
public class SchedulerMain {
    public static void main(String args[]) throws InterruptedException {

        Timer time = new Timer(); // Instantiate Timer Object
        ScheduledTask st = new ScheduledTask(); // Instantiate SheduledTask class
        time.schedule(st, 0, 400); // Create Repetitively task for every 1 secs

        //for demo only.
        for (int i = 0; i <= 25; i++) {
            System.out.println("|                         ||                                    |");
            System.out.println("|                         ||                                    |");
            System.out.println("|                         ||                                    |");
            System.out.println("|                         ||                                    |");
            System.out.println("|                         ||                                    |");
            System.out.println("|                         ||                                    |");
            System.out.println("|                         ||                                    |");
            System.out.println("|                         ||                                    |");
            System.out.println("|                         ||                                    |");
            System.out.println("|                         ||                                    |");
            System.out.println("|                         ||                                    |");
            System.out.println("|                         ||                                    |");
            System.out.println("|                         ||                                    |");
            System.out.println("|                         ||                                    |");
            System.out.println("|                         ||                                    |");
            Thread.sleep(800);
            if (i == 5) {
                System.out.println("Application Terminates");
                System.exit(0);
            }
        }
    }
}