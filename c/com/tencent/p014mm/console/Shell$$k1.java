package com.tencent.p014mm.console;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import p565ir.C33392p;

/* renamed from: com.tencent.mm.console.Shell$$k1 */
public class Shell$$k1 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            ((C33392p) C86312j.m106911c(C33392p.class)).No0(intent);
        } else {
            Log.m105920e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
        }
    }
}
