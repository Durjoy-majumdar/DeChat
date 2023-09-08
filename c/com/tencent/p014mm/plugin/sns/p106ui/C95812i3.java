package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.sns.ui.i3 */
public class C95812i3 implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f279568d;

    /* renamed from: e */
    public final /* synthetic */ String f279569e;

    /* renamed from: f */
    public final /* synthetic */ String f279570f;

    /* renamed from: g */
    public final /* synthetic */ String f279571g;

    /* renamed from: h */
    public final /* synthetic */ SnsAdNativeLandingPagesUI f279572h;

    public C95812i3(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI, String str, String str2, String str3, String str4) {
        this.f279572h = snsAdNativeLandingPagesUI;
        this.f279568d = str;
        this.f279569e = str2;
        this.f279570f = str3;
        this.f279571g = str4;
    }

    public Object invoke(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$37");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$37");
        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f279572h;
        String L7 = SnsAdNativeLandingPagesUI.m121805L7(snsAdNativeLandingPagesUI);
        String str = this.f279568d;
        String str2 = this.f279569e;
        String str3 = this.f279570f;
        String str4 = this.f279571g;
        SnsMethodCalculate.markStartTimeMs("access$7100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        snsAdNativeLandingPagesUI.mo132513T8(L7, (String) obj, str, str2, str3, str4);
        SnsMethodCalculate.markEndTimeMs("access$7100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$37");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$37");
        return b0Var;
    }
}
