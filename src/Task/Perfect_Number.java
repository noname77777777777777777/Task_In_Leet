package Task;

import java.util.ArrayList;

public class Perfect_Number {

    public boolean checkPerfectNumber(int num) {
        if (num == 0) {
            return false;
        }
        int count = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                count += i;
                if (count > num) {
                    break;
                }
            }
        }
        return count == num;
    }
}
