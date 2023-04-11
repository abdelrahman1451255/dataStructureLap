/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloword;

/**
 *
 * @author Lab505
 */
public class MyDataStructure {
    String[] names = new String[100];
    int lastindex=0;

    public MyDataStructure() {
    }
    
    void insert(String n){
        if(lastindex<100){
        
    names[lastindex]=n;
    lastindex++;
        }
    }

    @Override
    public String toString() {
        return "MyDataStructure{" + "names=" + names + ", lastindex=" + lastindex + '}';
    }
    void printAll(){
        for (int i = 0; i < lastindex; i++) {
            System.out.println(names[i]);
        }
    }
    void delete(String x)
    {
        for(int i=0 ; i< lastindex; i++){
        if(names[i].equals(x))
        {
            names[i]=null;
            for (int j = i; j <=lastindex ; j++) {
                names[j]=names[j+1];
            }
//        names[i]=null;
        lastindex--;
        }
        }
      
        
    }
    public void search(String x){
        boolean y=false;
        for (int i = 0; i < lastindex; i++) {
            if(x.equals(names[i])){
                y=true;
            }
        }
        if (y) {
                System.out.println("element is in the data structure");
        }
        else
        {
            
                System.out.println("element isn't in the data structure");
        }
    }
    public boolean isEmpty(){
        if (lastindex==0) {
    return true;
        }
        else
    return false;
    }
    public int size(){
    return lastindex;
    }
}
