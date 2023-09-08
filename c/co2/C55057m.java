package co2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import rq2.C101425k;

/* renamed from: co2.m */
public class C55057m {

    /* renamed from: a */
    public String f154589a;

    /* renamed from: b */
    public String f154590b;

    /* renamed from: a */
    public static C55057m m62164a(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadFinderProfile");
        if (C101425k.m133098b(map) || TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadFinderProfile");
            return null;
        }
        try {
            C55057m mVar = new C55057m();
            mVar.f154589a = Util.nullAsNil(map.get(str + ".finderUsername"));
            mVar.f154590b = Util.nullAsNil(map.get(str + ".exportId"));
            Util.nullAsNil(map.get(str + ".objectNonceId"));
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadFinderProfile");
            return mVar;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadFinderProfile");
            return null;
        }
    }
}
