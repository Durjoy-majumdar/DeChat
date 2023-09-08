package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* renamed from: com.tencent.mm.ui.ForceInvalidateImageView */
public class ForceInvalidateImageView extends ImageView {
    public ForceInvalidateImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onVisibilityChanged(View view, int i) {
        if (i == 0) {
            invalidate();
        }
        super.onVisibilityChanged(view, i);
    }

    public ForceInvalidateImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
