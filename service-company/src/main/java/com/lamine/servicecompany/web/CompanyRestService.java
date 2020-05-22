package com.lamine.servicecompany.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
@RefreshScope
@RestController
public class CompanyRestService {
    @Value("${xParam}")
    private String xParam;
    @Value("${yParam}")
    private String yParam;
    @Value("${my}")
    private String mail;

    @GetMapping("/myConfig")
    public Map<String,Object>getParam(){
        Map<String,Object> params =new HashMap<>();
        params.put("xParam",xParam);
        params.put("yParam",yParam);
        params.put("me",mail);
        params.put("myThread",Thread.currentThread().getName());

        return params;
    }

}
