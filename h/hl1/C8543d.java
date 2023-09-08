package hl1;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.state.visitor.FinderLiveVisitorEndUIC$requestFinderLiveEndNav$$inlined$finally$default$1", mo125469f = "FinderLiveVisitorEndUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: hl1.d */
public final class C8543d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {
    public C8543d(C15601d dVar) {
        super(2, dVar);
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C8543d(dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        C0000n0 n0Var = (C0000n0) obj;
        return new C8543d((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        Log.m105924i("Finder.FinderLiveVisitorEndUIC", "#requestFinderLiveEndNav net finally");
        return C13598b0.f38549a;
    }
}
