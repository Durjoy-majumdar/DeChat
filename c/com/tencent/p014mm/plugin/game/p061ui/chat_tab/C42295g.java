package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import gy3.C87412m;
import qq3.C63318b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.g */
public final class C42295g implements C63318b {

    /* renamed from: a */
    public final /* synthetic */ GameMsgNoticeFragment f114372a;

    public C42295g(GameMsgNoticeFragment gameMsgNoticeFragment) {
        this.f114372a = gameMsgNoticeFragment;
    }

    /* renamed from: a */
    public void mo3374a(boolean z) {
    }

    public void onLoadMore() {
        GameMsgNoticeFragment gameMsgNoticeFragment = this.f114372a;
        int i = GameMsgNoticeFragment.f114241q;
        gameMsgNoticeFragment.getClass();
        ((C119157j) C119157j.f356862d).mo183876g(new C42296h(gameMsgNoticeFragment), gameMsgNoticeFragment.f114242d);
        WxRefreshLayout wxRefreshLayout = this.f114372a.f114245g;
        if (wxRefreshLayout != null) {
            wxRefreshLayout.mo26580f(true);
        } else {
            C87412m.m108603p("refreshLayout");
            throw null;
        }
    }
}
