package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import p787ai.C79547b;

/* renamed from: com.tencent.mm.ui.q2 */
public class C57846q2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MainTabUnreadMgr f165475d;

    public C57846q2(MainTabUnreadMgr mainTabUnreadMgr) {
        this.f165475d = mainTabUnreadMgr;
    }

    public void run() {
        MainTabUnreadMgr mainTabUnreadMgr = this.f165475d;
        mainTabUnreadMgr.getClass();
        MMHandlerThread.postToMainThread(new C57845o2(mainTabUnreadMgr));
        MainTabUnreadMgr mainTabUnreadMgr2 = this.f165475d;
        mainTabUnreadMgr2.getClass();
        C79547b.f233255g.mo109607a(new C57847r2(mainTabUnreadMgr2));
        MainTabUnreadMgr.m86008a(this.f165475d);
    }
}
