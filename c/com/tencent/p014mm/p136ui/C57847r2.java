package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.ui.r2 */
public class C57847r2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MainTabUnreadMgr f165476d;

    public C57847r2(MainTabUnreadMgr mainTabUnreadMgr) {
        this.f165476d = mainTabUnreadMgr;
    }

    public void run() {
        MainTabUnreadMgr mainTabUnreadMgr = this.f165476d;
        mainTabUnreadMgr.f214455i = true;
        MMHandlerThread.removeRunnable(mainTabUnreadMgr.f214456j);
        MMHandlerThread.postToMainThread(this.f165476d.f214456j);
    }
}
