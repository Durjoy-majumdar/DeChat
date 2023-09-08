package mr1;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import mr1.C25026b;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: mr1.l */
public final class C25043l extends C87413o implements C32226l<C25026b.C25033c, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f71472d;

    /* renamed from: e */
    public final /* synthetic */ C25026b.C25027a f71473e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25043l(String str, C25026b.C25027a aVar) {
        super(1);
        this.f71472d = str;
        this.f71473e = aVar;
    }

    public Object invoke(Object obj) {
        C25026b.C25033c cVar = (C25026b.C25033c) obj;
        C87412m.m108594g(cVar, "result");
        C61926c.m72661F("FinderNetworkFlowReport_Thread", new C25042k(cVar, this.f71472d, this.f71473e));
        return C13598b0.f38549a;
    }
}
