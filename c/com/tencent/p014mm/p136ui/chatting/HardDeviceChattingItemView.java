package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import wq3.C111847h;

/* renamed from: com.tencent.mm.ui.chatting.HardDeviceChattingItemView */
public class HardDeviceChattingItemView extends LinearLayout implements C111847h {

    /* renamed from: d */
    public boolean f24307d;

    public HardDeviceChattingItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        if (!this.f24307d) {
            this.f24307d = true;
        }
    }
}
