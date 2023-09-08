package com.tencent.p014mm.plugin.base.stub;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.CountDownLatch;
import lp3.C88631d;

/* renamed from: com.tencent.mm.plugin.base.stub.j */
public class C85089j implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ CountDownLatch f247941a;

    public C85089j(CountDownLatch countDownLatch) {
        this.f247941a = countDownLatch;
    }

    /* renamed from: a */
    public void mo1720a(Object obj) {
        Log.m105920e("MicroMsg.WXBizLogic", "onInterrupt error");
        this.f247941a.countDown();
    }
}
