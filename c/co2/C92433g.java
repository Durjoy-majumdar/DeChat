package co2;

import android.util.SparseArray;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import rq2.C101425k;

/* renamed from: co2.g */
public class C92433g {

    /* renamed from: a */
    public SparseArray<C92434a> f264508a;

    /* renamed from: co2.g$a */
    public static class C92434a {

        /* renamed from: a */
        public int f264509a;

        /* renamed from: b */
        public int f264510b;

        /* renamed from: a */
        public static C92434a m116266a(Map<String, String> map, String str) {
            SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo$Action");
            if (C101425k.m133098b(map)) {
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo$Action");
                return null;
            }
            int safeParseInt = Util.safeParseInt(map.get(str + ".type"));
            int safeParseInt2 = Util.safeParseInt(map.get(str + ".expireTime")) * 1000;
            if (safeParseInt == 0 || safeParseInt2 == 0) {
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo$Action");
                return null;
            }
            C92434a aVar = new C92434a();
            aVar.f264509a = safeParseInt;
            aVar.f264510b = safeParseInt2;
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo$Action");
            return aVar;
        }
    }

    /* renamed from: a */
    public static C92433g m116264a(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo");
        try {
            C92433g b = m116265b(map, str);
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo");
            return b;
        } catch (Throwable unused) {
            Log.m105920e("AdDynamicUpdateInfo", "parse the update info failed!!");
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo");
            return null;
        }
    }

    /* renamed from: b */
    public static C92433g m116265b(Map<String, String> map, String str) {
        C92434a aVar;
        SnsMethodCalculate.markStartTimeMs("parseInternal", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo");
        C92433g gVar = null;
        if (C101425k.m133098b(map)) {
            SnsMethodCalculate.markEndTimeMs("parseInternal", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo");
            return null;
        }
        SparseArray<C92434a> sparseArray = null;
        for (int i = 0; i < 20; i++) {
            if (i == 0) {
                aVar = C92434a.m116266a(map, str + ".action");
                if (aVar != null) {
                    sparseArray = new SparseArray<>();
                }
            } else {
                aVar = C92434a.m116266a(map, str + ".action" + i);
            }
            if (aVar == null || sparseArray == null) {
                break;
            }
            sparseArray.put(aVar.f264509a, aVar);
        }
        if (sparseArray != null && sparseArray.size() > 0) {
            gVar = new C92433g();
            gVar.f264508a = sparseArray;
        }
        SnsMethodCalculate.markEndTimeMs("parseInternal", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicUpdateInfo");
        return gVar;
    }
}
