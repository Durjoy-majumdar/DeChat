package com.tencent.p014mm.pluginsdk.p133ui.emoji;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.gif.MMAnimateView;

/* renamed from: com.tencent.mm.pluginsdk.ui.emoji.BannerEmojiView */
public class BannerEmojiView extends MMAnimateView {
    public BannerEmojiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        int right = ((getRight() - getLeft()) - getPaddingRight()) - getPaddingLeft();
        int i3 = right / 2;
        if (right == 0 || i3 == 0) {
            right = getContext().getResources().getDisplayMetrics().widthPixels;
        }
        float f = 0.53333336f;
        Drawable drawable = getDrawable();
        if (drawable != null && drawable.getIntrinsicHeight() > 0 && drawable.getIntrinsicWidth() > 0) {
            f = (((float) drawable.getIntrinsicHeight()) * 1.0f) / ((float) drawable.getIntrinsicWidth());
        }
        setMeasuredDimension(right, (int) (((float) right) * f));
    }

    public BannerEmojiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
