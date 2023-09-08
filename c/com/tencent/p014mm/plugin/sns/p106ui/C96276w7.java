package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.w7 */
public class C96276w7 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f281400d;

    /* renamed from: e */
    public final /* synthetic */ SnsUserUI f281401e;

    public C96276w7(SnsUserUI snsUserUI, int i) {
        this.f281401e = snsUserUI;
        this.f281400d = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$17");
        C94866e1.Yx0().mo139814bD(this.f281400d);
        SnsUserUI.m122458H7(this.f281401e).mo133861z("");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$17");
    }
}
