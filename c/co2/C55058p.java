package co2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ps2.C118127b0;
import rq2.C101425k;

/* renamed from: co2.p */
public class C55058p {
    @C118127b0(resType = 1)

    /* renamed from: a */
    public String f154591a;

    /* renamed from: b */
    public List<String> f154592b;

    /* renamed from: a */
    public static C55058p m62165a(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdRollInfo");
        if (C101425k.m133098b(map)) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdRollInfo");
            return null;
        }
        try {
            String nullAsNil = Util.nullAsNil(map.get(str + ".iconUrl"));
            List<String> b = m62166b(map, str + ".textList");
            if (!C101425k.m133097a(b)) {
                C55058p pVar = new C55058p();
                pVar.f154591a = nullAsNil;
                pVar.f154592b = b;
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdRollInfo");
                return pVar;
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdRollInfo");
        return null;
    }

    /* renamed from: b */
    public static List<String> m62166b(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parseRollTextList", "com.tencent.mm.plugin.sns.ad.adxml.AdRollInfo");
        ArrayList arrayList = new ArrayList();
        if (C101425k.m133098b(map)) {
            SnsMethodCalculate.markEndTimeMs("parseRollTextList", "com.tencent.mm.plugin.sns.ad.adxml.AdRollInfo");
            return arrayList;
        }
        String str2 = str + ".text";
        int i = 0;
        String str3 = str2;
        while (true) {
            if (i > 0) {
                str3 = str2 + i;
            }
            if (!map.containsKey(str3)) {
                SnsMethodCalculate.markEndTimeMs("parseRollTextList", "com.tencent.mm.plugin.sns.ad.adxml.AdRollInfo");
                return arrayList;
            }
            String str4 = map.get(str3);
            if (!Util.isNullOrNil(str4)) {
                arrayList.add(str4);
            }
            i++;
        }
    }
}
