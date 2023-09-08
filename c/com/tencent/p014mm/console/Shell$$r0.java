package com.tencent.p014mm.console;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import eb0.C116734h6;

/* renamed from: com.tencent.mm.console.Shell$$r0 */
public class Shell$$r0 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                Log.m105920e("MicroMsg.Shell", "extras is null");
                return;
            }
            Log.m105924i("MicroMsg.Shell", "#BRANDS_BIZ");
            for (String next : extras.keySet()) {
                if (next.startsWith("set_biz_") && next.length() > 8) {
                    String substring = next.substring(next.indexOf("set_biz_") + 8);
                    int parseInt = Integer.parseInt(String.valueOf(extras.get(next)));
                    Log.m105924i("MicroMsg.Shell", "#BRANDS_BIZ, set " + substring + " = " + parseInt);
                    MultiProcessMMKV s = C116734h6.m164663s("xagreement_test_configs");
                    if (s != null) {
                        s.putInt(substring, parseInt).commit();
                    }
                    C116734h6.C31472g.m39419a();
                }
            }
            return;
        }
        Log.m105920e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
    }
}
