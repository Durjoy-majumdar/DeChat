package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.sns.ui.g3 */
public class C95791g3 implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ SnsAdNativeLandingPagesUI f279542d;

    public C95791g3(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        this.f279542d = snsAdNativeLandingPagesUI;
    }

    public Object invoke(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$28");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$28");
        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f279542d;
        String L7 = SnsAdNativeLandingPagesUI.m121805L7(snsAdNativeLandingPagesUI);
        SnsMethodCalculate.markStartTimeMs("access$6500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        snsAdNativeLandingPagesUI.mo132530c8(L7, (String) obj);
        SnsMethodCalculate.markEndTimeMs("access$6500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$28");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$28");
        return b0Var;
    }
}
