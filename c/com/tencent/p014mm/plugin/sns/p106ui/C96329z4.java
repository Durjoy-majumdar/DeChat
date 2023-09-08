package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.z4 */
public class C96329z4 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsMsgUI f281731d;

    public C96329z4(SnsMsgUI snsMsgUI) {
        this.f281731d = snsMsgUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$15");
        SnsMsgUI.m122164K7(this.f281731d, true);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$15");
    }
}
