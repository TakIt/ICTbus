package com.example.ICT.page;


import com.example.ICT.model.Repository;
import com.example.ICT.model.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private Service service;


    @Autowired
    private HttpSession httpSession;

    @GetMapping("index")
    public String get(Model model){
        return "index";
    }

    @PostMapping("index")
    public String post(Model model,String dir,String sta,String time){
        service.setState(dir);
        System.out.println(dir+sta+time);
        service.arrive_findAll(sta,time);
        return "timetable";
    }


    @GetMapping("timetable")
    public String get2(Model model){
        if (service.getState().equals("arr")){
        model.addAttribute("atimetable",service.getaTimeTable());
        }
        return "timetable";
    }
}