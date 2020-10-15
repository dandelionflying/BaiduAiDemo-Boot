package cn.running4light.javasdk.web;

import cn.running4light.common.Result;
import cn.running4light.javasdk.service.AipImageClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  @Description    图图像别
 *  @Author running4light朱泽雄
 *  @CreateTime 10:44 2020/10/15
 *
 */
@RequestMapping("aip-image")
@RestController
public class AipImageClassifyController {

    @Autowired
    private AipImageClassifyService aipImageClassifyService;
    /**
     *  @Description    通用物体识别
     *  @Author running4light朱泽雄
     *  @CreateTime 10:45 2020/10/15
     *
     */
    @GetMapping("advancedGeneral")
    public Result advancedGeneral(){
        return aipImageClassifyService.advancedGeneral();
    }
    /**
     *  @Description    菜品识别
     *  @Author running4light朱泽雄
     *  @CreateTime 11:52 2020/10/15
     *
     */
    @GetMapping("dishDetect")
    public Result dishDetect(){
        return aipImageClassifyService.dishDetect();
    }
    /**
     *  @Description    车辆识别--检测一张车辆图片的具体车型
     *  @Author running4light朱泽雄
     *  @CreateTime 12:05 2020/10/15
     *
     */
    @GetMapping("carDetect")
    public Result carDetect(){
        return aipImageClassifyService.carDetect();
    }
    /**
     *  @Description    车辆检测--传入单帧图像，检测图片中所有机动车辆，返回每辆车的类型和坐标位置，
     *  可识别小汽车、卡车、巴士、摩托车、三轮车5大类车辆，并对每类车辆分别计数，
     *  可返回含有统计值和检测框的渲染结果图，支持指定不规则区域的车辆统计
     *  @Author running4light朱泽雄
     *  @CreateTime 12:08 2020/10/15
     *
     */
    @GetMapping("vehicleDetect")
    public Result vehicleDetect(){
        return aipImageClassifyService.vehicleDetect();
    }
    /**
     *  @Description    车辆外观损伤识别--针对常见的小汽车车型，传入单帧图像，识别车辆外观受损部件及损伤类型，
     *  支持32种车辆部件、5大类外观损伤。同时可输出损伤的数值化结果（长宽、面积、部件占比），支持单图多种损伤的识别
     *  @Author running4light朱泽雄
     *  @CreateTime 14:14 2020/10/15
     *
     */
    @GetMapping("vehicleDamage")
    public Result vehicleDamage(){
        return aipImageClassifyService.vehicleDamage();
    }
    /**
     *  @Description    logo商标识别
     *  @Author running4light朱泽雄
     *  @CreateTime 14:20 2020/10/15
     *
     */
    @GetMapping("logoSearch")
    public Result logoSearch(){
        return aipImageClassifyService.logoSearch();
    }
    /**
     *  @Description    动物识别
     *  @Author running4light朱泽雄
     *  @CreateTime 14:24 2020/10/15
     *
     */
    @GetMapping("animalDetect")
    public Result animalDetect(){
        return aipImageClassifyService.animalDetect();
    }
    /**
     *  @Description    植物识别
     *  @Author running4light朱泽雄
     *  @CreateTime 14:26 2020/10/15
     *
     */
    @GetMapping("plantDetect")
    public Result plantDetect(){
        return aipImageClassifyService.plantDetect();
    }
}
