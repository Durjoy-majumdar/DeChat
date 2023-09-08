package com.tencent.kinda.framework.module.impl;

import com.tencent.kinda.gen.KUUIDService;
import java.util.UUID;

public class KindaUUIDService implements KUUIDService {
    public String getUuid() {
        return UUID.randomUUID().toString();
    }
}
