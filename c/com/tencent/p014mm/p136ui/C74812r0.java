package com.tencent.p014mm.p136ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;

/* renamed from: com.tencent.mm.ui.r0 */
public class C74812r0 implements DialogInterface.OnClickListener {

    /* renamed from: com.tencent.mm.ui.r0$a */
    public class C74813a implements Runnable {
        public C74813a(C74812r0 r0Var) {
        }

        public void run() {
            C86709a0.m107528h().mo121099j("");
            MMAppMgr.m85988h(true);
        }
    }

    public C74812r0(GlobalAlertMgr globalAlertMgr) {
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        MMHandlerThread.postToMainThread(new C74813a(this));
    }
}
