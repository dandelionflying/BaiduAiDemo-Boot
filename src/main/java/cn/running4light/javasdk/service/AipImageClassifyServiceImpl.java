package cn.running4light.javasdk.service;

import cn.running4light.common.Result;
import cn.running4light.javasdk.AipImageClassifyUtil;
import com.baidu.aip.imageclassify.AipImageClassify;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 *  @Description    图像识别--接口实现
 *  @Author running4light朱泽雄
 *  @CreateTime 10:51 2020/10/15
 *
 */
@Service
public class AipImageClassifyServiceImpl implements AipImageClassifyService {
    @Override
    public Result advancedGeneral() {
        AipImageClassify client = AipImageClassifyUtil.getSingleton();
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("baike_num", "10");
        String image = "D:\\zzx\\pictures\\549eb0de14cec408696abf7c93cadb68.jpg";
        JSONObject res = client.advancedGeneral(image, options);
        Map<String, Object> stringObjectMap = res.toMap();// JSONObject没有序列化 无法正常解析
        System.err.println(res);
        return new Result("200","查询成功！",stringObjectMap);
    }

    @Override
    public Result dishDetect() {
        AipImageClassify client = AipImageClassifyUtil.getSingleton();
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("top_num", "3");// 返回预测得分top结果数，默认为5
        options.put("filter_threshold", "0.7");// 默认0.95，可以通过该参数调节识别效果，降低非菜识别率
        options.put("baike_num", "6");// 返回百科信息的结果数，默认不返回
        String image = "D:\\zzx\\pictures\\architecture-buildings-business-city-325185.jpg";
        JSONObject res = client.dishDetect(image, options);
        Map<String, Object> stringObjectMap = res.toMap();// JSONObject没有序列化 无法正常解析
        System.err.println(res);
        return new Result("200","查询成功！",stringObjectMap);
    }

    @Override
    public Result carDetect() {
        AipImageClassify client = AipImageClassifyUtil.getSingleton();
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("top_num", "3");// 返回预测得分top结果数，默认为5
        options.put("baike_num", "6");// 返回百科信息的结果数，默认不返回
        String image = "D:\\zzx\\pictures\\architecture-buildings-business-city-325185.jpg";
        JSONObject res = client.carDetect(image, options);
        Map<String, Object> stringObjectMap = res.toMap();// JSONObject没有序列化 无法正常解析
        System.err.println(res);
        return new Result("200","查询成功！",stringObjectMap);
    }

    @Override
    public Result vehicleDetect() {
        AipImageClassify client = AipImageClassifyUtil.getSingleton();
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("show", "false");// 是否返回结果图（含统计值和跟踪框）。选true时返回渲染后的图片(base64)，其它无效值或为空则默认false。
        // 只统计该区域内的车辆数，缺省时为全图统计。
        //逗号分隔，如‘x1,y1,x2,y2,x3,y3...xn,yn'，按顺序依次给出每个顶点的x、y坐标（默认尾点和首点相连），形成闭合多边形区域。
        //服务会做范围（顶点左边需在图像范围内）及个数校验（数组长度必须为偶数，且大于3个顶点）。
        // 只支持单个多边形区域，建议设置矩形框，即4个顶点。坐标取值不能超过图像宽度和高度，比如1280的宽度，坐标值最大到1279。
        options.put("area", "‘x1,y1,x2,y2,x3,y3...xn,yn'");
        String image = "D:\\zzx\\pictures\\architecture-buildings-business-city-325185.jpg";
        JSONObject res = client.vehicleDetect(image, options);
        Map<String, Object> stringObjectMap = res.toMap();// JSONObject没有序列化 无法正常解析
        System.err.println(res);
        return new Result("200","查询成功！",stringObjectMap);
    }

    @Override
    public Result vehicleDamage() {
        AipImageClassify client = AipImageClassifyUtil.getSingleton();
        HashMap<String, String> options = new HashMap<String, String>();
        String image = "D:\\zzx\\pictures\\architecture-buildings-business-city-325185.jpg";
        JSONObject res = client.vehicleDamage(image, options);
        Map<String, Object> stringObjectMap = res.toMap();// JSONObject没有序列化 无法正常解析
        System.err.println(res);
        return new Result("200","查询成功！",stringObjectMap);
    }

    @Override
    public Result logoSearch() {
        AipImageClassify client = AipImageClassifyUtil.getSingleton();
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("custom_lib", "false");// 是否只使用自定义logo库的结果，默认false：返回自定义库+默认库的识别结果
        String image = "D:\\zzx\\pictures\\architecture-buildings-business-city-325185.jpg";
        JSONObject res = client.logoSearch(image, options);
        Map<String, Object> stringObjectMap = res.toMap();// JSONObject没有序列化 无法正常解析
        System.err.println(res);
        return new Result("200","查询成功！",stringObjectMap);
    }

    @Override
    public Result animalDetect() {
        AipImageClassify client = AipImageClassifyUtil.getSingleton();
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("baike_num", "5");// 返回百科信息的结果数，默认不返回
        String image = "D:\\zzx\\pictures\\architecture-buildings-business-city-325185.jpg";
        JSONObject res = client.animalDetect(image, options);
        Map<String, Object> stringObjectMap = res.toMap();// JSONObject没有序列化 无法正常解析
        System.err.println(res);
        return new Result("200","查询成功！",stringObjectMap);
    }

    @Override
    public Result plantDetect() {
        AipImageClassify client = AipImageClassifyUtil.getSingleton();
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("top_num", "3");// 返回预测得分top结果数，默认为6
        options.put("baike_num", "5");// 返回百科信息的结果数，默认不返回
        String image = "D:\\zzx\\pictures\\architecture-buildings-business-city-325185.jpg";
        JSONObject res = client.plantDetect(image, options);
        Map<String, Object> stringObjectMap = res.toMap();// JSONObject没有序列化 无法正常解析
        System.err.println(res);
        return new Result("200","查询成功！",stringObjectMap);
    }
}
