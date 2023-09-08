package xp2;

import android.content.Context;
import android.view.View;
import co2.C55057m;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import lo2.C99542h0;
import p213oh.C11412b;
import rq2.C101431r;
import t91.C64208c;
import tp2.C101914d;
import vr2.C102236a0;
import wp2.C102481b;

/* renamed from: xp2.b */
public class C102706b implements C102481b {
    /* renamed from: a */
    public void mo142089a(View view, int i, SnsInfo snsInfo, C101914d dVar) {
        SnsAdClick snsAdClick;
        SnsMethodCalculate.markStartTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
        SnsMethodCalculate.markStartTimeMs("reportAd", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("reportAd", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
        } else {
            try {
                ADXml adXml = snsInfo.getAdXml();
                C55057m mVar = adXml.adHeadFinderProfile;
                if (mVar == null) {
                    SnsMethodCalculate.markEndTimeMs("reportAd", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
                } else {
                    String str = mVar.f154589a;
                    String q0 = C102236a0.m134765q0(snsInfo.field_snsId);
                    if (adXml.adFinderInfo == null) {
                        String str2 = adXml.adHeadFinderProfile.f154590b;
                    }
                    C64208c.f181951a.mo89032g(C99542h0.m129912j(snsInfo.getUxinfo(), q0, 1), str);
                    SnsMethodCalculate.markEndTimeMs("reportAd", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
                }
            } catch (Exception e) {
                Object[] objArr = {e.getMessage()};
                int i2 = C11412b.f33577a;
                Log.printErrStackTrace("HABBYGE-MALI.AdFinderProfileAvatarAction", e, "reportAd crash: %s", objArr);
            }
        }
        if (!(dVar == null || (snsAdClick = (SnsAdClick) dVar.mo141403a("ext_sns_ad_click", null)) == null)) {
            C101431r.m133118a(snsAdClick, 41);
            C102236a0.m134773u0(snsAdClick);
        }
        SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
    }

    /* renamed from: b */
    public boolean mo126055b(View view, int i, SnsInfo snsInfo, C101914d dVar) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
        if (view == null || snsInfo == null || snsInfo.getAdXml() == null) {
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
            return false;
        }
        C55057m mVar = snsInfo.getAdXml().adHeadFinderProfile;
        if (mVar == null) {
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
            return false;
        }
        try {
            Context context = view.getContext();
            if (!(context == null || snsInfo.getAdInfo(i) == null)) {
                ADXml adXml = snsInfo.getAdXml();
                SnsMethodCalculate.markStartTimeMs("isAvatarToFinderProfile", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
                boolean z = (adXml == null || adXml.headClickType != 4 || adXml.adHeadFinderProfile == null) ? false : true;
                SnsMethodCalculate.markEndTimeMs("isAvatarToFinderProfile", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
                if (z) {
                    boolean g = C99542h0.m129909g(context, mVar.f154589a, snsInfo.getAdInfo(i).uxInfo, C102236a0.m134765q0(snsInfo.field_snsId), 1);
                    SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
                    return g;
                }
            }
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
            return false;
        } catch (Throwable th) {
            Log.m105920e("HABBYGE-MALI.AdFinderProfileAvatarAction", "doAction exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
            return false;
        }
    }
}
