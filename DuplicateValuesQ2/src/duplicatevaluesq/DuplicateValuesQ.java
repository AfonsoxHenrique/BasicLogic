/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicatevaluesq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Pichau
 */
public class DuplicateValuesQ {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        List<Integer> lt = new ArrayList<>(Arrays.asList(1,10,2,2,10,3,3,3,4,5,5));
        System.out.println("Duplicates: " + lt);
        List<Integer> nLt = lt.stream().distinct().collect(Collectors.toList());
        System.out.println("Removed duplicats: " + nLt);
        
        
        List<String> lt2 = new ArrayList<>(Arrays.asList("G", "e", "e", "k", "s"));
        System.out.println("Duplicates: " + lt2);
        List<String> nLt2 = lt2.stream().distinct().collect(Collectors.toList());
        System.out.println("Removed duplicats: " + nLt2);
    }
    
}
