/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class DataBaseUtil {
    public static void addCarToBase(){
        //Mitko, implement this method! You know what to do!
    }
    public static void removeCarFromBase(){
        //same shit
    }
    public static Set<Integer> getFreePlaces(){
        //same shit
        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(9);
        set.add(3);
        set.add(1);
        set.add(0);
        set.add(16);
        set.add(56);
        set.add(95);
        set.add(952);
        set.add(965);
        return set;
    }
}
