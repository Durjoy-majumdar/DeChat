package com.tencent.kinda.framework.module.impl;

import com.tencent.kinda.gen.IAsyncTask;
import com.tencent.kinda.gen.KEventLoop;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

public class KindaUIEventLoop implements KEventLoop {
    public void post(final IAsyncTask iAsyncTask) {
        MMHandlerThread.postToMainThread(new Runnable() {
            public void run() {
                iAsyncTask.execute();
            }
        });
    }
}
