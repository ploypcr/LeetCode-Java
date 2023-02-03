public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        if(s.length() == 0){
            return "";
        }
        String maxs = "" + s.charAt(0);
        int max = 0;

        for(int i = 0;i < s.length();i++){
            for(int j = i+1;j < s.length();j++){
                String ss = s.substring(i,j+1);
                if(isPalindrome(ss) && ss.length() > max){
                    maxs = ss;
                    max = ss.length();
                }
            }
        }
        return maxs;
    }

    public static boolean isPalindrome(String s){
        if (s.length() == 1 || s.length() == 0){
            return false;
        }
        if(s.length() % 2 == 1){
            int leftIndex = (s.length()-1)/2;
            String left = s.substring(0,leftIndex);
            String right = s.substring(leftIndex+1);
            for(int i = 0,j = right.length()-1;i < left.length();i++,j--){
                if(left.charAt(i) != right.charAt(j)){
                    return false;
                }
            }
            return true;
        }
        else{
            String left = s.substring(0,s.length()/2);
            String right = s.substring(s.length()/2);
            for(int i = 0,j = right.length()-1;i < left.length();i++,j--){
                if(left.charAt(i) != right.charAt(j)){
                    return false;
                }
            }
            return true;
        }
    }
}
