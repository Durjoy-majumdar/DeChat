package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView */
public class SnsUnScaleTextView extends TextView {
    public SnsUnScaleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public int getBaseline() {
        SnsMethodCalculate.markStartTimeMs("getBaseline", "com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView");
        try {
            int baseline = super.getBaseline();
            SnsMethodCalculate.markEndTimeMs("getBaseline", "com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView");
            return baseline;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("getBaseline", "com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView");
            return -1;
        }
    }

    public void onDraw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView");
        try {
            super.onDraw(canvas);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView");
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView");
        try {
            super.onMeasure(i, i2);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView");
    }

    public boolean onPreDraw() {
        SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView");
        try {
            boolean onPreDraw = super.onPreDraw();
            SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView");
            return onPreDraw;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView");
            return true;
        }
    }

    public SnsUnScaleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
