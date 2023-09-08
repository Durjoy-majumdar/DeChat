package com.tencent.p014mm.plugin.sns.storage;

import android.text.TextUtils;
import bo2.C92277a;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rq2.C101425k;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.storage.ADInfo */
public class ADInfo {
    public static int ADChainStrengthenDefaultWording = 0;
    public static int ADChainStrengthenUserInfoFormatWording = 1;
    public static final int AD_ACTION_TYPE_FINDER = 9;
    public static final int AD_ACTION_TYPE_FINDER_LIVE = 10;
    public static final int AD_ACTION_TYPE_FINDER_TOPIC = 11;
    public static final int AD_ACTION_TYPE_SCAN = 8;
    public static final int AD_ACTION_TYPE_WEAPP = 4;
    public static final String TAG = "MicroMsg.ADInfo";
    private static HashMap<String, String> waidPkgCache = new HashMap<>();
    public C95008a actionExtAppJump;
    public C95009b actionExtWeApp;
    public String adActionCardExt;
    public String adActionCardTitle;
    public String adActionCardTpId;
    public String adActionExtTailFormattedWording;
    public String adActionExtTailLink;
    public int adActionExtTailType;
    public String adActionExtTailUserDisplayName;
    public String adActionExtTailWording;
    public LinkedList<String> adActionExtUserList;
    public String adActionLink;
    public String adActionPOIId;
    public String adActionPOILink;
    public String adActionPOIName;
    public int adActionPOIType;
    public int adActionType;
    public String adCanvasExtXml;
    public int adChainType;
    public int adChainTypeExpireTime;
    public List<AdClickActionInfo> adClickActionInfoList;
    public String adDislikeInfoTitle_cn;
    public String adDislikeInfoTitle_en;
    public String adDislikeInfoTitle_tw;
    public int adDupSnsIdDel;
    public String adExtTailWording;
    public int adExtTailWordingExchangeValue;
    public String adIPv4Url;
    public String adInfoSyncBuffer;
    public boolean adInfoSyncBufferImm;
    private C92277a adPreloadConfig;
    public C95010c adUnlikeInfo;
    public C95012d adVoteInfoExt;
    public int ad_sns_pos;
    public boolean addClickTimeToWeAppPath;
    public String aid;
    public boolean bLandingPagesAd;
    public int contractAdEndTime;
    public String costLevel;
    public long exposureNoActionExpireTime;
    public boolean forbidClick;
    public boolean forbiddenShowRelievedBuy;
    public boolean isPersonalizedAdClose;
    public HashMap<String, String> mappedCanvasCardExt;
    public long noExposureExpireTime;
    public String pId;
    public boolean preloadFinderFeed;
    public boolean preloadFinderLive;
    public float score;
    public String sessionKeyAd;
    public String traceid;
    public String uxInfo;
    public String viewId;
    public String waidPkg;
    public String xml;

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADInfo$a */
    public static class C95008a {

        /* renamed from: a */
        public String f275641a;

        /* renamed from: b */
        public String f275642b;

        /* renamed from: c */
        public String f275643c;

        /* renamed from: d */
        public String f275644d;

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.storage.ADInfo$AdActionExtAppJump");
            String str = "appId=" + this.f275641a + ", pkg=" + this.f275642b + ", appName=" + this.f275644d + ", pageUrl=" + this.f275643c;
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.storage.ADInfo$AdActionExtAppJump");
            return str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADInfo$b */
    public static class C95009b {

        /* renamed from: a */
        public String f275645a;

        /* renamed from: b */
        public String f275646b;

        /* renamed from: c */
        public String f275647c;

        /* renamed from: d */
        public int f275648d;
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADInfo$e */
    public static class C95013e {

        /* renamed from: a */
        public String f275664a;

        /* renamed from: b */
        public int f275665b;

        /* renamed from: c */
        public ArrayList<String> f275666c = new ArrayList<>();
    }

    public ADInfo() {
        this.xml = "";
        this.uxInfo = "";
        this.adActionType = 0;
        this.adActionCardTitle = "";
        this.adActionCardTpId = "";
        this.adActionCardExt = "";
        this.adActionLink = "";
        this.adActionPOIType = 0;
        this.adActionPOIId = "";
        this.adActionPOIName = "";
        this.adActionPOILink = "";
        this.adActionExtTailType = ADChainStrengthenDefaultWording;
        this.adActionExtTailWording = "";
        this.adActionExtTailLink = "";
        this.adActionExtUserList = new LinkedList<>();
        this.adCanvasExtXml = "";
        this.adUnlikeInfo = new C95010c();
        this.adDislikeInfoTitle_cn = "";
        this.adDislikeInfoTitle_en = "";
        this.adDislikeInfoTitle_tw = "";
        this.forbidClick = false;
        this.isPersonalizedAdClose = false;
        this.adInfoSyncBuffer = "";
        this.adInfoSyncBufferImm = false;
        this.pId = "";
        this.sessionKeyAd = "";
        this.costLevel = "";
    }

    private static boolean enableAdPreloadConfig() {
        SnsMethodCalculate.markStartTimeMs("enableAdPreloadConfig", "com.tencent.mm.plugin.sns.storage.ADInfo");
        boolean z = true;
        try {
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_enable_adinfo_preload_cfg, 1) != 1) {
                z = false;
            }
            SnsMethodCalculate.markEndTimeMs("enableAdPreloadConfig", "com.tencent.mm.plugin.sns.storage.ADInfo");
            return z;
        } catch (Throwable th) {
            Log.m105920e(TAG, "enableAdPreloadConfig, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("enableAdPreloadConfig", "com.tencent.mm.plugin.sns.storage.ADInfo");
            return true;
        }
    }

    private void feed(String str) {
        String str2;
        String str3;
        SnsMethodCalculate.markStartTimeMs("feed", "com.tencent.mm.plugin.sns.storage.ADInfo");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("feed", "com.tencent.mm.plugin.sns.storage.ADInfo");
            return;
        }
        boolean z = true;
        Log.m105925i(TAG, "feed xml %s", str);
        C92277a aVar = null;
        Map<String, String> parseXml = XmlParser.parseXml(str, "ADInfo", (String) null);
        if (parseXml == null) {
            SnsMethodCalculate.markEndTimeMs("feed", "com.tencent.mm.plugin.sns.storage.ADInfo");
            return;
        }
        this.viewId = Util.nullAs(parseXml.get(".ADInfo.viewid"), "");
        if (parseXml.get(".ADInfo.ad_sns_pos") == null) {
            SnsMethodCalculate.markEndTimeMs("feed", "com.tencent.mm.plugin.sns.storage.ADInfo");
            return;
        }
        this.ad_sns_pos = Util.safeParseInt(parseXml.get(".ADInfo.ad_sns_pos"));
        this.noExposureExpireTime = Util.safeParseLong(parseXml.get(".ADInfo.noExposureExpireTime"));
        this.exposureNoActionExpireTime = Util.safeParseLong(parseXml.get(".ADInfo.exposureNoActionExpireTime"));
        this.uxInfo = Util.nullAs(parseXml.get(".ADInfo.uxInfo"), "");
        this.adActionType = Util.safeParseInt(parseXml.get(".ADInfo.adActionType"));
        this.adActionCardTitle = Util.nullAs(parseXml.get(".ADInfo.adActionCardTitle"), "");
        this.adActionCardTpId = Util.nullAs(parseXml.get(".ADInfo.adActionCardTpId"), "");
        this.adActionCardExt = Util.nullAs(parseXml.get(".ADInfo.adActionCardExt"), "");
        this.adActionLink = Util.nullAs(parseXml.get(".ADInfo.adActionLink"), "");
        this.adActionPOIType = Util.safeParseInt(parseXml.get(".ADInfo.adActionExt.adActionExtPOI.POIType"));
        this.adActionPOIId = Util.nullAs(parseXml.get(".ADInfo.adActionExt.adActionExtPOI.POIId"), "");
        this.adActionPOIName = Util.nullAs(parseXml.get(".ADInfo.adActionExt.adActionExtPOI.POIName"), "");
        this.adActionPOILink = Util.nullAs(parseXml.get(".ADInfo.adActionExt.adActionExtPOI.POILink"), "");
        this.adChainType = Util.safeParseInt(parseXml.get(".ADInfo.adActionExt.adChainType"));
        this.adChainTypeExpireTime = Util.safeParseInt(parseXml.get(".ADInfo.adActionExt.adChainTypeExpireTime"));
        this.adExtTailWording = Util.nullAs(parseXml.get(".ADInfo.adActionExt.adChainStrengthen.WordingComplexString"), "");
        this.adExtTailWordingExchangeValue = Util.safeParseInt(parseXml.get(".ADInfo.adActionExt.adChainStrengthen.WordingComplexExchangeValue"));
        String nullAs = Util.nullAs(parseXml.get(".ADInfo.adActionExt.adChainStrengthen.Wording"), "");
        this.adActionExtTailType = Util.safeParseInt(parseXml.get(".ADInfo.adActionExt.adChainStrengthen.WordingType"));
        this.adActionExtTailLink = Util.nullAs(parseXml.get(".ADInfo.adActionExt.adChainStrengthen.WordingLink"), "");
        if (this.adActionExtTailType == ADChainStrengthenUserInfoFormatWording) {
            String nullAs2 = Util.nullAs(parseXml.get(".ADInfo.adActionExt.adChainStrengthen.WordingRepAndroid"), "");
            this.adActionExtUserList.clear();
            int i = 0;
            while (true) {
                if (i == 0) {
                    str3 = Util.nullAs(parseXml.get(".ADInfo.adActionExt.adChainStrengthen.UserNameList.UserName"), "");
                } else {
                    str3 = Util.nullAs(parseXml.get(".ADInfo.adActionExt.adChainStrengthen.UserNameList.UserName" + i), "");
                }
                if (Util.isNullOrNil(str3)) {
                    break;
                }
                this.adActionExtUserList.add(str3);
                i++;
            }
            boolean z2 = nullAs2.indexOf("%s") >= 0;
            int indexOf = nullAs2.indexOf("%");
            int lastIndexOf = nullAs2.lastIndexOf("%");
            if (Util.isNullOrNil(nullAs2) || !z2 || indexOf != lastIndexOf) {
                this.adActionExtTailWording = nullAs;
                this.adActionExtTailType = ADChainStrengthenDefaultWording;
            } else {
                this.adActionExtTailWording = nullAs2;
            }
        } else {
            this.adActionExtTailWording = nullAs;
            this.adActionExtTailType = ADChainStrengthenDefaultWording;
        }
        this.bLandingPagesAd = parseXml.containsKey(".ADInfo.adCanvasInfo");
        this.aid = parseXml.get(".ADInfo.session_data.aid");
        this.traceid = parseXml.get(".ADInfo.session_data.trace_id");
        this.mappedCanvasCardExt = new HashMap<>();
        int i2 = 0;
        while (true) {
            if (i2 == 0) {
                str2 = ".ADInfo.adCanvasExt.adCardItemList.cardItem";
            } else {
                str2 = ".ADInfo.adCanvasExt.adCardItemList.cardItem" + i2;
            }
            String str4 = parseXml.get(str2 + ".cardTpId");
            String str5 = parseXml.get(str2 + ".cardExt");
            if (Util.isNullOrNil(str4)) {
                break;
            }
            this.mappedCanvasCardExt.put(str4, str5);
            i2++;
        }
        Matcher matcher = Pattern.compile("<adCanvasExt>[\\s\\S]*</adCanvasExt>").matcher(str);
        if (matcher.find()) {
            String group = matcher.group();
            if (!Util.isNullOrNil(group)) {
                this.adCanvasExtXml = group.replaceAll("</?adCanvasExt>", "");
            }
        }
        String str6 = parseXml.get(".ADInfo.adActionExt.adActionExtWeApp.appUserName");
        if (!TextUtils.isEmpty(str6)) {
            C95009b bVar = new C95009b();
            this.actionExtWeApp = bVar;
            bVar.f275645a = str6;
            bVar.f275647c = parseXml.get(".ADInfo.adActionExt.adActionExtWeApp.appVersion");
            this.actionExtWeApp.f275646b = parseXml.get(".ADInfo.adActionExt.adActionExtWeApp.relativePagePath");
            this.actionExtWeApp.f275648d = Util.safeParseInt(parseXml.get(".ADInfo.adActionExt.adActionExtWeApp.miniProgramType"));
        }
        this.adUnlikeInfo = new C95010c(parseXml, ".ADInfo");
        this.adDislikeInfoTitle_cn = Util.nullAs(parseXml.get(".ADInfo.dislikeInfo.Title.zh"), "");
        this.adDislikeInfoTitle_tw = Util.nullAs(parseXml.get(".ADInfo.dislikeInfo.Title.tw"), "");
        this.adDislikeInfoTitle_en = Util.nullAs(parseXml.get(".ADInfo.dislikeInfo.Title.en"), "");
        this.forbidClick = Util.safeParseInt(parseXml.get(".ADInfo.dislikeInfo.forbidClick")) > 0;
        this.isPersonalizedAdClose = Util.safeParseInt(parseXml.get(".ADInfo.dislikeInfo.isPersonalizedAdClose")) > 0;
        this.adInfoSyncBuffer = Util.nullAs(parseXml.get(".ADInfo.adInfoSyncBuffer"), "");
        this.adInfoSyncBufferImm = Util.safeParseInt(parseXml.get(".ADInfo.adInfoSyncBuffer.$imm")) == 1;
        this.adVoteInfoExt = new C95012d(parseXml);
        this.waidPkg = Util.nullAsNil(parseXml.get(".ADInfo.appWaid.pkg"));
        String u = C102260r.m134881u(this.uxInfo);
        if (TextUtils.isEmpty(u)) {
            Log.m105928w(TAG, "aid from uxinfo is empty, uxinfo=" + this.uxInfo + ", aid=" + this.aid);
            u = this.aid;
        }
        synchronized (waidPkgCache) {
            try {
                if (!TextUtils.isEmpty(u) && !TextUtils.isEmpty(this.waidPkg)) {
                    Log.m105924i(TAG, "cache waidPkg, key=" + u + ", value=" + this.waidPkg);
                    waidPkgCache.put(u, this.waidPkg);
                }
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("feed", "com.tencent.mm.plugin.sns.storage.ADInfo");
                    throw th;
                }
            }
        }
        if (parseXml.containsKey(".ADInfo.adActionExt.adActionSchemaJump")) {
            String nullAs3 = Util.nullAs(parseXml.get(".ADInfo.adActionExt.adActionSchemaJump.packageName"), "");
            String nullAs4 = Util.nullAs(parseXml.get(".ADInfo.adActionExt.adActionSchemaJump.openSdkAppIdAndroid"), "");
            if (!TextUtils.isEmpty(nullAs3) && !TextUtils.isEmpty(nullAs4)) {
                C95008a aVar2 = new C95008a();
                this.actionExtAppJump = aVar2;
                aVar2.f275642b = nullAs3;
                aVar2.f275641a = nullAs4;
                aVar2.f275643c = Util.nullAs(parseXml.get(".ADInfo.adActionExt.adActionSchemaJump.appPageUrlAndroid"), "");
                this.actionExtAppJump.f275644d = Util.nullAs(parseXml.get(".ADInfo.adActionExt.adActionSchemaJump.appName"), "");
            }
        }
        this.contractAdEndTime = Util.safeParseInt(parseXml.get(".ADInfo.adGroupEndTime"));
        this.adDupSnsIdDel = Util.safeParseInt(parseXml.get(".ADInfo.adDupSnsIdDel"));
        this.pId = Util.nullAsNil(C102260r.m134833B(this.uxInfo));
        this.preloadFinderFeed = Util.safeParseInt(parseXml.get(".ADInfo.preloadFinderFeed")) == 1;
        this.preloadFinderLive = Util.safeParseInt(parseXml.get(".ADInfo.preloadFinderLive")) == 1;
        this.addClickTimeToWeAppPath = Util.safeParseInt(parseXml.get(".ADInfo.addClickTimeToWeAppPath")) == 1;
        parseAdClickActionInfoList(parseXml);
        this.adIPv4Url = Util.nullAsNil(parseXml.get(".ADInfo.adIPv4Url"));
        this.forbiddenShowRelievedBuy = Util.safeParseInt(parseXml.get(".ADInfo.forbiddenShowRelievedBuy")) == 1;
        if (parseXml.containsKey(".ADInfo.preloadCfg")) {
            SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adinfo.AdPreloadConfig");
            try {
                int safeParseInt = Util.safeParseInt(parseXml.get(".ADInfo.preloadCfg.forbidTimelinePreload"));
                int safeParseInt2 = Util.safeParseInt(parseXml.get(".ADInfo.preloadCfg.timelinePreloadRatio"));
                int i3 = 100;
                if (safeParseInt2 < 0) {
                    safeParseInt2 = 0;
                } else if (safeParseInt2 > 100) {
                    safeParseInt2 = 100;
                }
                int safeParseInt3 = Util.safeParseInt(parseXml.get(".ADInfo.preloadCfg.forbidLandingpagePreload"));
                int safeParseInt4 = Util.safeParseInt(parseXml.get(".ADInfo.preloadCfg.landingpagePreloadRatio"));
                if (safeParseInt4 < 0) {
                    i3 = 0;
                } else if (safeParseInt4 <= 100) {
                    i3 = safeParseInt4;
                }
                C92277a aVar3 = new C92277a();
                aVar3.f264107a = safeParseInt == 1;
                aVar3.f264108b = safeParseInt2;
                if (safeParseInt3 != 1) {
                    z = false;
                }
                aVar3.f264109c = z;
                aVar3.f264110d = i3;
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adinfo.AdPreloadConfig");
                aVar = aVar3;
            } catch (Throwable th4) {
                Log.m105920e("AdPreloadConfig", "parse AdPreloadConfig failed, exp=" + th4.toString());
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adinfo.AdPreloadConfig");
            }
            this.adPreloadConfig = aVar;
        }
        this.sessionKeyAd = Util.nullAsNil(parseXml.get(".ADInfo.sessionKeyAd"));
        this.score = Util.safeParseFloat(parseXml.get(".ADInfo.score"));
        this.costLevel = Util.nullAsNil(parseXml.get(".ADInfo.costLevel"));
        SnsMethodCalculate.markEndTimeMs("feed", "com.tencent.mm.plugin.sns.storage.ADInfo");
    }

    public static String getWaidPkgByUxInfo(String str) {
        String str2;
        String str3;
        SnsMethodCalculate.markStartTimeMs("getWaidPkgByUxInfo", "com.tencent.mm.plugin.sns.storage.ADInfo");
        String str4 = "";
        String u = C102260r.m134881u(str);
        if (!TextUtils.isEmpty(u)) {
            synchronized (waidPkgCache) {
                try {
                    str4 = Util.nullAsNil(waidPkgCache.get(u));
                } finally {
                    str2 = "getWaidPkgByUxInfo";
                    str3 = "com.tencent.mm.plugin.sns.storage.ADInfo";
                    SnsMethodCalculate.markEndTimeMs(str2, str3);
                }
            }
        } else {
            Log.m105920e(TAG, "getWaidPkgByUxInfo, aid is empty, uxinfo=" + str);
        }
        return str4;
    }

    private void parseAdClickActionInfoList(Map<String, String> map) {
        SnsMethodCalculate.markStartTimeMs("parseAdClickActionInfoList", "com.tencent.mm.plugin.sns.storage.ADInfo");
        try {
            if (map.containsKey(".ADInfo.clickActionInfoList")) {
                if (this.adClickActionInfoList == null) {
                    this.adClickActionInfoList = new ArrayList();
                }
                int i = 0;
                while (true) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(".ADInfo.clickActionInfoList.clickActionInfo");
                    sb.append(i == 0 ? "" : Integer.valueOf(i));
                    String sb4 = sb.toString();
                    if (!map.containsKey(sb4)) {
                        break;
                    }
                    this.adClickActionInfoList.add(AdClickActionInfo.m119629b(map, sb4));
                    i++;
                }
            }
        } catch (Throwable th) {
            Log.m105920e(TAG, th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("parseAdClickActionInfoList", "com.tencent.mm.plugin.sns.storage.ADInfo");
    }

    public boolean checkCurIndexCanJump(int i) {
        SnsMethodCalculate.markStartTimeMs("checkCurIndexCanJump", "com.tencent.mm.plugin.sns.storage.ADInfo");
        boolean z = false;
        if (i < 0) {
            SnsMethodCalculate.markEndTimeMs("checkCurIndexCanJump", "com.tencent.mm.plugin.sns.storage.ADInfo");
            return false;
        } else if (C101425k.m133097a(this.adClickActionInfoList)) {
            SnsMethodCalculate.markEndTimeMs("checkCurIndexCanJump", "com.tencent.mm.plugin.sns.storage.ADInfo");
            return false;
        } else {
            if (i < this.adClickActionInfoList.size()) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("checkCurIndexCanJump", "com.tencent.mm.plugin.sns.storage.ADInfo");
            return z;
        }
    }

    public C92277a getAdPreloadConfig() {
        SnsMethodCalculate.markStartTimeMs("getAdPreloadConfig", "com.tencent.mm.plugin.sns.storage.ADInfo");
        if (!enableAdPreloadConfig()) {
            Log.m105920e(TAG, "adVideoPreload, getAdPreloadConfig==null, for X cfg close");
            SnsMethodCalculate.markEndTimeMs("getAdPreloadConfig", "com.tencent.mm.plugin.sns.storage.ADInfo");
            return null;
        }
        C92277a aVar = this.adPreloadConfig;
        SnsMethodCalculate.markEndTimeMs("getAdPreloadConfig", "com.tencent.mm.plugin.sns.storage.ADInfo");
        return aVar;
    }

    public boolean isSuperAd() {
        SnsMethodCalculate.markStartTimeMs("isSuperAd", "com.tencent.mm.plugin.sns.storage.ADInfo");
        boolean z = this.forbidClick;
        SnsMethodCalculate.markEndTimeMs("isSuperAd", "com.tencent.mm.plugin.sns.storage.ADInfo");
        return z;
    }

    public boolean isWeApp(AdClickActionInfo adClickActionInfo) {
        SnsMethodCalculate.markStartTimeMs("isWeApp", "com.tencent.mm.plugin.sns.storage.ADInfo");
        boolean z = false;
        if (adClickActionInfo == null) {
            SnsMethodCalculate.markEndTimeMs("isWeApp", "com.tencent.mm.plugin.sns.storage.ADInfo");
            return false;
        }
        if (adClickActionInfo.f273641b == 4 && !Util.isNullOrNil(adClickActionInfo.f273645d)) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("isWeApp", "com.tencent.mm.plugin.sns.storage.ADInfo");
        return z;
    }

    public boolean isWeapp() {
        SnsMethodCalculate.markStartTimeMs("isWeapp", "com.tencent.mm.plugin.sns.storage.ADInfo");
        boolean z = this.adActionType == 4 && this.actionExtWeApp != null;
        SnsMethodCalculate.markEndTimeMs("isWeapp", "com.tencent.mm.plugin.sns.storage.ADInfo");
        return z;
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADInfo$c */
    public static class C95010c {

        /* renamed from: a */
        public int f275649a = 0;

        /* renamed from: b */
        public List<C95011a> f275650b = new ArrayList();

        /* renamed from: c */
        public Map<String, List<C95011a>> f275651c = new HashMap();

        /* renamed from: d */
        public String f275652d = "";

        /* renamed from: e */
        public String f275653e = "";

        /* renamed from: f */
        public String f275654f = "";

        public C95010c() {
        }

        /* renamed from: a */
        public List<C95011a> mo131416a() {
            SnsMethodCalculate.markStartTimeMs("getReasonList", "com.tencent.mm.plugin.sns.storage.ADInfo$AdUnlikeInfo");
            String currentLanguage = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
            if (!"zh_CN".equals(currentLanguage) && !"zh_TW".equals(currentLanguage) && !"zh_HK".equals(currentLanguage)) {
                currentLanguage = "en";
            }
            if (!this.f275651c.containsKey(currentLanguage)) {
                ArrayList arrayList = new ArrayList();
                for (C95011a next : this.f275650b) {
                    if ("zh_CN".equals(currentLanguage) && !Util.isNullOrNil(next.f275655a)) {
                        arrayList.add(next);
                    } else if (("zh_TW".equals(currentLanguage) || "zh_HK".equals(currentLanguage)) && !Util.isNullOrNil(next.f275656b)) {
                        arrayList.add(next);
                    } else if ("en".equals(currentLanguage) && !Util.isNullOrNil(next.f275657c)) {
                        arrayList.add(next);
                    }
                }
                this.f275651c.put(currentLanguage, arrayList);
            }
            List<C95011a> list = this.f275651c.get(currentLanguage);
            SnsMethodCalculate.markEndTimeMs("getReasonList", "com.tencent.mm.plugin.sns.storage.ADInfo$AdUnlikeInfo");
            return list;
        }

        public C95010c(Map<String, String> map, String str) {
            int i = 0;
            String str2 = str + ".dislikeInfo.ReasonList";
            while (true) {
                String str3 = str2 + ".Reason";
                if (i > 0) {
                    str3 = str3 + i;
                }
                if (map.get(str3 + ".ReasonId") == null) {
                    this.f275649a = Util.safeParseInt(map.get(str + ".dislikeInfo.unReceiveAdInterval"));
                    this.f275652d = Util.nullAs(map.get(str + ".dislikeInfo.forbidClickReason.zh"), "");
                    this.f275653e = Util.nullAs(map.get(str + ".dislikeInfo.forbidClickReason.tw"), "");
                    this.f275654f = Util.nullAs(map.get(str + ".dislikeInfo.forbidClickReason.en"), "");
                    return;
                }
                this.f275650b.add(new C95011a(Util.nullAs(map.get(str3 + ".Wording.zh"), ""), Util.nullAs(map.get(str3 + ".Wording.tw"), ""), Util.nullAs(map.get(str3 + ".Wording.en"), ""), Util.safeParseInt(map.get(str3 + ".ReasonId"))));
                i++;
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.ADInfo$c$a */
        public static class C95011a {

            /* renamed from: a */
            public String f275655a = "";

            /* renamed from: b */
            public String f275656b = "";

            /* renamed from: c */
            public String f275657c = "";

            /* renamed from: d */
            public int f275658d = 0;

            /* renamed from: e */
            public int f275659e;

            /* renamed from: f */
            public LinkedList<Integer> f275660f = new LinkedList<>();

            /* renamed from: g */
            public long f275661g = 0;

            /* renamed from: h */
            public long f275662h = 0;

            public C95011a(String str, String str2, String str3, int i) {
                this.f275655a = str;
                this.f275656b = str2;
                this.f275657c = str3;
                this.f275658d = i;
            }

            public String toString() {
                SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.storage.ADInfo$AdUnlikeInfo$AdUnlikeReason");
                String str = "AdUnlikeReason{, reasonIdCount=" + this.f275659e + ", reasonIdList=" + this.f275660f + ", unlikeStartTime=" + this.f275661g + ", unlikeEndTime=" + this.f275662h + '}';
                SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.storage.ADInfo$AdUnlikeInfo$AdUnlikeReason");
                return str;
            }

            public C95011a() {
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADInfo$d */
    public static class C95012d {

        /* renamed from: a */
        public ArrayList<C95013e> f275663a = new ArrayList<>();

        public C95012d(Map<String, String> map) {
            String str;
            int i = 0;
            while (true) {
                String str2 = ".ADInfo.adActionExt.adVoteInfoExt.voteItemList.voteResultInfo";
                if (i != 0) {
                    str2 = str2 + i;
                }
                String nullAs = Util.nullAs(map.get(str2 + ".id"), "");
                if (!TextUtils.isEmpty(nullAs)) {
                    C95013e eVar = new C95013e();
                    eVar.f275664a = nullAs;
                    eVar.f275665b = Util.safeParseInt(map.get(str2 + ".scoring"));
                    Util.safeParseInt(map.get(str2 + ".friends"));
                    String str3 = str2 + ".friendsList.userName";
                    int i2 = 0;
                    while (true) {
                        if (i2 == 0) {
                            str = str3;
                        } else {
                            str = str3 + i2;
                        }
                        String nullAs2 = Util.nullAs(map.get(str), "");
                        if (TextUtils.isEmpty(nullAs2)) {
                            break;
                        }
                        eVar.f275666c.add(nullAs2);
                        i2++;
                    }
                    this.f275663a.add(eVar);
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public C95013e mo131418a(String str) {
            SnsMethodCalculate.markStartTimeMs("getResultInfoById", "com.tencent.mm.plugin.sns.storage.ADInfo$AdVoteInfoExt");
            if (TextUtils.isEmpty(str)) {
                SnsMethodCalculate.markEndTimeMs("getResultInfoById", "com.tencent.mm.plugin.sns.storage.ADInfo$AdVoteInfoExt");
                return null;
            }
            Iterator<C95013e> it = this.f275663a.iterator();
            while (it.hasNext()) {
                C95013e next = it.next();
                if (str.equals(next.f275664a)) {
                    SnsMethodCalculate.markEndTimeMs("getResultInfoById", "com.tencent.mm.plugin.sns.storage.ADInfo$AdVoteInfoExt");
                    return next;
                }
            }
            SnsMethodCalculate.markEndTimeMs("getResultInfoById", "com.tencent.mm.plugin.sns.storage.ADInfo$AdVoteInfoExt");
            return null;
        }

        public C95012d() {
        }
    }

    public ADInfo(String str) {
        this.xml = "";
        this.uxInfo = "";
        this.adActionType = 0;
        this.adActionCardTitle = "";
        this.adActionCardTpId = "";
        this.adActionCardExt = "";
        this.adActionLink = "";
        this.adActionPOIType = 0;
        this.adActionPOIId = "";
        this.adActionPOIName = "";
        this.adActionPOILink = "";
        this.adActionExtTailType = ADChainStrengthenDefaultWording;
        this.adActionExtTailWording = "";
        this.adActionExtTailLink = "";
        this.adActionExtUserList = new LinkedList<>();
        this.adCanvasExtXml = "";
        this.adUnlikeInfo = new C95010c();
        this.adDislikeInfoTitle_cn = "";
        this.adDislikeInfoTitle_en = "";
        this.adDislikeInfoTitle_tw = "";
        this.forbidClick = false;
        this.isPersonalizedAdClose = false;
        this.adInfoSyncBuffer = "";
        this.adInfoSyncBufferImm = false;
        this.pId = "";
        this.sessionKeyAd = "";
        this.costLevel = "";
        this.bLandingPagesAd = false;
        feed(str);
    }
}
