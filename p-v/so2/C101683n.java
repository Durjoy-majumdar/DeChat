package so2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Map;
import qs2.C101287r;

/* renamed from: so2.n */
public final class C101683n extends C101287r {

    /* renamed from: Z */
    public final C101685b f297672Z;

    /* renamed from: so2.n$a */
    public static final class C101684a {

        /* renamed from: a */
        public final String f297673a;

        /* renamed from: b */
        public final String f297674b;

        /* renamed from: c */
        public final int f297675c;

        public C101684a(String str, String str2, int i) {
            C87412m.m108594g(str, "brandUsername");
            this.f297673a = str;
            this.f297674b = str2;
            this.f297675c = i;
        }

        /* renamed from: a */
        public final String mo141132a() {
            SnsMethodCalculate.markStartTimeMs("getBrandUsername", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$BrandFollowInfo");
            String str = this.f297673a;
            SnsMethodCalculate.markEndTimeMs("getBrandUsername", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$BrandFollowInfo");
            return str;
        }
    }

    /* renamed from: so2.n$b */
    public static final class C101685b {

        /* renamed from: a */
        public final String f297676a;

        /* renamed from: b */
        public final String f297677b;

        /* renamed from: c */
        public final int f297678c;

        /* renamed from: d */
        public final int f297679d;

        /* renamed from: e */
        public final C101684a f297680e;

        /* renamed from: f */
        public final C101686c f297681f;

        public C101685b(String str, String str2, String str3, int i, int i2, C101684a aVar, C101686c cVar) {
            C87412m.m108594g(aVar, "brandFollowInfo");
            C87412m.m108594g(cVar, "finderFollowInfo");
            this.f297676a = str;
            this.f297677b = str2;
            this.f297678c = i;
            this.f297679d = i2;
            this.f297680e = aVar;
            this.f297681f = cVar;
        }

        /* renamed from: a */
        public final C101684a mo141133a() {
            SnsMethodCalculate.markStartTimeMs("getBrandFollowInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
            C101684a aVar = this.f297680e;
            SnsMethodCalculate.markEndTimeMs("getBrandFollowInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
            return aVar;
        }

        /* renamed from: b */
        public final C101686c mo141134b() {
            SnsMethodCalculate.markStartTimeMs("getFinderFollowInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
            C101686c cVar = this.f297681f;
            SnsMethodCalculate.markEndTimeMs("getFinderFollowInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
            return cVar;
        }
    }

    /* renamed from: so2.n$c */
    public static final class C101686c {

        /* renamed from: a */
        public final String f297682a;

        /* renamed from: b */
        public final String f297683b;

        public C101686c(String str, String str2) {
            C87412m.m108594g(str, "finderUsername");
            this.f297682a = str;
            this.f297683b = str2;
        }

        /* renamed from: a */
        public final String mo141135a() {
            SnsMethodCalculate.markStartTimeMs("getFinderUsername", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$FinderFollowInfo");
            String str = this.f297682a;
            SnsMethodCalculate.markEndTimeMs("getFinderUsername", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$FinderFollowInfo");
            return str;
        }
    }

    public C101683n(C101685b bVar) {
        this.f297672Z = bVar;
    }

    /* renamed from: c */
    public static final C101683n m133562c(Map<String, String> map, String str) {
        C101683n nVar;
        int i;
        C101684a aVar;
        C101683n nVar2;
        C101685b bVar;
        C101686c cVar;
        Map<String, String> map2 = map;
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo");
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$Companion");
        C87412m.m108594g(map2, "values");
        C87412m.m108594g(str2, "adLandingComponetsStr");
        String str3 = str2 + ".combineFollowInfo";
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo$Companion");
        C87412m.m108594g(str3, "adLandingComponetsStr");
        String nullAs = Util.nullAs(map2.get(str3 + ".headTitle"), "");
        String nullAs2 = Util.nullAs(map2.get(str3 + ".headImageUrl"), "");
        String nullAs3 = Util.nullAs(map2.get(str3 + ".compatibleJumpUrl"), "");
        int safeParseInt = Util.safeParseInt(map2.get(str3 + ".allFollowedJumpType"));
        int safeParseInt2 = Util.safeParseInt(map2.get(str3 + ".allFollowSuccessJumpType"));
        String str4 = str3 + ".brandFollowInfo";
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$BrandFollowInfo$Companion");
        C87412m.m108594g(str4, "adLandingComponetsStr");
        String str5 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo";
        String str6 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$Companion";
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        C101683n nVar3 = nVar;
        sb.append(".brandUsername");
        String str7 = map2.get(sb.toString());
        if (str7 == null) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$BrandFollowInfo$Companion");
            i = safeParseInt2;
            aVar = null;
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str4);
            i = safeParseInt2;
            sb4.append(".brandDesc");
            C101684a aVar2 = new C101684a(str7, Util.nullAs(map2.get(sb4.toString()), ""), Util.safeParseInt(map2.get(str4 + ".openType"), 0));
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$BrandFollowInfo$Companion");
            aVar = aVar2;
        }
        if (aVar == null) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo$Companion");
        } else {
            String str8 = str3 + ".finderFollowInfo";
            SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$FinderFollowInfo$Companion");
            C87412m.m108594g(str8, "adLandingComponetsStr");
            String str9 = map2.get(str8 + ".finderUsername");
            if (str9 == null) {
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$FinderFollowInfo$Companion");
                cVar = null;
            } else {
                C101686c cVar2 = new C101686c(str9, Util.nullAs(map2.get(str8 + ".finderDesc"), ""));
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$FinderFollowInfo$Companion");
                cVar = cVar2;
            }
            if (cVar == null) {
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo$Companion");
            } else {
                C101685b bVar2 = new C101685b(nullAs, nullAs2, nullAs3, safeParseInt, i, aVar, cVar);
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo$Companion");
                bVar = bVar2;
                nVar2 = nVar3;
                nVar2 = new C101683n(bVar);
                SnsMethodCalculate.markEndTimeMs("parse", str6);
                SnsMethodCalculate.markEndTimeMs("parse", str5);
                return nVar2;
            }
        }
        nVar2 = nVar3;
        bVar = null;
        nVar2 = new C101683n(bVar);
        SnsMethodCalculate.markEndTimeMs("parse", str6);
        SnsMethodCalculate.markEndTimeMs("parse", str5);
        return nVar2;
    }

    /* renamed from: b */
    public final C101685b mo141131b() {
        SnsMethodCalculate.markStartTimeMs("getCombineFollowInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo");
        C101685b bVar = this.f297672Z;
        SnsMethodCalculate.markEndTimeMs("getCombineFollowInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo");
        return bVar;
    }
}
