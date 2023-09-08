package com.tencent.p014mm.plugin.sns.p104ad.widget.shakead;

import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import lo2.C99574x0;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.b */
public class C94777b implements C99574x0.C99575a {

    /* renamed from: a */
    public final /* synthetic */ CardAnimView f274511a;

    public C94777b(CardAnimView cardAnimView) {
        this.f274511a = cardAnimView;
    }

    /* renamed from: a */
    public void mo130606a() {
        SnsMethodCalculate.markStartTimeMs("onFlipEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$4");
        CardAnimView cardAnimView = this.f274511a;
        int i = CardAnimView.f274438p;
        SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        cardAnimView.f274446n = false;
        SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        if (CardAnimView.m120052a(this.f274511a) != null) {
            ((AdLandingPageEggCardHelper.C94708e) CardAnimView.m120052a(this.f274511a)).mo130369a();
        }
        CardAnimView.m120053b(this.f274511a, 4);
        SnsMethodCalculate.markEndTimeMs("onFlipEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$4");
    }

    /* renamed from: b */
    public void mo130607b() {
        SnsMethodCalculate.markStartTimeMs("onFlipStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$4");
        SnsMethodCalculate.markEndTimeMs("onFlipStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$4");
    }
}
