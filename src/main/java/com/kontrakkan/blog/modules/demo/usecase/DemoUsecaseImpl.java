package com.kontrakkan.blog.modules.demo.usecase;

import com.kontrakkan.blog.modules.demo.model.DemoModel;
import com.kontrakkan.blog.modules.demo.repository.DemoRepoInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "demoUsecase")
public class DemoUsecaseImpl implements DemoUsecaseInterface {
    @Autowired
    @Qualifier("demoRepo")
    private DemoRepoInterface demoRepo;

    @Override
    public DemoModel getDemoData() {
        return demoRepo.getDemoData();
    }

}
