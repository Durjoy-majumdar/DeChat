package ai0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p170ic.C87692f;
import rx3.C13598b0;

/* renamed from: ai0.n */
public final class C79569n extends C87413o implements C32226l<C87692f, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f233320d;

    /* renamed from: e */
    public final /* synthetic */ C79570o f233321e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79569n(AppBrandRuntime appBrandRuntime, C79570o oVar) {
        super(1);
        this.f233320d = appBrandRuntime;
        this.f233321e = oVar;
    }

    public Object invoke(Object obj) {
        C87692f fVar = (C87692f) obj;
        C87412m.m108594g(fVar, "$this$lifecycle");
        fVar.mo122119a(new C79568m(this.f233320d, this.f233321e));
        return C13598b0.f38549a;
    }
}
