package com.tencent.kinda.framework.module.impl;

import com.tencent.kinda.gen.EventLoopManager;
import com.tencent.kinda.gen.KEventLoop;

public class KindaEventLoopManagerImpl implements EventLoopManager {
    private KEventLoop bgLoop;
    private KEventLoop makeSureUILoop;
    private KEventLoop uiLoop;

    public KEventLoop getBackGroundEventLoop() {
        if (this.bgLoop == null) {
            this.bgLoop = new KindaUIEventLoop();
        }
        return this.bgLoop;
    }

    public KEventLoop getMakeSureUIEventLoop() {
        if (this.makeSureUILoop == null) {
            this.makeSureUILoop = new KindaUIEventLoop();
        }
        return this.makeSureUILoop;
    }

    public KEventLoop getUIEventLoop() {
        if (this.uiLoop == null) {
            this.uiLoop = new KindaUIEventLoop();
        }
        return this.uiLoop;
    }
}
