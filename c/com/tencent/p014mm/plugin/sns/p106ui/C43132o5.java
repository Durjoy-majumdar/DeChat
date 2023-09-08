package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sns.model.C43040m0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.o5 */
public class C43132o5 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C43040m0 f116702d;

    /* renamed from: e */
    public final /* synthetic */ SnsPermissionUI f116703e;

    public C43132o5(SnsPermissionUI snsPermissionUI, C43040m0 m0Var) {
        this.f116703e = snsPermissionUI;
        this.f116702d = m0Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI$2");
        SnsPermissionUI snsPermissionUI = this.f116703e;
        int i = SnsPermissionUI.f116617r;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        snsPermissionUI.onStop();
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123458d(this.f116702d);
        SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI$2");
    }
}
