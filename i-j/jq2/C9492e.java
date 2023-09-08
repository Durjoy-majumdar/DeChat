package jq2;

import c00.C0405n;
import c30.C104289g;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import java.util.HashMap;
import java.util.Map;
import p206nj.C117627q;
import u73.C101982p;

/* renamed from: jq2.e */
public class C9492e {
    /* renamed from: a */
    public static boolean m9175a(AdClickActionInfo adClickActionInfo, ADInfo aDInfo) {
        SnsMethodCalculate.markStartTimeMs("doJumpAdBrandRegion", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
        if (adClickActionInfo == null || aDInfo == null) {
            Log.m105920e("AdJumpBrandRegion", "doJumpAdBrandRegion, adClickActionInfo or adInfo is null");
            SnsMethodCalculate.markEndTimeMs("doJumpAdBrandRegion", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return false;
        }
        String str = adClickActionInfo.f273656i0;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("AdJumpBrandRegion", "doJumpAdBrandRegion, searchQuery is null or nil");
            SnsMethodCalculate.markEndTimeMs("doJumpAdBrandRegion", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return false;
        }
        try {
            String str2 = aDInfo.uxInfo;
            C104289g gVar = new C104289g();
            gVar.put("uxInfo", str2);
            HashMap hashMap = new HashMap();
            hashMap.put(SearchIntents.EXTRA_QUERY, str);
            hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 105);
            hashMap.put("thirdExtParam", gVar.toString());
            boolean d = m9178d(hashMap);
            SnsMethodCalculate.markEndTimeMs("doJumpAdBrandRegion", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return d;
        } catch (Throwable th) {
            Log.m105920e("AdJumpBrandRegion", "doJumpAdBrandRegion, exp is " + th.toString());
            SnsMethodCalculate.markEndTimeMs("doJumpAdBrandRegion", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return false;
        }
    }

    /* renamed from: b */
    public static int m9176b(Map<String, Object> map, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("getSaveInt", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
        String c = m9177c(map, str);
        if (Util.isNullOrNil(c)) {
            SnsMethodCalculate.markEndTimeMs("getSaveInt", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return i;
        }
        try {
            int parseInt = Integer.parseInt(c);
            SnsMethodCalculate.markEndTimeMs("getSaveInt", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return parseInt;
        } catch (Exception unused) {
            SnsMethodCalculate.markEndTimeMs("getSaveInt", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return i;
        }
    }

    /* renamed from: c */
    public static String m9177c(Map<String, Object> map, String str) {
        SnsMethodCalculate.markStartTimeMs("getSaveString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
        String str2 = "";
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj != null) {
                str2 = obj.toString();
            }
            SnsMethodCalculate.markEndTimeMs("getSaveString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return str2;
        }
        SnsMethodCalculate.markEndTimeMs("getSaveString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
        return str2;
    }

    /* renamed from: d */
    public static boolean m9178d(Map<String, Object> map) {
        SnsMethodCalculate.markStartTimeMs("openSosHomeWebView", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
        C0405n nVar = (C0405n) C86312j.m106911c(C0405n.class);
        if (nVar == null) {
            Log.m105920e("AdJumpBrandRegion", "IWebSearchApiLogicService is null");
            SnsMethodCalculate.markEndTimeMs("openSosHomeWebView", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
            return false;
        }
        String c = m9177c(map, SearchIntents.EXTRA_QUERY);
        int b = m9176b(map, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
        int b2 = m9176b(map, "type", 0);
        String obj = map.get("thirdExtParam") == null ? "" : map.get("thirdExtParam").toString();
        String lh02 = nVar.lh0(b);
        Map<String, String> hn = nVar.mo280hn(b, true, 0);
        hn.put(SearchIntents.EXTRA_QUERY, c);
        hn.put("sessionId", lh02);
        hn.put("thirdExtParam", C117627q.m165908a(obj));
        ((C101982p) C86312j.m106911c(C101982p.class)).mo6878da(MMApplicationContext.getContext(), b, c, lh02, true, hn, b2, true);
        SnsMethodCalculate.markEndTimeMs("openSosHomeWebView", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpBrandRegionHelper");
        return true;
    }
}
