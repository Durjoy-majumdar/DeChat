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

/* renamed from: eo.m */
public final class C86603m extends C87413o implements C32226l<C88059h.C88060a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C86174d<?> f251554d;

    /* renamed from: e */
    public final /* synthetic */ C86596j.C86599c f251555e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<String> f251556f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86603m(C86174d<?> dVar, C86596j.C86599c cVar, C8479f0<String> f0Var) {
        super(1);
        this.f251554d = dVar;
        this.f251555e = cVar;
        this.f251556f = f0Var;
    }

    public Object invoke(Object obj) {
        C88059h.C88060a aVar = (C88059h.C88060a) obj;
        C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
        C86174d<?> dVar = this.f251554d;
        String str = aVar.f254710b;
        C87412m.m108593f(str, "it.errMsg");
        C86174d.C86175a.m106688a(dVar, this.f251555e.mo121043g((int) aVar.f254709a.longValue(), str), (Object) null, 2, (Object) null);
        Log.m105924i("MicroMsg.MagicBrandBaseBiz", ((String) this.f251556f.f27484d) + " successs");
        return C13598b0.f38549a;
    }
}
