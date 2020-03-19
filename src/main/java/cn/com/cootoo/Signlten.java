package cn.com.cootoo;

/**
 * Created by zhaoxiang
 * Date 2020/2/27 4:11 下午
 * Description
 */
public class Signlten {

    private static volatile Signlten instance=null;

    public static synchronized Signlten getInstance(){
        if(instance==null){
            instance=new Signlten();
        }
        return instance;
    }
}
