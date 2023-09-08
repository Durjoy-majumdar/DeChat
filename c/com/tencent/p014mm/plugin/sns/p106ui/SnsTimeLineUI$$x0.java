package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$x0 */
public class SnsTimeLineUI$$x0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f82120d;

    public SnsTimeLineUI$$x0(SnsTimeLineUI snsTimeLineUI) {
        this.f82120d = snsTimeLineUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$78");
        dialogInterface.dismiss();
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$78");
    }
}
