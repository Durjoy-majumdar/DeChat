package lo2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import java.net.URI;
import qs2.C101297w;
import te3.C101804kv2;
import vr2.C102236a0;

/* renamed from: lo2.n */
public final class C99556n {
    /* renamed from: a */
    public static void m129938a(C101297w wVar, boolean z) {
        boolean z2;
        SnsMethodCalculate.markStartTimeMs("checkAdLandingPageSightVideoForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        if (wVar == null) {
            SnsMethodCalculate.markEndTimeMs("checkAdLandingPageSightVideoForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            return;
        }
        SnsMethodCalculate.markStartTimeMs("isExptLandingPageSightVideoEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        boolean z3 = true;
        try {
            z2 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_landing_sight_video_h265, 0) > 0;
            SnsMethodCalculate.markEndTimeMs("isExptLandingPageSightVideoEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        } catch (Throwable th) {
            Log.m105920e("AdH265Helper", "isExptLandingPageSightVideoEnableH265, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("isExptLandingPageSightVideoEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            z2 = false;
        }
        if (!z2 || wVar.f296766M) {
            z3 = false;
        }
        wVar.f296769z = m129947j(wVar.f296769z, z3);
        Log.m105924i("AdH265Helper", "checkAdLandingPageSightForH265, expt=" + z2 + ", forbidCdn=" + wVar.f296766M + ", isPreload=" + z + ", ret url=" + wVar.f296769z);
        SnsMethodCalculate.markEndTimeMs("checkAdLandingPageSightVideoForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
    }

    /* renamed from: b */
    public static void m129939b(ADXml aDXml, C101804kv2 kv22, String str) {
        String str2;
        SnsMethodCalculate.markStartTimeMs("checkAdSupportH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = true;
        if (aDXml == null || kv22 == null || !kv22.f298681N) {
            StringBuilder sb = new StringBuilder();
            sb.append("checkAdSupportH265, adXml==null?");
            boolean z2 = false;
            sb.append(aDXml == null);
            sb.append(", media==null?");
            if (kv22 != null) {
                z = false;
            }
            sb.append(z);
            sb.append(", isAd=");
            if (kv22 != null) {
                z2 = kv22.f298681N;
            }
            sb.append(z2);
            Log.m105928w("AdH265Helper", sb.toString());
            SnsMethodCalculate.markEndTimeMs("checkAdSupportH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            return;
        }
        if (aDXml.isFullCardAd()) {
            SnsMethodCalculate.markStartTimeMs("isExptFullCardAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            SnsMethodCalculate.markEndTimeMs("isExptFullCardAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            str2 = "fullcardAd enable h265";
        } else if (aDXml.isCardAd()) {
            SnsMethodCalculate.markStartTimeMs("isExptCardAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            SnsMethodCalculate.markEndTimeMs("isExptCardAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            str2 = "cardAd enable h265";
        } else {
            SnsMethodCalculate.markStartTimeMs("isExptNormAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            SnsMethodCalculate.markEndTimeMs("isExptNormAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            str2 = "normalAd enable h265";
        }
        m129946i(kv22, true);
        Log.m105924i("AdH265Helper", "checkAdSupportH265, " + str2 + ", snsId=" + str + ", timeCost=" + (System.currentTimeMillis() - currentTimeMillis));
        SnsMethodCalculate.markEndTimeMs("checkAdSupportH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
    }

    /* renamed from: c */
    public static void m129940c(SnsInfo snsInfo, C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("checkAdSupportH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        if (snsInfo != null && snsInfo.isAd()) {
            m129939b(snsInfo.getAdXml(), kv22, C102236a0.m134765q0(snsInfo.field_snsId));
        }
        SnsMethodCalculate.markEndTimeMs("checkAdSupportH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
    }

    /* renamed from: d */
    public static String m129941d(String str) {
        SnsMethodCalculate.markStartTimeMs("deleteUrlH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        try {
            if (TextUtils.isEmpty(str)) {
                SnsMethodCalculate.markEndTimeMs("deleteUrlH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
                return str;
            } else if (!str.contains("svpuseh265flag")) {
                SnsMethodCalculate.markEndTimeMs("deleteUrlH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
                return str;
            } else {
                URI uri = new URI(str);
                String query = uri.getQuery();
                if (!TextUtils.isEmpty(query)) {
                    if (query.contains("svpuseh265flag=0")) {
                        query = query.replace("&svpuseh265flag=0", "").replace("svpuseh265flag=0", "");
                    }
                    if (query.contains("svpuseh265flag=1")) {
                        query = query.replace("&svpuseh265flag=1", "").replace("svpuseh265flag=1", "");
                    }
                    if (query.startsWith("&")) {
                        query = query.replaceFirst("&", "");
                    }
                }
                if (TextUtils.isEmpty(query)) {
                    query = null;
                }
                String uri2 = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), query, uri.getFragment()).toString();
                SnsMethodCalculate.markEndTimeMs("deleteUrlH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
                return uri2;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("AdH265Helper", e, "", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("deleteUrlH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            return str;
        }
    }

    /* renamed from: e */
    public static boolean m129942e() {
        SnsMethodCalculate.markStartTimeMs("isDebug", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        SnsMethodCalculate.markEndTimeMs("isDebug", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        return false;
    }

    /* renamed from: f */
    public static void m129943f(int i, boolean z, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("reportAdVideoH265Req", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        int i2 = i == 1 ? (!z || !z2) ? !z ? 14 : 15 : 13 : 0;
        if (i2 > 0) {
            C115669n.INSTANCE.mo175911u(1579, i2);
        }
        Log.m105924i("AdH265Helper", "report, videoPlayerType = " + i + ", urlHasFlag = " + z + ", cdnHasFlag = " + z2 + ", key = " + i2);
        SnsMethodCalculate.markEndTimeMs("reportAdVideoH265Req", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
    }

    /* renamed from: g */
    public static void m129944g(boolean z, boolean z2, boolean z3) {
        SnsMethodCalculate.markStartTimeMs("reportAdVideoH265Req", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        int i = z ? (!z2 || !z3) ? !z2 ? 2 : 3 : 1 : (!z2 || !z3) ? !z2 ? 5 : 6 : 4;
        if (i > 0) {
            C115669n.INSTANCE.mo175911u(1579, i);
        }
        Log.m105924i("AdH265Helper", "report, isOnline=" + z + ", urlHasFlag=" + z2 + ", cdnHasFlag=" + z3 + ", key=" + i);
        SnsMethodCalculate.markEndTimeMs("reportAdVideoH265Req", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
    }

    /* renamed from: h */
    public static String m129945h(String str, boolean z) {
        String str2;
        SnsMethodCalculate.markStartTimeMs("setMediaIdForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        try {
            if (TextUtils.isEmpty(str)) {
                Log.m105920e("AdH265Helper", "setMediaIdForH265, mediaId==null");
            } else if (z) {
                if (!str.contains("_hvec")) {
                    str2 = str + "_hvec";
                    Log.m105924i("AdH265Helper", "setMediaIdForH265, raw=" + str + ", ret=" + str2 + ", enable=" + z);
                    SnsMethodCalculate.markEndTimeMs("setMediaIdForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
                    return str2;
                }
            } else if (str.contains("_hvec")) {
                str2 = str.replace("_hvec", "");
                Log.m105924i("AdH265Helper", "setMediaIdForH265, raw=" + str + ", ret=" + str2 + ", enable=" + z);
                SnsMethodCalculate.markEndTimeMs("setMediaIdForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
                return str2;
            }
        } catch (Throwable th) {
            Log.m105920e("AdH265Helper", "setMediaIdForH265, exp=" + th.toString());
        }
        str2 = str;
        Log.m105924i("AdH265Helper", "setMediaIdForH265, raw=" + str + ", ret=" + str2 + ", enable=" + z);
        SnsMethodCalculate.markEndTimeMs("setMediaIdForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        return str2;
    }

    /* renamed from: i */
    public static void m129946i(C101804kv2 kv22, boolean z) {
        SnsMethodCalculate.markStartTimeMs("setMediaInfoForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        long currentTimeMillis = System.currentTimeMillis();
        if (kv22 == null) {
            Log.m105920e("AdH265Helper", "setMediaInfoForH265, media==null");
            SnsMethodCalculate.markEndTimeMs("setMediaInfoForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        } else if (!kv22.f298681N) {
            Log.m105920e("AdH265Helper", "setMediaInfoForH265, !media.isAd");
            SnsMethodCalculate.markEndTimeMs("setMediaInfoForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        } else {
            kv22.f298692g = m129947j(kv22.f298692g, z);
            kv22.f298689d = m129945h(kv22.f298689d, z);
            long currentTimeMillis2 = System.currentTimeMillis();
            Log.m105924i("AdH265Helper", "setMediaInfoForH265, media.hash=" + kv22.hashCode() + ", enableH265=" + z + ", meida.enc=" + kv22.f298671D + ", cost=" + (currentTimeMillis2 - currentTimeMillis));
            SnsMethodCalculate.markEndTimeMs("setMediaInfoForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        }
    }

    /* renamed from: j */
    public static String m129947j(String str, boolean z) {
        String str2;
        SnsMethodCalculate.markStartTimeMs("setMediaUrlForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        try {
            if (!TextUtils.isEmpty(str)) {
                str2 = z ? !str.contains("svpuseh265flag") ? C95198o2.m121129a(str, "svpuseh265flag=1") : str.replace("svpuseh265flag=0", "svpuseh265flag=1") : m129941d(str);
                Log.m105918d("AdH265Helper", "setMediaUrlForH265, raw=" + str + ", ret=" + str2 + ", enable=" + z);
                SnsMethodCalculate.markEndTimeMs("setMediaUrlForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
                return str2;
            }
            Log.m105920e("AdH265Helper", "setMediaUrlForH265, media.Url==null");
            str2 = str;
            Log.m105918d("AdH265Helper", "setMediaUrlForH265, raw=" + str + ", ret=" + str2 + ", enable=" + z);
            SnsMethodCalculate.markEndTimeMs("setMediaUrlForH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            return str2;
        } catch (Throwable th) {
            Log.m105920e("AdH265Helper", "setMediaUrlForH265, exp=" + th.toString());
        }
    }
}
