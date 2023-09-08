package com.zj.idgenerator.service;


import com.zj.idgenerator.service.strategy.IdStrategy;
import com.zj.idgenerator.vo.CustomVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class IdGeneratorImpl implements IdGenerator{

    @Autowired
    private IdStrategy idStrategy;

    @Override
    public String getCustomId(CustomVo customVo) {
        //TODO
        return idStrategy.generateId();
    }

    @Override
    public String getId() {
        return idStrategy.generateId();
    }
}
