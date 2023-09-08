package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.remittance.ui.KindaPlatformLayout */
public class KindaPlatformLayout extends LinearLayout {

    /* renamed from: d */
    public C85402t1 f248861d = new C85402t1();

    public KindaPlatformLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        long currentTimeMillis = System.currentTimeMillis();
        super.onLayout(z, i, i2, i3, i4);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        this.f248861d.f248863b += currentTimeMillis2;
        Log.m105925i("KindaPlatformLayout", "testandroid root layout out %s %s", Long.valueOf(currentTimeMillis2), this.f248861d.mo118722a());
    }

    public void onMeasure(int i, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        super.onMeasure(i, i2);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        this.f248861d.f248862a += currentTimeMillis2;
        Log.m105925i("KindaPlatformLayout", "testandroid root measure out %s %s", Long.valueOf(currentTimeMillis2), this.f248861d.mo118722a());
    }

    public void requestLayout() {
        super.requestLayout();
    }

    public KindaPlatformLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
