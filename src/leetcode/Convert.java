package leetcode;

/**
 * 将字符串 "PAYPALISHIRING" 以Z字形排列成给定的行数：
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 *
 * 之后从左往右，逐行读取字符："PAHNAPLSIIGYIR"
 *
 * 实现一个将字符串进行指定行数变换的函数:
 *
 * string convert(string s, int numRows);
 *
 * 示例 1:
 *
 * 输入: s = "PAYPALISHIRING", numRows = 3
 * 输出: "PAHNAPLSIIGYIR"
 *
 * 示例 2:
 *
 * 输入: s = "PAYPALISHIRING", numRows = 4
 * 输出: "PINALSIGYAHRPI"
 * 解释:
 *
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 */
public class Convert {
    public static void main(String[] args){
        convert("A",1);
    }
    public static String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<numRows;i++){
            int flag = i;
            while (flag<s.length()){
                sb.append(s.charAt(flag));
                if(i!=0 && i!=numRows-1 && flag-2*i+2*numRows-2<s.length()){
                    sb.append(s.charAt(flag-2*i+2*numRows-2));
                }
                flag += 2*numRows-2;
            }
        }
        return sb.toString();
    }
}
