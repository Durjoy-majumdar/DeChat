package co2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;

/* renamed from: co2.j */
public final class C55055j {

    /* renamed from: a */
    public C55056a f154583a;

    /* renamed from: b */
    public Long f154584b = 0L;

    /* renamed from: co2.j$a */
    public static final class C55056a {

        /* renamed from: a */
        public String f154585a = "";

        /* renamed from: b */
        public Long f154586b = 0L;

        /* renamed from: c */
        public String f154587c = "";

        /* renamed from: d */
        public String f154588d = "";

        /* renamed from: a */
        public final Long mo76117a() {
            SnsMethodCalculate.markStartTimeMs("getFinderLiveId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
            Long l = this.f154586b;
            SnsMethodCalculate.markEndTimeMs("getFinderLiveId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
            return l;
        }
    }

    /* renamed from: b */
    public static final C55055j m62161b(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$Companion");
        C55055j jVar = null;
        if (map == null) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$Companion");
        } else if (str == null) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$Companion");
        } else if (!map.containsKey(str)) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$Companion");
        } else {
            jVar = new C55055j();
            Long valueOf = Long.valueOf(Util.getLong(map.get(str + ".previewJoinliveAdControlFlag"), 0));
            SnsMethodCalculate.markStartTimeMs("setPreviewJoinliveAdControlFlag", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
            jVar.f154584b = valueOf;
            SnsMethodCalculate.markEndTimeMs("setPreviewJoinliveAdControlFlag", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
            String str2 = str + ".finderLiveInfo";
            if (map.containsKey(str2)) {
                C55056a aVar = new C55056a();
                SnsMethodCalculate.markStartTimeMs("setFinderLiveInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
                jVar.f154583a = aVar;
                SnsMethodCalculate.markEndTimeMs("setFinderLiveInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
                C55056a a = jVar.mo76116a();
                String str3 = "";
                if (a != null) {
                    String str4 = map.get(str2 + ".finderLiveFeedExportId");
                    if (str4 == null) {
                        str4 = str3;
                    }
                    SnsMethodCalculate.markStartTimeMs("setFinderLiveExportId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                    a.f154585a = str4;
                    SnsMethodCalculate.markEndTimeMs("setFinderLiveExportId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                }
                C55056a a2 = jVar.mo76116a();
                if (a2 != null) {
                    Long valueOf2 = Long.valueOf(Util.getLong(map.get(str2 + ".finderLiveId"), 0));
                    SnsMethodCalculate.markStartTimeMs("setFinderLiveId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                    a2.f154586b = valueOf2;
                    SnsMethodCalculate.markEndTimeMs("setFinderLiveId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                }
                C55056a a3 = jVar.mo76116a();
                if (a3 != null) {
                    String str5 = map.get(str2 + ".finderLiveFeedNonceId");
                    if (str5 == null) {
                        str5 = str3;
                    }
                    SnsMethodCalculate.markStartTimeMs("setFinderLiveFeedNonceId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                    a3.f154587c = str5;
                    SnsMethodCalculate.markEndTimeMs("setFinderLiveFeedNonceId", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                }
                C55056a a4 = jVar.mo76116a();
                if (a4 != null) {
                    String str6 = map.get(str2 + ".finderUsername");
                    if (str6 != null) {
                        str3 = str6;
                    }
                    SnsMethodCalculate.markStartTimeMs("setFinderUsername", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                    a4.f154588d = str3;
                    SnsMethodCalculate.markEndTimeMs("setFinderUsername", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo");
                }
            }
            if (map.containsKey(str + ".playerInfo")) {
                SnsMethodCalculate.markStartTimeMs("setPlayerInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
                SnsMethodCalculate.markEndTimeMs("setPlayerInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
            }
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$Companion");
        }
        SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
        return jVar;
    }

    /* renamed from: a */
    public final C55056a mo76116a() {
        SnsMethodCalculate.markStartTimeMs("getFinderLiveInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
        C55056a aVar = this.f154583a;
        SnsMethodCalculate.markEndTimeMs("getFinderLiveInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo");
        return aVar;
    }
}
