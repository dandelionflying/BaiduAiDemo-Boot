package cn.running4light.javasdk.service;

import cn.running4light.common.Result;
import org.springframework.stereotype.Service;

/**
 *  图形识别接口
 */
public interface AipImageClassifyService {
    /**
     *  @Description    通用物体识别
     *  @Author running4light朱泽雄
     *  @CreateTime 10:49 2020/10/15
     *
     */
    Result advancedGeneral();
    /**
     *  @Description 菜品识别
     *  @Author running4light朱泽雄
     *  @CreateTime 11:50 2020/10/15
     *
     */
    Result dishDetect();
    /**
     *  @Description    车辆识别
     *  @Author running4light朱泽雄
     *  @CreateTime 12:03 2020/10/15
     *
     */
    Result carDetect();
    /**
     *  @Description    车辆检测
     *  @Author running4light朱泽雄
     *  @CreateTime 12:08 2020/10/15
     *
     */
    Result vehicleDetect();
    /**
     *  @Description    车辆外观损伤识别
     *  @Author running4light朱泽雄
     *  @CreateTime 14:13 2020/10/15
     *
     */
    Result vehicleDamage();
    /**
     *  @Description    logo商标识别
     *  @Author running4light朱泽雄
     *  @CreateTime 14:17 2020/10/15
     *
     */
    Result logoSearch();
    /**
     *  @Description    动物识别
     *  @Author running4light朱泽雄
     *  @CreateTime 14:23 2020/10/15
     *
     */
    Result animalDetect();
    /**
     *  @Description    植物识别
     *  @Author running4light朱泽雄
     *  @CreateTime 14:25 2020/10/15
     *
     */
    Result plantDetect();
}
