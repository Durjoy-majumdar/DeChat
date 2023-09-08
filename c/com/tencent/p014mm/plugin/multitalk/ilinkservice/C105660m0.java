package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.m0 */
public class C105660m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f314171d;

    public C105660m0(C105724z zVar, int i) {
        this.f314171d = i;
    }

    public void run() {
        int Hangup = C105714w.f314302c.Hangup(this.f314171d);
        Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "Hangup ret:" + Hangup);
    }
}
