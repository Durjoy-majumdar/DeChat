package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPrepareTask;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.j0 */
public class C83343j0 extends C83497u3 {

    /* renamed from: q */
    public final /* synthetic */ AppLaunchPrepareProcess f243545q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83343j0(AppLaunchPrepareProcess appLaunchPrepareProcess, String str, int i, String str2, String str3, int i2, WxaAttributes.WxaVersionInfo wxaVersionInfo, boolean z, ICommLibReader iCommLibReader, QualitySession qualitySession, C80247h hVar, boolean z2) {
        super(str, i, str2, str3, i2, wxaVersionInfo, z, iCommLibReader, qualitySession, hVar, z2);
        AppLaunchPrepareProcess appLaunchPrepareProcess2 = appLaunchPrepareProcess;
        this.f243545q = appLaunchPrepareProcess2;
        boolean z3 = appLaunchPrepareProcess2.f243274y;
        C83362l1 l1Var = this.f243969n;
        if (l1Var instanceof C83399o2) {
            ((C83399o2) l1Var).f243686q = z3;
        }
        mo115733g(appLaunchPrepareProcess.mo115519d());
    }

    /* renamed from: i */
    public void mo115623i(int i) {
        if (this.f243545q.f243257g != null) {
            C83483u uVar = (C83483u) this.f243545q.f243257g;
            if (uVar.f243928d != null) {
                AppBrandPrepareTask.PrepareResult prepareResult = new AppBrandPrepareTask.PrepareResult();
                prepareResult.f243189h = i;
                prepareResult.f243185d = AppBrandPrepareTask.C83254d.EVENT_DOWNLOAD_PROGRESS;
                uVar.f243928d.mo894a(prepareResult);
            }
        }
    }

    /* renamed from: j */
    public void mo115624j() {
        super.mo115624j();
        AppLaunchPrepareProcess appLaunchPrepareProcess = this.f243545q;
        Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "preDownload, appId %s, versionType %d", appLaunchPrepareProcess.f243263p, Integer.valueOf(appLaunchPrepareProcess.f243265q));
        appLaunchPrepareProcess.f243261n = Util.nowMilliSecond();
        if (appLaunchPrepareProcess.f243257g != null) {
            C83483u uVar = (C83483u) appLaunchPrepareProcess.f243257g;
            if (uVar.f243928d != null) {
                AppBrandPrepareTask.PrepareResult prepareResult = new AppBrandPrepareTask.PrepareResult();
                prepareResult.f243185d = AppBrandPrepareTask.C83254d.EVENT_NEED_DOWNLOAD;
                prepareResult.f243190i = Util.nowMilliSecond();
                uVar.f243928d.mo894a(prepareResult);
            }
        }
    }
}
