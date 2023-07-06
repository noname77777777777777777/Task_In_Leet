package Task;

import java.math.BigInteger;

public class AddString {
    public String addStrings(String num1, String num2) {
        BigInteger s = new BigInteger(num1);
        BigInteger s1 = new BigInteger(num2);
        BigInteger s3 = s.add(s1);
        return String.valueOf(String.valueOf(s3));
    }
}
