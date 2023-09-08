package so2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ps2.C100894u;
import qs2.C101255a0;
import vr2.C102260r;

/* renamed from: so2.m */
public final class C101679m extends C101255a0 {

    /* renamed from: A */
    public List<C101680a> f297654A = new ArrayList();

    /* renamed from: B */
    public String f297655B = "";

    /* renamed from: C */
    public int f297656C;

    /* renamed from: D */
    public int f297657D;

    /* renamed from: z */
    public C101682b f297658z = new C101682b();

    /* renamed from: so2.m$a */
    public static final class C101680a {

        /* renamed from: i */
        public static final C101681a f297659i = new C101681a((C8480h) null);

        /* renamed from: a */
        public String f297660a = "";

        /* renamed from: b */
        public String f297661b;

        /* renamed from: c */
        public String f297662c;

        /* renamed from: d */
        public String f297663d;

        /* renamed from: e */
        public boolean f297664e;

        /* renamed from: f */
        public C101255a0 f297665f;

        /* renamed from: g */
        public C101255a0 f297666g;

        /* renamed from: h */
        public C101255a0 f297667h;

        /* renamed from: so2.m$a$a */
        public static final class C101681a {
            public C101681a(C8480h hVar) {
            }

            /* renamed from: a */
            public final C101680a mo141130a(Map<String, String> map, String str, int i, int i2, int i3, int i4) {
                Map<String, String> map2 = map;
                String str2 = str;
                SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo$Companion");
                if (map2 == null) {
                    SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo$Companion");
                    return null;
                } else if (str2 == null) {
                    SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo$Companion");
                    return null;
                } else {
                    String nullAsNil = Util.nullAsNil(map.get(str + ".cardId"));
                    boolean z = true;
                    if (nullAsNil == null || nullAsNil.length() == 0) {
                        SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo$Companion");
                        return null;
                    }
                    C101680a aVar = new C101680a();
                    if (Util.safeParseInt(map.get(str + ".isDefaultCard")) != 1) {
                        z = false;
                    }
                    SnsMethodCalculate.markStartTimeMs("setDefaultCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                    aVar.f297664e = z;
                    SnsMethodCalculate.markEndTimeMs("setDefaultCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                    C87412m.m108593f(nullAsNil, "id");
                    SnsMethodCalculate.markStartTimeMs("setCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                    aVar.f297660a = nullAsNil;
                    SnsMethodCalculate.markEndTimeMs("setCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                    String nullAsNil2 = Util.nullAsNil(map.get(str + ".preTitle"));
                    SnsMethodCalculate.markStartTimeMs("setTopTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                    aVar.f297661b = nullAsNil2;
                    SnsMethodCalculate.markEndTimeMs("setTopTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                    String nullAsNil3 = Util.nullAsNil(map.get(str + ".title"));
                    SnsMethodCalculate.markStartTimeMs("setTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                    aVar.f297662c = nullAsNil3;
                    SnsMethodCalculate.markEndTimeMs("setTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                    String nullAsNil4 = Util.nullAsNil(map.get(str + ".desc"));
                    SnsMethodCalculate.markStartTimeMs("setDesc", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                    aVar.f297663d = nullAsNil4;
                    SnsMethodCalculate.markEndTimeMs("setDesc", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                    int i5 = 0;
                    while (true) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(".componentItem");
                        sb.append(i5 == 0 ? "" : Integer.valueOf(i5));
                        C101255a0 i6 = C100894u.m132229i(map, sb.toString(), i, i2, i3, i4);
                        if (i6 == null) {
                            SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo$Companion");
                            return aVar;
                        }
                        i6.f296498d = 0.0f;
                        i6.f296497c = 0.0f;
                        i6.f296499e = 0.0f;
                        i6.f296500f = 0.0f;
                        int i7 = i6.f296505k;
                        if (i7 == 21) {
                            SnsMethodCalculate.markStartTimeMs("setBtnCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                            aVar.f297667h = i6;
                            SnsMethodCalculate.markEndTimeMs("setBtnCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                        } else if (i7 == 41) {
                            SnsMethodCalculate.markStartTimeMs("setImgCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                            aVar.f297665f = i6;
                            SnsMethodCalculate.markEndTimeMs("setImgCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                        } else if (i7 == 142) {
                            SnsMethodCalculate.markStartTimeMs("setVideoCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                            aVar.f297666g = i6;
                            SnsMethodCalculate.markEndTimeMs("setVideoCompInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
                        }
                        i5++;
                    }
                }
            }
        }

        /* renamed from: a */
        public final String mo141129a() {
            SnsMethodCalculate.markStartTimeMs("getCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
            String str = this.f297660a;
            SnsMethodCalculate.markEndTimeMs("getCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
            return str;
        }
    }

    /* renamed from: so2.m$b */
    public static final class C101682b {

        /* renamed from: a */
        public String f297668a = "";

        /* renamed from: b */
        public String f297669b = "";

        /* renamed from: c */
        public int f297670c;

        /* renamed from: d */
        public int f297671d;
    }

    /* renamed from: d */
    public static final C101679m m133557d(Map<String, String> map, String str, int i, int i2, int i3, int i4) {
        Map<String, String> map2 = map;
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$Companion");
        C101679m mVar = new C101679m();
        if (map2 == null) {
            SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$Companion");
        } else if (str2 == null) {
            SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$Companion");
        } else {
            try {
                C101682b b = mVar.mo141127b();
                String nullAsNil = Util.nullAsNil(map.get(str + ".rotateAnimInfo.animationImg"));
                C87412m.m108593f(nullAsNil, "nullAsNil(values[\"${keyP…eAnimInfo.animationImg\"])");
                b.getClass();
                SnsMethodCalculate.markStartTimeMs("setAnimImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                b.f297668a = nullAsNil;
                SnsMethodCalculate.markEndTimeMs("setAnimImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                String nullAsNil2 = Util.nullAsNil(map.get(str + ".rotateAnimInfo.animationColor"));
                String nullAsNil3 = Util.nullAsNil(map.get(str + ".rotateAnimInfo.animationColorAlpha"));
                C101682b b2 = mVar.mo141127b();
                String T = C102260r.m134851T(nullAsNil2, nullAsNil3);
                C87412m.m108593f(T, "parseColor(animBgColor, animBgAlpha)");
                b2.getClass();
                SnsMethodCalculate.markStartTimeMs("setBgColor", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                b2.f297669b = T;
                SnsMethodCalculate.markEndTimeMs("setBgColor", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                C101682b b3 = mVar.mo141127b();
                int safeParseInt = Util.safeParseInt(map.get(str + ".rotateAnimInfo.imgWidth"));
                b3.getClass();
                SnsMethodCalculate.markStartTimeMs("setImgWidth", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                b3.f297670c = safeParseInt;
                SnsMethodCalculate.markEndTimeMs("setImgWidth", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                C101682b b4 = mVar.mo141127b();
                int safeParseInt2 = Util.safeParseInt(map.get(str + ".rotateAnimInfo.imgHeight"));
                b4.getClass();
                SnsMethodCalculate.markStartTimeMs("setImgHeight", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                b4.f297671d = safeParseInt2;
                SnsMethodCalculate.markEndTimeMs("setImgHeight", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                String nullAsNil4 = Util.nullAsNil(map.get(str + ".backgroundImg"));
                C87412m.m108593f(nullAsNil4, "nullAsNil(values[\"${keyPref}.backgroundImg\"])");
                SnsMethodCalculate.markStartTimeMs("setBackgroundImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
                mVar.f297655B = nullAsNil4;
                SnsMethodCalculate.markEndTimeMs("setBackgroundImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
                int safeParseInt3 = Util.safeParseInt(map.get(str + ".backgroundImgWidth"));
                SnsMethodCalculate.markStartTimeMs("setBackgroundImgW", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
                mVar.f297656C = safeParseInt3;
                SnsMethodCalculate.markEndTimeMs("setBackgroundImgW", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
                int safeParseInt4 = Util.safeParseInt(map.get(str + ".backgroundImgHeight"));
                SnsMethodCalculate.markStartTimeMs("setBackgroundImgH", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
                mVar.f297657D = safeParseInt4;
                SnsMethodCalculate.markEndTimeMs("setBackgroundImgH", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
                int i5 = 0;
                while (true) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(".items.item");
                    sb.append(i5 == 0 ? "" : Integer.valueOf(i5));
                    C101680a a = C101680a.f297659i.mo141130a(map, sb.toString(), i, i2, i3, i4);
                    if (a == null) {
                        break;
                    }
                    ((ArrayList) mVar.mo141128c()).add(a);
                    i5++;
                }
            } catch (Exception e) {
                Log.m105920e("AdLandingHalfEggCardContainerInfo", "parseFromXml exp=" + e);
            }
            SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$Companion");
        }
        SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        return mVar;
    }

    /* renamed from: b */
    public final C101682b mo141127b() {
        SnsMethodCalculate.markStartTimeMs("getAnimInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        C101682b bVar = this.f297658z;
        SnsMethodCalculate.markEndTimeMs("getAnimInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        return bVar;
    }

    /* renamed from: c */
    public final List<C101680a> mo141128c() {
        SnsMethodCalculate.markStartTimeMs("getCardInfoList", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        List<C101680a> list = this.f297654A;
        SnsMethodCalculate.markEndTimeMs("getCardInfoList", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        return list;
    }
}
