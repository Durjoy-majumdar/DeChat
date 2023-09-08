package mr1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import mr1.C25026b;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: mr1.h */
public final class C25039h extends C87413o implements C32226l<C25026b.C25033c, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f71459d;

    /* renamed from: e */
    public final /* synthetic */ C25026b.C25027a f71460e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25039h(String str, C25026b.C25027a aVar) {
        super(1);
        this.f71459d = str;
        this.f71460e = aVar;
    }

    public Object invoke(Object obj) {
        C25026b.C25033c cVar = (C25026b.C25033c) obj;
        C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
        C61926c.m72661F("FinderNetworkFlowReport_Thread", new C25038g(cVar, this.f71459d, this.f71460e));
        return C13598b0.f38549a;
    }
}
