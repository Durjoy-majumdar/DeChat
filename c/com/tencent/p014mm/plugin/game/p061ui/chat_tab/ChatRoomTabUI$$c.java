package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import androidx.viewpager.widget.ViewPager;
import gy3.C87412m;
import ux1.C52636c;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI$$c */
public class ChatRoomTabUI$$c implements ViewPager.OnPageChangeListener {

    /* renamed from: d */
    public final /* synthetic */ ChatRoomTabUI f114193d;

    public ChatRoomTabUI$$c(ChatRoomTabUI chatRoomTabUI) {
        this.f114193d = chatRoomTabUI;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        if (i == 1) {
            C52636c cVar = this.f114193d.f114189o.f114257f;
            C87412m.m108591d(cVar);
            cVar.f146969a.mo65467C1();
        }
    }
}
