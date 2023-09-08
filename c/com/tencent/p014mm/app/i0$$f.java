package com.tencent.p014mm.app;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.tencent.mm.app.i0$$f */
public class i0$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CountDownLatch f235811d;

    public i0$$f(CountDownLatch countDownLatch) {
        this.f235811d = countDownLatch;
    }

    public void run() {
        try {
            C80600i0.m98222g(MMApplicationContext.getContext(), MMApplicationContext.getContext().getPackageName());
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MMCrashReporter", "getPkgSize failed :%s", e.getMessage());
        }
        this.f235811d.countDown();
    }
}
