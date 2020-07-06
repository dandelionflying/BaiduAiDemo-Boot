package cn.running4light.baiduAi.apis;

import java.util.HashMap;
import java.util.Map;

import utils.HttpUtil;


/**@description 
 * @modifyDate 上午10:05:04
 * @modifyedBy zzx
 * TODO
 * @auther zzx
 */
public class Api {
	public static final String GET_TOKEN_URL = "https://aip.baidubce.com/oauth/2.0/token";
	public static final String General_object_scene_recognition= "https://aip.baidubce.com/rest/2.0/image-classify/v2/advanced_general";// 通用物体及场景识别
	public static final String grant_type = "client_credentials";// 获取token默认参数
	public static final String client_id = "agCUvsTj8WmOh4xbIc18BlUd";// 应用的API Key
	public static final String client_secret = "sT0wlh1PxHH4U4ZofpcumOgPgQ1PMv9H ";// 应用的Secret Key
	public static final String access_token = "24.64ccced17d2fe0db961e13d9df5af725.2592000.1596346880.282335-18319334";
	private Map<String, Object> getTokenMap = new HashMap<String,Object>();
	
	public void init() {
		getTokenMap.put("client_id", client_id);
		getTokenMap.put("client_secret", client_secret);
		getTokenMap.put("grant_type", grant_type);
	}
	
	public Api() {
		init();
	}
	
	/**
	 * 
	 * @description:获取token
	 * @createDate:	2020年7月3日 上午10:09:28
	 * @modifyDate：	2020年7月3日
	 * @modifiedBy：	zzx
	 * @return
	 */
	public String getToken(){
//		String post = HttpUtil.post(GET_TOKEN_URL, getTokenMap);
//		System.err.println(post);
		return "";
	}
	
	public void generalObjectSceneRecognition() {
//		HttpUtil.post(GET_TOKEN_URL, getTokenMap);
//		Map<String, String> params = new HashMap<String,String>();
		String params = "access_token=24.64ccced17d2fe0db961e13d9df5af725.2592000.1596346880.282335-18319334";
		try {
			String post = HttpUtil.post(General_object_scene_recognition, access_token, params);
			System.err.println(post);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
