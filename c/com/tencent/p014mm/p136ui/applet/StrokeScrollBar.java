package com.tencent.p014mm.p136ui.applet;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.VerticalScrollBar;

/* renamed from: com.tencent.mm.ui.applet.StrokeScrollBar */
public class StrokeScrollBar extends VerticalScrollBar {
    public StrokeScrollBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    public void mo174288c() {
        this.f348303f = new String[18];
        int i = 0;
        while (true) {
            String[] strArr = this.f348303f;
            if (i < strArr.length) {
                strArr[i] = Integer.toString(i + 3) + "劃";
                i++;
            } else {
                this.f348301d = 2.0f;
                this.f348302e = 79;
                return;
            }
        }
    }

    public int getToastLayoutId() {
        return C0966R.C0971layout.bz9;
    }
}
