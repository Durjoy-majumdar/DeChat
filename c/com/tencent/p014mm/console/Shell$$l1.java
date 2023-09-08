package com.tencent.p014mm.console;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import p147ea.C31441e;

/* renamed from: com.tencent.mm.console.Shell$$l1 */
public class Shell$$l1 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        int i;
        Class cls = C31441e.class;
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            String stringExtra = intent.getStringExtra("enable");
            if (TextUtils.isEmpty(stringExtra)) {
                Log.m105925i("MicroMsg.Shell", "FINDER_SUPPORT_FIND_PAGE_LIVE: enabled: %s", Integer.valueOf(((C31441e) C86312j.m106911c(cls)).mo58173hm()));
                return;
            }
            try {
                i = Integer.parseInt(stringExtra);
            } catch (Throwable unused) {
                i = -1;
            }
            if (i == 0 || i == 1) {
                ((C31441e) C86312j.m106911c(cls)).mo58172IW(i);
                Log.m105925i("MicroMsg.Shell", "FINDER_SUPPORT_FIND_PAGE_LIVE: status updated, enabled: %s", Integer.valueOf(((C31441e) C86312j.m106911c(cls)).mo58173hm()));
                return;
            }
            Log.m105920e("MicroMsg.Shell", "FINDER_SUPPORT_FIND_PAGE_LIVE, bad args, use 0 for disable an 1 for enable.");
            return;
        }
        Log.m105920e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
    }
}
