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
//        System.out.println(huiwen());
//
        String s = "abcdcdabba";
//        System.out.println(s.length());
//        System.out.println(s.substring(0, s.length() - 2));

        maxHuiWen(s);

    }


    private static void miniHuiWen(String s) {
        // abcdcdabba
        int n = s.length();
        String res = new String();
        boolean flag;
        for (int r = 0; r < n; r++) {
            for (int l = 0; l <= r; l++) {
                flag = s.charAt(r) == s.charAt(l) && r - l < 3;
                if (flag && r - l + 1 > res.length()) {
                    res = s.substring(l, r + 1);
                }
            }
        }
        System.out.println(res);

    }


    private static void maxHuiWen(String s) {
        // abcdcdabba
        int n = s.length();
        String res = new String();
        boolean flag[]=new boolean[n];
        for (int r = 0; r < n; r++) {
            for (int l = 0; l <= r; l++) {
                flag[l] = s.charAt(r) == s.charAt(l) &&  (r - l < 3 || flag[l+1]);
                if (flag[l] && r - l + 1 > res.length()) {
                    res = s.substring(l, r + 1);
                }
            }
        }
        System.out.println(res);

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


    public static String huiwen() {
        // abcdcdabba
        // p(i,j) && si=sj, p(i+1,j-1) && si+1=sj-1
        String s = "abcdcdabba";
        if (s.isEmpty()) {
            return s;
        }
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int left = 0;
        int right = 0;
        for (int i = n - 2; i >= 0; i--) {
            dp[i][i] = true;
            for (int j = i + 1; j < n; j++) {
                System.out.println("i=" + i + ":" + s.charAt(i) + ",j=" + j + ":" + s.charAt(j) + "," + dp[i + 1][j - 1]);
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);//小于3是因为aba一定是回文
                if (dp[i][j] && right - left < j - i) {
                    left = i;
                    right = j;
                }
            }
        }
        return s.substring(left, right + 1);
    }


    public static String hw() {
        String s = "abcdcdabba";
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int l = 0, r = 0;

        for (int i = n - 2; i >= 0; i--) {
            dp[i][i] = true;
            for (int j = i + 1; j < n; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);

            }
        }


        return "";
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
