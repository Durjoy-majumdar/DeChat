package com.tencent.p014mm.plugin.sns.p104ad.magicbrush;

import a70.C112760b;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.plugin.magicbrush.base.MBBootsPkgManagementBiz;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.vfs.C86013q1;
import e42.C86425a;
import e42.C86426b;
import e42.C86427c;
import fp2.C87070f;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdPkgManager */
public final class MagicBrushSclSnsAdPkgManager extends MBBootsPkgManagementBiz {

    /* renamed from: d */
    public final String f249067d = "surface/app/MagicAdLandPage.wspkg";

    /* renamed from: e */
    public final String f249068e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagicBrushSclSnsAdPkgManager(String str) {
        super(str);
        C87412m.m108594g(str, "instanceName");
        mo109579c();
        mo109579c();
        this.f249068e = "sns/mb/MagicAdLandPage.wspkg";
    }

    /* renamed from: c */
    public String mo109579c() {
        SnsMethodCalculate.markStartTimeMs("provideAppId", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdPkgManager");
        SnsMethodCalculate.markEndTimeMs("provideAppId", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdPkgManager");
        return MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_LAND_PAGE;
    }

    /* renamed from: h */
    public boolean mo118396h() {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("checkBootsEnable", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdPkgManager");
        C87070f fVar = C87070f.f252656a;
        SnsMethodCalculate.markStartTimeMs("getUseLocalWsPkg", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        if (fVar.mo121543a()) {
            z = C86013q1.m106450k(C112760b.m154200H() + ".localwspkg");
        } else {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("getUseLocalWsPkg", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        boolean z2 = !z;
        SnsMethodCalculate.markEndTimeMs("checkBootsEnable", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdPkgManager");
        return z2;
    }

    /* renamed from: i */
    public C86425a mo112232i() {
        SnsMethodCalculate.markStartTimeMs("getBaseEmbedPkgConfig", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdPkgManager");
        C86425a aVar = new C86425a(this.f249068e, 1, "5bfc9eac99e00cae6224d1a2f7910c33");
        SnsMethodCalculate.markEndTimeMs("getBaseEmbedPkgConfig", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdPkgManager");
        return aVar;
    }

    /* renamed from: k */
    public C86427c mo112233k() {
        SnsMethodCalculate.markStartTimeMs("getDebugConfig", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdPkgManager");
        C86427c cVar = new C86427c(this.f249067d, C86426b.DEFAULT);
        SnsMethodCalculate.markEndTimeMs("getDebugConfig", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdPkgManager");
        return cVar;
    }

    /* renamed from: m */
    public String mo112234m() {
        SnsMethodCalculate.markStartTimeMs("getMainScriptPath", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdPkgManager");
        SnsMethodCalculate.markEndTimeMs("getMainScriptPath", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdPkgManager");
        return "/index.js";
    }
}
