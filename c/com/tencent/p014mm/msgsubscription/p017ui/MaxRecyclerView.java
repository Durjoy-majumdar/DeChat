package com.tencent.p014mm.msgsubscription.p017ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.tencent.mm.msgsubscription.ui.MaxRecyclerView */
public class MaxRecyclerView extends RecyclerView {
    public MaxRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public MaxRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
