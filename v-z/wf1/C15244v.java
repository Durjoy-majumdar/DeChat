package wf1;

import a14.C0000n0;
import a14.C53973z1;
import fy3.C32227p;
import gy3.C8479f0;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.uic.FinderLiveGiftPkgUIC$makeOrder$$inlined$finally$default$1", mo125469f = "FinderLiveGiftPkgUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: wf1.v */
public final class C15244v extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0 f41474d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0 f41475e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15244v(C15601d dVar, C8479f0 f0Var, C8479f0 f0Var2) {
        super(2, dVar);
        this.f41474d = f0Var;
        this.f41475e = f0Var2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15244v(dVar, this.f41474d, this.f41475e);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15244v) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C61926c.m72668M(new C15252z(this.f41475e));
        C53973z1.C53974a.m60623a((C53973z1) this.f41474d.f27484d, (CancellationException) null, 1, (Object) null);
        return C13598b0.f38549a;
    }
}
