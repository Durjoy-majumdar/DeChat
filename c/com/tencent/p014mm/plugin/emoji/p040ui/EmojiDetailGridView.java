package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.view.SmileySubGrid;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiDetailGridView */
public class EmojiDetailGridView extends SmileySubGrid {

    /* renamed from: A */
    public String f268490A;

    /* renamed from: z */
    public EmojiDetailScrollView f268491z;

    public EmojiDetailGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getLongTouchTime() {
        return 200;
    }

    public String getProductId() {
        return this.f268490A;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public void setEmojiDetailScrollView(EmojiDetailScrollView emojiDetailScrollView) {
        this.f268491z = emojiDetailScrollView;
    }

    public void setProductId(String str) {
        this.f268490A = str;
    }

    public void setScrollEnable(boolean z) {
        EmojiDetailScrollView emojiDetailScrollView = this.f268491z;
        if (emojiDetailScrollView != null) {
            emojiDetailScrollView.setScrollEnable(z);
        }
    }
}
