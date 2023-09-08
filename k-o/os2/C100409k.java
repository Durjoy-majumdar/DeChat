package os2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import ps2.C118127b0;
import rq2.C101425k;

/* renamed from: os2.k */
public class C100409k {
    @C118127b0(resType = 1)

    /* renamed from: a */
    public String f294141a;
    @C118127b0(resType = 1)

    /* renamed from: b */
    public String f294142b;
    @C118127b0(resType = 1)

    /* renamed from: c */
    public String f294143c;
    @C118127b0(resType = 7)

    /* renamed from: d */
    public C100410a f294144d;

    /* renamed from: e */
    public String f294145e;

    /* renamed from: f */
    public String f294146f;

    /* renamed from: g */
    public String f294147g;

    /* renamed from: h */
    public String f294148h;

    /* renamed from: i */
    public String f294149i;

    /* renamed from: j */
    public String f294150j;

    /* renamed from: k */
    public String f294151k;

    /* renamed from: l */
    public String f294152l;

    /* renamed from: m */
    public String f294153m;
    @C118127b0(resType = 2)

    /* renamed from: n */
    public String f294154n;

    /* renamed from: o */
    public String f294155o;

    /* renamed from: p */
    public boolean f294156p = false;

    /* renamed from: os2.k$a */
    public static class C100410a {

        /* renamed from: a */
        public int f294157a;
        @C118127b0(resType = 2)

        /* renamed from: b */
        public String f294158b;

        /* renamed from: c */
        public String f294159c;

        /* renamed from: d */
        public float f294160d;
        @C118127b0(resType = 2)

        /* renamed from: e */
        public String f294161e;

        /* renamed from: f */
        public String f294162f;
        @C118127b0(resType = 2)

        /* renamed from: g */
        public String f294163g;

        /* renamed from: h */
        public String f294164h;
    }

    /* renamed from: a */
    public static C100409k m131403a(Map<String, String> map, String str) {
        String str2;
        boolean z;
        Map<String, String> map2 = map;
        String str3 = str;
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdSocialInfo");
        if (C101425k.m133098b(map) || Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdSocialInfo");
            return null;
        } else if (!map.containsKey(str)) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdSocialInfo");
            return null;
        } else {
            try {
                String nullAsNil = Util.nullAsNil(map2.get(str3 + ".cheerIcon"));
                String nullAsNil2 = Util.nullAsNil(map2.get(str3 + ".cheerText.zh"));
                String nullAsNil3 = Util.nullAsNil(map2.get(str3 + ".cheerText.tw"));
                String nullAsNil4 = Util.nullAsNil(map2.get(str3 + ".cheerText.en"));
                String nullAsNil5 = Util.nullAsNil(map2.get(str3 + ".cheerFinishText.zh"));
                String nullAsNil6 = Util.nullAsNil(map2.get(str3 + ".cheerFinishText.tw"));
                String nullAsNil7 = Util.nullAsNil(map2.get(str3 + ".cheerFinishText.en"));
                String nullAsNil8 = Util.nullAsNil(map2.get(str3 + ".commentText.zh"));
                String nullAsNil9 = Util.nullAsNil(map2.get(str3 + ".commentText.tw"));
                String nullAsNil10 = Util.nullAsNil(map2.get(str3 + ".commentText.en"));
                int safeParseInt = Util.safeParseInt(map2.get(str3 + ".attractingAnimation.interval"));
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                String str4 = "parse";
                try {
                    sb.append(".attractingAnimation.pagUrl");
                    String nullAsNil11 = Util.nullAsNil(map2.get(sb.toString()));
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str3);
                    String str5 = nullAsNil11;
                    sb4.append(".attractingAnimation.pagMD5");
                    String nullAsNil12 = Util.nullAsNil(map2.get(sb4.toString()));
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str3);
                    String str6 = nullAsNil12;
                    sb5.append(".attractingAnimation.offsetY");
                    float safeParseFloat = Util.safeParseFloat(map2.get(sb5.toString()));
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str3);
                    float f = safeParseFloat;
                    sb6.append(".attractingAnimation.iconPagUrl");
                    String nullAsNil13 = Util.nullAsNil(map2.get(sb6.toString()));
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(str3);
                    String str7 = nullAsNil13;
                    sb7.append(".attractingAnimation.iconPagMD5");
                    String nullAsNil14 = Util.nullAsNil(map2.get(sb7.toString()));
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(str3);
                    String str8 = nullAsNil14;
                    sb8.append(".attractingAnimation.iconPagDarkUrl");
                    String nullAsNil15 = Util.nullAsNil(map2.get(sb8.toString()));
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(str3);
                    String str9 = nullAsNil15;
                    sb9.append(".attractingAnimation.iconPagDarkMD5");
                    String nullAsNil16 = Util.nullAsNil(map2.get(sb9.toString()));
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(str3);
                    String str10 = nullAsNil16;
                    sb10.append(".notShowPag");
                    boolean z2 = Util.safeParseInt(map2.get(sb10.toString()), 0) == 1;
                    if (!Util.isNullOrNil(nullAsNil, nullAsNil2, nullAsNil3, nullAsNil4, nullAsNil5, nullAsNil6, nullAsNil7, nullAsNil8, nullAsNil9, nullAsNil10)) {
                        C100409k kVar = new C100409k();
                        kVar.f294141a = nullAsNil;
                        kVar.f294145e = nullAsNil2;
                        kVar.f294146f = nullAsNil3;
                        kVar.f294147g = nullAsNil4;
                        kVar.f294148h = nullAsNil5;
                        kVar.f294149i = nullAsNil6;
                        kVar.f294150j = nullAsNil7;
                        kVar.f294151k = nullAsNil8;
                        kVar.f294152l = nullAsNil9;
                        kVar.f294153m = nullAsNil10;
                        kVar.f294142b = Util.nullAs(map2.get(str3 + ".likedIcon"), nullAsNil);
                        kVar.f294143c = Util.nullAs(map2.get(str3 + ".likedIconDark"), nullAsNil);
                        SnsMethodCalculate.markStartTimeMs("isAttractingAnimationInfoValid", "com.tencent.mm.plugin.sns.storage.AdSocialInfo");
                        if (safeParseInt >= 1000) {
                            z = false;
                            if (!Util.isNullOrNil(str5, str6)) {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        SnsMethodCalculate.markEndTimeMs("isAttractingAnimationInfoValid", "com.tencent.mm.plugin.sns.storage.AdSocialInfo");
                        if (z) {
                            C100410a aVar = new C100410a();
                            kVar.f294144d = aVar;
                            aVar.f294157a = safeParseInt;
                            aVar.f294158b = str5;
                            aVar.f294159c = str6;
                            aVar.f294160d = f;
                            String str11 = str7;
                            aVar.f294161e = str11;
                            String str12 = str8;
                            aVar.f294162f = str12;
                            if (!Util.isNullOrNil(str9)) {
                                str11 = str9;
                            }
                            aVar.f294163g = str11;
                            C100410a aVar2 = kVar.f294144d;
                            if (!Util.isNullOrNil(str10)) {
                                str12 = str10;
                            }
                            aVar2.f294164h = str12;
                        }
                        kVar.f294154n = Util.nullAsNil(map2.get(str3 + ".pagAnimationUrl"));
                        kVar.f294155o = Util.nullAsNil(map2.get(str3 + ".pagAnimationMD5"));
                        kVar.f294156p = z2;
                        SnsMethodCalculate.markEndTimeMs(str4, "com.tencent.mm.plugin.sns.storage.AdSocialInfo");
                        return kVar;
                    }
                } catch (Throwable unused) {
                }
                str2 = str4;
            } catch (Throwable unused2) {
                str2 = "parse";
            }
            SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.storage.AdSocialInfo");
            return null;
        }
    }
}
