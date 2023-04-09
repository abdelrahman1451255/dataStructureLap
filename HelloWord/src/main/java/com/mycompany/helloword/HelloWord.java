/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.helloword;
import java.util.*;

/**
 *
 * @author Lab505
 */
public class HelloWord {

    public static void main(String[] args) {
        MyDataStructure a = new MyDataStructure();
        Scanner S = new Scanner(System.in);
            String T = S.next();
            a.insert(T);
              T = S.next();
            a.insert(T);
              T = S.next();
            a.insert(T);
             T = S.next();
            a.insert(T);
        System.out.println("_______________");
//        a.delete("a");
//        a.printAll();
a.search("hello");
        
    }
}
