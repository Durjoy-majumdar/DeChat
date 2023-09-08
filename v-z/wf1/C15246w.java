package wf1;

import a14.C0000n0;
import bi1.C0287e;
import bi1.C0288f;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import kotlin.ResultKt;
import o40.C61937h;
import rx3.C13598b0;
import te3.C51084rb1;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.ui.uic.FinderLiveGiftPkgUIC$makeOrder$$inlined$success$default$1", mo125469f = "FinderLiveGiftPkgUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: wf1.w */
public final class C15246w extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C0287e f41480d;

    /* renamed from: e */
    public final /* synthetic */ C15193l f41481e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0 f41482f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15246w(C0287e eVar, C15601d dVar, C15193l lVar, C8479f0 f0Var) {
        super(2, dVar);
        this.f41480d = eVar;
        this.f41481e = lVar;
        this.f41482f = f0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15246w(this.f41480d, dVar, this.f41481e, this.f41482f);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15246w) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        T t = (C51084rb1) ((C0288f) this.f41480d).f855b;
        String str = this.f41481e.f41381d;
        StringBuilder sb = new StringBuilder();
        sb.append("[FinderMakePackageOrderRequest] sucess, pb = ");
        C87412m.m108593f(t, LocaleUtil.ITALIAN);
        sb.append(C61937h.m72709h(t));
        Log.m105924i(str, sb.toString());
        this.f41482f.f27484d = t;
        return C13598b0.f38549a;
    }
}
