package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/* renamed from: com.tencent.mm.ui.ListViewInScrollView */
public class ListViewInScrollView extends ListView {
    public ListViewInScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public ListViewInScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
