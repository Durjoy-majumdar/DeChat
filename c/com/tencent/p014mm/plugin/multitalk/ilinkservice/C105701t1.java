package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.t1 */
public class C105701t1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f314279d;

    /* renamed from: e */
    public final /* synthetic */ C105724z.C105735k f314280e;

    public C105701t1(C105724z.C105735k kVar, int i) {
        this.f314280e = kVar;
        this.f314279d = i;
    }

    public void run() {
        C105724z zVar = C105724z.this;
        C105724z zVar2 = C105724z.INSTANCE;
        zVar.mo150604n();
        C105724z zVar3 = C105724z.this;
        zVar3.mo150599i((C105598b<ArrayList<C105683r>>) null, -10086, -6, "accept callback failed: " + this.f314279d);
    }
}
