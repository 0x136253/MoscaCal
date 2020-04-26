package com.mutiny.moscacal.controller;

import com.mutiny.moscacal.api.CommonResult;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @Author: Anonsmd
 * @Date: 2020/1/16 17:43
 */
@Controller
@RequestMapping("/Base")
public class BaseController {
    @RequestMapping(value = "/ADMIN", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Map<String,Object>> ADMIN(){
        return CommonResult.success("ADMIN");
    }

    @RequestMapping(value = "/ROOT", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Map<String,Object>> ROOT(){
        return CommonResult.success("ROOT");
    }
    @RequestMapping(value = "/SYSTEM", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Map<String,Object>> SYSTEM(){
        return CommonResult.success("SYSTEM");
    }
    @RequestMapping(value = "/USER", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Map<String,Object>> USER(){
        return CommonResult.success("USER");
    }
}
