package com.tencent.p014mm.plugin.product.p087ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

/* renamed from: com.tencent.mm.plugin.product.ui.MaxGridView */
public class MaxGridView extends GridView {
    public MaxGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }
}
