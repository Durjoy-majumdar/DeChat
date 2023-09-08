package p284zb;

import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;
import com.tencent.p014mm.sdk.platformtools.Log;
import p774zg.C39348q0;

/* renamed from: zb.d$$j */
public class d$$j implements C84754j1.C84756b {

    /* renamed from: a */
    public final /* synthetic */ long f262562a;

    /* renamed from: b */
    public final /* synthetic */ boolean f262563b;

    /* renamed from: c */
    public final /* synthetic */ C91633d f262564c;

    public d$$j(C91633d dVar, long j, boolean z) {
        this.f262564c = dVar;
        this.f262562a = j;
        this.f262563b = z;
    }

    /* renamed from: b */
    public void mo114825b(String str) {
        Log.m105920e("Luggage.AppBrandMiniProgramServiceLogicImp", "Inject EnvBootstrapScript Script Failed");
    }

    public void onSuccess(String str) {
        Log.m105924i("Luggage.AppBrandMiniProgramServiceLogicImp", "Inject EnvBootstrapScript Script Success");
        boolean z = this.f262563b;
        C39348q0.m42097c(3, System.currentTimeMillis() - this.f262562a, z ? 1 : 0, ((C91635f) this.f262564c.mo124764Z()).getAppId(), -1, 0, ((C91635f) this.f262564c.mo124764Z()).mo114272k().mo113371a());
    }
}
