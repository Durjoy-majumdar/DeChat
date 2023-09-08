package com.tencent.p014mm.plugin.game.p061ui.message;

import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.game.ui.message.h */
public class C42351h implements ViewPager.OnPageChangeListener {

    /* renamed from: d */
    public final /* synthetic */ GameMsgCenterUI f114567d;

    public C42351h(GameMsgCenterUI gameMsgCenterUI) {
        this.f114567d = gameMsgCenterUI;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        Log.m105925i("MicroMsg.GameMsgCenterUI", "onPageSelected:%d", Integer.valueOf(i));
        this.f114567d.mo66395H7(i);
    }
}
