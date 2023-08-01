package Task;

public class MaximumNumbersOfWordsYouCanType {
    public boolean checkbrokenletter(String Text,String brokenLetters){
        for(int i = 0 ; i < brokenLetters.length() ; i ++){
            if(Text.indexOf(brokenLetters.charAt(i))!=-1){
                return true;
            }
        }
        return false;
    }
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        int count = 0;
        if(brokenLetters.isEmpty()){
            return arr.length + 1;
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(!checkbrokenletter(arr[i],brokenLetters) && arr.length>1){
                count++;
            }
        }
//        for (String word : arr) {
//            if (!checkbrokenletter(word, brokenLetters)) {
//                count++;
//            }
//        }
        if(count == arr.length){
            count = 0;
        }
        return count;
    }
}
