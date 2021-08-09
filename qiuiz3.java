package com.interview;

import java.util.Stack;

public class NestedObject {

public static void main(String[] args) {
//String input = "{“a”:{“b”:{“c”:”d”}}}";
String object = "{“x”:{“y”:{“z”:”a”}}}";
String key="x/y/a";
System.out.println(getValueFromKeys(object,key));

}


public static String getValueFromKeys(String input,String key) {


String []keyArray=key.split("/");


   String extract = input.replaceAll("[^a-zA-Z]+", "");
   //System.out.println(extract);
   
  // extract.charAt(k)
   Stack<Character> match=new  Stack<Character>();
   
   for(int k=extract.length()-1;k>=0;k--) {
    //System.out.println(extract.charAt(k));
    match.push(extract.charAt(k));
   
   }
   for(int k=0;k<keyArray.length;k++) {
    String s=String.valueOf(match.pop());
   
    if(!keyArray[k].equals(s)) {
    return "key not found";
    }
   }
   
   return String.valueOf(match.pop());



}

}
