package com.tencent.p014mm.plugin.music.p080ui.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: com.tencent.mm.plugin.music.ui.view.MarqueeTextView */
public class MarqueeTextView extends AppCompatTextView {
    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean isFocused() {
        return true;
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
