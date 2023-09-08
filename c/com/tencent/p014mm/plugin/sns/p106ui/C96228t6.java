package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.t6 */
public class C96228t6 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f281188d;

    public C96228t6(SnsTimeLineUI snsTimeLineUI) {
        this.f281188d = snsTimeLineUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$70");
        if (SnsTimeLineUI.m122306i8(this.f281188d).f278725c != 3) {
            if (i == 0) {
                SnsTimeLineUI.m122306i8(this.f281188d).mo132962b(3);
            } else {
                SnsTimeLineUI.m122306i8(this.f281188d).mo132962b(2);
            }
            SnsTimeLineUI snsTimeLineUI = this.f281188d;
            SnsTimeLineUI.m122307j8(snsTimeLineUI, SnsTimeLineUI.m122306i8(snsTimeLineUI));
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$70");
    }
}
