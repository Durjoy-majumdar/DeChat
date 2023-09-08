package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.view.KeyEvent;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81974j3;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import li0.C88508b;
import p170ic.C87692f;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.j4 */
public final class C84549j4 extends C81974j3 {

    /* renamed from: c */
    public final /* synthetic */ C84537h4 f246716c;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.j4$a */
    public static final class C84550a extends C87413o implements C32226l<C87692f, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C84537h4 f246717d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84550a(C84537h4 h4Var) {
            super(1);
            this.f246717d = h4Var;
        }

        public Object invoke(Object obj) {
            C87692f fVar = (C87692f) obj;
            C87412m.m108594g(fVar, "$this$lifecycle");
            C84547i4 i4Var = new C84547i4(this.f246717d);
            fVar.f253969d.put(C88508b.BACKGROUND, i4Var);
            return C13598b0.f38549a;
        }
    }

    public C84549j4(C84537h4 h4Var) {
        this.f246716c = h4Var;
    }

    /* renamed from: a */
    public boolean mo107509a(KeyEvent keyEvent) {
        AppBrandRuntimeWC runtime = this.f246716c.getRuntime();
        boolean z = false;
        if (runtime == null) {
            return false;
        }
        if (keyEvent != null && 1 == keyEvent.getAction()) {
            z = true;
        }
        if (z) {
            if (runtime.f238116N) {
                C84550a aVar = new C84550a(this.f246716c);
                C87692f fVar = new C87692f();
                aVar.invoke(fVar);
                runtime.f238113K.mo122978a(fVar);
                runtime.mo113063k();
            } else {
                runtime.mo113006E();
            }
        }
        return true;
    }
}
