package com.tencent.kinda.gen;

public interface KAddPayCardService {
    boolean clearBindCardProcess();

    BindCardContext enterBindCardProcess(int i);

    String getBanBindCardTitle();

    boolean isBanBindCard();
}
