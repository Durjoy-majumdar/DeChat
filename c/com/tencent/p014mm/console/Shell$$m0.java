package com.tencent.p014mm.console;

import android.content.Intent;
import android.os.Handler;
import android.util.Base64;
import com.tencent.p014mm.plugin.appbrand.debugger.C29480i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;

/* renamed from: com.tencent.mm.console.Shell$$m0 */
public class Shell$$m0 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        if (!WeChatEnvironment.hasDebugger() && !WeChatEnvironment.isMonkeyEnv()) {
            Log.m105920e("MicroMsg.Shell", "OpenWeApp not coolassist or monkey env, disable hprof dump cmd.");
        } else if (MMApplicationContext.isMMProcess()) {
            String stringExtra = intent.getStringExtra("kContent");
            if (!Util.isNullOrNil(stringExtra)) {
                new Handler().postDelayed(new Shell$$m0$$a(), 10000);
                String str = new String(Base64.decode(stringExtra, 0));
                C29480i iVar = (C29480i) C86312j.m106911c(C29480i.class);
                if (iVar != null) {
                    iVar.mo56727Op(MMApplicationContext.getContext(), str);
                }
            }
        }
    }
}
