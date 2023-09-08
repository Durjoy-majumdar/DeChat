package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: cj1.f1 */
public final class C0536f1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C0540g1 f1300d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0536f1(C0540g1 g1Var) {
        super(0);
        this.f1300d = g1Var;
    }

    public Object invoke() {
        Log.m105924i("Finder.FinderLiveCommentStickyHelper", "checkSticky undo sticky");
        C0540g1 g1Var = this.f1300d;
        g1Var.f1314e = false;
        C32227p<? super Integer, ? super Boolean, C13598b0> pVar = g1Var.f1317h;
        if (pVar != null) {
            pVar.invoke(Integer.valueOf(g1Var.f1312c), Boolean.FALSE);
        }
        return C13598b0.f38549a;
    }
}
