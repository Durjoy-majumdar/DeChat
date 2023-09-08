package com.tencent.p014mm.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import t40.C77853a;

/* renamed from: com.tencent.mm.view.MaxHeightScrollView */
public class MaxHeightScrollView extends ScrollView {

    /* renamed from: d */
    public int f220858d;

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        hashCode();
        mo104672a(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo104672a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226872r, 0, 0);
        try {
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(index, -1));
                }
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public int getMaxHeight() {
        return this.f220858d;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (this.f220858d > 0 && getMeasuredHeight() > (i3 = this.f220858d)) {
            setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
        }
    }

    public void setMaxHeight(int i) {
        this.f220858d = i;
        requestLayout();
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        hashCode();
        mo104672a(context, attributeSet);
    }
}
