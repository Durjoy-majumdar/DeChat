package com.tencent.kinda.gen;

public interface IShakeCheckingManager {
    void playShakeMatch(boolean z);

    void playShakeSound();

    void setDelayNotifyCallBackImpl(VoidCallback voidCallback, int i);

    void setOnShakeCallBackImpl(VoidCallback voidCallback);

    void startCheck();

    void stopCheck();
}
