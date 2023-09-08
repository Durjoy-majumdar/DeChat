package xp2;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import jq2.C9492e;
import jq2.C98984f;
import rq2.C101431r;
import tp2.C101914d;
import vr2.C102236a0;
import wp2.C102481b;

/* renamed from: xp2.d */
public class C102708d implements C102481b {

    /* renamed from: a */
    public AdClickActionInfo f303328a;

    /* renamed from: a */
    public void mo142089a(View view, int i, SnsInfo snsInfo, C101914d dVar) {
        SnsMethodCalculate.markStartTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
        if (view == null || snsInfo == null || snsInfo.getAdXml() == null) {
            Log.m105920e("SnsAd.AdGeneralAvatarAction", "afterAction, view or snsInfo or adXml is null");
            SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
        } else if (snsInfo.getAdInfo(i) == null) {
            Log.m105920e("SnsAd.AdGeneralAvatarAction", "afterAction, adInfo is null and source is " + i);
            SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
        } else {
            AdClickActionInfo adClickActionInfo = snsInfo.getAdXml().headAdClickActionInfo;
            this.f303328a = adClickActionInfo;
            if (adClickActionInfo == null) {
                Log.m105920e("SnsAd.AdGeneralAvatarAction", "afterAction, mHeadAdClickActionInfo is null and source is " + i);
                SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
                return;
            }
            if (dVar != null) {
                try {
                    SnsAdClick snsAdClick = (SnsAdClick) dVar.mo141403a("ext_sns_ad_click", null);
                    if (snsAdClick != null) {
                        int i2 = this.f303328a.f273641b;
                        if (i2 == 17) {
                            C101431r.m133118a(snsAdClick, 51);
                            C102236a0.m134773u0(snsAdClick);
                        } else if (i2 == 19) {
                            C101431r.m133118a(snsAdClick, 39);
                            C102236a0.m134773u0(snsAdClick);
                        }
                    }
                } catch (Throwable th) {
                    Log.m105920e("SnsAd.AdGeneralAvatarAction", "afterAction exp=" + android.util.Log.getStackTraceString(th));
                }
            }
            SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
        }
    }

    /* renamed from: b */
    public boolean mo126055b(View view, int i, SnsInfo snsInfo, C101914d dVar) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
        if (view == null || snsInfo == null || snsInfo.getAdXml() == null) {
            Log.m105920e("SnsAd.AdGeneralAvatarAction", "view or snsInfo or adXml is null");
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
            return false;
        }
        ADInfo adInfo = snsInfo.getAdInfo(i);
        if (adInfo == null) {
            Log.m105920e("SnsAd.AdGeneralAvatarAction", "adInfo is null and source is " + i);
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
            return false;
        }
        AdClickActionInfo adClickActionInfo = snsInfo.getAdXml().headAdClickActionInfo;
        this.f303328a = adClickActionInfo;
        if (adClickActionInfo == null) {
            Log.m105920e("SnsAd.AdGeneralAvatarAction", "mHeadAdClickActionInfo is null and source is " + i);
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
            return false;
        }
        SnsAdClick snsAdClick = null;
        if (dVar != null) {
            snsAdClick = (SnsAdClick) dVar.mo141403a("ext_sns_ad_click", null);
        }
        Context context = view.getContext();
        try {
            AdClickActionInfo adClickActionInfo2 = this.f303328a;
            int i2 = adClickActionInfo2.f273641b;
            if (i2 != 17) {
                if (i2 == 19) {
                    if (context != null) {
                        boolean a = C98984f.m128890a(context, adClickActionInfo2, i, snsAdClick);
                        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
                        return a;
                    }
                }
                SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
                return false;
            }
            boolean a2 = C9492e.m9175a(adClickActionInfo2, adInfo);
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
            return a2;
        } catch (Throwable th) {
            Log.m105920e("SnsAd.AdGeneralAvatarAction", "doAction exp=" + android.util.Log.getStackTraceString(th));
        }
    }
}
