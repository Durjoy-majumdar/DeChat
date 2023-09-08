package co2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Map;
import rq2.C101425k;

/* renamed from: co2.b */
public class C55052b {

    /* renamed from: a */
    public String f154579a;

    /* renamed from: b */
    public String f154580b;

    /* renamed from: a */
    public static C55052b m62154a(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAvatarFinderTopicInfo");
        if (C101425k.m133098b(map)) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAvatarFinderTopicInfo");
            return null;
        }
        try {
            String str2 = map.get(str + ".finderEncryptedTopicId");
            String str3 = map.get(str + ".finderTopicName");
            if (!TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(str3)) {
                    C55052b bVar = new C55052b();
                    bVar.f154579a = str2;
                    bVar.f154580b = str3;
                    SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAvatarFinderTopicInfo");
                    return bVar;
                }
            }
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAvatarFinderTopicInfo");
            return null;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdAvatarFinderTopicInfo");
            return null;
        }
    }
}
