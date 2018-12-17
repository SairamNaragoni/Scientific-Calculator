/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author exam
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "8+9-9-80";
        //String str="core/pages/viewemployee.jsff";
        String[] s;
        s = str.split("-|\\*|\\/|\\+");
        System.out.println(s[s.length-1]);
    }
    
}
