package cn.running4light.javasdk;

import com.baidu.aip.imageclassify.AipImageClassify;

/**
 *  @Description
 *  @Author running4light朱泽雄
 *  @CreateTime 10:40 2020/10/15
 *
 */
public class AipImageClassifyUtil {
    public static final String APP_ID = "18319334";
    public static final String API_KEY = "agCUvsTj8WmOh4xbIc18BlUd";
    public static final String SECRET_KEY = "sT0wlh1PxHH4U4ZofpcumOgPgQ1PMv9H";
    public volatile static AipImageClassify client = null;

    /**
     *  @Description    单例--双检锁/双重校验锁
     *  @Author running4light朱泽雄
     *  @CreateTime 10:39 2020/10/15
     *
     */
    public static AipImageClassify getSingleton() {
        if (client == null) {
            System.out.println("实例化AipImageClassify");
            synchronized (AipImageClassify.class) {
                System.out.println("实例化AipImageClassify");
                if (client == null) {
                    client = new AipImageClassify(APP_ID, API_KEY, SECRET_KEY);
                    // 可选：设置网络连接参数
                    client.setConnectionTimeoutInMillis(2000);// 建立连接的超时时间（单位：毫秒）
                    client.setSocketTimeoutInMillis(60000);// 通过打开的连接传输数据的超时时间（单位：毫秒）

                    // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
                    //		client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
                    //		client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理
                }
            }
        }
        return client;
    }
}
