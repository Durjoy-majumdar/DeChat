package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sns.p106ui.NewSnsLabelUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.v1 */
public class C96241v1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NewSnsLabelUI f281227d;

    public C96241v1(NewSnsLabelUI.ReturnSnsObjectDetailEventListener returnSnsObjectDetailEventListener, NewSnsLabelUI newSnsLabelUI) {
        this.f281227d = newSnsLabelUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener$1");
        this.f281227d.finish();
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener$1");
    }
}
