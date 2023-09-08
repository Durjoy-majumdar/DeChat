package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.p136ui.conversation.ConversationUnreadHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.n2 */
public class C74800n2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MainTabUnreadMgr f219931d;

    /* renamed from: com.tencent.mm.ui.n2$a */
    public class C74801a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f219932d;

        public C74801a(int i) {
            this.f219932d = i;
        }

        public void run() {
            MainTabUnreadMgr mainTabUnreadMgr = C74800n2.this.f219931d;
            int i = this.f219932d;
            C74809q qVar = mainTabUnreadMgr.f214453g;
            if (qVar != null) {
                ((LauncherUIBottomTabView) qVar).mo101402j(i);
                ((HomeUI) mainTabUnreadMgr.f214451e).mo101330u(false);
            }
        }
    }

    public C74800n2(MainTabUnreadMgr mainTabUnreadMgr) {
        this.f219931d = mainTabUnreadMgr;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        int b = ConversationUnreadHelper.m89354b();
        ((C119157j) C119157j.f356862d).mo183895z(new C74801a(b));
        Log.m105919d("MicroMsg.LauncherUI.MainTabUnreadMgr", "unreadcheck setConversationTagUnread  last time %d, unread %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(b));
    }
}
