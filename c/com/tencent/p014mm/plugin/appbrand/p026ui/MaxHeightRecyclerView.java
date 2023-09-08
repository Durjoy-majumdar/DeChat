package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView */
public class MaxHeightRecyclerView extends RecyclerView {

    /* renamed from: y1 */
    public int f108916y1;

    public MaxHeightRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getMaxHeight() {
        return this.f108916y1;
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.f108916y1;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.f108916y1 = i;
        invalidate();
        requestLayout();
    }

    public MaxHeightRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
