/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largeandshortq;

/**
 *
 * @author Pichau
 */
public class LargeAndShortQ {

    /**
     * @param num1
     * @param num2
     * @return 
     */
    public static int[] difference(int[] num1, int[] num2) {
        int[] diff = new int[2];
        double smallDiff = Double.MAX_VALUE;
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                int diff2 = Math.abs(num1[i] - num2[j]);
                if (diff2 < smallDiff) {
                    smallDiff = diff2;
                    diff[0] = num1[i];
                    diff[1] = num2[j];
                }
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1,3,15,11,2};
        int[] num2 = new int[]{23,127,235,19,8};
        int[] pair = difference(num1, num2);
        System.out.println(pair[0] - pair[1] + ". That is, the pair (" + pair[0]+"," + pair[1]+")" );
    }

}
