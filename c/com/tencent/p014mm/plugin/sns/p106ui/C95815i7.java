package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import di3.C86312j;
import p214om.C11502f;
import wc3.C15141z;

/* renamed from: com.tencent.mm.plugin.sns.ui.i7 */
public class C95815i7 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsUploadConfigView f279575d;

    public C95815i7(SnsUploadConfigView snsUploadConfigView) {
        this.f279575d = snsUploadConfigView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$5");
        C15141z yM = ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM();
        Intent intent = new Intent();
        SnsUploadConfigView snsUploadConfigView = this.f279575d;
        int i2 = SnsUploadConfigView.f278888u;
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        Context context = snsUploadConfigView.f278899q;
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        ((C67654r1) yM).mo93172e(intent, context);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$5");
    }
}
