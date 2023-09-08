package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.h0 */
public class C29770h0 {

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.h0$a */
    public class C29771a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f80780d;

        public C29771a(String str) {
            this.f80780d = str;
        }

        public void run() {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) this.f80780d, 0).show();
        }
    }

    /* renamed from: a */
    public static void m38873a(String str, String str2) {
        if (Log.getLogLevel() == 0 && WeChatEnvironment.hasDebugger()) {
            MMHandlerThread.postToMainThread(new C29771a(str2));
        }
        Log.m105924i(str, str2);
    }
}
