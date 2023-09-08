package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* renamed from: com.tencent.mm.ui.base.MMAutoHeightViewPager */
public class MMAutoHeightViewPager extends ViewPager {
    private static final String TAG = "MicoMsg.MMAutoHeightViewPager";

    public MMAutoHeightViewPager(Context context, AttributeSet attributeSet, int i) {
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

    public MMAutoHeightViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MMAutoHeightViewPager(Context context) {
        super(context);
    }
}
