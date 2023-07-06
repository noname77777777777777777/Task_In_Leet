package Task;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HappyNumber {
    public int result_equare(int disgit){
        ArrayList<Integer> elements = new ArrayList<Integer>();
        int number;
        while (disgit > 0){
            number  = disgit %10;
            disgit = disgit /10;
            elements.add(number);
        }
        double temp = 0;
        for(int i = 0 ; i < elements.size() ; i++){
            temp+=Math.pow(elements.get(i),2);
        }
        return (int)temp;
    }
    public boolean isHappy(int n) {
        while (n != 1&&n>5){
            n = result_equare(n);
        }
        if(n == 1){
            return true;
        }
        return false;
    }
}
