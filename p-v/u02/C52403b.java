package u02;

import android.view.View;
import b63.C39736t0;
import com.tencent.p014mm.plugin.honey_pay.p063ui.HoneyPayCardManagerUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import ie3.C76331i;
import java.util.HashMap;
import te3.C49546gd3;
import v53.C78342e0;

/* renamed from: u02.b */
public class C52403b extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ HoneyPayCardManagerUI f146479g;

    public C52403b(HoneyPayCardManagerUI honeyPayCardManagerUI) {
        this.f146479g = honeyPayCardManagerUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        HoneyPayCardManagerUI honeyPayCardManagerUI = this.f146479g;
        C49546gd3 gd32 = honeyPayCardManagerUI.f114752H;
        if (gd32 != null) {
            Log.m105919d(honeyPayCardManagerUI.f114712d, "click pay way: %s", Boolean.valueOf(gd32.f133980i));
            if (Util.isNullOrNil(this.f146479g.f114756L)) {
                HoneyPayCardManagerUI honeyPayCardManagerUI2 = this.f146479g;
                Log.m105924i(honeyPayCardManagerUI2.f114712d, "show select payway dialog");
                honeyPayCardManagerUI2.showLoading();
                C39736t0.C39737a aVar = honeyPayCardManagerUI2.f114764U;
                if (aVar != null) {
                    C39736t0.f106613d.mo62367d(aVar);
                }
                C39736t0.C39737a aVar2 = new C39736t0.C39737a(26, false, true, new C52408g(honeyPayCardManagerUI2));
                honeyPayCardManagerUI2.f114764U = aVar2;
                C39736t0 t0Var = C39736t0.f106613d;
                Log.m105924i("MicroMsg.WcPayBindQueryDataFetcher", "fetch bind query data: " + aVar2);
                if (aVar2.f106616b) {
                    aVar2.f106618d.invoke(t0Var.mo62364a(aVar2.f106615a, (C78342e0) null, C39736t0.C39739c.Cache, true));
                    if (aVar2.f106617c) {
                        t0Var.mo62365b(aVar2);
                    }
                } else {
                    t0Var.mo62365b(aVar2);
                }
                C115669n.INSTANCE.mo160131h(15191, 0, 0, 1, 0, 0, 0);
                return;
            }
            HoneyPayCardManagerUI honeyPayCardManagerUI3 = this.f146479g;
            int hashCode = honeyPayCardManagerUI3.hashCode() & 65535;
            Log.m105925i(honeyPayCardManagerUI3.f114712d, "show kinda select payment, requestCode:%d", Integer.valueOf(hashCode));
            HashMap hashMap = new HashMap();
            hashMap.put("appId", honeyPayCardManagerUI3.f114754J);
            hashMap.put("sessionId", honeyPayCardManagerUI3.f114756L);
            C76331i.m91763g(honeyPayCardManagerUI3, "selectPayment", hashMap, hashCode, new C52406e(honeyPayCardManagerUI3, hashCode));
        }
    }
}
