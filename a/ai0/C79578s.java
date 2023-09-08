package ai0;

import com.tencent.p014mm.autogen.mmdata.rpt.AppBrandSplashAdWorkerReportStruct;
import com.tencent.p014mm.plugin.appbrand.C83195k3;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kr0.C88267e;
import rx3.C13604l;

/* renamed from: ai0.s */
public class C79578s implements C83195k3 {

    /* renamed from: a */
    public final /* synthetic */ AppBrandSplashAdWorkerReportStruct f233354a;

    /* renamed from: b */
    public final /* synthetic */ long f233355b;

    /* renamed from: c */
    public final /* synthetic */ C79575q f233356c;

    public C79578s(C79575q qVar, AppBrandSplashAdWorkerReportStruct appBrandSplashAdWorkerReportStruct, long j) {
        this.f233356c = qVar;
        this.f233354a = appBrandSplashAdWorkerReportStruct;
        this.f233355b = j;
    }

    /* renamed from: a */
    public void mo109680a(C40482o oVar, C13604l<Long, Long> lVar, String str) {
        Log.m105924i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "sendShouldShowAdWhenLaunchIfNeed, [not preload] ad worker is ready");
        if (oVar != null) {
            C79575q qVar = this.f233356c;
            C88267e eVar = (C88267e) qVar.f233333d.f239166f;
            qVar.f233332c = eVar;
            qVar.mo109691j(oVar, eVar, qVar.f233331b);
            if (C79570o.m96623c(this.f233356c.f233331b) != null) {
                C79570o.m96623c(this.f233356c.f233331b).f236357q = ((Long) lVar.f38556e).longValue() - ((Long) lVar.f38555d).longValue();
            }
            this.f233356c.mo109685c(lVar, this.f233354a, 0, Util.nowMilliSecond() - this.f233355b, "");
        } else {
            C79575q qVar2 = this.f233356c;
            Long l = -1L;
            Long l2 = -1L;
            AppBrandSplashAdWorkerReportStruct appBrandSplashAdWorkerReportStruct = this.f233354a;
            qVar2.getClass();
            appBrandSplashAdWorkerReportStruct.f236347g = l.longValue();
            appBrandSplashAdWorkerReportStruct.f236348h = l2.longValue();
            appBrandSplashAdWorkerReportStruct.f236350j = (long) 0;
            appBrandSplashAdWorkerReportStruct.f236351k = Util.nowMilliSecond() - this.f233355b;
            if (str == null) {
                str = "";
            }
            appBrandSplashAdWorkerReportStruct.f236353m = appBrandSplashAdWorkerReportStruct.mo86045b("AdWorkerCreateFailErrorMsg", str, true);
            appBrandSplashAdWorkerReportStruct.mo86054n();
        }
        C79570o.m96621a(this.f233356c.f233331b).f233271e = Util.nowMilliSecond() - this.f233355b;
    }
}
