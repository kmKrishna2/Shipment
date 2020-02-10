package com.test.net;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Election {public static void main(String args[] ) throws Exception {
	//Write code here
	

    //Write code here
    Scanner sc = new Scanner(System.in);
    int noOfTests = sc.nextInt();
	  
    List<String> resultsList = new ArrayList();
    for(int x=0;x<noOfTests;x++){
       System.out.println("reading phases");
		 String phasesAndStates = sc.nextLine();
       //phasesAndStates = sc.nextLine();
       String s[] = phasesAndStates.split(" ");
System.out.println("phasesAndStates phases "+phasesAndStates);
       String winTheory = sc.nextLine();
       //winTheory = sc.nextLine();
       String s1[] = winTheory.split(" ");
       String resultsStr = sc.nextLine();
       resultsStr = sc.nextLine();
       String s2[] = resultsStr.split(" ");
       int phases =0;
       int states =0;
       if(s!=null){
          phases = Integer.parseInt(s[0]);
          states = Integer.parseInt(s[1]);
       }
       List<Integer> wins = new ArrayList<>();
       List<Integer> results = new ArrayList<>();
       for(int i=0;i<s1.length;i++){
          wins.add(Integer.parseInt(s1[i]));
       }
       for(int i=0;i<s2.length;i++){
          results.add(Integer.parseInt(s2[i]));
       }
       int winsum = 0;
       for(int y=0;y<wins.size();y++){
          winsum+=wins.get(y);
       }
       int resultSum = 0;
       for(int y=0;y<results.size();y++){
          resultSum+=results.get(y);
       }
       if(winsum<resultSum){
          resultsList.add("YES");
       }else{
          resultsList.add("NO");
       }
    }   
    for(String res : resultsList){
       System.out.println(res);
    }
 	
}
}
