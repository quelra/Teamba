package java_introduction.substrings_comparison;

import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        if (s.length()>1 && s.length()<1000 && k<=s.length()){
            
        //welcometojava
        // for(int i=0, j=0+k; i<s.length(); i++){
        //     List subsArrays;
        //     subs.add(s.substring(i,k)); //if u gonna use Lists
        // }
        
        String[] subsArrays = new String[s.length()];
        
        //two = 2
        
        int last = 0;
        for(int i=0, l=k; l<=s.length(); i++,l++){
            subsArrays[i] = s.substring(i,l);
            last = i;
        }
        
        // System.out.println(subsArrays[0] +" "+ subsArrays[last]);
        // Arrays.sort(subsArrays, String.CASE_INSENSITIVE_ORDER); //need to import
        
        for(int i=0;i<last+1;i++){
            for(int j=i+1;j<last+1;j++){
                if(subsArrays[i].compareTo(subsArrays[j])>0){
                    String temp = subsArrays[i];
                    subsArrays[i] = subsArrays[j];
                    subsArrays[j] = temp;
                }
            }
        }
        // System.out.println(subsArrays);
        smallest = subsArrays[0];
        largest = subsArrays[last];
        }
         
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
