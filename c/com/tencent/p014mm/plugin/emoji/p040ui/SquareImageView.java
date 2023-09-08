package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* renamed from: com.tencent.mm.plugin.emoji.ui.SquareImageView */
public class SquareImageView extends ImageView {
    public SquareImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public SquareImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
