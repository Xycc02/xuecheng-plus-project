package com.xuecheng.xczx_content.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xuecheng.xczx_content.service.TeachplanMediaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xuyuchao
 */
@Slf4j
@RestController
@RequestMapping("teachplanMedia")
public class TeachplanMediaController {

    @Autowired
    private TeachplanMediaService  teachplanMediaService;
}
