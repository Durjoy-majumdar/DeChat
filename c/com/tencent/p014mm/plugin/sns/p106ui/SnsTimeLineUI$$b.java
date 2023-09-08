package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$b */
public final /* synthetic */ class SnsTimeLineUI$$b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f116637d;

    public /* synthetic */ SnsTimeLineUI$$b(boolean z) {
        this.f116637d = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z = this.f116637d;
        Boolean bool = SnsTimeLineUI.f278611T1;
        SnsMethodCalculate.markStartTimeMs("lambda$onClickSecondCut$2", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsTimeLineUI.m122280B8(z, 4, false);
        SnsMethodCalculate.markEndTimeMs("lambda$onClickSecondCut$2", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }
}
