package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti cuvantul: ");
        String str = input.nextLine();
        String toBeGuessed = str.replaceAll("[a-z]","-");
        StringBuilder sb = new StringBuilder(toBeGuessed);
        int count =0;
        do{
            System.out.println(sb);
            System.out.println("Introduceti o litera ");
            char c = input.nextLine().charAt(0);
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==c){
                    sb.setCharAt(i,c);
                }
            }
                count++;
        }while(sb.toString().contains("-"));
        System.out.println("Cuvantul este "+str
                +" l-ati ghicit din " +count+" incercari");
    }
}
