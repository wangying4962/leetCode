package leetcode;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class IsPalindrome {
    public static void main(String[] args){
        isPalindrome(121);
    }
    public static boolean isPalindrome(int x){
        if(x<0 || (x%10==0&&x!=0)){
            return false;
        }
        int revertedNumber = 0;
        while(x>revertedNumber){
            revertedNumber = revertedNumber*10 + x%10;
            x = x/10;
        }
        if(x==revertedNumber || x == revertedNumber/10){
            return true;
        }
        return false;
    }
}
