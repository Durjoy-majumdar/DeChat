package com.tencent.p014mm.plugin.setting.p102ui.setting.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.view.SquareFrameLayout */
public class SquareFrameLayout extends FrameLayout {
    public SquareFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size == 0 && size2 == 0) {
            super.onMeasure(i, i2);
            int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
            setMeasuredDimension(min, min);
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size == 0 || size2 == 0) ? Math.max(size, size2) : Math.min(size, size2), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public SquareFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
