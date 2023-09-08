package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import fy3.C32224a;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.w2 */
public final class C18502w2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WeakReference<C18508z2> f51393d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18502w2(WeakReference<C18508z2> weakReference) {
        super(0);
        this.f51393d = weakReference;
    }

    public Object invoke() {
        C18508z2 z2Var = this.f51393d.get();
        if (z2Var != null) {
            C18508z2.C18509a aVar = C18508z2.f51409I;
            z2Var.mo23165v();
        }
        return C13598b0.f38549a;
    }
}
