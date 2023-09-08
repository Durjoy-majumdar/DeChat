package com.tencent.p014mm.plugin.sns.p104ad.widget.shakead;

import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import lo2.C99574x0;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.d */
public class C94780d implements C99574x0.C99575a {

    /* renamed from: a */
    public final /* synthetic */ GLCardAnimView f274514a;

    public C94780d(GLCardAnimView gLCardAnimView) {
        this.f274514a = gLCardAnimView;
    }

    /* renamed from: a */
    public void mo130606a() {
        SnsMethodCalculate.markStartTimeMs("onFlipEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$4");
        GLCardAnimView gLCardAnimView = this.f274514a;
        int i = GLCardAnimView.f274448B;
        SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        gLCardAnimView.f274457z = false;
        SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        if (GLCardAnimView.m120056h(this.f274514a) != null) {
            ((AdLandingPageEggCardHelper.C94708e) GLCardAnimView.m120056h(this.f274514a)).mo130369a();
        }
        GLCardAnimView.m120057i(this.f274514a, 4);
        SnsMethodCalculate.markEndTimeMs("onFlipEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$4");
    }

    /* renamed from: b */
    public void mo130607b() {
        SnsMethodCalculate.markStartTimeMs("onFlipStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$4");
        SnsMethodCalculate.markEndTimeMs("onFlipStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$4");
    }
}
