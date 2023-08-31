import java.util.HashMap;
import java.util.LinkedList;
import java.util.*;

import org.w3c.dom.Node;

public class ATM {
    //private String userID;
    //private double deps;
    private HashMap<String,Double> map = new HashMap<String,Double>();

    public ATM () {
        
    }

    public void openAccount (String userId, Double idep) {
        if(!map.containsKey(userId)) {
			map.put(userId, idep);
        }
        else {
            System.out.println("user already exists.");
        }
    }

    
    
}