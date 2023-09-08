package com.tencent.p014mm.plugin.sns.p106ui;

import a22.C67001a;
import android.content.DialogInterface;
import b22.C28250a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import nj3.C76879j;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.sns.ui.w4 */
public class C96273w4 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsLabelUI f281339d;

    public C96273w4(SnsLabelUI snsLabelUI) {
        this.f281339d = snsLabelUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$6");
        SnsLabelUI snsLabelUI = this.f281339d;
        int i2 = SnsLabelUI.f278212C;
        SnsMethodCalculate.markStartTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        snsLabelUI.f278225q = true;
        SnsMethodCalculate.markEndTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        ((C67001a) C28250a.m38138a()).mo90963a(SnsLabelUI.m122143L7(this.f281339d));
        SnsLabelUI snsLabelUI2 = this.f281339d;
        C89779i0 Q = C76879j.m92723Q(snsLabelUI2, (String) null, snsLabelUI2.getString(C0966R.string.jds), false, false, (DialogInterface.OnCancelListener) null);
        SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        snsLabelUI2.f278228t = Q;
        SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$6");
    }
}
