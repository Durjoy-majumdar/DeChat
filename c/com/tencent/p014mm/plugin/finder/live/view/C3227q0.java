package com.tencent.p014mm.plugin.finder.live.view;

import ak1.C0076j0;
import ak1.C54116w;
import androidx.viewpager.widget.ViewPager;
import di3.C86312j;
import java.util.Map;
import l31.C61212e;
import ok1.C62042e;

/* renamed from: com.tencent.mm.plugin.finder.live.view.q0 */
public final class C3227q0 implements ViewPager.OnPageChangeListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveGiftPanelIndicator f15347d;

    public C3227q0(FinderLiveGiftPanelIndicator finderLiveGiftPanelIndicator) {
        this.f15347d = finderLiveGiftPanelIndicator;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        this.f15347d.setCurrentChoosedIndicator(i);
        if (!C62042e.f176370a.mo87027N0()) {
            ((C54116w) C86312j.m106911c(C54116w.class)).nv0(C0076j0.GIFT_BOARD_TURN_PAGE, "", 0);
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("live_gift_board_turn_page", this.f15347d, (Map<String, Object>) null, 26236);
        }
    }
}
