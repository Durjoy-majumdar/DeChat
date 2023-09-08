package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.AutoBottomScrollView */
public class AutoBottomScrollView extends ScrollView {

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.AutoBottomScrollView$a */
    public class C68359a implements Runnable {
        public C68359a() {
        }

        public void run() {
            AutoBottomScrollView autoBottomScrollView = AutoBottomScrollView.this;
            autoBottomScrollView.smoothScrollTo(0, autoBottomScrollView.getBottom());
        }
    }

    public AutoBottomScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        postDelayed(new C68359a(), 100);
    }

    public AutoBottomScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
