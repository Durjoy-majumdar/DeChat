package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.f1 */
public class C105626f1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105724z f314104d;

    public C105626f1(C105724z zVar) {
        this.f314104d = zVar;
    }

    public void run() {
        if (this.f314104d.f314406p0.f314075a != null) {
            Log.m105924i("MicroMsg.MT.MultiTalkManager", "onMultiTalkReady");
        }
    }
}
