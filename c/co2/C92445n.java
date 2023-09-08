package co2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import rq2.C101425k;

/* renamed from: co2.n */
public class C92445n {

    /* renamed from: a */
    public int f264555a;

    /* renamed from: b */
    public String f264556b;

    /* renamed from: c */
    public String f264557c;

    /* renamed from: d */
    public String f264558d;

    /* renamed from: e */
    public List<String> f264559e;

    /* renamed from: f */
    public List<String> f264560f;

    /* renamed from: g */
    public List<String> f264561g;

    /* renamed from: h */
    public boolean f264562h;

    /* renamed from: i */
    public float f264563i;

    /* renamed from: j */
    public List<C92446a> f264564j;

    /* renamed from: co2.n$a */
    public static class C92446a {

        /* renamed from: a */
        public String f264565a;

        /* renamed from: b */
        public int f264566b;
    }

    /* renamed from: a */
    public static C92445n m116278a(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
        if (C101425k.m133098b(map)) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
            return null;
        }
        String str2 = map.get(str + ".liveType");
        if (str2 == null) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
            return null;
        }
        try {
            C92445n nVar = new C92445n();
            nVar.f264555a = Util.safeParseInt(str2);
            nVar.f264556b = Util.nullAsNil(map.get(str + ".liveParams"));
            nVar.f264557c = Util.nullAsNil(map.get(str + ".finderUsername"));
            nVar.f264558d = Util.nullAsNil(map.get(str + ".finderLiveId"));
            nVar.f264559e = m116279b(map, str + ".pendingDescList");
            nVar.f264560f = m116279b(map, str + ".livingDescList");
            nVar.f264561g = m116279b(map, str + ".endDescList");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".showLikeAnimation");
            nVar.f264562h = Util.safeParseInt(map.get(sb.toString())) > 0;
            nVar.f264563i = Util.safeParseFloat(map.get(str + ".likeAnimationInterval"));
            nVar.f264564j = m116280c(map, str + ".liveCheerIconList");
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
            return nVar;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
            return null;
        }
    }

    /* renamed from: b */
    public static List<String> m116279b(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parseDescList", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
        if (C101425k.m133098b(map)) {
            SnsMethodCalculate.markEndTimeMs("parseDescList", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
            return null;
        }
        String str2 = map.get(str + ".descText");
        if (str2 == null) {
            SnsMethodCalculate.markEndTimeMs("parseDescList", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        int i = 1;
        while (true) {
            String str3 = map.get(str + ".descText" + i);
            if (str3 == null) {
                SnsMethodCalculate.markEndTimeMs("parseDescList", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
                return arrayList;
            }
            arrayList.add(str3);
            i++;
        }
    }

    /* renamed from: c */
    public static List<C92446a> m116280c(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parseLikeIconList", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
        ArrayList arrayList = new ArrayList();
        if (C101425k.m133098b(map)) {
            SnsMethodCalculate.markEndTimeMs("parseLikeIconList", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
            return arrayList;
        }
        String str2 = str + ".iconInfo";
        int i = 0;
        while (map.containsKey(str2)) {
            String nullAsNil = Util.nullAsNil(map.get(str2 + ".iconUrl"));
            int safeParseInt = Util.safeParseInt(map.get(str2 + ".sampleRate"));
            if (!TextUtils.isEmpty(nullAsNil) && safeParseInt > 0 && safeParseInt <= 100) {
                C92446a aVar = new C92446a();
                aVar.f264565a = nullAsNil;
                aVar.f264566b = safeParseInt;
                arrayList.add(aVar);
            }
            i++;
            str2 = str + ".iconInfo" + i;
        }
        SnsMethodCalculate.markEndTimeMs("parseLikeIconList", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
        return arrayList;
    }
}
