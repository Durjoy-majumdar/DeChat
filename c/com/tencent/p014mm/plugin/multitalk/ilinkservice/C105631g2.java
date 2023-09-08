package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.g2 */
public class C105631g2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f314113d;

    /* renamed from: e */
    public final /* synthetic */ C105639h2 f314114e;

    public C105631g2(C105639h2 h2Var, int i) {
        this.f314114e = h2Var;
        this.f314113d = i;
    }

    public void run() {
        C105724z zVar = this.f314114e.f314128a;
        C105724z zVar2 = C105724z.INSTANCE;
        zVar.mo150604n();
        int i = -5;
        int i2 = this.f314113d;
        if (i2 == 15) {
            i = i2;
        }
        C105724z zVar3 = this.f314114e.f314128a;
        zVar3.mo150602l((C105598b<ArrayList<C105683r>>) null, -10086, i, "join room callback failed: " + this.f314113d);
    }
}
