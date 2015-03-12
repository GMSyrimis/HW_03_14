package nyc.c4q.gmsyrimis;

import java.util.ArrayList;

/**
 * Created by c4q-george on 3/11/15.
 */
public class Store {
    public static void main(String[] args){
        ArrayList<String> items = new ArrayList<String>();
        items.add("Hoody:         *300");
        items.add("Baggy Jeans:   *300");
        items.add("Boots:         *300");
        items.add("Fat Cap:       *100");
        System.out.println("What are you looking for today?");
        System.out.println(items.get(0));
    }

}
