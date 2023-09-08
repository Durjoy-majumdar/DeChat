package com.tencent.p014mm.plugin.webview.webcompt;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.webview.webcompt.w */
public final class C6612w {
    /* renamed from: a */
    public static final MultiProcessMMKV m6920a() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("__webcompt_command");
        C87412m.m108593f(mmkv, "getMMKV(\"__webcompt_command\")");
        return mmkv;
    }

    /* renamed from: b */
    public static final void m6921b(String str) {
        if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG || (Log.getLogLevel() == 0 && WeChatEnvironment.hasDebugger())) {
            MMHandlerThread.postToMainThread(new C6611v(str));
        }
        Log.m105924i("WebComptCommand", str);
    }
}
