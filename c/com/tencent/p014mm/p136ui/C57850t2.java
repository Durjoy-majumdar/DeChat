package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.ui.t2 */
public class C57850t2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MainTabUnreadMgr f165483d;

    public C57850t2(MainTabUnreadMgr mainTabUnreadMgr) {
        this.f165483d = mainTabUnreadMgr;
    }

    public void run() {
        if (this.f165483d.f214455i) {
            Log.m105924i("MicroMsg.LauncherUI.MainTabUnreadMgr", "remove setTagRunnable");
            MMHandlerThread.removeRunnable(this.f165483d.f214456j);
        }
    }
}
