package cn.running4light.javasdk;

import com.baidu.aip.face.AipFace;
import com.baidu.aip.imageclassify.AipImageClassify;

/**
 *
 */
public class AipFaceUtil {
    public static final String APP_ID = "18319334";
    public static final String API_KEY = "agCUvsTj8WmOh4xbIc18BlUd";
    public static final String SECRET_KEY = "sT0wlh1PxHH4U4ZofpcumOgPgQ1PMv9H";
    private volatile static AipFace aipFace = null;

    /**
     *  @Description    AipFace实例
     *  @Author running4light朱泽雄
     *  @CreateTime 14:58 2020/10/15
     *
     */
    public static AipFace getInstance(){
        if (aipFace == null) {
            System.out.println("实例化AipImageClassify");
            synchronized (AipImageClassify.class) {
                System.out.println("实例化AipImageClassify");
                if (aipFace == null) {
                    aipFace = new AipFace(APP_ID, API_KEY, SECRET_KEY);
                    // 可选：设置网络连接参数
                    aipFace.setConnectionTimeoutInMillis(2000);// 建立连接的超时时间（单位：毫秒）
                    aipFace.setSocketTimeoutInMillis(60000);// 通过打开的连接传输数据的超时时间（单位：毫秒）

                    // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
                    //		client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
                    //		client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理
                }
            }
        }
        return aipFace;
    }
}
