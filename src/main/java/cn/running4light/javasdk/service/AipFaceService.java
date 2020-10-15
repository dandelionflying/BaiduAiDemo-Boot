package cn.running4light.javasdk.service;

import cn.running4light.common.Result;

/**
 *  @Description    人脸识别接口
 *  @Author running4light朱泽雄
 *  @CreateTime 15:10 2020/10/15
 *
 */
public interface AipFaceService {
    /**
     *  @Description    人脸检测
     *  @Author running4light朱泽雄
     *  @CreateTime 15:12 2020/10/15
     *
     */
    Result detect();

    /**
     *  @Description    人脸搜索
     *
     *  @Author running4light朱泽雄
     *  @CreateTime 15:13 2020/10/15
     *
     */
    Result search();
    /**
     *  @Description    人脸搜索 M:N 识别
     *  待识别的图片中，存在多张人脸的情况下，支持在一个人脸库中，一次请求，同时返回图片中所有人脸的识别结果。
     *  @Author running4light朱泽雄
     *  @CreateTime 15:14 2020/10/15
     *
     */
    Result multiSearch();
}
