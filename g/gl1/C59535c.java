package gl1;

import al1.C0079b;
import b50.C54424j;
import com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C55529k;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58704c5;
import er1.C58728f5;
import fj1.C45795b;
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: gl1.c */
public final class C59535c extends C87413o implements C32230s<Boolean, Integer, Integer, String, C0079b, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59547g f170164d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59535c(C59547g gVar) {
        super(5);
        this.f170164d = gVar;
    }

    /* renamed from: D */
    public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        C0079b bVar = (C0079b) obj5;
        C87412m.m108594g((String) obj4, "errMsg");
        C61926c.m72668M(new C59532b(booleanValue, bVar, this.f170164d, intValue));
        String str = this.f170164d.f170180j;
        Log.m105924i(str, "finish live result:" + booleanValue + ',' + bVar);
        if (booleanValue) {
            C58704c5 c5Var = C58704c5.f168044a;
            if (C58704c5.C58705a.f168049b == 3) {
                C58704c5.C58705a.f168049b = 0;
                C115669n.INSTANCE.mo175912v(C58704c5.f168047d, 1140);
            } else {
                Log.m105924i("Finder.LiveAnchorFlowStats", "reportExternalManualClose but not record live!");
            }
            C58728f5 f5Var = C58728f5.f168144a;
            C45795b bVar2 = this.f170164d.f166851d;
            f5Var.mo83645b(bVar2, C55529k.CTRL_INDEX, 0, "externalManualClose", "0-vBitrate:" + C54424j.f152654c);
        }
        return C13598b0.f38549a;
    }
}
