package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.C95741b5;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import iv2.C33418b;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$r */
public class SnsTimeLineUI$$r implements C95741b5.C95743b {

    /* renamed from: a */
    public final /* synthetic */ SnsTimeLineUI f278779a;

    public SnsTimeLineUI$$r(SnsTimeLineUI snsTimeLineUI) {
        this.f278779a = snsTimeLineUI;
    }

    /* renamed from: M */
    public void mo133000M(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onNetWorkChange", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$37");
        SnsTimeLineUI snsTimeLineUI = this.f278779a;
        C33418b bVar = C33418b.f90548a;
        Boolean bool = SnsTimeLineUI.f278611T1;
        SnsMethodCalculate.markStartTimeMs("access$4400", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        C95741b5 b5Var = snsTimeLineUI.f278685p0;
        SnsMethodCalculate.markEndTimeMs("access$4400", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        boolean a = bVar.mo59132a(b5Var);
        SnsMethodCalculate.markStartTimeMs("access$4302", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        snsTimeLineUI.f278666Y = a;
        SnsMethodCalculate.markEndTimeMs("access$4302", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsMethodCalculate.markEndTimeMs("onNetWorkChange", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$37");
    }
}
