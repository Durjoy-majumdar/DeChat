package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.tencent.mm.ui.base.MMFrameLayout */
public class MMFrameLayout extends FrameLayout {

    /* renamed from: d */
    public boolean f214815d = false;

    public MMFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        while (!this.f214815d && i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.gravity == -1) {
                    layoutParams.gravity = 51;
                    childAt.setLayoutParams(layoutParams);
                }
            }
            i5++;
        }
        this.f214815d = true;
        super.onLayout(z, i, i2, i3, i4);
    }
}
