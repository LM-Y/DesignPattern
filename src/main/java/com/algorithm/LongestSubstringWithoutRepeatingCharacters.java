package com.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Descripttion 给定一个字符串，请你找出其中不含有重复字符的 最长子串的长度。
 *
 *  * 来源：力扣（LeetCode）
 *  * 链接：https://leetcode-cn.com/problems/add-two-numbers
 *  * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author Ming
 * @Date 2020/5/29 19:31
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(lengthOfLongestSubstring(str));
        System.out.println(getLength(str));
        str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
        System.out.println(getLength(str));
        str = "bbbbb";
        System.out.println(lengthOfLongestSubstring(str));
        System.out.println(getLength(str));
        str = " ";
        System.out.println(lengthOfLongestSubstring(str));
        System.out.println(getLength(str));
        str = "au";
        System.out.println(lengthOfLongestSubstring(str));
        System.out.println(getLength(str));
        str = "dvdf";
        System.out.println(lengthOfLongestSubstring(str));
        System.out.println(getLength(str));
        str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
        System.out.println(getLength(str));
        System.out.println(lengthOfLongestSubstring1(str));

    }

    /**
     * @Descripttion 方法1
     * @Auth Ming
     * @Date 2020/5/29
     * @param: s
     * @return: int
     */
    public static int lengthOfLongestSubstring(String s) {

        char[] chars = s.toCharArray();
        int startIndex = 0;
        int endIndex = 0;
        Map<Integer, Integer> map = new HashMap<>(chars.length);
        String tmp = "";
        AtomicInteger resultLength = new AtomicInteger();
        for (int i = 0; i < chars.length; i++) {
            tmp += chars[i];
            endIndex = i+1;
            if (tmp.contains(String.valueOf(chars[i+1==chars.length?i:i+1]))){
                startIndex++;
                endIndex = i+1;
                i = startIndex-1;
                map.put(startIndex, endIndex);
//                System.out.println("startIndex:" + startIndex + ",endIndex:" + endIndex + ",i:" + i + ",tmp:" + tmp);
                tmp = "";
            }
        }
//        map.forEach((x,y) -> System.out.println(x + "," + y));
        map.forEach((x,y) -> {
            if(resultLength.get() < y - x +1){
                resultLength.set(y - x + 1);
            }

        });
        return resultLength.get();
    }

    /**
     * @Descripttion 方法2
     * @Auth Ming
     * @Date 2020/5/30
     * @param: str
     * @return: int
     */
    public static int getLength(String str){
        int length = 1;
        int lengthTemp = 1;
        char[] strs = str.toCharArray();
        String temp = String.valueOf(strs[0]);
        for (int i = 0; i < strs.length - 1; i++) {
            if (!temp.contains(String.valueOf(strs[i + 1]))) {
                temp += String.valueOf(strs[i + 1]);
                lengthTemp = temp.length();
            }else if(temp.startsWith(String.valueOf(strs[i + 1]))) {
                temp += String.valueOf(strs[i + 1]);
                temp=temp.substring(1);
                lengthTemp = temp.length();
            }else{
                temp = temp.substring(temp.indexOf(String.valueOf(strs[i + 1]))+1)+String.valueOf(strs[i + 1]);
                lengthTemp = temp.length();
            }
            if(length<lengthTemp){
                length=lengthTemp;
            }
        }
//        System.err.println(str+":"+length);
        return length;
    }

    /**
     * @Descripttion 方法三
     * @Auth Ming
     * @Date 2020/5/30
     * @param: s
     * @return: int
     */
    public static int lengthOfLongestSubstring1(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }

}
