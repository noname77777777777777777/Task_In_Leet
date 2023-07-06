package Task;

public class longestCommonPrefix {
    public String Solution(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i = 0 ; i < strs[i].length() ; i++){
            while (prefix.indexOf(strs[i])!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
            if(strs[i].isEmpty()){
                return "";
            }
        }
        return prefix;
    }
}