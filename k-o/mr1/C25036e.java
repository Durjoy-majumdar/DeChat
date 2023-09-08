package mr1;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import mr1.C25026b;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: mr1.e */
public final class C25036e extends C87413o implements C32226l<C25026b.C25033c, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C25026b.C25027a f71444d;

    /* renamed from: e */
    public final /* synthetic */ String f71445e;

    /* renamed from: f */
    public final /* synthetic */ C25026b f71446f;

    /* renamed from: g */
    public final /* synthetic */ boolean f71447g;

    /* renamed from: h */
    public final /* synthetic */ C25026b.C25029d f71448h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25036e(C25026b.C25027a aVar, String str, C25026b bVar, boolean z, C25026b.C25029d dVar) {
        super(1);
        this.f71444d = aVar;
        this.f71445e = str;
        this.f71446f = bVar;
        this.f71447g = z;
        this.f71448h = dVar;
    }

    public Object invoke(Object obj) {
        C25026b.C25033c cVar = (C25026b.C25033c) obj;
        C87412m.m108594g(cVar, "result");
        C61926c.m72661F("FinderNetworkFlowReport_Thread", new C25035d(this.f71444d, cVar, this.f71445e, this.f71446f, this.f71447g, this.f71448h));
        return C13598b0.f38549a;
    }
}
