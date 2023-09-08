package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import in3.C87771d;
import in3.C87773e;

/* renamed from: com.tencent.mm.plugin.sns.ui.v7 */
public class C96249v7 implements C87771d.C46280b {

    /* renamed from: d */
    public final /* synthetic */ SnsUserUI f281247d;

    public C96249v7(SnsUserUI snsUserUI) {
        this.f281247d = snsUserUI;
    }

    /* renamed from: U3 */
    public void mo6344U3(int i) {
        SnsMethodCalculate.markStartTimeMs("onStatusBarHeightChange", "com.tencent.mm.plugin.sns.ui.SnsUserUI$16");
        SnsUserUI snsUserUI = this.f281247d;
        int i2 = SnsUserUI.f278981R;
        SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        View view = snsUserUI.f278994M;
        SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        view.setPadding(0, i, 0, 0);
        C87773e.m109211d(this.f281247d.getWindow());
        SnsMethodCalculate.markEndTimeMs("onStatusBarHeightChange", "com.tencent.mm.plugin.sns.ui.SnsUserUI$16");
    }
}
