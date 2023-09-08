package com.tencent.p014mm.plugin.sns.p106ui;

import android.graphics.Rect;
import android.widget.TextView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.r5$$h */
public class r5$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TextView f281074d;

    /* renamed from: e */
    public final /* synthetic */ C96198r5 f281075e;

    public r5$$h(C96198r5 r5Var, TextView textView) {
        this.f281075e = r5Var;
        this.f281074d = textView;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$3");
        new Rect();
        this.f281074d.measure(0, 0);
        C96198r5 r5Var = this.f281075e;
        int measuredHeight = this.f281074d.getMeasuredHeight();
        SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        r5Var.f281038H = measuredHeight;
        SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        C96198r5 r5Var2 = this.f281075e;
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        int i = r5Var2.f281038H;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        Log.m105919d("MicroMsg.SnsphotoAdapter", "yearTv height:%s", Integer.valueOf(i));
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$3");
    }
}
