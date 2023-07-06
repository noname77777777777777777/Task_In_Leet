package Task;

public class Validpalindrome {
        public String Default_text(String s){
            s = s.toLowerCase();
            s = s.replaceAll("\\ ","");
            s = s.replaceAll("\\,","");
            s = s.replaceAll("\\.","");
            s = s.replaceAll("\\:","");
            s = s.replaceAll("\\@","");
            s = s.replaceAll("\\#","");
            s = s.replaceAll("\\[","");
            s = s.replaceAll("\\]","");
            s = s.replaceAll("\\-","");
            s = s.replaceAll("\\_","");
            s = s.replaceAll("\\{","");
            s = s.replaceAll("\\}","");
            s = s.replaceAll("\\\\","");
            s = s.replaceAll("\\//","");
            s = s.replaceAll("\\'","");
            s = s.replaceAll("\"","");
            s = s.replaceAll("\\?","");
            s = s.replaceAll("\\;","");
            s = s.replaceAll("\\!","");
            s = s.replaceAll("\\(","");
            s = s.replaceAll("\\)","");
            s = s.replaceAll("\\`","");
            return s;
        }
        public boolean isPalindrome(String s) {
            //s = Default_text(s);
            for (int i = 0; i < s.length(); i++) {
                for (int j = s.length() - 1; j >= 0; j--) {
                    if (s.charAt(i) != s.charAt(j)) {
                        return false;
                    }
                    i++;
                }
            }
            return true;
        }
}
