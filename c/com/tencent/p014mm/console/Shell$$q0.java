package com.tencent.p014mm.console;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import eb0.C116734h6;

/* renamed from: com.tencent.mm.console.Shell$$q0 */
public class Shell$$q0 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                Log.m105920e("MicroMsg.Shell", "extras is null");
                return;
            }
            int parseInt = Integer.parseInt(String.valueOf(extras.get("set_xid")));
            Log.m105924i("MicroMsg.Shell", "#BRANDS_XID, set_xid = " + parseInt);
            if (parseInt >= 0) {
                MultiProcessMMKV s = C116734h6.m164663s("xagreement_test_configs");
                if (s != null) {
                    s.putInt("test_xagreement_id", parseInt).commit();
                }
                C116734h6.C31472g.m39419a();
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
    }
}
