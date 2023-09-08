package qv2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import hp3.C87581a;
import lp3.C46888b;
import lp3.C88643g;
import lt3.C21460a;
import op3.C117882j;
import ot3.C117897l;
import pv2.C110259i;
import rt3.C22252b;

/* renamed from: qv2.h */
public class C110478h implements C87581a<Boolean, Boolean> {

    /* renamed from: a */
    public C46888b f330377a = null;

    public Object call(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f330377a = C88643g.m110544b();
        Log.m105927v("MicroMsg.SoterSaveDeviceInfoFunc", "alvinluo isNeedSaveDeviceInfo: %b", bool);
        if (!C22252b.m25806c()) {
            Log.m105928w("MicroMsg.SoterSaveDeviceInfoFunc", "alvinluo not support soter");
            this.f330377a.mo72091a(C117882j.m166284c(2, "not support soter"));
            return Boolean.TRUE;
        } else if (!bool.booleanValue()) {
            return Boolean.TRUE;
        } else {
            C110259i.m149876c();
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath());
            if (mmkv != null) {
                String string = mmkv.getString("cpu_id", (String) null);
                String string2 = mmkv.getString("uid", (String) null);
                Log.m105925i("MicroMsg.SoterDeviceInfoManager", "alvinluo old cpuId: %s, old uid: %s", string, string2);
                C117897l c = C21460a.m24269c();
                if (c != null) {
                    String str = c.f352426c;
                    String valueOf = String.valueOf(c.f352425b);
                    Log.m105925i("MicroMsg.SoterDeviceInfoManager", "new cpuid: %s, uid: %s", str, valueOf);
                    if (str.equals(string) && !valueOf.equals(string2)) {
                        C115669n.INSTANCE.mo175911u(1104, 20);
                    }
                    if (string2 != null && string2.equals("0")) {
                        C115669n.INSTANCE.mo175911u(1104, 21);
                    }
                    if ("0".equals(valueOf) && !Util.isNullOrNil(str)) {
                        C115669n.INSTANCE.mo175911u(1104, 32);
                    }
                    if (!Util.isNullOrNil(str) && !Util.isNullOrNil(valueOf)) {
                        C110259i.m149875b(str, valueOf);
                    }
                    C115669n.INSTANCE.mo175911u(1104, 22);
                }
            }
            return Boolean.TRUE;
        }
    }
}
