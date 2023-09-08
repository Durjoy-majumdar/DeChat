package p150eo;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86174d;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import k10.C88059h;
import p150eo.C86596j;
import rx3.C13598b0;

/* renamed from: eo.k */
public final class C86601k extends C87413o implements C32226l<C88059h.C88060a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C86174d<?> f251548d;

    /* renamed from: e */
    public final /* synthetic */ C86596j.C86599c f251549e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<String> f251550f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86601k(C86174d<?> dVar, C86596j.C86599c cVar, C8479f0<String> f0Var) {
        super(1);
        this.f251548d = dVar;
        this.f251549e = cVar;
        this.f251550f = f0Var;
    }

    public Object invoke(Object obj) {
        C88059h.C88060a aVar = (C88059h.C88060a) obj;
        C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
        C86174d<?> dVar = this.f251548d;
        C86596j.C86599c cVar = this.f251549e;
        int longValue = (int) aVar.f254709a.longValue();
        String str = aVar.f254710b;
        C87412m.m108593f(str, "it.errMsg");
        C86174d.C86175a.m106688a(dVar, cVar.mo121043g(longValue, str), (Object) null, 2, (Object) null);
        Log.m105924i("MicroMsg.MagicBrandBaseBiz", ((String) this.f251550f.f27484d) + " errCode:" + ((int) aVar.f254709a.longValue()) + ",errMsg:" + aVar.f254710b);
        return C13598b0.f38549a;
    }
}
