package os2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import rq2.C101425k;

/* renamed from: os2.i */
public class C62171i {

    /* renamed from: a */
    public String f176767a;

    /* renamed from: b */
    public String f176768b;

    /* renamed from: c */
    public String f176769c;

    /* renamed from: a */
    public static C62171i m73036a(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdSellingPointInfo");
        if (C101425k.m133098b(map) || TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdSellingPointInfo");
            return null;
        } else if (!map.containsKey(str)) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdSellingPointInfo");
            return null;
        } else {
            try {
                C62171i iVar = new C62171i();
                iVar.f176767a = Util.nullAsNil(map.get(str + ".title"));
                iVar.f176768b = Util.nullAsNil(map.get(str + ".description"));
                iVar.f176769c = Util.nullAsNil(map.get(str + ".iconUrl"));
                if (Util.isNullOrNil(iVar.f176768b)) {
                    SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdSellingPointInfo");
                    return null;
                }
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdSellingPointInfo");
                return iVar;
            } catch (Throwable unused) {
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdSellingPointInfo");
                return null;
            }
        }
    }
}
