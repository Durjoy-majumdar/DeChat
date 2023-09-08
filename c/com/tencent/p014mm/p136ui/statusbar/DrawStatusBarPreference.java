package com.tencent.p014mm.p136ui.statusbar;

import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import in3.C87763b;
import pj3.C47511g;

/* renamed from: com.tencent.mm.ui.statusbar.DrawStatusBarPreference */
public class DrawStatusBarPreference extends MMPreference {

    /* renamed from: d */
    public C87763b f122196d = null;

    public int getResourceId() {
        return 0;
    }

    public void initSwipeBack() {
        super.initSwipeBack();
        if (getSwipeBackLayout() != null && getSwipeBackLayout().getChildCount() > 0) {
            View childAt = getSwipeBackLayout().getChildAt(0);
            getSwipeBackLayout().removeView(childAt);
            C87763b bVar = new C87763b(this);
            this.f122196d = bVar;
            bVar.addView(childAt, new FrameLayout.LayoutParams(-1, -1));
            getSwipeBackLayout().addView(this.f122196d);
            getSwipeBackLayout().setContentView(this.f122196d);
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        return false;
    }
}
