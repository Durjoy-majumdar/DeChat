package com.tencent.p014mm.plugin.sns.p104ad.adxml;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import rq2.C101425k;

/* renamed from: com.tencent.mm.plugin.sns.ad.adxml.a */
public class C94588a {

    /* renamed from: a */
    public String f273681a;

    /* renamed from: b */
    public String f273682b;

    /* renamed from: c */
    public String f273683c;

    /* renamed from: d */
    public String f273684d;

    /* renamed from: com.tencent.mm.plugin.sns.ad.adxml.a$a */
    public static class C94589a {

        /* renamed from: a */
        public String f273685a;

        /* renamed from: b */
        public String f273686b;

        /* renamed from: c */
        public String f273687c;

        /* renamed from: d */
        public C94591b f273688d;

        /* renamed from: e */
        public List<C94590a> f273689e = new ArrayList();

        /* renamed from: com.tencent.mm.plugin.sns.ad.adxml.a$a$a */
        public static class C94590a {

            /* renamed from: a */
            public String f273690a;

            /* renamed from: b */
            public int f273691b;

            /* renamed from: a */
            public C94590a mo130143a(Map<String, String> map, String str) {
                SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo$AdFinderLivePreviewInfo$LiveCheerIconInfo");
                this.f273690a = Util.nullAsNil(map.get(str + ".iconUrl"));
                this.f273691b = Util.safeParseInt(map.get(str + ".sampleRate"));
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo$AdFinderLivePreviewInfo$LiveCheerIconInfo");
                return this;
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ad.adxml.a$a$b */
        public static class C94591b {

            /* renamed from: a */
            public String f273692a;

            /* renamed from: b */
            public String f273693b;

            /* renamed from: c */
            public String f273694c;

            /* renamed from: d */
            public String f273695d;

            /* renamed from: e */
            public String f273696e;

            /* renamed from: a */
            public C94591b mo130144a(Map<String, String> map, String str) {
                SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo$AdFinderLivePreviewInfo$ProductCardInfo");
                this.f273692a = Util.nullAsNil(map.get(str + ".image"));
                this.f273693b = Util.nullAsNil(map.get(str + ".title"));
                this.f273694c = Util.nullAsNil(map.get(str + ".desc"));
                this.f273695d = Util.nullAsNil(map.get(str + ".actionTitle"));
                this.f273696e = Util.nullAsNil(map.get(str + ".canvasId"));
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo$AdFinderLivePreviewInfo$ProductCardInfo");
                return this;
            }
        }

        /* renamed from: a */
        public C94589a mo130142a(Map<String, String> map, String str) {
            SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo$AdFinderLivePreviewInfo");
            if (C101425k.m133098b(map)) {
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo$AdFinderLivePreviewInfo");
                return null;
            }
            try {
                if (!map.containsKey(str)) {
                    SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo$AdFinderLivePreviewInfo");
                    return null;
                }
                this.f273685a = Util.nullAsNil(map.get(str + ".bgImage"));
                this.f273686b = Util.nullAsNil(map.get(str + ".avatar"));
                this.f273687c = Util.nullAsNil(map.get(str + ".nickname"));
                C94591b bVar = new C94591b();
                bVar.mo130144a(map, str + ".productInfo");
                this.f273688d = bVar;
                String str2 = str + ".liveCheerIconList.iconInfo";
                int i = 0;
                while (true) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(i == 0 ? "" : Integer.valueOf(i));
                    String sb4 = sb.toString();
                    if (!map.containsKey(sb4)) {
                        SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo$AdFinderLivePreviewInfo");
                        return this;
                    }
                    C94590a aVar = new C94590a();
                    aVar.mo130143a(map, sb4);
                    ((ArrayList) this.f273689e).add(aVar);
                    i++;
                }
            } catch (Throwable unused) {
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo$AdFinderLivePreviewInfo");
                return null;
            }
        }
    }

    /* renamed from: a */
    public static C94588a m119632a(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo");
        if (C101425k.m133098b(map)) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo");
            return null;
        }
        String str2 = map.get(str + ".finderUsername");
        if (TextUtils.isEmpty(str2)) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo");
            return null;
        }
        try {
            C94588a aVar = new C94588a();
            aVar.f273681a = Util.nullAsNil(str2);
            aVar.f273682b = Util.nullAsNil(map.get(str + ".finderLiveId"));
            aVar.f273683c = Util.nullAsNil(map.get(str + ".finderLiveFeedExportId"));
            aVar.f273684d = Util.nullAsNil(map.get(str + ".finderLiveFeedNonceId"));
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo");
            return aVar;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo");
            return null;
        }
    }
}
