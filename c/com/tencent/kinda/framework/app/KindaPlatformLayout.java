package com.tencent.kinda.framework.app;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class KindaPlatformLayout extends LinearLayout {
    public static String TAG = "KindaPlatformLayout";
    private TestMeasure measure = new TestMeasure();

    public KindaPlatformLayout(Context context) {
        super(context);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onLayout(z, i, i2, i3, i4);
        this.measure.valLayout += SystemClock.elapsedRealtime() - elapsedRealtime;
    }

    public void onMeasure(int i, int i2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onMeasure(i, i2);
        this.measure.valMeasure += SystemClock.elapsedRealtime() - elapsedRealtime;
    }

    public void requestLayout() {
        super.requestLayout();
    }

    public KindaPlatformLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KindaPlatformLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
