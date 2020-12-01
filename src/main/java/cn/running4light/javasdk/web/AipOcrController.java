package cn.running4light.javasdk.web;

import cn.running4light.common.Result;
import cn.running4light.javasdk.service.AipOcrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RequestMapping("aip-ocr")
@RestController
public class AipOcrController {

    @Autowired
    private AipOcrService aipOcrService;

    @GetMapping("basicGeneral")
    public Result basicGeneral(){
        return aipOcrService.basicGeneral();
    }
}
