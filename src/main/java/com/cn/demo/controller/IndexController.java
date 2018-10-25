package com.cn.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Orine
 * @Date: 2018/10/25
 */
@RestController
public class IndexController {

    private static final Logger LOGGER = Logger.getLogger(IndexController.class);

    @GetMapping("/{string}")
    public String index(@PathVariable("string") String s) {
        LOGGER.info(s);
        LOGGER.warn(s);
        LOGGER.error(s);
        return s;
    }
}
