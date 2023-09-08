package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: com.tencent.mm.ui.NoDrawingCacheLinearLayout */
public class NoDrawingCacheLinearLayout extends LinearLayout {
    public NoDrawingCacheLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void buildDrawingCache() {
    }

    public void buildDrawingCache(boolean z) {
    }

    public Bitmap getDrawingCache() {
        return null;
    }

    public Bitmap getDrawingCache(boolean z) {
        return null;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public NoDrawingCacheLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
