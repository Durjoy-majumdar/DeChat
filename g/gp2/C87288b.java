package gp2;

import android.app.Activity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.VideoFullScreenActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import e42.C7594e;
import e42.C7596h;
import gy3.C87412m;
import hp2.C87580d;
import ip2.C87788c;
import java.util.HashMap;
import qs2.C101271i0;

/* renamed from: gp2.b */
public final class C87288b<T extends C7594e> extends C87580d<T> {
    /* renamed from: e */
    public String mo16e() {
        SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetAdPageDataSync");
        SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetAdPageDataSync");
        return "getAdPageDataSync";
    }

    /* renamed from: p */
    public C7596h mo121697p(C7596h hVar) {
        String str;
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetAdPageDataSync");
        C87412m.m108594g(hVar, "data");
        T t = this.f251227a;
        Activity e0 = t != null ? t.mo8720e0() : null;
        C101271i0 n8 = e0 instanceof SnsAdNativeLandingPagesUI ? ((SnsAdNativeLandingPagesUI) e0).mo132541n8() : e0 instanceof VideoFullScreenActivity ? ((VideoFullScreenActivity) e0).mo133148T0() : new C101271i0();
        HashMap hashMap = new HashMap();
        hashMap.put(FirebaseAnalytics.C113379b.SOURCE, Integer.valueOf(Util.nullAsInt(Integer.valueOf(n8.mo140742i()), 0)));
        hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(Util.nullAsInt(Integer.valueOf(n8.mo140742i()), 0)));
        hashMap.put("originScene", Integer.valueOf(Util.nullAsNil(Integer.valueOf(n8.mo140738e()))));
        hashMap.put("uxinfo", Util.nullAsNil(C87788c.m109226a(n8)));
        SnsMethodCalculate.markStartTimeMs("getUin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        String str2 = n8.f296621f;
        SnsMethodCalculate.markEndTimeMs("getUin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        hashMap.put("uin", Util.nullAsNil(str2));
        hashMap.put("bizId", Integer.valueOf(n8.mo140736c()));
        hashMap.put("aid", Util.nullAsNil(n8.mo140735b()));
        hashMap.put("traceId", Util.nullAsNil(n8.mo140743j()));
        hashMap.put("canvasId", Long.valueOf(Util.safeParseLong(n8.mo140737d())));
        SnsMethodCalculate.markStartTimeMs("getViewId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        String str3 = "";
        if (Util.isNullOrNil(n8.f296629n)) {
            SnsMethodCalculate.markEndTimeMs("getViewId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
            str = str3;
        } else {
            str = n8.f296629n;
            SnsMethodCalculate.markEndTimeMs("getViewId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        }
        hashMap.put("viewId", Util.nullAsNil(str));
        hashMap.put("snsId", Util.nullAsNil(n8.mo140740g()));
        hashMap.put("rawSnsId", Util.nullAsNil(n8.mo140740g()));
        SnsMethodCalculate.markStartTimeMs("getCommInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        if (Util.isNullOrNil(n8.f296630o)) {
            SnsMethodCalculate.markEndTimeMs("getCommInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        } else {
            str3 = n8.f296630o;
            SnsMethodCalculate.markEndTimeMs("getCommInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        }
        hashMap.put("commInfo", Util.nullAsNil(str3));
        hashMap.put("adExtInfo", Util.nullAsNil(n8.mo140734a()));
        hashMap.put("pageId", Util.nullAsNil(n8.mo140739f()));
        hashMap.put("isHalfScreenMode", Boolean.valueOf(n8.mo140747n()));
        SnsMethodCalculate.markStartTimeMs("isNativeAd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        boolean z = n8.f296618c;
        SnsMethodCalculate.markEndTimeMs("isNativeAd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        hashMap.put("isNativeAd", Boolean.valueOf(z));
        C7596h k = mo120846k(hashMap);
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetAdPageDataSync");
        return k;
    }
}
