package c01;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import n80.C109697b;
import rx3.C13598b0;

/* renamed from: c01.l */
public final class C104220l extends C87413o implements C32226l<C109697b, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C104224p f308509d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104220l(C104224p pVar) {
        super(1);
        this.f308509d = pVar;
    }

    public Object invoke(Object obj) {
        C109697b bVar = (C109697b) obj;
        C87412m.m108594g(bVar, "$this$$receiver");
        C104224p.m139026a(this.f308509d, bVar);
        this.f308509d.f308516d = Util.currentTicks();
        bVar.f328347d = new C104218j(this.f308509d);
        bVar.f328348e = new C104219k(this.f308509d);
        Log.m105924i("MicroMsg.CastReportHelper", "markVideoEncodingUseAsync");
        C115669n.INSTANCE.mo175913w(1634, 13, 1);
        return C13598b0.f38549a;
    }
}
