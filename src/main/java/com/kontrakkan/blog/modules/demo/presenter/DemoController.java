package com.kontrakkan.blog.modules.demo.presenter;

import com.kontrakkan.blog.modules.demo.usecase.DemoUsecaseInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
    @Autowired
    @Qualifier("demoUsecase")
    private DemoUsecaseInterface demoUsecase;

    @RequestMapping(value = "/demo")
    @ResponseBody
    public String getDemoData() {
        return "<h1>" + demoUsecase.getDemoData().getDemoMessage() + "</h1>";
    }
}
