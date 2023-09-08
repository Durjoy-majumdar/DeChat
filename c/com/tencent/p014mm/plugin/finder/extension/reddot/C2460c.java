package com.tencent.p014mm.plugin.finder.extension.reddot;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C51978xi1;
import te3.C64586nn1;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.c */
public final class C2460c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C2469j f12914d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2460c(C2469j jVar) {
        super(0);
        this.f12914d = jVar;
    }

    public Object invoke() {
        Log.m105924i("Finder.MsgRedDotHandler", "[addFinderHelloMessageRedDot]");
        C51978xi1 xi12 = new C51978xi1();
        xi12.f144679q = C66785b.f191882e.mo90662O5();
        xi12.f144673h = String.valueOf(C31543z5.m39453c());
        xi12.f144669d = 390000;
        xi12.f144670e = 1007;
        C64586nn1 nn12 = new C64586nn1();
        nn12.f184502d = 1;
        nn12.f184506h = 1;
        nn12.f184507i = "TLPersonalCenter";
        xi12.f144672g.add(nn12);
        C64586nn1 nn13 = new C64586nn1();
        nn13.f184502d = 1;
        nn13.f184506h = 1;
        nn13.f184507i = "finder_private_msg_entrance";
        xi12.f144672g.add(nn13);
        this.f12914d.f12929a.mo77230I(xi12, "addFinderHelloMessageRedDot", (C32226l<? super C55718s0, C13598b0>) null);
        return C13598b0.f38549a;
    }
}
