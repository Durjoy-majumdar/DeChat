package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import t40.C77853a;

/* renamed from: com.tencent.mm.ui.widget.MMBoundedRelativeLayout */
public class MMBoundedRelativeLayout extends RelativeLayout {

    /* renamed from: d */
    public int f220341d;

    /* renamed from: e */
    public int f220342e;

    public MMBoundedRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f220341d = context.obtainStyledAttributes(attributeSet, C77853a.f226857c).getDimensionPixelSize(1, 0);
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f220341d;
        if (i3 > 0 && i3 < size) {
            i = View.MeasureSpec.makeMeasureSpec(this.f220341d, View.MeasureSpec.getMode(i));
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.f220342e;
        if (i4 > 0 && i4 < size2) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.f220342e, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.f220342e = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        this.f220341d = i;
        requestLayout();
    }

    public MMBoundedRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f220341d = context.obtainStyledAttributes(attributeSet, C77853a.f226857c).getDimensionPixelSize(1, 0);
    }
}
