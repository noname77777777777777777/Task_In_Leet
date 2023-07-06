package Task;

import java.util.ArrayList;

public class AddBinary {
    public String addBinary(String a,String b){
        var carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder result = new StringBuilder();
        while (i>=0 || j >= 0 || carry > 0 ){
            if (i>=0){
                carry += a.charAt(i) - '0';
            }
            if(j>=0){
                carry += b.charAt(j) - '0';
            }
            result.append(carry%2);
            carry =carry/2;
            i--;
            j--;
        }
        return result.reverse().toString();
    }
}
