package co2;

import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import te3.C101804kv2;
import te3.C101817mv2;

/* renamed from: co2.q */
public class C92448q {

    /* renamed from: a */
    public String f264573a;

    /* renamed from: b */
    public String f264574b;

    /* renamed from: c */
    public float f264575c;

    /* renamed from: d */
    public int f264576d;

    /* renamed from: e */
    public C101804kv2 f264577e;

    /* renamed from: f */
    public AdClickActionInfo f264578f;

    /* renamed from: g */
    public C92451t f264579g;

    /* renamed from: h */
    public String f264580h;

    /* renamed from: i */
    public String f264581i;

    /* renamed from: b */
    public static C92451t m116282b(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parseButtonInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
        C92451t tVar = new C92451t();
        tVar.f264601a = Util.nullAsNil(map.get(str + ".icon"));
        tVar.f264602b = Util.nullAsNil(map.get(str + ".title"));
        AdClickActionInfo b = AdClickActionInfo.m119629b(map, str + ".clickActionInfo");
        tVar.f264603c = b;
        b.f273639a = 4;
        SnsMethodCalculate.markEndTimeMs("parseButtonInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
        return tVar;
    }

    /* renamed from: c */
    public static C101804kv2 m116283c(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parseMediaObj", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
        C101804kv2 kv22 = new C101804kv2();
        StringBuilder sb = new StringBuilder();
        sb.append("SlideFullCardAd_");
        sb.append(Util.nullAsNil(map.get(str + ".id")));
        kv22.f298689d = sb.toString();
        kv22.f298681N = true;
        kv22.f298690e = Util.safeParseInt(map.get(str + ".type"));
        kv22.f298704v = Util.safeParseInt(map.get(str + ".subtype"));
        kv22.f298692g = Util.nullAsNil(map.get(str + ".url"));
        kv22.f298693h = Util.safeParseInt(map.get(str + ".url.$type"));
        kv22.f298707y = Util.nullAsNil(map.get(str + ".url.$md5"));
        kv22.f298694i = Util.nullAsNil(map.get(str + ".thumb"));
        kv22.f298695j = Util.safeParseInt(map.get(str + ".thumb.$type"));
        C101817mv2 mv22 = new C101817mv2();
        kv22.f298698p = mv22;
        mv22.f298876e = (float) Util.safeParseInt(map.get(str + ".size.$height"));
        C101817mv2 mv23 = kv22.f298698p;
        mv23.f298875d = (float) Util.safeParseInt(map.get(str + ".size.$width"));
        C101817mv2 mv24 = kv22.f298698p;
        mv24.f298877f = (float) Util.safeParseInt(map.get(str + ".size.$totalSize"));
        SnsMethodCalculate.markEndTimeMs("parseMediaObj", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
        return kv22;
    }

    /* renamed from: a */
    public boolean mo126435a() {
        SnsMethodCalculate.markStartTimeMs("isSight", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
        boolean z = true;
        if (this.f264576d != 1) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isSight", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
        return z;
    }
}
