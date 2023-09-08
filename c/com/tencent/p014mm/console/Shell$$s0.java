package com.tencent.p014mm.console;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import eb0.C116734h6;

/* renamed from: com.tencent.mm.console.Shell$$s0 */
public class Shell$$s0 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            Log.m105924i("MicroMsg.Shell", "#BRANDS_CLEAR");
            MultiProcessMMKV s = C116734h6.m164663s("xagreement_test_configs");
            if (s != null) {
                s.clearAll();
            }
            C116734h6.C31472g.f84195a = -1;
            C116734h6.m164664t(C116734h6.m164647c());
            C116734h6.C31472g.m39419a();
            return;
        }
        Log.m105920e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
    }
}
