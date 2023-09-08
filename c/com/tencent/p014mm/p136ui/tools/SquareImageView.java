package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* renamed from: com.tencent.mm.ui.tools.SquareImageView */
public class SquareImageView extends ImageView {
    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i, i3, i4);
    }

    public SquareImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
