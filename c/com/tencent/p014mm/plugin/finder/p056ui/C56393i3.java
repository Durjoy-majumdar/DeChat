package com.tencent.p014mm.plugin.finder.p056ui;

import er1.C58784w3;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C64689rq2;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.finder.ui.i3 */
public final class C56393i3 extends C87413o implements C32226l<Long, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C64689rq2 f161225d;

    /* renamed from: e */
    public final /* synthetic */ FinderSelectCoverUI f161226e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56393i3(C64689rq2 rq22, FinderSelectCoverUI finderSelectCoverUI) {
        super(1);
        this.f161225d = rq22;
        this.f161226e = finderSelectCoverUI;
    }

    public Object invoke(Object obj) {
        ((Number) obj).longValue();
        if (C58784w3.f168295a.mo83894P0(this.f161225d)) {
            ((C119157j) C119157j.f356862d).mo183875f(new C56392h3(this.f161226e, this.f161225d));
        }
        return C13598b0.f38549a;
    }
}
