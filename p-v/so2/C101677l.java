package so2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import ps2.C100894u;
import ps2.C118127b0;
import qs2.C101255a0;
import qs2.C101264f;
import vr2.C102260r;

/* renamed from: so2.l */
public class C101677l extends C101255a0 {
    @C118127b0(resType = 1)

    /* renamed from: A */
    public String f297632A;

    /* renamed from: B */
    public C101264f f297633B;

    /* renamed from: C */
    public String f297634C;

    /* renamed from: D */
    public String f297635D;

    /* renamed from: E */
    public String f297636E;

    /* renamed from: F */
    public String f297637F;

    /* renamed from: G */
    public String f297638G;
    @C118127b0(resType = 1)

    /* renamed from: H */
    public String f297639H;

    /* renamed from: I */
    public String f297640I;

    /* renamed from: J */
    public String f297641J;

    /* renamed from: K */
    public float f297642K;

    /* renamed from: L */
    public C101678a[] f297643L = new C101678a[4];

    /* renamed from: z */
    public String f297644z;

    /* renamed from: so2.l$a */
    public static class C101678a {

        /* renamed from: a */
        public String f297645a;

        /* renamed from: b */
        public String f297646b;

        /* renamed from: c */
        public String f297647c;

        /* renamed from: d */
        public String f297648d;

        /* renamed from: e */
        public String f297649e;

        /* renamed from: f */
        public String f297650f;

        /* renamed from: g */
        public int f297651g;

        /* renamed from: h */
        public C101678a f297652h;

        /* renamed from: i */
        public C101678a f297653i;
    }

    /* renamed from: b */
    public static C101677l m133555b(Map<String, String> map, String str, int i, int i2, int i3, int i4) {
        Map<String, String> map2 = map;
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHBCardCompInfo");
        try {
            C101677l lVar = new C101677l();
            lVar.f297632A = Util.nullAsNil(map.get(str + ".hbImgUrl"));
            C101255a0 i5 = C100894u.m132229i(map, str + ".componentItem", i, i2, i3, i4);
            if (i5 instanceof C101264f) {
                i5.f296498d = 0.0f;
                i5.f296497c = 0.0f;
                i5.f296499e = 0.0f;
                i5.f296500f = 0.0f;
                lVar.f297633B = (C101264f) i5;
            }
            lVar.f297634C = Util.nullAsNil(map.get(str + ".title"));
            lVar.f297638G = Util.nullAsNil(map.get(str + ".shareTitle"));
            lVar.f297639H = Util.nullAsNil(map.get(str + ".shareThumbUrl"));
            lVar.f297637F = Util.nullAsNil(map.get(str + ".jumpUrl"));
            lVar.f297635D = Util.nullAsNil(map.get(str + ".inviteLinkTxt"));
            String nullAsNil = Util.nullAsNil(map.get(str + ".inviteLinkTxtColor"));
            lVar.f297636E = C102260r.m134851T(nullAsNil, Util.nullAsNil(map.get(str + ".inviteLinkTxtColorAlpha")));
            String nullAsNil2 = Util.nullAsNil(map.get(str + ".btnTxtColor"));
            String T = C102260r.m134851T(nullAsNil2, Util.nullAsNil(map.get(str + ".btnTxtColorAlpha")));
            lVar.f297640I = T;
            if (TextUtils.isEmpty(T)) {
                lVar.f297640I = "#FFFFFF";
            }
            String nullAsNil3 = Util.nullAsNil(map.get(str + ".btnBgColor"));
            String T2 = C102260r.m134851T(nullAsNil3, Util.nullAsNil(map.get(str + ".btnBgColorAlpha")));
            lVar.f297641J = T2;
            if (TextUtils.isEmpty(T2)) {
                lVar.f297641J = "#FA5151";
            }
            int safeParseInt = Util.safeParseInt(map.get(str + ".btnCornerRadius"));
            if (safeParseInt <= 0) {
                safeParseInt = 8;
            }
            int i6 = i2;
            int i7 = i3;
            lVar.f297642K = C100894u.m132234n((double) safeParseInt, 1, i2, i3);
            int i8 = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".item");
                sb.append(i8 == 0 ? "" : Integer.valueOf(i8));
                String sb4 = sb.toString();
                if (!map.containsKey(sb4)) {
                    SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHBCardCompInfo");
                    return lVar;
                }
                int safeParseInt2 = Util.safeParseInt(map.get(sb4 + ".subType"));
                if (safeParseInt2 >= 1) {
                    if (safeParseInt2 <= 4) {
                        lVar.f297643L[safeParseInt2 - 1] = m133556c(map, sb4);
                    }
                }
                i8++;
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.AdLandingPageComponentInfo", "parse, exp=" + th.toString());
            Log.m105920e("MicroMsg.AdLandingPageComponentInfo", "parse, null");
            SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHBCardCompInfo");
            return null;
        }
    }

    /* renamed from: c */
    public static C101678a m133556c(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parseHBCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHBCardCompInfo");
        Log.m105918d("MicroMsg.AdLandingPageComponentInfo", "parseHBCardInfo, pref=" + str);
        try {
            C101678a aVar = new C101678a();
            if (Util.safeParseInt(map.get(str + ".subType")) != 3) {
                aVar.f297645a = Util.nullAsNil(map.get(str + ".headline"));
                aVar.f297646b = Util.nullAsNil(map.get(str + ".desc"));
                aVar.f297647c = Util.nullAsNil(map.get(str + ".decorationTitle"));
                aVar.f297648d = Util.nullAsNil(map.get(str + ".btnTitle"));
                Util.nullAsNil(map.get(str + ".btnTitleAfterAction"));
                aVar.f297649e = Util.nullAsNil(map.get(str + ".btnTitleExpired"));
                aVar.f297650f = Util.nullAsNil(map.get(str + ".btnTitleGetByOther"));
                aVar.f297651g = Util.safeParseInt(map.get(str + ".expireTime"));
            }
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".item");
                sb.append(i == 0 ? "" : Integer.valueOf(i));
                String sb4 = sb.toString();
                if (!map.containsKey(sb4)) {
                    SnsMethodCalculate.markEndTimeMs("parseHBCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHBCardCompInfo");
                    return aVar;
                }
                int safeParseInt = Util.safeParseInt(map.get(sb4 + ".subType"));
                if (safeParseInt == 1) {
                    aVar.f297652h = m133556c(map, sb4);
                } else if (safeParseInt == 2) {
                    aVar.f297653i = m133556c(map, sb4);
                }
                i++;
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.AdLandingPageComponentInfo", "parseHBCardInfo, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("parseHBCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHBCardCompInfo");
            return null;
        }
    }
}
