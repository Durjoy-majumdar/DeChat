package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.p136ui.MainTabUnreadMgr;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.ui.p2 */
public class C74808p2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MainTabUnreadMgr.C730872 f219941d;

    public C74808p2(MainTabUnreadMgr.C730872 r1) {
        this.f219941d = r1;
    }

    public void run() {
        MainTabUnreadMgr mainTabUnreadMgr = MainTabUnreadMgr.this;
        mainTabUnreadMgr.f214455i = true;
        MMHandlerThread.removeRunnable(mainTabUnreadMgr.f214456j);
        MMHandlerThread.postToMainThread(MainTabUnreadMgr.this.f214456j);
    }
}
