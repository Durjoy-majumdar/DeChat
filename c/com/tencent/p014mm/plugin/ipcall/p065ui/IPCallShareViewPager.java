package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.p136ui.base.CustomViewPager;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallShareViewPager */
public class IPCallShareViewPager extends CustomViewPager {
    public IPCallShareViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredHeight > i3) {
                i3 = measuredHeight;
            }
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }
}
