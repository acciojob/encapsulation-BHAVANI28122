package com.driver;
import java.util.Scanner;
public class Main {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      RWOnly obj = new RWOnly();
      String S = sc.nextLine();
      obj.setName(S);
      String name = obj.getName();
      System.out.println("You have entered: "+name);

  }
}