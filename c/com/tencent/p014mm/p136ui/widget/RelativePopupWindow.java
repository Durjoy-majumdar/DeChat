package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* renamed from: com.tencent.mm.ui.widget.RelativePopupWindow */
public class RelativePopupWindow extends PopupWindow {

    /* renamed from: a */
    public FrameLayout f122368a;

    public RelativePopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public View getContentView() {
        return this.f122368a.getChildAt(0);
    }

    public void setContentView(View view) {
        this.f122368a.removeAllViews();
        this.f122368a.addView(view);
    }

    public RelativePopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f122368a = frameLayout;
        super.setContentView(frameLayout);
    }
}
