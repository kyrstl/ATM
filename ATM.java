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

    public Double checkBalance(String userId) {
        if(map.containsKey(userId)) {
            return map.get(userId);
        }
        throw new IllegalArgumentException("account not found");
    }

    public Double depositMoney(String userId, Double amount) {
        if(map.containsKey(userId)) {
            map.replace(userId, map.get(userId), map.get(userId)+amount);
            return map.get(userId);
        }
        else {
            throw new IllegalArgumentException("account not found, you are broke af!!");
        }
        
    }

    public Double withdrawMoney(String userId, Double amount) {
        if(map.containsKey(userId) && map.get(userId)>=amount) {
            map.replace(userId, map.get(userId), map.get(userId)-amount);
            return map.get(userId);
        }
        else {
            throw new IllegalArgumentException("account not found, you are broke af!!");
        }
    }

    
    
}