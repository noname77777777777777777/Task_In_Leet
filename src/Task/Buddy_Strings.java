package Task;

public class Buddy_Strings {
    public String Swapstring(String s, int i , int j){
        char[] a = s.toCharArray();
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return new String(a);
    }
    public boolean buddyStrings(String s, String goal) {
////        for(int i = s.length() - 1; i >= 0 ; i--){
////            news += s.charAt(i);
////        }
//        for(int i = 0; i < s.length() ; i++){
//            for(int j = i+1 ; j < s.length()  ;j++){
//                String news = Swapstring(s,i,j);
//                if(news.equals(goal)){
//                    return true;
//                }
//            }
//        }
//        return false;
        if (s.length() > goal.length() || s.length() < goal.length()) {
            return false;
        }
        if (s.equals(goal)) {

        }
        return false;
    }
}
