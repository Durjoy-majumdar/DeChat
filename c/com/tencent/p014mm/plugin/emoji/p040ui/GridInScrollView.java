package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

/* renamed from: com.tencent.mm.plugin.emoji.ui.GridInScrollView */
public class GridInScrollView extends GridView {
    public GridInScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public GridInScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
