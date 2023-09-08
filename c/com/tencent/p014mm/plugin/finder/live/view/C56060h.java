package com.tencent.p014mm.plugin.finder.live.view;

import android.os.Bundle;
import cl1.C54991o;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.live.view.h */
public final class C56060h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C56061i f159881d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56060h(C56061i iVar) {
        super(0);
        this.f159881d = iVar;
    }

    public Object invoke() {
        if (!((C54991o) this.f159881d.business(C54991o.class)).mo75997d4()) {
            C58124b.C7172a.m7372a(this.f159881d, C58124b.C58125b.LIVE_HAS_FINISHED, (Bundle) null, 2, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
