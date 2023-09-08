package qj1;

import android.content.Context;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p565ir.C60606n;
import rx3.C13598b0;
import te3.C49352ez;
import te3.C49712hj1;

/* renamed from: qj1.mc */
public final class C12520mc extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12572oc f35986d;

    /* renamed from: e */
    public final /* synthetic */ C49352ez f35987e;

    /* renamed from: f */
    public final /* synthetic */ String f35988f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12520mc(C12572oc ocVar, C49352ez ezVar, String str) {
        super(0);
        this.f35986d = ocVar;
        this.f35987e = ezVar;
        this.f35988f = str;
    }

    public Object invoke() {
        C7335d c = C86312j.m106911c(C60606n.class);
        C87412m.m108593f(c, "getService(IFinderLiveFeatureService::class.java)");
        Context context = this.f35986d.f36076j.getContext();
        C87412m.m108593f(context, "root.context");
        C60606n.C60607a.m70859c((C60606n) c, context, this.f35987e, (C49712hj1) null, this.f35988f, "2", 4, (Object) null);
        return C13598b0.f38549a;
    }
}
