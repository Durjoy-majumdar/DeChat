package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallPayButtonLayout */
public class IPCallPayButtonLayout extends RelativeLayout {
    public IPCallPayButtonLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (((double) getMeasuredWidth()) * 0.62d), 1073741824));
    }

    public IPCallPayButtonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
