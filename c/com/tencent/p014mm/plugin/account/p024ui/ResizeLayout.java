package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: com.tencent.mm.plugin.account.ui.ResizeLayout */
public class ResizeLayout extends LinearLayout {

    /* renamed from: com.tencent.mm.plugin.account.ui.ResizeLayout$a */
    public interface C40420a {
        void onSizeChanged(int i, int i2, int i3, int i4);
    }

    public ResizeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setOnSizeChanged(C40420a aVar) {
    }
}
