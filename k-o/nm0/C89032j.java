package nm0;

import com.tencent.p014mm.plugin.appbrand.report.C84134l0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;

/* renamed from: nm0.j */
public class C89032j extends C89031i {
    static {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_wxa_batch_idkey_report_use_new_impl, 0);
        Log.m105925i("MicroMsg.JsApiReportRealtimeActionWC", "IMPL() exptVal=%d", Integer.valueOf(Qe));
        if (Qe > 0 || BuildInfo.DEBUG) {
            C84134l0.C84135a.f245612a = new j$$a();
        } else {
            C84134l0.C84135a.f245612a = new j$$b(new j$$c());
        }
    }
}
