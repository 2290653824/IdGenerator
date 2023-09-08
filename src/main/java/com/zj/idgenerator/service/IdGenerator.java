package com.zj.idgenerator.service;

import com.zj.idgenerator.vo.CustomVo;
import org.springframework.stereotype.Service;

@Service
public interface IdGenerator {

    String getCustomId(CustomVo customVo);

    String getId();
}
