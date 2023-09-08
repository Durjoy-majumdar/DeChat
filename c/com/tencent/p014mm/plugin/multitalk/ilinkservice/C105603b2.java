package com.tencent.p014mm.plugin.multitalk.ilinkservice;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.b2 */
public class C105603b2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105724z f314068d;

    public C105603b2(C105724z zVar) {
        this.f314068d = zVar;
    }

    public void run() {
        C105724z zVar = this.f314068d;
        if (!zVar.f314423x0) {
            zVar.f314423x0 = true;
            zVar.f314426y0 = 0;
            C105714w.f314302c.SwitchAV(zVar.f314407p1 ? 1 : 0, 1, 0);
        }
    }
}
