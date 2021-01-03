package com.kontrakkan.blog.modules.demo.model;

public class DemoModel {
    private String demoMessage;

    public DemoModel() {

    }

    public DemoModel(String demoMessage) {
        this.demoMessage = demoMessage;
    }

    public String getDemoMessage() {
        return demoMessage;
    }

    public void setDemoMessage(String demoMessage) {
        this.demoMessage = demoMessage;
    }

}
