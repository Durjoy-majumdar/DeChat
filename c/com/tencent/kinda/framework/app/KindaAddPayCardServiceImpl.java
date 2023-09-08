package com.tencent.kinda.framework.app;

import com.tencent.kinda.gen.BindCardContext;
import com.tencent.kinda.gen.KAddPayCardService;

public class KindaAddPayCardServiceImpl implements KAddPayCardService {
    public boolean clearBindCardProcess() {
        return false;
    }

    public BindCardContext enterBindCardProcess(int i) {
        return new BindCardContext();
    }

    public String getBanBindCardTitle() {
        return "todo: @zhihongwang";
    }

    public boolean isBanBindCard() {
        return false;
    }
}
