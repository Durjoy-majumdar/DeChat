package vm2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import f62.C31924c1;
import java.util.Map;
import ob0.C35136m;

/* renamed from: vm2.r */
public class C14909r implements C31924c1 {
    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        if (map != null) {
            String str2 = map.get(".sysmsg.UseSm4GcmConfig.switch");
            boolean z = false;
            Log.m105925i("UseSm4GcmConfig", "sm4gcm values:%s", str2);
            int i = Util.getInt(str2, 0);
            MultiProcessMMKV multiProcessMMKV = MultiProcessMMKV.getDefault();
            if (i == 1) {
                z = true;
            }
            multiProcessMMKV.putBoolean("SM4GCM_SWITCH", z);
            C115669n.INSTANCE.idkeyStat(1934, i == 1 ? 6 : 7, 1, false);
        }
    }
}
