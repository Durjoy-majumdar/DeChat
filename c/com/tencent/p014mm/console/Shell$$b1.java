package com.tencent.p014mm.console;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import p565ir.C60606n;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.console.Shell$$b1 */
public class Shell$$b1 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            int safeParseInt = Util.safeParseInt(intent.getStringExtra("seek"));
            Context context = MMApplicationContext.getContext();
            C76701a.makeText(context, (CharSequence) "美妆值: " + safeParseInt, 1).show();
            ((C60606n) C86312j.m106911c(C60606n.class)).mo85044Xi(safeParseInt);
            return;
        }
        Log.m105920e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
    }
}
