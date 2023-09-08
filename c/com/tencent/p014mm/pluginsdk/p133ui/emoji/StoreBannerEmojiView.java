package com.tencent.p014mm.pluginsdk.p133ui.emoji;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.p014mm.plugin.gif.MMAnimateView;

/* renamed from: com.tencent.mm.pluginsdk.ui.emoji.StoreBannerEmojiView */
public class StoreBannerEmojiView extends MMAnimateView {
    public StoreBannerEmojiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        Context context = getContext();
        int[] iArr = new int[2];
        if (context instanceof Activity) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics.widthPixels;
            iArr[1] = displayMetrics.heightPixels;
        } else {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            iArr[0] = defaultDisplay.getWidth();
            iArr[1] = defaultDisplay.getHeight();
        }
        int i3 = iArr[0];
        int i4 = ((i3 * 3) / 8) + 1;
        if (i3 <= 0 || i4 <= 0) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(i3, i4);
        }
    }

    public StoreBannerEmojiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
