package cn.com.cootoo.string;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhaoxiang
 * Date 2020/3/18 11:52 上午
 * Description
 */
public class SMain {


    public static void main(String[] args) {

//        maxSubStrLength("abcabcda");
//        maxSubStrLength("abcabcbb");
//
//        lengthOfLongestSubstring("abcabcda");
//        lengthOfLongestSubstring("abcabcbb");


//        checkdd("abcabcbb");

    }

    // 最长子串长度 abcabcda
    private static void maxSubStrLength(String str) {
        int l = 0, r = 0, res = 0;
        int n = str.length();
        Set set = new HashSet();

        while (r < n && l < n) {
            if (!set.contains(str.charAt(r))) {
                set.add(str.charAt(r++));
                res = Math.max(res, r - l);
            } else {
                set.remove(str.charAt(l++));
            }
        }
        System.out.println(res);

    }



    public void huiwen() {
        // abcdcdabba

    }


    public static void checkdd(String str) {
        int l = 0, r = 0, res = 0, n = str.length();
        Set set = new HashSet();

        while (l < n && r < n) {
            if (!set.contains(str.charAt(r))) {
                set.add(str.charAt(r++));
                res = Math.max(res, r - l);
            } else {
                set.remove(str.charAt(l++));
            }
        }
        System.out.println(res);
    }


    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        System.out.println(String.valueOf(set));
        System.out.println(ans);
        return ans;
    }


}
