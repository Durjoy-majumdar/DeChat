package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.style.MetricAffectingSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p156gj.C107835h0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTextView */
public class SnsTextView extends TextView {

    /* renamed from: d */
    public char f278547d = 0;

    /* renamed from: e */
    public String f278548e = "";

    public SnsTextView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo132909a(CharSequence charSequence, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("tryToFix", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
        if (metricAffectingSpanArr == null || metricAffectingSpanArr.length <= 0) {
            this.f278547d = 'd';
        } else {
            spannableStringBuilder.insert(spannableStringBuilder.getSpanStart(metricAffectingSpanArr[0]) - 1, " ");
            this.f278547d = (char) (this.f278547d + 1);
        }
        setText(spannableStringBuilder);
        onMeasure(i, i2);
        SnsMethodCalculate.markEndTimeMs("tryToFix", "com.tencent.mm.plugin.sns.ui.SnsTextView");
    }

    public int getBaseline() {
        SnsMethodCalculate.markStartTimeMs("getBaseline", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        try {
            int baseline = super.getBaseline();
            SnsMethodCalculate.markEndTimeMs("getBaseline", "com.tencent.mm.plugin.sns.ui.SnsTextView");
            return baseline;
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.SnsTextView", th, "", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("getBaseline", "com.tencent.mm.plugin.sns.ui.SnsTextView");
            return -1;
        }
    }

    public void onDraw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        try {
            super.onDraw(canvas);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.SnsTextView", th, "", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.SnsTextView");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        super.onLayout(z, i, i2, i3, i4);
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.SnsTextView");
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        int i3 = C107835h0.f322856m.f322917x;
        if (i3 == 1 || i3 == -1) {
            try {
                super.onMeasure(i, i2);
                this.f278547d = 0;
            } catch (IndexOutOfBoundsException e) {
                char c = this.f278547d;
                if (c < 3) {
                    try {
                        mo132909a(getText(), i, i2);
                    } catch (IndexOutOfBoundsException unused) {
                        Log.m105924i("MicroMsg.SnsTextView", "tryToFix error set origintext " + Util.isNullOrNil(this.f278548e));
                        setText(this.f278548e);
                        onMeasure(i, i2);
                        this.f278547d = (char) (this.f278547d + 1);
                    }
                } else if (c == 3) {
                    Log.m105924i("MicroMsg.SnsTextView", "fix error set origintext " + Util.isNullOrNil(this.f278548e));
                    setText(this.f278548e);
                    onMeasure(i, i2);
                    this.f278547d = (char) (this.f278547d + 1);
                } else {
                    SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.SnsTextView");
                    throw e;
                }
                SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.SnsTextView");
                return;
            }
        } else {
            super.onMeasure(i, i2);
        }
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.SnsTextView");
    }

    public boolean onPreDraw() {
        SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        try {
            boolean onPreDraw = super.onPreDraw();
            SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsTextView");
            return onPreDraw;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsTextView");
            return true;
        }
    }

    public boolean onTextContextMenuItem(int i) {
        SnsMethodCalculate.markStartTimeMs("onTextContextMenuItem", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
        SnsMethodCalculate.markEndTimeMs("onTextContextMenuItem", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        return onTextContextMenuItem;
    }

    public void setOriginText(String str) {
        SnsMethodCalculate.markStartTimeMs("setOriginText", "com.tencent.mm.plugin.sns.ui.SnsTextView");
        this.f278548e = str;
        SnsMethodCalculate.markEndTimeMs("setOriginText", "com.tencent.mm.plugin.sns.ui.SnsTextView");
    }

    public SnsTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
