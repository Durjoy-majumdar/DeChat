package hs1;

import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: hs1.t */
public final class C8755t extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<C15601d<Boolean>> f28038d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8755t(C8479f0<C15601d<Boolean>> f0Var) {
        super(0);
        this.f28038d = f0Var;
    }

    public Object invoke() {
        C15601d dVar = (C15601d) this.f28038d.f27484d;
        if (dVar != null) {
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
        }
        this.f28038d.f27484d = null;
        return C13598b0.f38549a;
    }
}
