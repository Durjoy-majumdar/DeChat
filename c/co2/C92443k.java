package co2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import rq2.C101425k;

/* renamed from: co2.k */
public class C92443k {

    /* renamed from: a */
    public String f264539a;

    /* renamed from: b */
    public String f264540b;

    /* renamed from: c */
    public String f264541c;

    /* renamed from: d */
    public String f264542d;

    /* renamed from: e */
    public List<String> f264543e;

    /* renamed from: f */
    public List<C92444l> f264544f;

    /* renamed from: a */
    public static C92443k m116272a(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
        if (C101425k.m133098b(map)) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
            return null;
        }
        try {
            String str2 = map.get(str + ".finderEncryptedTopicId");
            String str3 = map.get(str + ".finderTopicName");
            if (!TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(str3)) {
                    C92443k kVar = new C92443k();
                    kVar.f264539a = str2;
                    kVar.f264540b = str3;
                    kVar.f264541c = Util.nullAsNil(map.get(str + ".finderTopicTitle"));
                    kVar.f264542d = Util.nullAsNil(map.get(str + ".relationText"));
                    kVar.f264543e = m116274c(map, str + ".relationAvatarList");
                    kVar.f264544f = m116273b(map, str + ".finderTopicResList");
                    SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
                    return kVar;
                }
            }
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
            return null;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
            return null;
        }
    }

    /* renamed from: b */
    public static List<C92444l> m116273b(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parseFinderTopicResInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
        C92444l b = C92444l.m116275b(map, str + ".finderTopicResInfo");
        if (b == null) {
            SnsMethodCalculate.markEndTimeMs("parseFinderTopicResInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
            return null;
        }
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(b);
        for (int i = 1; i < 5; i++) {
            C92444l b2 = C92444l.m116275b(map, str + ".finderTopicResInfo" + i);
            if (b2 == null) {
                break;
            }
            arrayList.add(b2);
        }
        SnsMethodCalculate.markEndTimeMs("parseFinderTopicResInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
        return arrayList;
    }

    /* renamed from: c */
    public static List<String> m116274c(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parseRelationAvatar", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
        String str2 = map.get(str + ".avatar");
        if (TextUtils.isEmpty(str2)) {
            SnsMethodCalculate.markEndTimeMs("parseRelationAvatar", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(str2);
        int i = 1;
        while (true) {
            if (TextUtils.isEmpty(map.get(str + ".avatar" + i)) || i >= 10) {
                SnsMethodCalculate.markEndTimeMs("parseRelationAvatar", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
            } else {
                arrayList.add(map.get(str + ".avatar" + i));
                i++;
            }
        }
        SnsMethodCalculate.markEndTimeMs("parseRelationAvatar", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
        return arrayList;
    }
}
