package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

/* renamed from: com.tencent.mm.ui.widget.MMCenterChildGridView */
public class MMCenterChildGridView extends GridView {
    public MMCenterChildGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
        int size = View.MeasureSpec.getSize(i);
        super.onMeasure(i, makeMeasureSpec);
        int min = Math.min(getNumColumns(), getAdapter().getCount());
        int columnWidth = (size - (min > 0 ? (((getColumnWidth() * min) + ((min - 1) * getHorizontalSpacing())) + getListPaddingLeft()) + getListPaddingRight() : 0)) / 2;
        setPadding(columnWidth, getPaddingTop(), columnWidth, getPaddingBottom());
        postInvalidate();
    }

    public MMCenterChildGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
