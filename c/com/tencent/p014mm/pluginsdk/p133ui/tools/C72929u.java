package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.view.animation.Animation;
import com.tencent.p014mm.pluginsdk.p133ui.tools.DropdownListView;
import gy3.C87412m;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.u */
public final class C72929u implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ DropdownListView f212552a;

    public C72929u(DropdownListView dropdownListView) {
        this.f212552a = dropdownListView;
    }

    public void onAnimationEnd(Animation animation) {
        C87412m.m108594g(animation, "animation");
        DropdownListView dropdownListView = this.f212552a;
        dropdownListView.f212477h = true;
        dropdownListView.f212478i = false;
        if (dropdownListView.getMOnItemStateChanged() != null) {
            DropdownListView.C72904e mOnItemStateChanged = this.f212552a.getMOnItemStateChanged();
            C87412m.m108591d(mOnItemStateChanged);
            mOnItemStateChanged.mo100776a(true);
        }
    }

    public void onAnimationRepeat(Animation animation) {
        C87412m.m108594g(animation, "animation");
    }

    public void onAnimationStart(Animation animation) {
        C87412m.m108594g(animation, "animation");
    }
}
