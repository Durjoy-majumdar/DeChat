package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import gy3.C87412m;
import ux1.C52635a;
import ux1.C52636c;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI$$b */
public class ChatRoomTabUI$$b implements C42305q {

    /* renamed from: a */
    public final /* synthetic */ ChatRoomTabUI f114192a;

    public ChatRoomTabUI$$b(ChatRoomTabUI chatRoomTabUI) {
        this.f114192a = chatRoomTabUI;
    }

    /* renamed from: a */
    public void mo66284a(int i) {
        GameMsgNoticeFragment gameMsgNoticeFragment;
        ChatRoomTabUI chatRoomTabUI = this.f114192a;
        if (chatRoomTabUI.f114189o != null && (gameMsgNoticeFragment = chatRoomTabUI.f114190p) != null && gameMsgNoticeFragment.isAdded() && this.f114192a.f114189o.isAdded()) {
            GameRoomListFragment gameRoomListFragment = this.f114192a.f114189o;
            C52636c cVar = gameRoomListFragment.f114257f;
            C87412m.m108591d(cVar);
            ViewGroup.LayoutParams layoutParams = cVar.f146969a.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).bottomMargin = i;
            }
            C52636c cVar2 = gameRoomListFragment.f114257f;
            C87412m.m108591d(cVar2);
            cVar2.f146969a.setLayoutParams(layoutParams);
            GameMsgNoticeFragment gameMsgNoticeFragment2 = this.f114192a.f114190p;
            C52635a aVar = gameMsgNoticeFragment2.f114243e;
            C87412m.m108591d(aVar);
            ViewGroup.LayoutParams layoutParams2 = aVar.f146968c.getLayoutParams();
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = i;
            }
            C52635a aVar2 = gameMsgNoticeFragment2.f114243e;
            C87412m.m108591d(aVar2);
            aVar2.f146968c.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: b */
    public void mo66285b(String str) {
    }
}
