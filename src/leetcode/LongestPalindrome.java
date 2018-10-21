package leetcode;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba"也是一个有效答案。
 *
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 */
public class LongestPalindrome {

    public static void main(String[] args){
        String s = longestPalindrome("asdffdsa");
        System.out.print(s);
    }

    public static String longestPalindrome(String s){
        if(s==null || s.length()==0)
            return "";

        int length = s.length();
        int len = 0;
        int start = 0;
        int end = 0;

        for(int flag=0;flag<length;flag++){
            int len1 = getLength(s,flag,flag);
            int len2 = getLength(s,flag,flag+1);
            len = Math.max(len1,len2);
            if(len>end-start){
                start = flag - (len-1)/2;
                end = flag + len/2 + 1;
            }
        }

        return s.substring(start,end);
    }
    private static int getLength(String s,int left,int right){
        while (left>=0 && right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;right++;
        }
        return right - left - 1;
    }
}
