package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.sns.ui.d7 */
public class C71238d7 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsUploadConfigView f206181d;

    public C71238d7(SnsUploadConfigView snsUploadConfigView) {
        this.f206181d = snsUploadConfigView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$12");
        Intent intent = new Intent();
        intent.putExtra("is_force_unbind", true);
        intent.putExtra("shake_music", true);
        C88144b.m109795m(this.f206181d.getContext(), "account", ".ui.FacebookAuthUI", intent, 8);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$12");
    }
}
