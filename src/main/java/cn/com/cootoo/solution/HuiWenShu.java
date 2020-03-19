package cn.com.cootoo.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * 回文数
 * Created by zhaoxiang
 * Date 2020/2/28 9:57 上午
 * Description
 */
public class HuiWenShu {

    ThreadLocal t = new ThreadLocal();


    public static void main(String[] args) {

        int num = 1234584321;

        System.out.println(isPalindrome(num));

    }

    /**
     * 回文数
     *
     * @param num
     * @return
     */
    private static boolean isPalindrome(int num) {

        // 特殊情况：
        // 当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if (num < 0 || (num % 10 == 0 && num != 0)) {
            return false;
        }

        int res = 0;
        while (num > res) {
            res = res * 10 + num % 10;
            num /= 10;
            System.out.println("num=" + num + ",res=" + res);
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return num == res || num == res / 10;

    }

    /**
     * 回文排列
     * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
     * <p>
     * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
     * 回文串不一定是字典当中的单词。
     *
     * @param s
     * @return
     */
    private static boolean huiwenZiMu(String s) {

        if (s == null || s.length() == 0) {
            return false;
        }
        Set set = new HashSet();
        for (Character c : s.toCharArray()) {
            if (!set.add(c)) {
                set.remove(c);
            }
        }
        return set.size() <= 1;

    }
}
