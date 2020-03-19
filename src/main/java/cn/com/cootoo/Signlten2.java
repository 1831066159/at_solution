package cn.com.cootoo;

/**
 * Created by zhaoxiang
 * Date 2020/2/28 8:58 上午
 * Description
 */
public class Signlten2 {

    private static volatile Signlten2 signlten2 = null;

    public Signlten2() {
    }

    public static Signlten2 getInstance() {
        if (signlten2 == null) {
            synchronized (Signlten2.class) {
                if (signlten2 == null) {
                    signlten2 = new Signlten2();
                }
            }
        }
        return signlten2;
    }

}
