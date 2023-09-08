package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.kiss.widget.textview.PLTextView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gv2.C98239l;
import m40.C99786a;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView */
public class SnsComment2LinePreloadTextView extends PLTextView {

    /* renamed from: e */
    public static C99786a f281537e;

    /* renamed from: f */
    public static int f281538f;

    public SnsComment2LinePreloadTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static C99786a getTextViewConfig() {
        SnsMethodCalculate.markStartTimeMs("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
        if (f281537e == null) {
            C98239l.m126931a();
            f281537e = C98239l.f288025c.mo137536b();
        }
        C99786a aVar = f281537e;
        SnsMethodCalculate.markEndTimeMs("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
        return aVar;
    }

    public static int getViewWidth() {
        SnsMethodCalculate.markStartTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
        if (f281538f == 0) {
            C98239l.m126931a();
            f281538f = C98239l.f288025c.mo137537c();
        }
        int i = f281538f;
        SnsMethodCalculate.markEndTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
        return i;
    }

    /* renamed from: b */
    public C99786a mo126800b() {
        SnsMethodCalculate.markStartTimeMs("initConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
        if (f281537e == null) {
            C98239l.m126931a();
            f281537e = C98239l.f288025c.mo137536b();
        }
        C99786a aVar = f281537e;
        SnsMethodCalculate.markEndTimeMs("initConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
        return aVar;
    }

    /* renamed from: g */
    public void mo126793g(CharSequence charSequence) {
        SnsMethodCalculate.markStartTimeMs("onHitLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
        SnsMethodCalculate.markEndTimeMs("onHitLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
    }

    /* renamed from: h */
    public void mo126794h(CharSequence charSequence) {
        SnsMethodCalculate.markStartTimeMs("onMissLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
        mo126802f(charSequence, false);
        SnsMethodCalculate.markEndTimeMs("onMissLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
        super.onMeasure(i, i2);
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsComment2LinePreloadTextView");
    }

    public SnsComment2LinePreloadTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
