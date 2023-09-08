package jh2;

import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87413o;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: jh2.n */
public final class C9437n extends C87413o implements C32227p<Boolean, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<C15601d<String>> f29465d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9437n(C8479f0<C15601d<String>> f0Var) {
        super(2);
        this.f29465d = f0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        C15601d dVar = (C15601d) this.f29465d.f27484d;
        if (dVar != null) {
            Result.Companion companion = Result.Companion;
            if (!booleanValue) {
                str = null;
            }
            dVar.resumeWith(Result.m168114constructorimpl(str));
        }
        this.f29465d.f27484d = null;
        return C13598b0.f38549a;
    }
}
