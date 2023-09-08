package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.c5 */
public class C95750c5 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ SnsNotInterestUI f279283d;

    public C95750c5(SnsNotInterestUI snsNotInterestUI) {
        this.f279283d = snsNotInterestUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI$4");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123458d(this.f279283d.f278366u);
        SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI$4");
    }
}
