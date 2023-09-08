package com.tencent.p014mm.console;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import p705tw.C37284b;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.console.Shell$$z */
public class Shell$$z implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            String stringExtra = intent.getStringExtra("fetch_base_id");
            if (TextUtils.isEmpty(stringExtra)) {
                Log.m105920e("MicroMsg.Shell", "base id is empty, abort");
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "base id is empty, abort", 1).show();
                return;
            }
            Log.m105924i("MicroMsg.Shell", "#RECOVERY_FETCH_PATCH, baseId = " + stringExtra);
            ((C37284b) C86312j.m106911c(C37284b.class)).Zq0(MMApplicationContext.getContext(), stringExtra);
            return;
        }
        Log.m105920e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
    }
}
