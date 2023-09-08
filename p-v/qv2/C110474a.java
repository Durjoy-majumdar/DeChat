package qv2;

import android.content.SharedPreferences;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.WCWebUpdater;
import op3.C117882j;
import p156gj.C107835h0;
import pv2.C77290d;
import tt3.C22552d;
import tt3.C22553e;
import tt3.C64998b;
import xb3.C15635h;

/* renamed from: qv2.a */
public class C110474a implements C64998b<C22552d> {

    /* renamed from: a */
    public final /* synthetic */ C110475b f330371a;

    public C110474a(C110475b bVar) {
        this.f330371a = bVar;
    }

    /* renamed from: a */
    public void mo24821a(C22553e eVar) {
        SharedPreferences defaultPreference;
        C22552d dVar = (C22552d) eVar;
        int i = 1;
        Log.m105925i("MicroMsg.SoterInitFunc", "alvinluo SoterInitFunc onResult errCode: %d, errMsg: %s", Integer.valueOf(dVar.f61886a), dVar.f61887b);
        if (dVar.mo34909a()) {
            Log.m105927v("MicroMsg.SoterInitFunc", "alvinluo resume %d", Long.valueOf(System.currentTimeMillis()));
            C110476d.f330374a = true;
            C110475b bVar = this.f330371a;
            bVar.getClass();
            SharedPreferences defaultPreference2 = MMApplicationContext.getDefaultPreference();
            if (defaultPreference2 != null) {
                bVar.f330373b = 1;
                defaultPreference2.edit().putBoolean("init_success", true).commit();
            }
            this.f330371a.f330372a.resume();
            return;
        }
        C77290d.m93105c(0, dVar.f61886a, 0);
        C110475b bVar2 = this.f330371a;
        if (bVar2.f330373b <= 0 && (defaultPreference = MMApplicationContext.getDefaultPreference()) != null) {
            if (!defaultPreference.getBoolean("init_success", false)) {
                i = 2;
            }
            bVar2.f330373b = i;
        }
        if (this.f330371a.f330373b == 2 && dVar.f61886a == 2 && C107835h0.f322851h.f322842a) {
            C115669n.INSTANCE.mo175911u(1104, 3);
            C15635h.f42265a.mo14380a(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, "1", "9999", "ever init success");
        }
        C110476d.f330374a = false;
        int i2 = dVar.f61886a;
        C110476d.f330375b = i2;
        this.f330371a.f330372a.mo72091a(C117882j.m166284c(Integer.valueOf(i2), dVar.f61887b));
    }
}
