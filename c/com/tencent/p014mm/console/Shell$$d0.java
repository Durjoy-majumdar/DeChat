package com.tencent.p014mm.console;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import p757xv.C38850q;

/* renamed from: com.tencent.mm.console.Shell$$d0 */
public class Shell$$d0 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            ((C38850q) C86312j.m106911c(C38850q.class)).uu0(intent);
        } else {
            Log.m105920e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
        }
    }
}
