package cn.com.cootoo.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaoxiang
 * Date 2020/3/18 11:42 上午
 * Description
 */
public class AMain {


    // [] target=9
    private int[] plus2num(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if (map.containsKey(tmp)) {
                return new int[]{map.get(tmp), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
