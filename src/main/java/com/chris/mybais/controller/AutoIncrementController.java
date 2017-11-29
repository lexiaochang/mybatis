package com.chris.mybais.controller;

import com.chris.mybais.http.HttpUtils;
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
import org.springframework.web.bind.annotation.RequestParam;
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
        int i = mAutoIncrementService.insertData(autoIncrementEntity);
        if (i == 1) {
            i = 200;
        }
        JSONObject json = new JSONObject();
        try {
            json.put("success", i);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        ResponseEntity<String> responseEntity = new ResponseEntity<>(json.toString(), HttpStatus.OK);
        return responseEntity;
    }

    @RequestMapping(value = "/selectdata", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public ResponseEntity<String> selectData(@RequestParam Long id) throws Exception {
        AutoIncrementEntity autoIncrementEntity = mAutoIncrementService.selectData(id);
        JSONObject json = new JSONObject();
        try {
            json.put("name", autoIncrementEntity.getName());
            json.put("age", autoIncrementEntity.getAge());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        ResponseEntity<String> responseEntity = new ResponseEntity<>(json.toString(), HttpStatus.OK);
        return responseEntity;
    }

    @RequestMapping(value = "/deletedata", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public ResponseEntity<String> deleteData(@RequestParam Long id) throws Exception {
        int i = mAutoIncrementService.deleteData(id);
        if (i == 1) {
            i = 200;
        }
        JSONObject json = new JSONObject();
        try {
            json.put("result", i);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        ResponseEntity<String> responseEntity = new ResponseEntity<>(json.toString(), HttpStatus.OK);
        return responseEntity;
    }

    @RequestMapping(value = "/updatedata", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public ResponseEntity<String> updateData(@ModelAttribute AutoIncrementEntity autoIncrementEntity) throws Exception {
        int i = mAutoIncrementService.updateData(autoIncrementEntity);
        if (i == 1) {
            i = 200;
        }
        String message = sendPost();
        JSONObject json = new JSONObject();
        try {
            json.put("result", i);
            json.put("message",message);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        ResponseEntity<String> responseEntity = new ResponseEntity<>(json.toString(), HttpStatus.OK);
        return responseEntity;
    }

    public String sendPost() {
        //发送 POST 请求
        String sr = HttpUtils.sendPost("http://10.11.26.24:8080/autoincrement/selectdata", "id=3");
        return sr;
    }

    public String sendGet() {
        //发送 GET 请求
        String s = HttpUtils.sendGet("http://localhost:6144/Home/RequestString", "key=123&v=456");
        return s;
    }
}
