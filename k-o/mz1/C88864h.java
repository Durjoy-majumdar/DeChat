package mz1;

import c30.C104289g;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import p565ir.C60606n;
import p635os.C89291d;
import rx3.C13598b0;

@C86522b(dependencies = {C89291d.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: mz1.h */
public final class C88864h extends C86301e implements C88870s {

    /* renamed from: d */
    public C109651k f256318d;

    /* renamed from: e */
    public int f256319e;

    /* renamed from: f */
    public int f256320f;

    public final void vx0(boolean z) {
        C104289g gVar = new C104289g();
        gVar.put(ProviderConstants.API_PATH, "setCustomCaptureGLSyncMode");
        C104289g gVar2 = new C104289g();
        gVar2.mo145953n("mode", z ? 1 : 0);
        C13598b0 b0Var = C13598b0.f38549a;
        gVar.put("params", gVar2);
        ((C60606n) C86312j.m106911c(C60606n.class)).mo84989BR(gVar.toString());
    }
}
