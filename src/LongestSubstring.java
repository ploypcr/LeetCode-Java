import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;

        if (s.length() == 0){
            return 0;
        }
        if (s.length() == 1){
            return 1;
        }

        String ss = "" + s.charAt(0);
        for(int i = 1;i < s.length();i++){
            if (ss.indexOf(s.charAt(i)) != -1){
                //System.out.println(ss);
                if (ss.length() > max){
                    max = ss.length();
                    //System.out.println(max);
                }
                ss = ss.substring(ss.indexOf(s.charAt(i))+1);
            }
            ss += s.charAt(i);
        }
        if (ss.length() > max){
            return ss.length();
        }
        return max;
    }
}
