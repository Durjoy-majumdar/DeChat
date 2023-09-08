package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.MaskTextView */
public class MaskTextView extends SnsTextView {
    public MaskTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onDraw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.MaskTextView");
        try {
            super.onDraw(canvas);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.MaskTextView", th, "", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.MaskTextView");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.MaskTextView");
        super.onLayout(z, i, i2, i3, i4);
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.MaskTextView");
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.MaskTextView");
        super.onMeasure(i, i2);
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.MaskTextView");
    }
}
