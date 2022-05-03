package com.assignment;
import java.util.HashMap;
import java.util.Collections;
public class main {

  public static void main(String[] args) {
  int sum=0;
  int total=0;
HashMap <String, Integer> item = new HashMap <String, Integer>();
item.put("Bike",100);
item.put("TV",200);
item.put("Album",10);
item.put("Book",5);
item.put("Phone",500);
item.put("Computer",1000);
 int min=Collections.min(item.values());
 int max=Collections.max(item.values());
 
for (String i :item.keySet()) {
int price=item.get(i);
if(price==min)
{
 System.out.println("name: " + i + " Price: " +price);
 }
 if(price==max)
 {
 System.out.println("name: " + i + " Price: " +price);
 }

if(price>=10)
{
total+=price;
 }
 sum+=price;
    }
    System.out.println(total);
    System.out.println(sum);
} 
  }

