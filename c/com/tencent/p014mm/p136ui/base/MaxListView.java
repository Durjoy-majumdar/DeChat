package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/* renamed from: com.tencent.mm.ui.base.MaxListView */
public class MaxListView extends ListView {
    public MaxListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public MaxListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
