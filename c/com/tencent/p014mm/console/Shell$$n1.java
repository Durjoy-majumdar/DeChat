package com.tencent.p014mm.console;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.xweb.XWebSdk;

/* renamed from: com.tencent.mm.console.Shell$$n1 */
public class Shell$$n1 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                Log.m105920e("MicroMsg.Shell", "extras is null");
            } else {
                XWebSdk.runCommand(extras);
            }
        } else {
            Log.m105920e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
        }
    }
}
