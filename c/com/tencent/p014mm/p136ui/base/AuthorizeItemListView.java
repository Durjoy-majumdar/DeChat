package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/* renamed from: com.tencent.mm.ui.base.AuthorizeItemListView */
public class AuthorizeItemListView extends ListView {

    /* renamed from: d */
    public int f214735d;

    public AuthorizeItemListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onMeasure(int i, int i2) {
        if (this.f214735d <= 5) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public AuthorizeItemListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
