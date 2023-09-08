package com.zj.idgenerator.service.strategy;

import java.util.UUID;

public class UUIDStrategy implements IdStrategy{
    @Override
    public String generateId() {
        return UUID.randomUUID().toString();
    }
}
