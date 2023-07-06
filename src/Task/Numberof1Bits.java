package Task;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Numberof1Bits {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res += n & 1;
            n = n >>> 1;
        }
        return res;
    }
}
