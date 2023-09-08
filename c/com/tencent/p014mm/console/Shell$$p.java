package com.tencent.p014mm.console;

import android.content.Intent;
import ce2.C28544a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.console.Shell$$p */
public class Shell$$p implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            C28544a.INSTANCE.mo56047c("<cmd><diagnostic><MemoryHook enable='0' source='push' enableExpt='0' force='1'/></diagnostic></cmd>");
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "Hook Disable", 0).show();
            return;
        }
        Log.m105920e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
    }
}
