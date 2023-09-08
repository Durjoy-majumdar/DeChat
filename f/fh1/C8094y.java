package fh1;

import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: fh1.y */
public final class C8094y extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<C15601d<Integer>> f26947d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8094y(C8479f0<C15601d<Integer>> f0Var) {
        super(0);
        this.f26947d = f0Var;
    }

    public Object invoke() {
        C15601d dVar = (C15601d) this.f26947d.f27484d;
        if (dVar != null) {
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(0));
        }
        return C13598b0.f38549a;
    }
}
