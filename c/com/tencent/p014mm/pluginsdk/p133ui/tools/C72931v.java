package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.tencent.p014mm.pluginsdk.p133ui.tools.DropdownListView;
import gy3.C87412m;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.v */
public final class C72931v implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ DropdownListView f212556a;

    public C72931v(DropdownListView dropdownListView) {
        this.f212556a = dropdownListView;
    }

    public void onAnimationEnd(Animation animation) {
        C87412m.m108594g(animation, "animation");
        FrameLayout frameLayout = this.f212556a.f212474e;
        C87412m.m108591d(frameLayout);
        frameLayout.setVisibility(8);
        DropdownListView dropdownListView = this.f212556a;
        dropdownListView.f212477h = false;
        dropdownListView.f212478i = false;
        if (dropdownListView.getMOnItemStateChanged() != null) {
            DropdownListView.C72904e mOnItemStateChanged = this.f212556a.getMOnItemStateChanged();
            C87412m.m108591d(mOnItemStateChanged);
            mOnItemStateChanged.mo100776a(false);
        }
    }

    public void onAnimationRepeat(Animation animation) {
        C87412m.m108594g(animation, "animation");
    }

    public void onAnimationStart(Animation animation) {
        C87412m.m108594g(animation, "animation");
    }
}
