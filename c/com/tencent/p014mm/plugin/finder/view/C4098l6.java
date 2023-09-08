package com.tencent.p014mm.plugin.finder.view;

import fy3.C32226l;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.view.l6 */
public final class C4098l6 extends C87413o implements C32226l<Integer, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C4087k6 f18240d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4098l6(C4087k6 k6Var) {
        super(1);
        this.f18240d = k6Var;
    }

    public Object invoke(Object obj) {
        boolean z = true;
        if (this.f18240d.f18525c.size() - 1 != ((Number) obj).intValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
