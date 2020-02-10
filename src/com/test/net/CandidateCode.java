package com.test.net;

/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {
		//Write code here
	      int noOfTests = 1; 
	      int a[] ={32, 42, 52, 62, 72, 82, 92};
	     
	      List<Integer> results = new ArrayList<Integer>();
			for(int x=0;x<noOfTests;x++){
				//int noOfBoxes = 4 ;//sc.nextInt();
				List<Integer> boxNumbers = new ArrayList<Integer>();
				for(int i=0;i<a.length;i++) {
					boxNumbers.add(a[i]);
				}
				Collections.sort(boxNumbers);
				int sum =0;
				sum = getSum(boxNumbers);
				results.add(sum);	
			}
			for(int i=0;i<results.size();i++){
	         System.out.println(results.get(i));
	      }	
	   }
   private static int getSum(List<Integer> digitList) {
	   int sum =0;
	   
	   
	   for(int i=0;i<digitList.size();i++) {
		   int tempSum = 0;
		   Map<String,List<Integer>> addedCombinations = new HashMap();
		   List<Integer> comboList = new ArrayList<>();
		   tempSum = getBestListSum(digitList.get(i),digitList);
		   if(tempSum>sum) {
			   sum=tempSum ;
		   }
	   }
	   
	   
	   return sum;
   }
   private static int getBestListSum(int digit,List<Integer> digitList){
	   int sum =0;
	   int tempDigit = digit;
	   List<Integer> combo = new ArrayList<>();
	   List<Integer> consider = new ArrayList<>();
	   consider.add(digit);
	   int maxSum = 0;
	   List<Integer> addedDigitsForThis = new ArrayList<Integer>();
	   while(tempDigit>0) {
		   int x = tempDigit%10;
		   if(!addedDigitsForThis.contains(x)) {
			   addedDigitsForThis.add(x);
		   }
		   tempDigit = tempDigit/10;
	   }
	   for(int i =0;i<digitList.size();i++) {
		   tempDigit = digitList.get(i);
		   List<Integer> addedDigitsSub = new ArrayList<Integer>();
		   while(tempDigit>0) {
			   int x = tempDigit%10;
			   if(!addedDigitsSub.contains(x)) {
				   addedDigitsSub.add(x);
			   }
			   tempDigit = tempDigit/10;
		   }
		   boolean addThisToList = true;
		   for(int x=0;x<addedDigitsSub.size();x++) {
			   if(addedDigitsForThis.contains(addedDigitsSub.get(x))) {
				   addThisToList = false ;
				   break;
			   }
		   }
		   if(addThisToList) {
			   combo.add(digitList.get(i));
		   }
	   }
	   List<Integer> tempCombo= new ArrayList<>();
	   
	   sum+=digit;
	if(combo.size()>0) {
		
		   tempCombo.addAll(combo);
		   for(int i=combo.size()-1;i>=0;i--) {
			   boolean addToSum = true;
			   List<Integer> digitsForCombo = new ArrayList<>();
			   tempDigit = combo.get(i);
			   while(tempDigit>0) {
				   int x = tempDigit%10;
				   if(!digitsForCombo.contains(x)) {
					   digitsForCombo.add(x);
				   }
				   tempDigit = tempDigit/10;
			   }
			  for(int x=0;x<digitsForCombo.size();x++) {
				  if(addedDigitsForThis.contains(digitsForCombo.get(x))) {
					  addToSum = false;
					  break;
				  }
			  }
			  if(addToSum) {
				  addedDigitsForThis.addAll(digitsForCombo);
				  sum += combo.get(i); 
				  consider.add(combo.get(i));
			  }
		   }
	   }
	   System.out.println("digit :: "+digit+" , List==="+consider+"sum ===="+sum);
	   return sum;
   }
}
