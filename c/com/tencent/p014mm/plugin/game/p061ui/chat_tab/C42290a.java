package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.model.C42036a0;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import sw1.C48483p;
import sw1.C48484q;
import v20.C90741c;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.a */
public class C42290a implements TabLayout.C104470c {

    /* renamed from: a */
    public final /* synthetic */ ChatCustomTabActionBar f114362a;

    public C42290a(ChatCustomTabActionBar chatCustomTabActionBar) {
        this.f114362a = chatCustomTabActionBar;
    }

    /* renamed from: a */
    public void mo9213a(TabLayout.C55061f fVar) {
        ChatCustomTabActionBar chatCustomTabActionBar = this.f114362a;
        int i = ChatCustomTabActionBar.f114178g;
        chatCustomTabActionBar.mo66279b(fVar, 0);
    }

    /* renamed from: b */
    public void mo9214b(TabLayout.C55061f fVar) {
        if (fVar.f154604e == 0) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.GAME_MSG_NOTIFY_TAB_BOOLEAN_SYNC, Boolean.FALSE);
            ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66006bO(1);
            C42036a0 ar = ((C48483p) C86312j.m106911c(C48483p.class)).mo66079ar();
            C42119w g = ar.mo65978g();
            if (g != null && g.field_showType == 1) {
                ar.mo65974c();
            }
        } else {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.GAME_MSG_CHAT_TAB_BOOLEAN_SYNC, Boolean.FALSE);
        }
        View findViewById = fVar.f154605f.findViewById(C0966R.C0970id.nsg);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar$1", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar$1", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.GAME_MSG_BOTTOM_TAB_BOOLEAN_SYNC, Boolean.FALSE);
        ChatCustomTabActionBar chatCustomTabActionBar = this.f114362a;
        int i = ChatCustomTabActionBar.f114178g;
        chatCustomTabActionBar.mo66279b(fVar, 1);
        C90741c.m113809b("MicroMsg.ChatCustomTabActionBar", "gamelog.chat, chatRoomTab, click, switch tab to %s", fVar.f154602c);
    }

    /* renamed from: c */
    public void mo9215c(TabLayout.C55061f fVar) {
    }
}
