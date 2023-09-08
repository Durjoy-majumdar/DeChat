package com.tencent.p014mm.console;

import android.content.Intent;
import ce2.C28544a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.console.Shell$$l */
public class Shell$$l implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            C28544a.INSTANCE.mo56047c("<cmd><diagnostic><MemoryHook enable='1' source='push' process='all' duration='24' hook='.*\\.so$' stack='1' min='0' max='0' force='1' enableExpt='0' sampling='1'/></diagnostic></cmd>");
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "Hook ALL .*\\.so", 0).show();
            return;
        }
        Log.m105920e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
    }
}
