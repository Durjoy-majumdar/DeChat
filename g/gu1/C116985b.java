package gu1;

import a10.C112725w;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: gu1.b */
public final class C116985b extends C87413o implements C32226l<C112725w, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C116989f f350551d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116985b(C116989f fVar) {
        super(1);
        this.f350551d = fVar;
    }

    public Object invoke(Object obj) {
        C112725w wVar = (C112725w) obj;
        C87412m.m108594g(wVar, LocaleUtil.ITALIAN);
        this.f350551d.f350561f.add(wVar.f337501b);
        this.f350551d.mo180957a();
        wVar.f337501b.addEngineLifecycleListener(new C116984a(this.f350551d, wVar));
        return C13598b0.f38549a;
    }
}
