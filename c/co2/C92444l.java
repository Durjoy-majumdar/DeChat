package co2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import rq2.C101425k;
import te3.C101804kv2;
import te3.C101817mv2;

/* renamed from: co2.l */
public class C92444l {

    /* renamed from: a */
    public String f264545a;

    /* renamed from: b */
    public String f264546b;

    /* renamed from: c */
    public String f264547c;

    /* renamed from: d */
    public String f264548d;

    /* renamed from: e */
    public String f264549e;

    /* renamed from: f */
    public float f264550f;

    /* renamed from: g */
    public String f264551g;

    /* renamed from: h */
    public int f264552h;

    /* renamed from: i */
    public C101804kv2 f264553i;

    /* renamed from: j */
    public String f264554j;

    /* renamed from: b */
    public static C92444l m116275b(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
        if (C101425k.m133098b(map)) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
            return null;
        }
        if (TextUtils.isEmpty(Util.nullAsNil(map.get(str + ".media.id")))) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
            return null;
        }
        try {
            C92444l lVar = new C92444l();
            lVar.f264545a = Util.nullAsNil(map.get(str + ".avatar"));
            lVar.f264546b = Util.nullAsNil(map.get(str + ".nickname"));
            lVar.f264547c = Util.nullAsNil(map.get(str + ".tag"));
            lVar.f264548d = Util.nullAsNil(map.get(str + ".desc"));
            lVar.f264549e = Util.nullAsNil(map.get(str + ".barBgColor"));
            lVar.f264550f = Util.safeParseFloat(map.get(str + ".barBgAlpha"));
            lVar.f264551g = Util.nullAsNil(map.get(str + ".duration"));
            C101804kv2 c = m116276c(map, str + ".media");
            lVar.f264553i = c;
            lVar.f264552h = c.f298690e == 6 ? 1 : 0;
            lVar.f264554j = Util.nullAsNil(map.get(str + ".finderType"));
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
            return lVar;
        } catch (Throwable th) {
            Log.m105920e("AdFinderTopicResInfo", "parse AdFinderTopicResInfo error " + th.getMessage());
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
            return null;
        }
    }

    /* renamed from: c */
    public static C101804kv2 m116276c(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parseMediaObj", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
        C101804kv2 kv22 = new C101804kv2();
        kv22.f298689d = Util.nullAsNil(map.get(str + ".id"));
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
        SnsMethodCalculate.markEndTimeMs("parseMediaObj", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
        return kv22;
    }

    /* renamed from: a */
    public boolean mo126434a() {
        SnsMethodCalculate.markStartTimeMs("isSight", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
        boolean z = true;
        if (this.f264552h != 1) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isSight", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicResInfo");
        return z;
    }
}
