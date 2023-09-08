package com.tencent.p014mm.console;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.console.Shell$$b0 */
public class Shell$$b0 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            String stringExtra = intent.getStringExtra("entry");
            Log.m105924i("MicroMsg.Shell", "#RECOVERY_EXERCISE_START_TIMER, entry = " + stringExtra);
            Context context = MMApplicationContext.getContext();
            C76701a.makeText(context, (CharSequence) "开启 Recovery 演练: " + stringExtra, 1).show();
            MMApplicationContext.getContext();
            return;
        }
        Log.m105920e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
    }
}
