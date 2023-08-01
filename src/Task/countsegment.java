package Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class countsegment {
    public int countSegments(String s){
        if(s.isEmpty())
            return 0;
        ArrayList<String> t = new ArrayList<>();
       char[][] c = new char[s.length()][s.length()];
       int temp = 0;
       for(int i = 0 ; i < s.length() ; i++){
           if(s.charAt(i) == ' '){
               temp++;
               i++;
           }
           c[temp][i] = s.charAt(i);
       }
       int[] ints = new int[s.length()];
       int tempp = 0;
       for(int i = 0 ; i < s.length() ; i++){
           for (int j = 0 ; j < s.length() ; j++){
               if(c[i][j] != '\u0000' ){
                   if(c[i][j]!=' ')
                     ints[tempp] = i;
                     tempp++;
               }
           }
       }
       for(int i = 0 ; i < s.length() ; i++){
            for(int j = 0 ; j < s.length() ; j++){
            }
       }
       return 1;
    }
}
