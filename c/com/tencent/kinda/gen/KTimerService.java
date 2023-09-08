package com.tencent.kinda.gen;

public interface KTimerService {
    void dispatchAfterImpl(float f, VoidCallback voidCallback);

    void dispatchAsyncInBgThreadImpl(VoidCallback voidCallback);

    void dispatchAsyncInMainThreadImpl(VoidCallback voidCallback);

    void initIntervalAndCheckedCallbackImpl(float f, VoidCallback voidCallback);

    double now();

    void startTimeCheck();

    void stopTimeCheck();

    void throttleImpl(float f, VoidCallback voidCallback);
}
