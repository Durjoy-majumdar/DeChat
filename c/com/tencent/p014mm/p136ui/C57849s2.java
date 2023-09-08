package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.ui.s2 */
public class C57849s2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MainTabUnreadMgr f165482d;

    public C57849s2(MainTabUnreadMgr mainTabUnreadMgr) {
        this.f165482d = mainTabUnreadMgr;
    }

    public void run() {
        MainTabUnreadMgr mainTabUnreadMgr = this.f165482d;
        mainTabUnreadMgr.f214455i = true;
        MMHandlerThread.removeRunnable(mainTabUnreadMgr.f214456j);
        MMHandlerThread.postToMainThreadDelayed(this.f165482d.f214456j, 300);
    }
}
