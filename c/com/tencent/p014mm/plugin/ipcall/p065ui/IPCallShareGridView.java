package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallShareGridView */
public class IPCallShareGridView extends GridView {
    public IPCallShareGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public IPCallShareGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
