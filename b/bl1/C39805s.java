package bl1;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import sx3.C26236u;

/* renamed from: bl1.s */
public final class C39805s extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C39786k f106811d;

    /* renamed from: e */
    public final /* synthetic */ String f106812e;

    /* renamed from: f */
    public final /* synthetic */ C39775b f106813f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39805s(C39786k kVar, String str, C39775b bVar) {
        super(0);
        this.f106811d = kVar;
        this.f106812e = str;
        this.f106813f = bVar;
    }

    public Object invoke() {
        C39807u d = this.f106811d.mo62413d(this.f106812e);
        if (d != null) {
            C39786k.m42575a(this.f106811d, "post", C26236u.m33719b(this.f106813f), d.f106817d, d, this.f106811d.f106765d.get(this.f106812e));
        }
        return C13598b0.f38549a;
    }
}
