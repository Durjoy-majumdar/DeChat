package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.gif.MMAnimateView;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardBannerView */
public class EmojiStoreV2RewardBannerView extends MMAnimateView {

    /* renamed from: n */
    public float f197869n = 0.75f;

    public EmojiStoreV2RewardBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        int right = ((getRight() - getLeft()) - getPaddingRight()) - getPaddingLeft();
        int i3 = (int) (((float) right) * this.f197869n);
        if (right == 0 || i3 == 0) {
            right = getContext().getResources().getDisplayMetrics().widthPixels;
            i3 = (int) (((float) right) * this.f197869n);
        }
        setMeasuredDimension(right, i3);
    }

    public void setScale(float f) {
        this.f197869n = f;
    }

    public EmojiStoreV2RewardBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
