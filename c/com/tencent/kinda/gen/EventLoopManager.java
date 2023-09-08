package com.tencent.kinda.gen;

public interface EventLoopManager {
    KEventLoop getBackGroundEventLoop();

    KEventLoop getMakeSureUIEventLoop();

    KEventLoop getUIEventLoop();
}
