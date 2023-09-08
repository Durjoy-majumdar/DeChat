package mr1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import mr1.C25026b;
import p1081gi.C98121d;
import rx3.C13598b0;

/* renamed from: mr1.c */
public final class C25034c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C25026b f71435d;

    /* renamed from: e */
    public final /* synthetic */ String f71436e;

    /* renamed from: f */
    public final /* synthetic */ C98121d f71437f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25034c(C25026b bVar, String str, C98121d dVar) {
        super(0);
        this.f71435d = bVar;
        this.f71436e = str;
        this.f71437f = dVar;
    }

    public Object invoke() {
        C25026b bVar = this.f71435d;
        String str = this.f71436e;
        C98121d dVar = this.f71437f;
        C25026b.C25027a aVar = bVar.f71361b.get(str);
        if (aVar != null) {
            aVar.f71377J = true;
            long j = dVar.field_recvedBytes;
            aVar.f71375H = j;
            aVar.f71374G = aVar.f71373F + j;
            if (dVar.field_retCode == 0) {
                aVar.f71380M = true;
            }
            if (!aVar.f71381N) {
                bVar.mo52126c(j);
                C25026b.C25027a.f71367U.mo52140e(aVar, dVar);
            }
            Log.m105924i("FinderNetworkFlowReport", "PRERENDER_handleDownloaderComeStopStateInPreRender update:" + aVar.f71381N + ' ' + aVar.f71384Q + ' ' + str + " item:" + aVar);
            aVar.f71372E = true;
            if (aVar.f71376I) {
                bVar.f71361b.remove(str);
                bVar.mo52129f(aVar, "handleDownloaderComeStopStateInPreRender");
            }
        }
        return C13598b0.f38549a;
    }
}
