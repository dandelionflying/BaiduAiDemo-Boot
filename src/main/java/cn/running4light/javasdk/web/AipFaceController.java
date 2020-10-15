package cn.running4light.javasdk.web;

import cn.running4light.common.Result;
import cn.running4light.javasdk.service.AipFaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  @Description    人脸识别
 *  @Author running4light朱泽雄
 *  @CreateTime 15:02 2020/10/15
 */
@RestController
@RequestMapping("aip-face")
public class AipFaceController {
    
    @Autowired
    private AipFaceService aipFaceService;
    /**
     *  @Description    人脸检测
     *  @Author running4light朱泽雄
     *  @CreateTime 15:35 2020/10/15
     *  
     */
    @RequestMapping("detect")
    public Result detect(){
        return aipFaceService.detect();
    }
}
