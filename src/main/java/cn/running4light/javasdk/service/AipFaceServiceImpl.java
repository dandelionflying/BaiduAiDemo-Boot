package cn.running4light.javasdk.service;

import cn.running4light.common.Result;
import cn.running4light.javasdk.AipFaceUtil;
import com.baidu.aip.face.AipFace;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 *  @Description    人脸识别--接口实现
 *  @Author running4light朱泽雄
 *  @CreateTime 16:10 2020/10/15
 *
 */
@Service
public class AipFaceServiceImpl implements AipFaceService {
    @Override
    public Result detect() {
        AipFace aipFace = AipFaceUtil.getInstance();
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("face_field", "age,beauty,expression,face_shape,gender,glasses,landmark,landmark72,landmark150,race,quality,eye_status,emotion,face_type");//
        options.put("max_face_num", "2");// 最多处理人脸的数目
        options.put("face_type", "LIVE");// 人脸的类型:LIVE--生活照,IDCARD--身份证芯片照,WATERMARK--带水印证件照,CERT--证件照片
        options.put("liveness_control", "LOW");// 活体检测控制:NONE: 不进行控制 LOW:较低的活体要求(高通过率 低攻击拒绝率) NORMAL: 一般的活体要求(平衡的攻击拒绝率, 通过率) HIGH: 较高的活体要求(高攻击拒绝率 低通过率) 默认NONE
        //String image = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1602757891412&di=681d80319519a5e10435cdd3bc8e278e&imgtype=0&src=http%3A%2F%2Fimg31.mtime.cn%2Fpi%2F2014%2F06%2F23%2F115248.76859641_1000X1000.jpg";
//        String image = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1602758194172&di=0a22d241341cc986df094ae2756e7e8c&imgtype=0&src=http%3A%2F%2Fpics6.baidu.com%2Ffeed%2F9f2f070828381f309732453ff0770a0e6f06f0fe.jpeg%3Ftoken%3D63571034061c4e64a3496ee5fe5be627%26s%3D7EB805C764C616F58838952903007011";//美娜
        String image = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1602758175229&di=6040829382f6a6054fddaea42f5b972b&imgtype=0&src=http%3A%2F%2Fwww.tiyutv.cc%2Fuploads%2Fallimg%2F191206%2F1-191206013622-50.jpg";//美娜
        String imageType = "URL";
        JSONObject detect = aipFace.detect(image, imageType, options);
        if("0".equals(detect.get("error_code"))){
            Map<String, Object> stringObjectMap = detect.toMap();
            return new Result("2000","查询成功",stringObjectMap);
        }else{
            return new Result("2001","aip错误",null);
        }
    }

    @Override
    public Result search() {
        return null;
    }

    @Override
    public Result multiSearch() {
        return null;
    }
}
