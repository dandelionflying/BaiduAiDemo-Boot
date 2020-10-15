package cn.running4light.javasdk;

import com.baidu.aip.imageclassify.AipImageClassify;
import org.json.JSONObject;

import java.util.HashMap;

/**
 *
 */
public class Sample {

	public static void main(String[] args) {
		AipImageClassify client = AipImageClassifyUtil.getSingleton();
		// 调用接口
		String path = "D:\\zzx\\pictures\\computer-keyboard-34153.jpg";
		JSONObject res = client.objectDetect(path, new HashMap<String, String>());
		System.out.println(res.toString(2));
	}
}
