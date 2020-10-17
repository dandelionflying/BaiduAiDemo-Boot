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
    /**
     *  @description 人脸注册
     *  @Author running4light朱泽雄
     *  @CreateTime 14:08 2020/10/17
     */
    Result addUser();
    /**
     *  @description 删除人脸数据
     *  @Author running4light朱泽雄
     *  @CreateTime 14:11 2020/10/17
     */
    Result faceDelete();
    /**
     *  @description 用户信息查询
     *  @Author running4light朱泽雄
     *  @CreateTime 14:11 2020/10/17
     */
    Result getUser(); 
    /**
     *  @description 获取用户人脸列表
     *  @Author running4light朱泽雄
     *  @CreateTime 14:13 2020/10/17
     */
    Result faceGetlist();
    /**
     *  @description 获取用户列表
     *  @Author running4light朱泽雄
     *  @CreateTime 14:15 2020/10/17
     *  @Return 用户ID列表
     */
    Result getGroupUsers();
    /**
     *  @description 复制用户：用于将已经存在于人脸库中的用户复制到一个新的组。
     *  @Author running4light朱泽雄
     *  @CreateTime 14:27 2020/10/17
     */
    Result userCopy();
    /**
     *  @description 删除用户
     *  @Author running4light朱泽雄
     *  @CreateTime 14:30 2020/10/17
     */
    Result deleteUser();
    /**
     *  @description 创建用户组
     *  @Author running4light朱泽雄
     *  @CreateTime 14:32 2020/10/17
     */
    Result groupAdd();
    /**
     *  @description 删除用户组
     *  @Author running4light朱泽雄
     *  @CreateTime 14:33 2020/10/17
     */
    Result groupDelete();
    /**
     *  @description 用户组列表
     *  @Author running4light朱泽雄
     *  @CreateTime 14:34 2020/10/17
     */
    Result getGroupList();

    /**
     *  @description 人脸对比
     *  @Author running4light朱泽雄
     *  @CreateTime 15:18 2020/10/17
     */
    Result faceMatch();
}
