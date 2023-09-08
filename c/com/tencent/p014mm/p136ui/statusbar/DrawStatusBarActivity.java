package com.tencent.p014mm.p136ui.statusbar;

import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.p136ui.MMActivity;
import in3.C46279a;
import in3.C87763b;
import in3.C87773e;

/* renamed from: com.tencent.mm.ui.statusbar.DrawStatusBarActivity */
public abstract class DrawStatusBarActivity extends MMActivity {

    /* renamed from: d */
    public C87763b f122195d = null;

    public void initSwipeBack() {
        super.initSwipeBack();
        if (getSwipeBackLayout() != null && getSwipeBackLayout().getChildCount() > 0) {
            View childAt = getSwipeBackLayout().getChildAt(0);
            getSwipeBackLayout().removeView(childAt);
            C87763b bVar = new C87763b(this);
            this.f122195d = bVar;
            bVar.addView(childAt, new FrameLayout.LayoutParams(-1, -1));
            getSwipeBackLayout().addView(this.f122195d);
            getSwipeBackLayout().setContentView(this.f122195d);
        }
    }

    public void setActionbarColor(int i) {
        super.setActionbarColor(i);
        if (getWindow() != null) {
            C46279a.m51577a(getContentView(), getWindow().getStatusBarColor(), C87773e.m109213g(getWindow()));
        }
    }
}
