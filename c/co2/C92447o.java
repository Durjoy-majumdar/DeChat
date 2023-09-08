package co2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import rq2.C101425k;

/* renamed from: co2.o */
public class C92447o {

    /* renamed from: a */
    public long f264567a;

    /* renamed from: b */
    public long f264568b;

    /* renamed from: c */
    public String f264569c;

    /* renamed from: d */
    public String f264570d;

    /* renamed from: e */
    public String f264571e;

    /* renamed from: f */
    public String f264572f;

    /* renamed from: a */
    public static C92447o m116281a(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdPromotionInfo");
        if (C101425k.m133098b(map)) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdPromotionInfo");
            return null;
        }
        String str2 = map.get(str + ".endTime");
        long safeParseLong = Util.safeParseLong(str2);
        if (TextUtils.isEmpty(str2) || safeParseLong == 0) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdPromotionInfo");
            return null;
        }
        C92447o oVar = new C92447o();
        oVar.f264568b = safeParseLong * 1000;
        oVar.f264567a = Util.safeParseLong(map.get(str + ".startTime")) * 1000;
        oVar.f264569c = Util.nullAs(map.get(str + ".barBgColor"), "");
        oVar.f264570d = Util.nullAs(map.get(str + ".barBgAlpha"), "");
        Util.safeParseInt(map.get(str + ".leftTitleType"));
        oVar.f264571e = Util.nullAs(map.get(str + ".leftTitle"), "");
        oVar.f264572f = Util.nullAs(map.get(str + ".rightTitle"), "");
        SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdPromotionInfo");
        return oVar;
    }
}
