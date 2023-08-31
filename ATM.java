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

    public void closeAccount (String userId) {
        if(map.containsKey(userId) && map.get(userId)==0) {
            map.remove(userId);
        }
        else {
            System.out.println("error closing account: please withdraw all money before closing account!");
        }
    }

    
    
}