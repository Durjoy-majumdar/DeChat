package com.tencent.p014mm.pluginsdk.p133ui.emoji;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiViewTo */
public class RTChattingEmojiViewTo extends RTChattingEmojiView {
    public RTChattingEmojiViewTo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo135108a();
    }

    /* renamed from: a */
    public void mo135108a() {
        super.mo135108a();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 5;
        addView(this.f283658j, layoutParams);
    }

    public RTChattingEmojiViewTo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo135108a();
    }
}
