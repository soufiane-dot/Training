package org.training;

import java.util.ArrayList;
import java.util.List;

public class Bag {

    private String bag;

    public Bag(String bag){

        this.bag=bag;

    }
    public int size(){
       if(bag.contains("#")){
           return (int)bag.chars().filter(c->c=='#').count()+1;

       }
        return 1;
    }
    public int calculate(){
        int sum=0;
        String str[]=bag.split("#");
        for(int i=0;i<str.length;i++){
            String Tab[]=str[i].split(":");
            if(Tab[1].isEmpty()){
                sum+=Integer.valueOf(Tab[2]);
            }else if(Tab[2].isEmpty()){
                sum+=Integer.valueOf(Tab[1]);
            }else {
                sum+= Integer.valueOf(Tab[2]) * Integer.valueOf(Tab[1]);
            }
        }


        return sum;
    }

    public void remove (String remove){

        String str[]=bag.split("#");
        StringBuffer Tab=new StringBuffer();


        for(int i=0;i<str.length;i++){
            if(str[i].contains(remove)){
                continue;
            }
            Tab.append(str[i]);

        }
        bag=Tab.toString();

    }
}
