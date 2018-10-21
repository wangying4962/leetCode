package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args){
        int length = lengthOfLongestSubstring("a;lkdjofalsdnfojwoienfnadfhoawienfalsdkfowiejf");
        System.out.print(length);
    }
    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int ans = 0;
        Set<Character> set = new HashSet<>();
        while (i < s.length() && j < s.length()) {
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans,j-i);
            }else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
