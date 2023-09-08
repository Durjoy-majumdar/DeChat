package com.tencent.p014mm.console;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import zt3.C119157j;

/* renamed from: com.tencent.mm.console.Shell$$p1 */
public class Shell$$p1 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            ((C119157j) C119157j.f356862d).mo183884o(new Shell$$p1$$a());
            return;
        }
        Log.m105920e("MicroMsg.Shell", "not coolassist or monkey env, disable opengl dump cmd.");
    }
}
