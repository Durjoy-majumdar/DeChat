package com.tencent.p014mm.p136ui.conversation;

import com.tencent.p014mm.autogen.events.APPHasInitEvent;
import com.tencent.p014mm.plugin.report.service.C85405m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.ui.conversation.n2 */
public class C57830n2 implements Runnable {

    /* renamed from: com.tencent.mm.ui.conversation.n2$a */
    public class C57831a implements Runnable {
        public C57831a(C57830n2 n2Var) {
        }

        public void run() {
            Log.m105924i("MicroMsg.RefreshHelper", "APPHasInitEvent begin");
            new APPHasInitEvent().publish();
        }
    }

    public C57830n2(C74739q2 q2Var) {
    }

    public void run() {
        if (!MMApplicationContext.isAppHasInit()) {
            MMApplicationContext.setAppHasInitFlag(true);
            MMHandlerThread.postToMainThreadDelayed(new C57831a(this), 100);
        }
        C85405m.m105412b(8);
    }
}
