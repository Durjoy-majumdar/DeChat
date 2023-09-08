package il1;

import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: il1.s */
public final class C9105s extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<C15601d<Boolean>> f28690d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9105s(C8479f0<C15601d<Boolean>> f0Var) {
        super(0);
        this.f28690d = f0Var;
    }

    public Object invoke() {
        C15601d dVar = (C15601d) this.f28690d.f27484d;
        if (dVar != null) {
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
        }
        this.f28690d.f27484d = null;
        return C13598b0.f38549a;
    }
}
