package cn.running4light.javasdk;

import com.baidu.aip.face.AipFace;
import com.baidu.aip.imageclassify.AipImageClassify;
import com.baidu.aip.ocr.AipOcr;

/**
 *
 */
public class AipOcrUtil {
    public static final String APP_ID = "18319334";
    public static final String API_KEY = "agCUvsTj8WmOh4xbIc18BlUd";
    public static final String SECRET_KEY = "sT0wlh1PxHH4U4ZofpcumOgPgQ1PMv9H";
    private volatile static AipOcr aipOcr = null;

    /**
     *  @Description    AipFace实例
     *  @Author running4light朱泽雄
     *  @CreateTime 14:58 2020/10/15
     *
     */
    public static AipOcr getInstance(){
        if (aipOcr == null) {
            System.out.println("实例化AipOcr");
            synchronized (AipOcr.class) {
                System.out.println("实例化AipOcr");
                if (aipOcr == null) {
                    aipOcr = new AipOcr(APP_ID, API_KEY, SECRET_KEY);
                    // 可选：设置网络连接参数
                    aipOcr.setConnectionTimeoutInMillis(2000);// 建立连接的超时时间（单位：毫秒）
                    aipOcr.setSocketTimeoutInMillis(60000);// 通过打开的连接传输数据的超时时间（单位：毫秒）

                    // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
                    //		client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
                    //		client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理
                }
            }
        }
        return aipOcr;
    }
}
