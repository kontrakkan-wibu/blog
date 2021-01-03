package com.kontrakkan.blog.modules.demo.repository;

import com.kontrakkan.blog.modules.demo.model.DemoModel;

import org.springframework.stereotype.Component;

@Component(value = "demoRepo")
public class DemoRepoImpl implements DemoRepoInterface {

    @Override
    public DemoModel getDemoData() {

        DemoModel demo = new DemoModel("Demo Test");
        return demo;
    }

}
