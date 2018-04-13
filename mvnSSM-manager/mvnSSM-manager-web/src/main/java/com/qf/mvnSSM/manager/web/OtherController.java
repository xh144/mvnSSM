package com.qf.mvnSSM.manager.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/other")
public class OtherController {

    @RequestMapping("/index")
    public String toIndex() {
        return "index";
    }
}
