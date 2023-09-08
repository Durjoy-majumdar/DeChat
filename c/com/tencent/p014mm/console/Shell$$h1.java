package com.tencent.p014mm.console;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import p487da.C31099b;

/* renamed from: com.tencent.mm.console.Shell$$h1 */
public class Shell$$h1 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        int i;
        Class cls = C31099b.class;
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            String stringExtra = intent.getStringExtra("enable");
            if (TextUtils.isEmpty(stringExtra)) {
                Log.m105925i("MicroMsg.Shell", "FINDER_LIVE_NEW_ENTRANCE: enabled: %s", Integer.valueOf(((C31099b) C86312j.m106911c(cls)).X70()));
                return;
            }
            try {
                i = Integer.parseInt(stringExtra);
            } catch (Throwable unused) {
                i = -1;
            }
            if (i == 0 || i == 1) {
                ((C31099b) C86312j.m106911c(cls)).Tu0(i == 0 ? 1 : 0);
                Log.m105925i("MicroMsg.Shell", "FINDER_LIVE_NEW_ENTRANCE: status updated, enabled: %s", Integer.valueOf(((C31099b) C86312j.m106911c(cls)).X70()));
                return;
            }
            Log.m105920e("MicroMsg.Shell", "FINDER_LIVE_NEW_ENTRANCE, bad args, use 0 for disable an 1 for enable.");
            return;
        }
        Log.m105920e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
    }
}
