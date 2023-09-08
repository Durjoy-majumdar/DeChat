package com.tencent.p014mm.legacy.app;

import com.tencent.p014mm.legacy.app.WeChatSplashStartup;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.splash.C6707h;
import com.tencent.p014mm.splash.C85781g;

/* renamed from: com.tencent.mm.legacy.app.o */
public class C80969o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WeChatSplashStartup.C80945b f237824d;

    public C80969o(WeChatSplashStartup.C80945b bVar) {
        this.f237824d = bVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.WeChatSplashStartup", "Replay pending messages.");
        ((C6707h) this.f237824d.f237804a).getClass();
        C85781g.f249832j = true;
        if (C85781g.f249832j) {
            C85781g.m105955c("WxSplash.Splash", "pending early replay %s", Boolean.valueOf(C85781g.f249832j));
            C85781g.m105959g();
        }
    }
}
