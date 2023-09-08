package so2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Map;
import qs2.C101287r;

/* renamed from: so2.c */
public final class C101667c extends C101287r {

    /* renamed from: Z */
    public final String f297597Z;

    /* renamed from: a0 */
    public final String f297598a0;

    /* renamed from: b0 */
    public final String f297599b0;

    /* renamed from: c0 */
    public final String f297600c0;

    public C101667c(String str, String str2, String str3, String str4) {
        C87412m.m108594g(str, "pkg");
        C87412m.m108594g(str2, "appPageUrlAndroid");
        C87412m.m108594g(str3, "appid");
        C87412m.m108594g(str4, "doubleLinkH5Url");
        this.f297597Z = str;
        this.f297598a0 = str2;
        this.f297599b0 = str3;
        this.f297600c0 = str4;
    }

    /* renamed from: b */
    public static final C101667c m133553b(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo$Companion");
        C87412m.m108594g(map, "values");
        C87412m.m108594g(str, "adLandingComponentsStr");
        String nullAs = Util.nullAs(map.get(str + ".pkg"), "");
        C87412m.m108593f(nullAs, "nullAs(values[\"$adLandingComponentsStr.pkg\"], \"\")");
        String nullAs2 = Util.nullAs(map.get(str + ".appPageUrlAndroid"), "");
        C87412m.m108593f(nullAs2, "nullAs(values[\"$adLandin….appPageUrlAndroid\"], \"\")");
        String nullAs3 = Util.nullAs(map.get(str + ".appid"), "");
        C87412m.m108593f(nullAs3, "nullAs(values[\"$adLandin…omponentsStr.appid\"], \"\")");
        String nullAs4 = Util.nullAs(map.get(str + ".doubleLinkH5Url"), "");
        C87412m.m108593f(nullAs4, "nullAs(values[\"$adLandin…tr.doubleLinkH5Url\"], \"\")");
        C101667c cVar = new C101667c(nullAs, nullAs2, nullAs3, nullAs4);
        SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo$Companion");
        SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingDoubleLinkInfo");
        return cVar;
    }
}
