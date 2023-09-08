package com.tencent.p014mm.pluginsdk.p133ui.emoji;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.emoji.view.EmojiStatusView;

/* renamed from: com.tencent.mm.pluginsdk.ui.emoji.PreViewEmojiView */
public class PreViewEmojiView extends EmojiStatusView {

    /* renamed from: r */
    public int f283650r = 0;

    public PreViewEmojiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f283650r;
        if (i3 > 0) {
            setMeasuredDimension(i3, i3);
        }
    }

    public void setSize(int i) {
        this.f283650r = i;
    }

    public PreViewEmojiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
