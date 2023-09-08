package com.tencent.p014mm.plugin.finder.view;

import android.os.Handler;
import android.os.Looper;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.view.z7 */
public final class C4242z7 extends C87413o implements C32224a<C18791w> {

    /* renamed from: d */
    public final /* synthetic */ SimpleTouchableLayout f18564d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4242z7(SimpleTouchableLayout simpleTouchableLayout) {
        super(0);
        this.f18564d = simpleTouchableLayout;
    }

    public Object invoke() {
        return new C18791w(this.f18564d.getContext(), this.f18564d, new Handler(Looper.getMainLooper()));
    }
}
