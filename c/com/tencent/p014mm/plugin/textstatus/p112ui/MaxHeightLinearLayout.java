package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kg3.C76577a;
import py2.C77295e;

/* renamed from: com.tencent.mm.plugin.textstatus.ui.MaxHeightLinearLayout */
public class MaxHeightLinearLayout extends LinearLayout {

    /* renamed from: d */
    public int f206750d;

    /* renamed from: e */
    public int f206751e = -1;

    public MaxHeightLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C77295e.f225408a, 0, 0);
        try {
            int integer = obtainStyledAttributes.getInteger(0, -1);
            this.f206750d = integer;
            if (integer != -1) {
                this.f206751e = C76577a.m92151b(getContext(), this.f206750d);
            } else {
                this.f206751e = -1;
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f206751e, Integer.MIN_VALUE));
    }

    public void setMaxHeightDp(int i) {
        this.f206750d = i;
        if (i != -1) {
            this.f206751e = C76577a.m92151b(getContext(), this.f206750d);
        } else {
            this.f206751e = -1;
        }
        invalidate();
    }

    public void setMaxHeightPx(int i) {
        this.f206751e = i;
        invalidate();
    }

    public MaxHeightLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
