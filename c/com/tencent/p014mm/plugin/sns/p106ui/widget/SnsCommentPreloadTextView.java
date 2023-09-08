package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.kiss.widget.textview.PLTextView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gv2.C98241o;
import m40.C99786a;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView */
public class SnsCommentPreloadTextView extends PLTextView {

    /* renamed from: e */
    public static C99786a f281556e;

    /* renamed from: f */
    public static int f281557f;

    public SnsCommentPreloadTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static C99786a getTextViewConfig() {
        SnsMethodCalculate.markStartTimeMs("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
        if (f281556e == null) {
            C98241o.m126934a();
            f281556e = C98241o.f288030d.mo137540b();
        }
        C99786a aVar = f281556e;
        SnsMethodCalculate.markEndTimeMs("getTextViewConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
        return aVar;
    }

    public static int getViewWidth() {
        SnsMethodCalculate.markStartTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
        if (f281557f == 0) {
            C98241o.m126934a();
            f281557f = C98241o.f288030d.mo137541c();
        }
        int i = f281557f;
        SnsMethodCalculate.markEndTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
        return i;
    }

    /* renamed from: b */
    public C99786a mo126800b() {
        SnsMethodCalculate.markStartTimeMs("initConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
        if (f281556e == null) {
            C98241o.m126934a();
            f281556e = C98241o.f288030d.mo137540b();
        }
        C99786a aVar = f281556e;
        SnsMethodCalculate.markEndTimeMs("initConfig", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
        return aVar;
    }

    /* renamed from: g */
    public void mo126793g(CharSequence charSequence) {
        SnsMethodCalculate.markStartTimeMs("onHitLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
        SnsMethodCalculate.markEndTimeMs("onHitLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
    }

    /* renamed from: h */
    public void mo126794h(CharSequence charSequence) {
        SnsMethodCalculate.markStartTimeMs("onMissLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
        mo126802f(charSequence, false);
        SnsMethodCalculate.markEndTimeMs("onMissLayoutCache", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
        super.onMeasure(i, i2);
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView");
    }

    public SnsCommentPreloadTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
