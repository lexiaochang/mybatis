package com.chris.mybais.controller;

import com.chris.mybais.po.AutoIncrementEntity;
import com.chris.mybais.service.AutoIncrementService;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Chris on 2017/11/28.
 */
@Controller
@RequestMapping("/autoincrement")
public class AutoIncrementController {
    @Resource
    private AutoIncrementService mAutoIncrementService;

    @RequestMapping(value = "/insertdata", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public ResponseEntity<String> insertData(@ModelAttribute AutoIncrementEntity autoIncrementEntity) throws Exception {
        String s = mAutoIncrementService.insertData(autoIncrementEntity);
        JSONObject json = new JSONObject();
        try {
            json.put("success", s);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        ResponseEntity<String> responseEntity = new ResponseEntity<>(json.toString(), HttpStatus.OK);
        return responseEntity;
    }


}
