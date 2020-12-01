package cn.running4light.javasdk.service;

import cn.running4light.common.Result;
import cn.running4light.javasdk.AipFaceUtil;
import com.baidu.aip.face.AipFace;
import com.baidu.aip.face.MatchRequest;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        HashMap<String, String> options = new HashMap<>();
        options.put("face_field", "age,beauty,expression,face_shape,gender,glasses,landmark,landmark72,landmark150,race,quality,eye_status,emotion,face_type");//
        options.put("max_face_num", "2");// 最多处理人脸的数目
        options.put("face_type", "LIVE");// 人脸的类型:LIVE--生活照,IDCARD--身份证芯片照,WATERMARK--带水印证件照,CERT--证件照片
        options.put("liveness_control", "LOW");// 活体检测控制:NONE: 不进行控制 LOW:较低的活体要求(高通过率 低攻击拒绝率) NORMAL: 一般的活体要求(平衡的攻击拒绝率, 通过率) HIGH: 较高的活体要求(高攻击拒绝率 低通过率) 默认NONE
        //String image = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1602757891412&di=681d80319519a5e10435cdd3bc8e278e&imgtype=0&src=http%3A%2F%2Fimg31.mtime.cn%2Fpi%2F2014%2F06%2F23%2F115248.76859641_1000X1000.jpg";
//        String image = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1602758194172&di=0a22d241341cc986df094ae2756e7e8c&imgtype=0&src=http%3A%2F%2Fpics6.baidu.com%2Ffeed%2F9f2f070828381f309732453ff0770a0e6f06f0fe.jpeg%3Ftoken%3D63571034061c4e64a3496ee5fe5be627%26s%3D7EB805C764C616F58838952903007011";//美娜
        //String image = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1602758175229&di=6040829382f6a6054fddaea42f5b972b&imgtype=0&src=http%3A%2F%2Fwww.tiyutv.cc%2Fuploads%2Fallimg%2F191206%2F1-191206013622-50.jpg";//美娜
        String image = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1602919005390&di=c89d78c020629fe46c9b326fe2c4a709&imgtype=0&src=http%3A%2F%2Fe0.ifengimg.com%2F12%2F2018%2F1215%2F987EDE1CAF43DDE3CF60CBBAA8EB52AD73C316AB_size153_w1967_h1229.jpeg";
        String imageType = "URL";
        JSONObject detect = aipFace.detect(image, imageType, options);
        System.out.println(detect);
        Map<String, Object> stringObjectMap = detect.toMap();
        if(detect.getInt("error_code") == 0){
            return new Result("2000","查询成功",stringObjectMap);
        }else{
            return new Result("2001","aip错误",stringObjectMap);
        }
    }

    @Override
    public Result search() {
        AipFace aipFace = AipFaceUtil.getInstance();
        HashMap<String, String> options = new HashMap<>();
        options.put("max_face_num", "3");// 最多处理人脸的数目(默认值为1(仅检测图片中面积最大的那个人脸) 最大值10)
        options.put("match_threshold", "70");//匹配阈值（设置阈值后，score低于此阈值的用户信息将不会返回） 最大100 最小0 默认80 此阈值设置得越高，检索速度将会越快，推荐使用默认阈值80
        options.put("quality_control", "NORMAL");// 图片质量控制:NONE LOW NORMAL HIGH
        options.put("liveness_control", "LOW");// 活体检测控制:NONE LOW NORMAL HIGH
        options.put("user_id", "0927");//当需要对特定用户进行比对时，指定user_id进行比对。即人脸认证功能。
        options.put("max_user_num", "3");//查找后返回的用户数量。返回相似度最高的几个用户，默认为1，最多返回50个
       // String image = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1602758175229&di=6040829382f6a6054fddaea42f5b972b&imgtype=0&src=http%3A%2F%2Fwww.tiyutv.cc%2Fuploads%2Fallimg%2F191206%2F1-191206013622-50.jpg";//美娜
        // 华晨宇 uid：08042
//        String image = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1602918459391&di=57c200791c2956810f2148f782cd5bb5&imgtype=0&src=http%3A%2F%2Fe0.ifengimg.com%2F12%2F2018%2F1215%2F987EDE1CAF43DDE3CF60CBBAA8EB52AD73C316AB_size153_w1967_h1229.jpeg";
        // 华晨宇 uid:0927
        // String image = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1602918813653&di=4ed7b3fc41de6dd00c98e10e69384800&imgtype=0&src=http%3A%2F%2Fp1.ssl.cdn.btime.com%2Ft010f2de82274c5ebc5.jpg%3Fsize%3D960x1401";
        String image = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1602918943176&di=87360150d11f981c882abbbf39f9ddc2&imgtype=0&src=http%3A%2F%2Fgss0.baidu.com%2F9vo3dSag_xI4khGko9WTAnF6hhy%2Fzhidao%2Fpic%2Fitem%2Fc8ea15ce36d3d539ef07c4763987e950352ab049.jpg";
        String imageType = "URL";
        String groupIdList = "08042";// 从指定的group中进行查找 用逗号分隔，上限20个

        // 人脸搜索
        JSONObject res = aipFace.search(image, imageType, groupIdList, options);
        printRes(res);
        if(res.getInt("error_code") == 0){
            Map<String, Object> stringObjectMap = res.toMap();
            return new Result("2000","查询成功",stringObjectMap);
        }else{
            return new Result("2001","aip错误",null);
        }
    }

    @Override
    public Result multiSearch() {
        return null;
    }

    @Override
    public Result addUser() {
        AipFace aipFace = AipFaceUtil.getInstance();
        HashMap<String, String> options = new HashMap<>();
        options.put("user_info", "user's info");
        options.put("quality_control", "NORMAL");// 图片质量控制 NONE LOW NORMAL HIGH
        options.put("liveness_control", "LOW");// 活体检测控制 NONE LOW NORMAL HIGH
        options.put("action_type", "REPLACE");// 操作方式:APPEND(追加) REPLACE(替换)
        String image = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1602918813653&di=4ed7b3fc41de6dd00c98e10e69384800&imgtype=0&src=http%3A%2F%2Fp1.ssl.cdn.btime.com%2Ft010f2de82274c5ebc5.jpg%3Fsize%3D960x1401";
        String imageType = "URL";
        String groupId = "08042";
        String userId = "0927";

        // 人脸注册
        JSONObject res = aipFace.addUser(image, imageType, groupId, userId, options);
        printRes(res);
        Map<String, Object> stringObjectMap = res.toMap();
        if(res.getInt("error_code") == 0){
            return new Result("2000","查询成功",stringObjectMap);
        }else{
            return new Result("2001","aip错误",stringObjectMap);
        }
    }

    @Override
    public Result faceDelete() {
        AipFace aipFace = AipFaceUtil.getInstance();
        HashMap<String, String> options = new HashMap<>();
        String groupId = "08042";
        String userId = "0927";
        String faceToken = "";// 需要删除的人脸图片token，（由数字、字母、下划线组成）长度限制64B
        JSONObject res = aipFace.faceDelete(userId, groupId, faceToken, options);
        printRes(res);
        Map<String, Object> stringObjectMap = res.toMap();
        if(res.getInt("error_code") == 0){
            return new Result("2000","删除成功",stringObjectMap);
        }else{
            return new Result("2001","aip错误",stringObjectMap);
        }
    }

    @Override
    public Result getUser() {
        AipFace aipFace = AipFaceUtil.getInstance();
        HashMap<String, String> options = new HashMap<>();
        String groupId = "08042";
        String userId = "0927";
        JSONObject res = aipFace.getUser(userId, groupId, options);
        printRes(res);
        Map<String, Object> stringObjectMap = res.toMap();
        if(res.getInt("error_code") == 0){
            return new Result("2000","查询成功",stringObjectMap);
        }else{
            return new Result("2001","aip错误",stringObjectMap);
        }
    }

    @Override
    public Result faceGetlist() {
        AipFace aipFace = AipFaceUtil.getInstance();
        HashMap<String, String> options = new HashMap<>();
        String groupId = "08042";
        String userId = "0927";
        JSONObject res = aipFace.faceGetlist(userId, groupId, options);
        printRes(res);
        Map<String, Object> stringObjectMap = res.toMap();
        if(res.getInt("error_code") == 0){
            return new Result("2000","查询成功",stringObjectMap);
        }else{
            return new Result("2001","aip错误",stringObjectMap);
        }
    }

    @Override
    public Result getGroupUsers() {
        AipFace aipFace = AipFaceUtil.getInstance();
        HashMap<String, String> options = new HashMap<>();
        String groupId = "08042";
        JSONObject res = aipFace.getGroupUsers(groupId, options);
        printRes(res);
        Map<String, Object> stringObjectMap = res.toMap();
        if(res.getInt("error_code") == 0){
            return new Result("2000","查询成功",stringObjectMap);
        }else{
            return new Result("2001","aip错误",stringObjectMap);
        }
    }

    @Override
    public Result userCopy() {
        AipFace aipFace = AipFaceUtil.getInstance();
        HashMap<String, String> options = new HashMap<>();
        options.put("src_group_id", "");
        options.put("dst_group_id", "");
        String userId = "08042";
        JSONObject res = aipFace.userCopy(userId, options);
        printRes(res);
        Map<String, Object> stringObjectMap = res.toMap();
        if(res.getInt("error_code") == 0){
            return new Result("2000","查询成功",stringObjectMap);
        }else{
            return new Result("2001","aip错误",stringObjectMap);
        }
    }

    @Override
    public Result deleteUser() {
        AipFace aipFace = AipFaceUtil.getInstance();
        HashMap<String, String> options = new HashMap<>();
        String groupId = "08042";
        String userId = "08042";
        JSONObject res = aipFace.deleteUser(groupId, userId, options);
        printRes(res);
        Map<String, Object> stringObjectMap = res.toMap();
        if(res.getInt("error_code") == 0){
            return new Result("2000","删除成功",stringObjectMap);
        }else{
            return new Result("2001","aip错误",stringObjectMap);
        }
    }

    @Override
    public Result groupAdd() {
        AipFace aipFace = AipFaceUtil.getInstance();
        HashMap<String, String> options = new HashMap<>();
        String groupId = "08042";
        JSONObject res = aipFace.groupAdd(groupId, options);
        printRes(res);
        Map<String, Object> stringObjectMap = res.toMap();
        if(res.getInt("error_code") == 0){
            return new Result("2000","创建成功",stringObjectMap);
        }else{
            return new Result("2001","aip错误",stringObjectMap);
        }
    }

    @Override
    public Result groupDelete() {
        AipFace aipFace = AipFaceUtil.getInstance();
        HashMap<String, String> options = new HashMap<>();
        String groupId = "08042";
        JSONObject res = aipFace.groupDelete(groupId, options);
        printRes(res);
        Map<String, Object> stringObjectMap = res.toMap();
        if(res.getInt("error_code") == 0){
            return new Result("2000","删除成功",stringObjectMap);
        }else{
            return new Result("2001","aip错误",stringObjectMap);
        }
    }

    @Override
    public Result getGroupList() {
        AipFace aipFace = AipFaceUtil.getInstance();
        HashMap<String, String> options = new HashMap<>();
        options.put("start", "0");// 默认值0，起始序号
        options.put("length", "50");// 返回数量，默认值100，最大值1000
        JSONObject res = aipFace.getGroupList(options);
        printRes(res);
        Map<String, Object> stringObjectMap = res.toMap();
        if(res.getInt("error_code") == 0){
            return new Result("2000","查询成功",stringObjectMap);
        }else{
            return new Result("2001","aip错误",stringObjectMap);
        }
    }

    @Override
    public Result faceMatch() {
        AipFace aipFace = AipFaceUtil.getInstance();
        HashMap<String, String> options = new HashMap<>();
        // 华晨宇 uid：08042
        String image1 = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1602918459391&di=57c200791c2956810f2148f782cd5bb5&imgtype=0&src=http%3A%2F%2Fe0.ifengimg.com%2F12%2F2018%2F1215%2F987EDE1CAF43DDE3CF60CBBAA8EB52AD73C316AB_size153_w1967_h1229.jpeg";
        // 华晨宇 uid:0927
        String image2 = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1602918813653&di=4ed7b3fc41de6dd00c98e10e69384800&imgtype=0&src=http%3A%2F%2Fp1.ssl.cdn.btime.com%2Ft010f2de82274c5ebc5.jpg%3Fsize%3D960x1401";

        // image1/image2也可以为url或facetoken, 相应的imageType参数需要与之对应。
        MatchRequest req1 = new MatchRequest(image1, "URL");
        MatchRequest req2 = new MatchRequest(image2, "URL");
        //image, imageType,
        // faceType：LIVE（生活照） IDCARD（身份证） WATERMARK（带水印证件照） CERT（证件照）
        // qualityControl：图片质量控制  NONE LOW NORMAL HIGH
        // livenessControl：活体检测控制    NONE LOW NORMAL HIGH（较高的活体要求(高攻击拒绝率 低通过率) ）
        ArrayList<MatchRequest> requests = new ArrayList<MatchRequest>();
        requests.add(req1);
        requests.add(req2);

        JSONObject res = aipFace.match(requests);
        printRes(res);
        Map<String, Object> stringObjectMap = res.toMap();
        if(res.getInt("error_code") == 0){
            return new Result("2000","查询成功",stringObjectMap);
        }else{
            return new Result("2001","aip错误",stringObjectMap);
        }
    }
    /**
     *  @description 输出
     *  @Author running4light朱泽雄
     *  @CreateTime 16:51 2020/10/17
     */
    private void printRes(JSONObject res){
        System.out.println(res.toString(2));
    }
}
