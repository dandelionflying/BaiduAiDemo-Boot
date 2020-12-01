package cn.running4light.javasdk.service;

import cn.running4light.common.Result;
import cn.running4light.javasdk.AipOcrUtil;
import com.baidu.aip.ocr.AipOcr;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 *
 */
@Service
public class AipOcrServiceImpl implements AipOcrService {
    @Override
    public Result basicGeneral() {
        AipOcr instance = AipOcrUtil.getInstance();
        String path = "D:\\zzx\\codes\\BaiduAi-Boot\\src\\main\\resources\\static\\3B2E79DE27AE48CF8F731575AAEBC22D.jpg";
//        String path = "D:\\zzx\\codes\\BaiduAi-Boot\\src\\main\\resources\\static\\微信截图_20201201155535.png";
        JSONObject res = instance.basicGeneral(path, new HashMap<String, String>());
        JSONArray words_result = res.getJSONArray("words_result");
        for (Object json:words_result
             ) {
            JSONObject jj = (JSONObject) json ;
            System.err.print(jj.getString("words"));
        }
//        System.out.println(res.toString(2));
        return Result.createSuccess(res.toString(2));
    }
}
