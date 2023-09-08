package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;

/* renamed from: com.tencent.mm.ui.o2 */
public class C57845o2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MainTabUnreadMgr f165474d;

    public C57845o2(MainTabUnreadMgr mainTabUnreadMgr) {
        this.f165474d = mainTabUnreadMgr;
    }

    public void run() {
        int i;
        if (!C97625j3.m125811a()) {
            Log.m105928w("MicroMsg.UnreadCountHelper", "getAddrTabUnreadCount, but mmcore not ready");
            i = 0;
        } else {
            i = Util.nullAsNil((Integer) C97625j3.m125812b().mo105906u().mo119684e(143618, (Object) null));
        }
        C74809q qVar = this.f165474d.f214453g;
        if (qVar != null) {
            ((LauncherUIBottomTabView) qVar).mo101400h(i);
        }
    }

    public String toString() {
        return super.toString() + "|setAddressTagUnread";
    }
}
