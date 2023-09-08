package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.x */
public final class C94686x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f274008d;

    /* renamed from: e */
    public final /* synthetic */ C94680v f274009e;

    public C94686x(String str, C94680v vVar) {
        this.f274008d = str;
        this.f274009e = vVar;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$selectCardFromReq$1");
        String str = this.f274008d;
        if (str == null || str.length() == 0) {
            str = C94680v.m119821E(this.f274009e);
            StringBuilder sb = new StringBuilder();
            sb.append("selectCardFromReq, isSelectedBefore=");
            C94680v vVar = this.f274009e;
            SnsMethodCalculate.markStartTimeMs("access$getMIsSelectCardSucc$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            boolean z = vVar.f273992M;
            SnsMethodCalculate.markEndTimeMs("access$getMIsSelectCardSucc$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            sb.append(z);
            sb.append(", use default cardId=");
            sb.append(str);
            Log.m105920e("AdLandingHalfEggCardComponent", sb.toString());
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("selectCardFromReq, isSelectedBefore=");
            C94680v vVar2 = this.f274009e;
            SnsMethodCalculate.markStartTimeMs("access$getMIsSelectCardSucc$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            boolean z2 = vVar2.f273992M;
            SnsMethodCalculate.markEndTimeMs("access$getMIsSelectCardSucc$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            sb4.append(z2);
            sb4.append(", cardId=");
            sb4.append(str);
            Log.m105924i("AdLandingHalfEggCardComponent", sb4.toString());
        }
        C94680v vVar3 = this.f274009e;
        SnsMethodCalculate.markStartTimeMs("access$getMIsSelectCardSucc$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        boolean z3 = vVar3.f273992M;
        SnsMethodCalculate.markEndTimeMs("access$getMIsSelectCardSucc$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        if (!z3) {
            C94680v vVar4 = this.f274009e;
            SnsMethodCalculate.markStartTimeMs("access$selectCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            boolean Q = vVar4.mo130278Q(str);
            SnsMethodCalculate.markEndTimeMs("access$selectCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            SnsMethodCalculate.markStartTimeMs("access$setMIsSelectCardSucc$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            vVar4.f273992M = Q;
            SnsMethodCalculate.markEndTimeMs("access$setMIsSelectCardSucc$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$selectCardFromReq$1");
    }
}
