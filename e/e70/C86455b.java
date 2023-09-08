package e70;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import d42.C86174d;
import e42.C31415g;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import k10.C88059h;
import rx3.C13598b0;

/* renamed from: e70.b */
public final class C86455b extends C87413o implements C32226l<C88059h.C88060a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C86174d<?> f251250d;

    /* renamed from: e */
    public final /* synthetic */ C86457d f251251e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86455b(C86174d<?> dVar, C86457d dVar2) {
        super(1);
        this.f251250d = dVar;
        this.f251251e = dVar2;
    }

    public Object invoke(Object obj) {
        C88059h.C88060a aVar = (C88059h.C88060a) obj;
        C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
        C86174d<?> dVar = this.f251250d;
        C86457d dVar2 = this.f251251e;
        int longValue = (int) aVar.f254709a.longValue();
        String str = aVar.f254710b;
        C87412m.m108593f(str, "it.errMsg");
        dVar2.getClass();
        C31415g gVar = C31415g.C7595b.f25862a;
        if (longValue != 0) {
            gVar = new C31415g(4, "fail:internal error" + "bizErrCode: " + longValue + ", bizErrCode:" + str);
        }
        C86174d.C86175a.m106688a(dVar, gVar, (Object) null, 2, (Object) null);
        return C13598b0.f38549a;
    }
}
