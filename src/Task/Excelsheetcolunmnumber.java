package Task;

import java.util.ArrayList;

public class Excelsheetcolunmnumber {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for(int i = 0 ; i < columnTitle.length() ; i++){
            char elements = columnTitle.charAt(i);
            int temp = elements - 'A' + 1;
            result += temp+ Math.pow(26,i);
            }
        return result;
    }
}
