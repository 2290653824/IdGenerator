package com.zj.idgenerator.controller;

import com.zj.idgenerator.service.IdGenerator;
import com.zj.idgenerator.vo.IdRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdGeneratorController {

    @Autowired
    private IdGenerator idGenerator;


    private String getId(IdRequestVo idRequestVo){

        return idGenerator.getId();
    }
}
