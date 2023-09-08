package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import di3.C86312j;
import p447aw.C103918d;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$w0 */
public class SnsTimeLineUI$$w0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f82119d;

    public SnsTimeLineUI$$w0(SnsTimeLineUI snsTimeLineUI) {
        this.f82119d = snsTimeLineUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$77");
        dialogInterface.dismiss();
        ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f82119d.getContext());
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$77");
    }
}
