package com.tencent.p014mm.plugin.sns.storage;

import android.content.Intent;
import android.text.TextUtils;
import ar2.C54325a;
import co2.C55052b;
import co2.C55055j;
import co2.C55057m;
import co2.C55058p;
import co2.C92429f;
import co2.C92433g;
import co2.C92443k;
import co2.C92445n;
import co2.C92447o;
import co2.C92449r;
import co2.C92450s;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.C94588a;
import com.tencent.p014mm.plugin.sns.p106ui.C96311x2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import fr2.C97952a;
import gr2.C98185c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import os2.C100403f;
import os2.C100409k;
import os2.C100418s;
import os2.C62171i;
import p749xh.C102646h;
import ps2.C118127b0;
import vr2.C102236a0;
import vr2.C102259p;
import wr2.C91098a;

/* renamed from: com.tencent.mm.plugin.sns.storage.ADXml */
public class ADXml {
    public static final int AD_CONTENT_STYLE_CARD = 1;
    public static final int AD_CONTENT_STYLE_COMBINED_GRID_1_ABOVE_3 = 7;
    public static final int AD_CONTENT_STYLE_FINDER_TOPIC_CARD = 5;
    public static final int AD_CONTENT_STYLE_FULL_CARD = 3;
    public static final int AD_CONTENT_STYLE_LINK = 2;
    public static final int AD_CONTENT_STYLE_SLIDE_FULL_CARD = 6;
    public static final int AD_CONTENT_STYLE_SPHERE_CARD = 4;
    public static final int AD_FULL_CARD_MEDIA_SIZE_W1_H1 = 1;
    public static final int AD_FULL_CARD_MEDIA_SIZE_W4_H3 = 0;
    public static final int AD_FULL_CARD_TITLE_LEFT_BOTTOM = 1;
    public static final int AD_FULL_CARD_TITLE_LEFT_TOP = 0;
    public static final int AD_MEDIA_DISPLAY_CENTER = 1;
    public static final int AD_MEDIA_DISPLAY_LEFT = 0;
    public static final int AD_MEDIA_DISPLAY_RIGHT = 2;
    public static final int AD_TURN_CARD_ANIMATION_TIME = 374;
    public static final String PRE_KEY_AD_ARGS = ".adxml.adArgs.arg";
    public static final String PRE_KEY_CARD_TAG_LIST = ".adxml.adCardInfo.adRatingCardInfo.tagList.tag";
    public static final String PRE_KEY_GESTURE_LIST = ".pointsItem";
    public static final String SUFF_KEY_CARD_TAG_BACKGROUND_DARK_MODE_COLOR = ".$tag_dark_bg_color";
    public static final String SUFF_KEY_CARD_TAG_BACKGROUND_LIGHT_MODE_COLOR = ".$tag_light_bg_color";
    public static final String SUFF_KEY_CARD_TAG_CONTENT_DARK_MODE_COLOR = ".$tag_dark_name_color";
    public static final String SUFF_KEY_CARD_TAG_CONTENT_LIGHT_MODE_COLOR = ".$tag_light_name_color";
    public static final String SUFF_KEY_CARD_TAG_ICON_DARK_MODE_URL = ".$dark_mode_url";
    public static final String SUFF_KEY_CARD_TAG_ICON_LIGHT_MODE_URL = ".$light_mode_url";
    public static final String TAG = "MicroMsg.ADXml";
    public String adActionLink;
    public AdClickActionInfo adActionLinkClickInfo;
    public int adActionLinkHidden = 0;
    public String adActionLinkIcon = "";
    public String adActionLinkName = "";
    public String adActionLinkTitle_cn = "";
    public String adActionLinkTitle_en = "";
    public String adActionLinkTitle_tw = "";
    public String adActionTitle;
    public Map<String, String> adArgs = new HashMap();
    public C55052b adAvatarFinderTopicInfo;
    public int adBasicRemWidth;
    public int adBasicRootFontSize;
    public C95301a adBreakFrameInfo;
    public int adBtnDisplayType;
    public ConcurrentHashMap<String, Boolean> adCanvasValidMap = new ConcurrentHashMap<>();
    public String adCard3dHeadTitle;
    public String adCard3dHeadUrl;
    public AdCardActionBtnInfo adCardActionBtnInfo;
    public String adCardDesc;
    public C30426c adCardTagInfo;
    public String adCardTitle;
    public C100403f adCombinedGridInfo;
    public int adContentDisplayType;
    public int adContentStyle;
    public C92433g adDynamicUpdateInfo;
    public String adExtInfo;
    public C95016e adFeedbackInfo;
    public C57361a adFinderInfo;
    public C94588a adFinderLiveInfo;
    public C94588a.C94589a adFinderLivePreviewInfo;
    public C55055j adFinderLiveStreamInfo;
    public C92443k adFinderTopicInfo;
    public C30427n adFloatWebViewInfo;
    @C118127b0(resType = 7)
    public C95018g adFullCardInfo;
    public C55057m adHeadFinderProfile;
    public C54325a adInteractionLabelInfo;
    public C92445n adLiveInfo;
    public float adMediaDisplayHeight;
    public int adMediaDisplayMode;
    public float adMediaDisplayWidth;
    public float adMediaIconHeight;
    public float adMediaIconPaddingBottom;
    public float adMediaIconPaddingRight;
    public String adMediaIconUrl;
    public float adMediaIconWidth;
    public C92447o adPromotionInfo;
    @C118127b0(resType = 7)
    public C55058p adRollInfo;
    public C85461b adScanJumpInfo;
    private C95021h adSelectInfo;
    public C62171i adSellingPointInfo;
    @C118127b0(resType = 7)
    public C97952a adShakeInfo;
    public C92449r adSliderFullCardInfo;
    @C118127b0(resType = 7)
    public C100409k adSocialInfo;
    public C95022i adSphereCardInfo;
    @C118127b0(resType = 7)
    public C92450s adTagBtnInfo;
    public C95023j adTurnInfo;
    public C95024k adTwistInfo;
    public int adType;
    public boolean adVideoContinuePlay = false;
    public C95025l adVoteInfo;
    public int addPlayIconOnCover;
    public String appGiftPackCode;
    public String appGiftPackCodeTips;
    public Intent appMarketIntent;
    public int attachShareLinkIsHidden = 0;
    public String attachShareLinkUrl = "";
    public String attachShareLinkWording = "";
    public boolean bLandingPagesAd;
    public boolean bTurnLandingPagesAd;
    public int clientMaxVersion;
    public int clientMinVersion;
    public String compatibleUrl;
    public String expandInsideTitle_cn = "";
    public String expandInsideTitle_en = "";
    public String expandInsideTitle_tw = "";
    public String expandOutsideTitle_cn = "";
    public String expandOutsideTitle_en = "";
    public String expandOutsideTitle_tw = "";
    public String feedbackWeAppPath;
    public String feedbackWeAppUsername;
    public String feedbackWording;
    public String firstDownloadApkPkgName;
    public boolean forbiddenCustomAnimation = false;
    public AdClickActionInfo headAdClickActionInfo;
    public String headClickParam = "";
    public int headClickRightBarShow = 0;
    public int headClickType = 0;
    public int isValidJumpCanvas = -1;
    public int newFeedbackPanel = 0;
    public String nickname;
    public long originSnsId;
    public String preferAvatar;
    public String preferNickName;
    public boolean preloadWeAppPkg = false;
    public int recExpId;
    public int recSrc;
    public int recType;
    public int toAdMarket = 0;
    @C118127b0(resType = 7)
    public C98185c touchParticleAnimConfig;
    public boolean usePreferedInfo;
    public int verticalVideoDisplayType = 0;
    public int videoPlayInStreamingMode = 0;
    public C95029q weAppInfo;
    public int webrightBar = 0;
    public String xml = "";

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADXml$c */
    public static class C30426c {

        /* renamed from: a */
        public List<C95015d> f82061a = new ArrayList();

        public boolean equals(Object obj) {
            SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
            if (this == obj) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
                return true;
            } else if (obj == null || C30426c.class != obj.getClass()) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
                return false;
            } else {
                boolean equals = Objects.equals(this.f82061a, ((C30426c) obj).f82061a);
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
                return equals;
            }
        }

        public int hashCode() {
            SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
            int hash = Objects.hash(new Object[]{this.f82061a});
            SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo");
            return hash;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADXml$n */
    public static class C30427n {

        /* renamed from: a */
        public String f82062a;

        /* renamed from: a */
        public static C30427n m39085a(Map<String, String> map, String str) {
            String str2;
            SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$FloatWebViewInfo");
            int i = 0;
            while (true) {
                SnsMethodCalculate.markStartTimeMs("getValueKey", "com.tencent.mm.plugin.sns.storage.ADXml$FloatWebViewInfo");
                if (i == 0) {
                    SnsMethodCalculate.markEndTimeMs("getValueKey", "com.tencent.mm.plugin.sns.storage.ADXml$FloatWebViewInfo");
                    str2 = str;
                } else {
                    str2 = str + i;
                    SnsMethodCalculate.markEndTimeMs("getValueKey", "com.tencent.mm.plugin.sns.storage.ADXml$FloatWebViewInfo");
                }
                String str3 = map.get(str2 + ".type");
                if (TextUtils.isEmpty(str3)) {
                    SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$FloatWebViewInfo");
                    return null;
                } else if (Util.safeParseInt(str3) == 136) {
                    C30427n nVar = new C30427n();
                    nVar.f82062a = map.get(str2 + ".webViewUrl");
                    SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$FloatWebViewInfo");
                    return nVar;
                } else {
                    i++;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADXml$a */
    public static class C57361a {

        /* renamed from: a */
        public String f164344a;

        /* renamed from: b */
        public String f164345b;

        /* renamed from: c */
        public String f164346c;

        /* renamed from: a */
        public static C57361a m66109a(Map<String, String> map, String str) {
            SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ADFinderInfo");
            String nullAsNil = Util.nullAsNil(map.get(str + ".objectNonceId"));
            String nullAsNil2 = Util.nullAsNil(map.get(str + ".finderUsername"));
            String nullAsNil3 = Util.nullAsNil(map.get(str + ".exportId"));
            if (TextUtils.isEmpty(nullAsNil3) || TextUtils.isEmpty(nullAsNil) || TextUtils.isEmpty(nullAsNil2)) {
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ADFinderInfo");
                return null;
            }
            C57361a aVar = new C57361a();
            aVar.f164344a = nullAsNil;
            aVar.f164345b = nullAsNil2;
            aVar.f164346c = nullAsNil3;
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ADFinderInfo");
            return aVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADXml$b */
    public static class C85461b {

        /* renamed from: a */
        public String f249071a;

        /* renamed from: b */
        public String f249072b;

        /* renamed from: c */
        public String f249073c;

        /* renamed from: d */
        public String f249074d;

        /* renamed from: e */
        public int f249075e;

        /* renamed from: a */
        public static C85461b m105464a(Map<String, String> map, String str) {
            SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ADScanJumpInfo");
            String nullAsNil = Util.nullAsNil(map.get(str + ".bgImage"));
            String nullAsNil2 = Util.nullAsNil(map.get(str + ".desc"));
            String nullAsNil3 = Util.nullAsNil(map.get(str + ".descIcon"));
            String nullAsNil4 = Util.nullAsNil(map.get(str + ".detectSucIcon"));
            int safeParseInt = Util.safeParseInt(map.get(str + ".scanGestureType"));
            if (TextUtils.isEmpty(nullAsNil) || TextUtils.isEmpty(nullAsNil3) || TextUtils.isEmpty(nullAsNil4) || safeParseInt <= 0) {
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ADScanJumpInfo");
                return null;
            }
            C85461b bVar = new C85461b();
            bVar.f249071a = nullAsNil;
            bVar.f249072b = nullAsNil2;
            bVar.f249073c = nullAsNil3;
            bVar.f249074d = nullAsNil4;
            bVar.f249075e = safeParseInt;
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ADScanJumpInfo");
            return bVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo */
    public static class AdCardActionBtnInfo {
        public C95014a alphaAnimBtnInfo;
        public String btnBgColor;
        public String btnBgDarkColor;
        public String btnColor;
        public String btnDarkColor;
        public String btnTitle;
        public AdClickActionInfo clickActionInfo;
        public String iconUrl;
        public int singleLineBtn;

        /* renamed from: com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo$a */
        public static class C95014a {

            /* renamed from: a */
            public int f275667a;

            /* renamed from: b */
            public int f275668b;

            /* renamed from: c */
            public String f275669c;

            /* renamed from: d */
            public String f275670d;

            /* renamed from: e */
            public String f275671e;

            /* renamed from: f */
            public String f275672f;
        }

        public void parse(Map<String, String> map, String str) {
            SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo");
            this.iconUrl = Util.nullAsNil(map.get(str + ".iconUrl"));
            this.btnTitle = Util.nullAsNil(map.get(str + ".btnTitle"));
            this.btnColor = Util.nullAsNil(map.get(str + ".btnColor"));
            this.btnBgColor = Util.nullAsNil(map.get(str + ".btnBgColor"));
            this.btnDarkColor = Util.nullAsNil(map.get(str + ".btnDarkColor"));
            this.btnBgDarkColor = Util.nullAsNil(map.get(str + ".btnBgDarkColor"));
            this.singleLineBtn = Util.safeParseInt(map.get(str + ".singleLineBtn"));
            if (map.containsKey(str + ".alphaAnimBtnInfo")) {
                C95014a aVar = new C95014a();
                this.alphaAnimBtnInfo = aVar;
                aVar.f275667a = Util.safeParseInt(map.get(str + ".alphaAnimBtnInfo.animTime"));
                C95014a aVar2 = this.alphaAnimBtnInfo;
                aVar2.f275668b = Util.safeParseInt(map.get(str + ".alphaAnimBtnInfo.animDelayTime"));
                C95014a aVar3 = this.alphaAnimBtnInfo;
                aVar3.f275669c = Util.nullAsNil(map.get(str + ".alphaAnimBtnInfo.btnColor"));
                C95014a aVar4 = this.alphaAnimBtnInfo;
                aVar4.f275670d = Util.nullAsNil(map.get(str + ".alphaAnimBtnInfo.btnBgColor"));
                C95014a aVar5 = this.alphaAnimBtnInfo;
                aVar5.f275671e = Util.nullAsNil(map.get(str + ".alphaAnimBtnInfo.btnDarkColor"));
                C95014a aVar6 = this.alphaAnimBtnInfo;
                aVar6.f275672f = Util.nullAsNil(map.get(str + ".alphaAnimBtnInfo.btnBgDarkColor"));
            }
            AdClickActionInfo b = AdClickActionInfo.m119629b(map, str);
            this.clickActionInfo = b;
            b.f273639a = 1;
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADXml$d */
    public static class C95015d {

        /* renamed from: a */
        public String f275673a;

        /* renamed from: b */
        public String f275674b;

        /* renamed from: c */
        public String f275675c;

        /* renamed from: d */
        public String f275676d;

        /* renamed from: e */
        public String f275677e;

        /* renamed from: f */
        public String f275678f;

        /* renamed from: g */
        public String f275679g;

        public boolean equals(Object obj) {
            SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagItem");
            boolean z = true;
            if (this == obj) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagItem");
                return true;
            } else if (obj == null || C95015d.class != obj.getClass()) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagItem");
                return false;
            } else {
                C95015d dVar = (C95015d) obj;
                if (!Objects.equals(this.f275673a, dVar.f275673a) || !Objects.equals(this.f275674b, dVar.f275674b) || !Objects.equals(this.f275675c, dVar.f275675c) || !Objects.equals(this.f275676d, dVar.f275676d) || !Objects.equals(this.f275677e, dVar.f275677e) || !Objects.equals(this.f275678f, dVar.f275678f) || !Objects.equals(this.f275679g, dVar.f275679g)) {
                    z = false;
                }
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagItem");
                return z;
            }
        }

        public int hashCode() {
            SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagItem");
            int hash = Objects.hash(new Object[]{this.f275673a, this.f275674b, this.f275675c, this.f275676d, this.f275677e, this.f275678f, this.f275679g});
            SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagItem");
            return hash;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADXml$e */
    public static class C95016e {

        /* renamed from: a */
        public List<C95017f> f275680a = new LinkedList();

        /* renamed from: a */
        public C95016e mo131453a(String str, Map<String, String> map, String str2) {
            String str3;
            SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdFeedbackInfo");
            String str4 = str2 + ".adxml.feedbackInfo.feedbackList.item";
            int i = 0;
            while (true) {
                if (i > 0) {
                    str3 = str4 + i;
                } else {
                    str3 = str4;
                }
                String str5 = str3 + ".url";
                if (map.get(str5) == null || map.get(str5).length() <= 0) {
                    SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdFeedbackInfo");
                } else {
                    C95017f fVar = new C95017f();
                    fVar.f275684d = Util.nullAs(map.get(str5), "");
                    fVar.f275681a = Util.nullAs(map.get(str3 + ".Wording.zh"), "");
                    fVar.f275682b = Util.nullAs(map.get(str3 + ".Wording.en"), "");
                    fVar.f275683c = Util.nullAs(map.get(str3 + ".Wording.tw"), "");
                    if (fVar.f275681a.length() + fVar.f275682b.length() + fVar.f275683c.length() > 0) {
                        ((LinkedList) this.f275680a).add(fVar);
                    }
                    i++;
                }
            }
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdFeedbackInfo");
            return this;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADXml$f */
    public static class C95017f {

        /* renamed from: a */
        public String f275681a = "";

        /* renamed from: b */
        public String f275682b = "";

        /* renamed from: c */
        public String f275683c = "";

        /* renamed from: d */
        public String f275684d = "";
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADXml$g */
    public static class C95018g {

        /* renamed from: a */
        public int f275685a;

        /* renamed from: b */
        public String f275686b;

        /* renamed from: c */
        public String f275687c;

        /* renamed from: d */
        public int f275688d = 30;

        /* renamed from: e */
        public int f275689e;

        /* renamed from: f */
        public C95019a f275690f;
        @C118127b0(resType = 1)

        /* renamed from: g */
        public String f275691g;

        /* renamed from: h */
        public int f275692h;
        @C118127b0(resType = 1)

        /* renamed from: i */
        public String f275693i;

        /* renamed from: j */
        public int f275694j;
        @C118127b0(resType = 7)

        /* renamed from: k */
        public C96311x2 f275695k;

        /* renamed from: l */
        public C95028p f275696l;
        @C118127b0(resType = 7)

        /* renamed from: m */
        public C92429f f275697m;

        /* renamed from: com.tencent.mm.plugin.sns.storage.ADXml$g$a */
        public static class C95019a {

            /* renamed from: a */
            public long f275698a;

            /* renamed from: b */
            public long f275699b;

            /* renamed from: c */
            public float f275700c;

            /* renamed from: d */
            public int f275701d;

            /* renamed from: e */
            public String f275702e;

            /* renamed from: f */
            public List<C95020b> f275703f = new ArrayList();
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.ADXml$g$b */
        public static class C95020b {

            /* renamed from: a */
            public String f275704a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x028e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0377  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo131454a(java.util.Map<java.lang.String, java.lang.String> r20, java.lang.String r21) {
            /*
                r19 = this;
                r0 = r19
                r1 = r20
                r2 = r21
                java.lang.String r3 = "parse"
                java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.ADXml$AdFullCardInfo"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r2)
                java.lang.String r6 = ".displayType"
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                java.lang.Object r5 = r1.get(r5)
                java.lang.String r5 = (java.lang.String) r5
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
                r0.f275685a = r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r2)
                java.lang.String r6 = ".title"
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                java.lang.Object r5 = r1.get(r5)
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
                r0.f275686b = r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r2)
                java.lang.String r7 = ".description"
                r5.append(r7)
                java.lang.String r5 = r5.toString()
                java.lang.Object r5 = r1.get(r5)
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
                r0.f275687c = r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r2)
                java.lang.String r8 = ".markMaxAlpha"
                r5.append(r8)
                java.lang.String r5 = r5.toString()
                java.lang.Object r5 = r1.get(r5)
                java.lang.String r5 = (java.lang.String) r5
                r8 = 30
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r8)
                r0.f275688d = r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r2)
                java.lang.String r8 = ".titlePosition"
                r5.append(r8)
                java.lang.String r5 = r5.toString()
                java.lang.Object r5 = r1.get(r5)
                java.lang.String r5 = (java.lang.String) r5
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
                r0.f275689e = r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r2)
                java.lang.String r8 = ".maskImg"
                r5.append(r8)
                java.lang.String r5 = r5.toString()
                java.lang.Object r5 = r1.get(r5)
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
                r0.f275691g = r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r2)
                java.lang.String r8 = ".maskImgDisappearTime"
                r5.append(r8)
                java.lang.String r5 = r5.toString()
                java.lang.Object r5 = r1.get(r5)
                java.lang.String r5 = (java.lang.String) r5
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
                r0.f275692h = r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r2)
                java.lang.String r8 = ".coverImg"
                r5.append(r8)
                java.lang.String r5 = r5.toString()
                java.lang.Object r5 = r1.get(r5)
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
                r0.f275693i = r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r2)
                java.lang.String r8 = ".coverImgAppearTime"
                r5.append(r8)
                java.lang.String r5 = r5.toString()
                java.lang.Object r5 = r1.get(r5)
                java.lang.String r5 = (java.lang.String) r5
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
                r0.f275694j = r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r2)
                java.lang.String r8 = ".adGestureInfo.points"
                r5.append(r8)
                java.lang.String r5 = r5.toString()
                java.lang.Object r5 = r1.get(r5)
                java.lang.String r5 = (java.lang.String) r5
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r2)
                java.lang.String r10 = ".adGestureInfo.pointsList"
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 == 0) goto L_0x0149
                boolean r5 = r1.containsKey(r9)
                if (r5 == 0) goto L_0x0275
            L_0x0149:
                com.tencent.mm.plugin.sns.storage.ADXml$g$a r5 = new com.tencent.mm.plugin.sns.storage.ADXml$g$a
                r5.<init>()
                r0.f275690f = r5
                r10 = -1
                r5.f275701d = r10
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r2)
                java.lang.String r11 = ".adGestureInfo.startTime"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                java.lang.Object r10 = r1.get(r10)
                java.lang.String r10 = (java.lang.String) r10
                int r10 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r10)
                long r10 = (long) r10
                r5.f275698a = r10
                com.tencent.mm.plugin.sns.storage.ADXml$g$a r5 = r0.f275690f
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r2)
                java.lang.String r11 = ".adGestureInfo.endTime"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                java.lang.Object r10 = r1.get(r10)
                java.lang.String r10 = (java.lang.String) r10
                int r10 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r10)
                long r10 = (long) r10
                r5.f275699b = r10
                com.tencent.mm.plugin.sns.storage.ADXml$g$a r5 = r0.f275690f
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r2)
                java.lang.String r11 = ".adGestureInfo.distance"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                java.lang.Object r10 = r1.get(r10)
                java.lang.String r10 = (java.lang.String) r10
                float r10 = com.tencent.p014mm.sdk.platformtools.Util.safeParseFloat(r10)
                r5.f275700c = r10
                com.tencent.mm.plugin.sns.storage.ADXml$g$a r5 = r0.f275690f
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r2)
                java.lang.String r11 = ".adGestureInfo.color"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                java.lang.Object r10 = r1.get(r10)
                java.lang.String r10 = (java.lang.String) r10
                java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
                int r10 = android.graphics.Color.parseColor(r10)
                r5.f275701d = r10
                com.tencent.mm.plugin.sns.storage.ADXml$g$a r5 = r0.f275690f
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r2)
                r10.append(r8)
                java.lang.String r8 = r10.toString()
                java.lang.Object r8 = r1.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
                r5.f275702e = r8
                boolean r5 = r1.containsKey(r9)
                if (r5 == 0) goto L_0x0275
                com.tencent.mm.plugin.sns.storage.ADXml$g$a r5 = r0.f275690f
                java.lang.String r8 = "access$000"
                java.lang.String r10 = "com.tencent.mm.plugin.sns.storage.ADXml$AdFullCardInfo$GestureInfo"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r10)
                r5.getClass()
                java.lang.String r11 = "parsePointsItem"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r10)
                r13 = 0
            L_0x0209:
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r9)
                java.lang.String r15 = ".pointsItem"
                r14.append(r15)
                java.lang.String r15 = ""
                if (r13 != 0) goto L_0x021c
                r12 = r15
                goto L_0x0222
            L_0x021c:
                java.lang.Integer r16 = java.lang.Integer.valueOf(r13)
                r12 = r16
            L_0x0222:
                r14.append(r12)
                java.lang.String r12 = r14.toString()
                boolean r14 = r1.containsKey(r12)
                if (r14 == 0) goto L_0x026c
                java.util.List<com.tencent.mm.plugin.sns.storage.ADXml$g$b> r14 = r5.f275703f
                if (r14 != 0) goto L_0x0234
                goto L_0x026c
            L_0x0234:
                java.lang.Object r12 = r1.get(r12)
                java.lang.String r12 = (java.lang.String) r12
                r14 = 1
                java.lang.Object[] r14 = new java.lang.Object[r14]
                r16 = 0
                r14[r16] = r12
                r17 = r9
                java.lang.String r9 = "MicroMsg.ADXml"
                r18 = r3
                java.lang.String r3 = "parse points item %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r3, r14)
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
                if (r3 != 0) goto L_0x0265
                com.tencent.mm.plugin.sns.storage.ADXml$g$b r3 = new com.tencent.mm.plugin.sns.storage.ADXml$g$b
                r3.<init>()
                java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r12, (java.lang.String) r15)
                r3.f275704a = r9
                java.util.List<com.tencent.mm.plugin.sns.storage.ADXml$g$b> r9 = r5.f275703f
                java.util.ArrayList r9 = (java.util.ArrayList) r9
                r9.add(r3)
            L_0x0265:
                int r13 = r13 + 1
                r9 = r17
                r3 = r18
                goto L_0x0209
            L_0x026c:
                r18 = r3
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r10)
                goto L_0x0277
            L_0x0275:
                r18 = r3
            L_0x0277:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r2)
                java.lang.String r5 = ".endCoverInfo"
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                boolean r5 = r1.containsKey(r3)
                if (r5 == 0) goto L_0x0349
                com.tencent.mm.plugin.sns.ui.x2 r5 = new com.tencent.mm.plugin.sns.ui.x2
                r5.<init>()
                r0.f275695k = r5
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r3)
                r8.append(r6)
                java.lang.String r6 = r8.toString()
                java.lang.Object r6 = r1.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
                r5.f281630a = r6
                com.tencent.mm.plugin.sns.ui.x2 r5 = r0.f275695k
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r3)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.Object r6 = r1.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
                r5.f281632c = r6
                com.tencent.mm.plugin.sns.ui.x2 r5 = r0.f275695k
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r3)
                java.lang.String r7 = ".actionTitle"
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.Object r6 = r1.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
                r5.f281633d = r6
                com.tencent.mm.plugin.sns.ui.x2 r5 = r0.f275695k
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r3)
                java.lang.String r7 = ".ambientImageUrl"
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.Object r6 = r1.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
                r5.f281635f = r6
                com.tencent.mm.plugin.sns.ui.x2 r5 = r0.f275695k
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r3)
                java.lang.String r7 = ".titleImageUrl"
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.Object r6 = r1.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
                r5.f281631b = r6
                com.tencent.mm.plugin.sns.ui.x2 r5 = r0.f275695k
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r3)
                java.lang.String r3 = ".endCoverEndTime"
                r6.append(r3)
                java.lang.String r3 = r6.toString()
                java.lang.Object r3 = r1.get(r3)
                java.lang.String r3 = (java.lang.String) r3
                int r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r3)
                r5.f281634e = r3
            L_0x0349:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r2)
                java.lang.String r5 = ".adLongPressGestureInfo"
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                com.tencent.mm.plugin.sns.storage.ADXml$p r3 = com.tencent.p014mm.plugin.sns.storage.ADXml.C95028p.m120769a(r1, r3)
                r0.f275696l = r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r2)
                java.lang.String r2 = ".dragImageGestureInfo"
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                boolean r3 = r1.containsKey(r2)
                if (r3 == 0) goto L_0x04a0
                java.lang.String r3 = "parseFromXml"
                java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.adxml.AdDragInfo"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
                co2.f r6 = new co2.f
                r6.<init>()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r2)
                java.lang.String r8 = ".imageUrl"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                java.lang.Object r7 = r1.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
                r6.f264494a = r7
                boolean r7 = android.text.TextUtils.isEmpty(r7)
                r8 = 0
                if (r7 == 0) goto L_0x03ae
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            L_0x03ab:
                r6 = r8
                goto L_0x049e
            L_0x03ae:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r2)
                java.lang.String r9 = ".dragStartTime"
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                java.lang.Object r7 = r1.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                int r7 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r7)
                r6.f264495b = r7
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r2)
                java.lang.String r9 = ".dragEndTime"
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                java.lang.Object r7 = r1.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                int r7 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r7)
                r6.f264496c = r7
                int r9 = r6.f264495b
                if (r9 < 0) goto L_0x0499
                if (r7 < 0) goto L_0x0499
                if (r9 <= r7) goto L_0x03f2
                goto L_0x0499
            L_0x03f2:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r2)
                java.lang.String r9 = ".srcDisplayRect"
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                java.lang.Object r7 = r1.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
                android.graphics.Rect r7 = co2.C92429f.m116259d(r7)
                r6.f264497d = r7
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r2)
                java.lang.String r9 = ".destDisplayRect"
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                java.lang.Object r7 = r1.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
                android.graphics.Rect r7 = co2.C92429f.m116259d(r7)
                r6.f264498e = r7
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r2)
                java.lang.String r9 = ".srcHitRect"
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                java.lang.Object r7 = r1.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
                android.graphics.Rect r7 = co2.C92429f.m116259d(r7)
                r6.f264499f = r7
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r2)
                java.lang.String r2 = ".destHitRect"
                r7.append(r2)
                java.lang.String r2 = r7.toString()
                java.lang.Object r1 = r1.get(r2)
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
                android.graphics.Rect r1 = co2.C92429f.m116259d(r1)
                r6.f264500g = r1
                android.graphics.Rect r2 = r6.f264497d
                if (r2 == 0) goto L_0x0494
                android.graphics.Rect r2 = r6.f264498e
                if (r2 == 0) goto L_0x0494
                android.graphics.Rect r2 = r6.f264499f
                if (r2 == 0) goto L_0x0494
                if (r1 != 0) goto L_0x0485
                goto L_0x0494
            L_0x0485:
                boolean r1 = android.graphics.Rect.intersects(r2, r1)
                if (r1 == 0) goto L_0x0490
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
                goto L_0x03ab
            L_0x0490:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
                goto L_0x049e
            L_0x0494:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
                goto L_0x03ab
            L_0x0499:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
                goto L_0x03ab
            L_0x049e:
                r0.f275697m = r6
            L_0x04a0:
                r1 = r18
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.ADXml.C95018g.mo131454a(java.util.Map, java.lang.String):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADXml$h */
    public class C95021h {

        /* renamed from: a */
        public String f275705a;

        /* renamed from: b */
        public String f275706b;

        /* renamed from: c */
        public AdClickActionInfo f275707c;

        /* renamed from: d */
        public AdClickActionInfo f275708d;

        public C95021h(ADXml aDXml) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADXml$i */
    public static class C95022i {

        /* renamed from: a */
        public int f275709a;

        /* renamed from: b */
        public String f275710b;

        /* renamed from: c */
        public String f275711c;

        /* renamed from: d */
        public int f275712d = 30;

        /* renamed from: e */
        public int f275713e;

        /* renamed from: f */
        public int f275714f;

        /* renamed from: g */
        public String f275715g;

        /* renamed from: h */
        public String f275716h;

        /* renamed from: a */
        public void mo131455a(Map<String, String> map, String str) {
            SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdSphereCardInfo");
            this.f275709a = Util.safeParseInt(map.get(str + ".displayType"));
            this.f275710b = Util.nullAsNil(map.get(str + ".title"));
            this.f275711c = Util.nullAsNil(map.get(str + ".description"));
            this.f275712d = Util.getInt(map.get(str + ".markMaxAlpha"), 30);
            this.f275713e = Util.safeParseInt(map.get(str + ".titlePosition"));
            this.f275714f = Util.safeParseInt(map.get(str + ".gestureDelayTime"));
            this.f275716h = Util.nullAsNil(map.get(str + ".sphereThumbUrl"));
            Util.nullAsNil(map.get(str + ".bgColor"));
            Util.nullAsNil(map.get(str + ".bgColorAlpha"));
            this.f275715g = Util.nullAsNil(map.get(str + ".sphereImageUrl"));
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdSphereCardInfo");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADXml$j */
    public static class C95023j {

        /* renamed from: a */
        public String f275717a = "";

        /* renamed from: b */
        public String f275718b;

        /* renamed from: c */
        public String f275719c;

        /* renamed from: d */
        public String f275720d;

        /* renamed from: e */
        public List<C95027o> f275721e = new ArrayList();

        /* renamed from: a */
        public void mo131456a(String str, Map<String, String> map, String str2) {
            String str3;
            SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdTurnInfo");
            this.f275717a = Util.nullAs(map.get(str2 + ".adxml.adTurnActionLink"), "");
            String str4 = map.get(str2 + ".adxml.adTurnActionExtWeApp.appUserName");
            if (!TextUtils.isEmpty(str4)) {
                this.f275718b = str4;
                this.f275720d = map.get(str2 + ".adxml.adTurnActionExtWeApp.appVersion");
                this.f275719c = map.get(str2 + ".adxml.adTurnActionExtWeApp.relativePagePath");
            }
            String str5 = str2 + ".adxml.adTurnInfo.materialInfo";
            int i = 0;
            while (true) {
                if (i > 0) {
                    str3 = str5 + i;
                } else {
                    str3 = str5;
                }
                if (map.get(str3 + ".displayType") == null) {
                    break;
                }
                if (map.get(str3 + ".displayType").length() <= 0) {
                    break;
                }
                C95027o oVar = new C95027o();
                oVar.f275740a = Util.nullAs(map.get(str3 + ".title"), "");
                oVar.f275741b = Util.nullAs(map.get(str3 + ".desc"), "");
                oVar.f275742c = Util.safeParseInt(map.get(str3 + ".displayType"));
                ((ArrayList) this.f275721e).add(oVar);
                i++;
            }
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdTurnInfo");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADXml$k */
    public static class C95024k implements Serializable {

        /* renamed from: d */
        public int f275722d;

        /* renamed from: e */
        public int f275723e;

        /* renamed from: f */
        public int f275724f;

        /* renamed from: g */
        public int f275725g;

        /* renamed from: h */
        public int f275726h;

        /* renamed from: i */
        public boolean f275727i;

        /* renamed from: j */
        public String f275728j;

        /* renamed from: n */
        public String f275729n;

        /* renamed from: o */
        public boolean f275730o;

        /* renamed from: a */
        public static C95024k m120766a(Map<String, String> map, String str) {
            SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdTwistInfo");
            if (map.containsKey(str)) {
                int safeParseInt = Util.safeParseInt(map.get(str + ".twistStartTime"));
                int safeParseInt2 = Util.safeParseInt(map.get(str + ".twistEndTime"));
                int safeParseInt3 = Util.safeParseInt(map.get(str + ".twistDegree"));
                int safeParseInt4 = Util.safeParseInt(map.get(str + ".coverStartTime"));
                int safeParseInt5 = Util.safeParseInt(map.get(str + ".coverEndTime"));
                if (safeParseInt4 == 0) {
                    safeParseInt4 = safeParseInt;
                }
                if (safeParseInt5 == 0) {
                    safeParseInt5 = safeParseInt2;
                }
                if (safeParseInt >= 0 && safeParseInt2 > safeParseInt && safeParseInt5 >= safeParseInt4 && safeParseInt4 >= safeParseInt && safeParseInt5 <= safeParseInt2 && safeParseInt3 > 0) {
                    int safeParseInt6 = Util.safeParseInt(map.get(str + ".isClockwise"));
                    int safeParseInt7 = Util.safeParseInt(map.get(str + ".showSimpleTransition"));
                    String nullAsNil = Util.nullAsNil(map.get(str + ".title"));
                    String nullAsNil2 = Util.nullAsNil(map.get(str + ".desc"));
                    C95024k kVar = new C95024k();
                    kVar.f275722d = safeParseInt;
                    kVar.f275723e = safeParseInt2;
                    kVar.f275724f = safeParseInt4;
                    kVar.f275725g = safeParseInt5;
                    kVar.f275726h = safeParseInt3;
                    kVar.f275728j = nullAsNil;
                    kVar.f275729n = nullAsNil2;
                    boolean z = false;
                    kVar.f275727i = safeParseInt6 == 1;
                    if (safeParseInt7 == 1) {
                        z = true;
                    }
                    kVar.f275730o = z;
                    SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdTwistInfo");
                    return kVar;
                }
            }
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdTwistInfo");
            return null;
        }

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.storage.ADXml$AdTwistInfo");
            String str = "{twistStartTime=" + this.f275722d + ", twistEndTime=" + this.f275723e + ", coverStartTime=" + this.f275724f + ", coverEndTime=" + this.f275725g + ", maxDegree=" + this.f275726h + ", isClockWise=" + this.f275727i + ", title='" + this.f275728j + '\'' + ", desc='" + this.f275729n + '\'' + '}';
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.storage.ADXml$AdTwistInfo");
            return str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADXml$l */
    public class C95025l {

        /* renamed from: a */
        public String f275731a = "";

        /* renamed from: b */
        public String f275732b = "";

        /* renamed from: c */
        public ArrayList<C95026m> f275733c = new ArrayList<>();

        public C95025l(ADXml aDXml) {
        }

        /* renamed from: a */
        public String mo131458a(int i) {
            SnsMethodCalculate.markStartTimeMs("getDefaultTitle", "com.tencent.mm.plugin.sns.storage.ADXml$AdVoteInfo");
            if (i < 0 || i >= this.f275733c.size()) {
                SnsMethodCalculate.markEndTimeMs("getDefaultTitle", "com.tencent.mm.plugin.sns.storage.ADXml$AdVoteInfo");
                return "";
            }
            String str = this.f275733c.get(i).f275734a;
            SnsMethodCalculate.markEndTimeMs("getDefaultTitle", "com.tencent.mm.plugin.sns.storage.ADXml$AdVoteInfo");
            return str;
        }

        /* renamed from: b */
        public String mo131459b(int i) {
            SnsMethodCalculate.markStartTimeMs("getSelectedTitle", "com.tencent.mm.plugin.sns.storage.ADXml$AdVoteInfo");
            if (i < 0 || i >= this.f275733c.size()) {
                SnsMethodCalculate.markEndTimeMs("getSelectedTitle", "com.tencent.mm.plugin.sns.storage.ADXml$AdVoteInfo");
                return "";
            }
            String str = this.f275733c.get(i).f275738e;
            SnsMethodCalculate.markEndTimeMs("getSelectedTitle", "com.tencent.mm.plugin.sns.storage.ADXml$AdVoteInfo");
            return str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADXml$m */
    public class C95026m {

        /* renamed from: a */
        public String f275734a = "";

        /* renamed from: b */
        public String f275735b = "";

        /* renamed from: c */
        public String f275736c = "";

        /* renamed from: d */
        public String f275737d = "";

        /* renamed from: e */
        public String f275738e = "";

        /* renamed from: f */
        public String f275739f = "";

        public C95026m(ADXml aDXml) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADXml$o */
    public static class C95027o {

        /* renamed from: a */
        public String f275740a;

        /* renamed from: b */
        public String f275741b;

        /* renamed from: c */
        public int f275742c = 0;
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADXml$p */
    public static class C95028p {

        /* renamed from: a */
        public int f275743a;

        /* renamed from: b */
        public int f275744b;

        /* renamed from: c */
        public int f275745c;

        /* renamed from: d */
        public String f275746d;

        /* renamed from: e */
        public int f275747e;

        /* renamed from: f */
        public int f275748f;

        /* renamed from: g */
        public int f275749g;

        /* renamed from: h */
        public int f275750h;

        /* renamed from: a */
        public static C95028p m120769a(Map<String, String> map, String str) {
            SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$SnsAdLongPressGestureInfo");
            if (map.containsKey(str)) {
                C95028p pVar = new C95028p();
                pVar.f275743a = Util.safeParseInt(map.get(str + ".pressStartTime"));
                pVar.f275744b = Util.safeParseInt(map.get(str + ".pressEndTime"));
                pVar.f275745c = Util.safeParseInt(map.get(str + ".pressDuration"));
                pVar.f275746d = Util.nullAsNil(map.get(str + ".spriteImageUrl"));
                pVar.f275747e = Util.safeParseInt(map.get(str + ".spriteType"));
                pVar.f275748f = Util.safeParseInt(map.get(str + ".spriteSizeType"));
                pVar.f275749g = Util.safeParseInt(map.get(str + ".spriteDuration"));
                int safeParseInt = Util.safeParseInt(map.get(str + ".minimumPressDuration"));
                pVar.f275750h = safeParseInt;
                if (pVar.f275749g == 0) {
                    pVar.f275749g = 4000;
                }
                if (safeParseInt == 0) {
                    pVar.f275750h = 500;
                }
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$SnsAdLongPressGestureInfo");
                return pVar;
            }
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$SnsAdLongPressGestureInfo");
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.ADXml$q */
    public static class C95029q {

        /* renamed from: a */
        public String f275751a;

        /* renamed from: b */
        public String f275752b;

        /* renamed from: c */
        public String f275753c;

        /* renamed from: d */
        public int f275754d;

        /* renamed from: a */
        public static C95029q m120770a(Map<String, String> map, String str) {
            SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$WeAppInfo");
            String nullAsNil = Util.nullAsNil(map.get(str + ".appUserName"));
            String nullAsNil2 = Util.nullAsNil(map.get(str + ".relativePagePath"));
            String nullAsNil3 = Util.nullAsNil(map.get(str + ".appVersion"));
            int safeParseInt = Util.safeParseInt(map.get(str + ".miniProgramType"));
            if (!TextUtils.isEmpty(nullAsNil)) {
                C95029q qVar = new C95029q();
                qVar.f275751a = nullAsNil;
                qVar.f275752b = nullAsNil2;
                qVar.f275753c = nullAsNil3;
                qVar.f275754d = safeParseInt;
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$WeAppInfo");
                return qVar;
            }
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$WeAppInfo");
            return null;
        }
    }

    public ADXml(String str) {
        feed(str);
    }

    private void feed(String str) {
        SnsMethodCalculate.markStartTimeMs("feed", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (Util.isNullOrNil(str) || !str.trim().startsWith("<RecXml")) {
            feedAdXml(str);
        } else {
            feedRecXml(str);
        }
        SnsMethodCalculate.markEndTimeMs("feed", "com.tencent.mm.plugin.sns.storage.ADXml");
    }

    private void feedAdXml(String str) {
        SnsMethodCalculate.markStartTimeMs("feedAdXml", "com.tencent.mm.plugin.sns.storage.ADXml");
        feedXml(str, "", C102646h.COL_ADXML);
        SnsMethodCalculate.markEndTimeMs("feedAdXml", "com.tencent.mm.plugin.sns.storage.ADXml");
    }

    private void feedRecXml(String str) {
        SnsMethodCalculate.markStartTimeMs("feedRecXml", "com.tencent.mm.plugin.sns.storage.ADXml");
        Map<String, String> feedXml = feedXml(str, ".RecXml", "RecXml");
        if (feedXml != null && !feedXml.isEmpty()) {
            this.recType = Util.safeParseInt(feedXml.get(".RecXml.$type"));
            this.recSrc = Util.safeParseInt(feedXml.get(".RecXml.$source"));
            this.recExpId = Util.safeParseInt(feedXml.get(".RecXml.$expId"));
            this.originSnsId = C102236a0.m134706B0(feedXml.get(".RecXml.$expOriginSnsId"));
        }
        SnsMethodCalculate.markEndTimeMs("feedRecXml", "com.tencent.mm.plugin.sns.storage.ADXml");
    }

    private Map<String, String> feedXml(String str, String str2, String str3) {
        C91098a g;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = str;
        String str9 = str3;
        String str10 = "feedXml";
        SnsMethodCalculate.markStartTimeMs(str10, "com.tencent.mm.plugin.sns.storage.ADXml");
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str3)) {
            SnsMethodCalculate.markEndTimeMs(str10, "com.tencent.mm.plugin.sns.storage.ADXml");
            return null;
        }
        String str11 = str2 == null ? "" : str2;
        this.xml = str8;
        int i = 3;
        int i2 = 1;
        Log.m105925i(TAG, "feed xml %s, keyPrefix %s, tag %s", str8, str11, str9);
        Map<String, String> parseXml = XmlParser.parseXml(str8, str9, (String) null);
        if (parseXml == null) {
            SnsMethodCalculate.markEndTimeMs(str10, "com.tencent.mm.plugin.sns.storage.ADXml");
            return null;
        }
        this.adType = Util.safeParseInt(parseXml.get(str11 + ".adxml.adType"));
        this.adActionTitle = Util.nullAs(parseXml.get(str11 + ".adxml.adActionTitle"), "");
        this.adActionLink = Util.nullAs(parseXml.get(str11 + ".adxml.adActionLink"), "");
        this.nickname = Util.nullAs(parseXml.get(str11 + ".adxml.nickname"), "");
        this.webrightBar = Util.safeParseInt(parseXml.get(str11 + ".adxml.webviewRightBarShow"));
        this.adActionLinkHidden = Util.safeParseInt(parseXml.get(str11 + ".adxml.adActionLinkHidden"));
        this.adActionLinkName = Util.nullAs(parseXml.get(str11 + ".adxml.adActionLinkName"), "");
        this.adActionLinkIcon = Util.nullAs(parseXml.get(str11 + ".adxml.adActionLinkIcon"), "");
        this.adActionLinkTitle_cn = Util.nullAs(parseXml.get(str11 + ".adxml.adActionLinkTitle.zh"), "");
        this.adActionLinkTitle_tw = Util.nullAs(parseXml.get(str11 + ".adxml.adActionLinkTitle.tw"), "");
        this.adActionLinkTitle_en = Util.nullAs(parseXml.get(str11 + ".adxml.adActionLinkTitle.en"), "");
        this.attachShareLinkWording = Util.nullAs(parseXml.get(str11 + ".adxml.attachShareLinkWording"), "");
        this.attachShareLinkUrl = Util.nullAs(parseXml.get(str11 + ".adxml.attachShareLinkUrl"), "");
        this.attachShareLinkIsHidden = Util.safeParseInt(parseXml.get(str11 + ".adxml.attachShareLinkIsHidden"));
        if (Util.isNullOrNil(this.attachShareLinkWording) || Util.isNullOrNil(this.attachShareLinkUrl)) {
            this.attachShareLinkIsHidden = 1;
        }
        this.expandOutsideTitle_cn = Util.nullAs(parseXml.get(str11 + ".adxml.expandOutsideTitle.zh"), "");
        this.expandOutsideTitle_tw = Util.nullAs(parseXml.get(str11 + ".adxml.expandOutsideTitle.tw"), "");
        this.expandOutsideTitle_en = Util.nullAs(parseXml.get(str11 + ".adxml.expandOutsideTitle.en"), "");
        this.expandInsideTitle_cn = Util.nullAs(parseXml.get(str11 + ".adxml.expandInsideTitle.zh"), "");
        this.expandInsideTitle_tw = Util.nullAs(parseXml.get(str11 + ".adxml.expandInsideTitle.tw"), "");
        this.expandInsideTitle_en = Util.nullAs(parseXml.get(str11 + ".adxml.expandInsideTitle.en"), "");
        this.headClickType = Util.safeParseInt(parseXml.get(str11 + ".adxml.headClickType"));
        this.headClickParam = Util.nullAs(parseXml.get(str11 + ".adxml.headClickParam"), "");
        this.headClickRightBarShow = Util.safeParseInt(parseXml.get(str11 + ".adxml.headClickRightBarShow"));
        String str12 = str11 + ".adxml.headClickActionInfo";
        if (parseXml.containsKey(str12)) {
            this.headAdClickActionInfo = AdClickActionInfo.m119629b(parseXml, str12);
        }
        this.toAdMarket = Util.safeParseInt(parseXml.get(str11 + ".adxml.toAdMarket"));
        this.newFeedbackPanel = Util.safeParseInt(parseXml.get(str11 + ".adxml.newFeedback"));
        this.videoPlayInStreamingMode = Util.safeParseInt(parseXml.get(str11 + ".adxml.videoPlayInStreamingMode"));
        int i3 = 0;
        while (true) {
            StringBuilder sb = new StringBuilder();
            sb.append(str11);
            sb.append(PRE_KEY_AD_ARGS);
            sb.append(i3 == 0 ? "" : Integer.valueOf(i3));
            sb.append(".key");
            String sb4 = sb.toString();
            String str13 = parseXml.get(sb4);
            if (str13 == null) {
                break;
            }
            String str14 = str10;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str11);
            sb5.append(PRE_KEY_AD_ARGS);
            sb5.append(i3 == 0 ? "" : Integer.valueOf(i3));
            sb5.append(".value");
            String sb6 = sb5.toString();
            String str15 = parseXml.get(sb6);
            Log.m105924i(TAG, "newKey " + sb4 + " " + str13 + " newValue : " + sb6 + " " + str15);
            this.adArgs.put(str13, str15);
            i3++;
            str8 = str;
            str10 = str14;
            i = 3;
            i2 = 1;
        }
        this.bLandingPagesAd = parseXml.containsKey(str11 + ".adxml.adCanvasInfo");
        StringBuilder sb7 = new StringBuilder();
        sb7.append(str11);
        sb7.append(".adxml.usePreferedInfo");
        this.usePreferedInfo = Util.safeParseInt(parseXml.get(sb7.toString())) == i2;
        this.preferNickName = Util.nullAsNil(parseXml.get(str11 + ".adxml.preferNickname"));
        this.preferAvatar = Util.nullAsNil(parseXml.get(str11 + ".adxml.preferAvatar"));
        this.adContentDisplayType = Util.safeParseInt(parseXml.get(str11 + ".adxml.adFeedDisplayInfo.contentDisplayType"));
        this.adMediaDisplayMode = Util.safeParseInt(parseXml.get(str11 + ".adxml.adFeedDisplayInfo.mediaDisplayMode"));
        this.adMediaDisplayWidth = (float) Util.safeParseDouble(parseXml.get(str11 + ".adxml.adFeedDisplayInfo.mediaDisplayWidth"));
        this.adMediaDisplayHeight = (float) Util.safeParseDouble(parseXml.get(str11 + ".adxml.adFeedDisplayInfo.mediaDisplayHeight"));
        this.adBtnDisplayType = Util.safeParseInt(parseXml.get(str11 + ".adxml.adFeedDisplayInfo.btnDisplayType"));
        this.adMediaIconUrl = Util.nullAs(parseXml.get(str11 + ".adxml.adFeedDisplayInfo.mediaIconUrl"), "");
        this.adBasicRemWidth = Util.safeParseInt(parseXml.get(str11 + ".adxml.adFeedDisplayInfo.basicRemWidth"));
        this.adBasicRootFontSize = Util.safeParseInt(parseXml.get(str11 + ".adxml.adFeedDisplayInfo.basicRootFontSize"));
        this.adMediaIconWidth = (float) Util.safeParseDouble(parseXml.get(str11 + ".adxml.adFeedDisplayInfo.mediaIconWidth"));
        this.adMediaIconHeight = (float) Util.safeParseDouble(parseXml.get(str11 + ".adxml.adFeedDisplayInfo.mediaIconHeight"));
        this.adMediaIconPaddingRight = (float) Util.safeParseDouble(parseXml.get(str11 + ".adxml.adFeedDisplayInfo.mediaIconPaddingRight"));
        this.adMediaIconPaddingBottom = (float) Util.safeParseDouble(parseXml.get(str11 + ".adxml.adFeedDisplayInfo.mediaIconPaddingBottom"));
        this.adContentStyle = Util.safeParseInt(parseXml.get(str11 + ".adxml.adContentStyle"));
        this.adCardTitle = Util.nullAs(parseXml.get(str11 + ".adxml.adCardInfo.title"), "");
        this.adCardDesc = Util.nullAs(parseXml.get(str11 + ".adxml.adCardInfo.description"), "");
        C30426c cVar = new C30426c();
        String str16 = "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagInfo";
        String str17 = "parse";
        SnsMethodCalculate.markStartTimeMs(str17, str16);
        int i4 = 0;
        while (true) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append(str11);
            sb8.append(PRE_KEY_CARD_TAG_LIST);
            sb8.append(i4 == 0 ? "" : Integer.valueOf(i4));
            String sb9 = sb8.toString();
            if (!parseXml.containsKey(sb9)) {
                break;
            }
            Object[] objArr = new Object[i2];
            objArr[0] = parseXml.get(sb9);
            Log.m105925i(TAG, "card ad tag %s", objArr);
            if (!Util.isNullOrNil(parseXml.get(sb9))) {
                C95015d dVar = new C95015d();
                dVar.f275673a = Util.nullAs(parseXml.get(sb9), "");
                String str18 = sb9 + SUFF_KEY_CARD_TAG_ICON_LIGHT_MODE_URL;
                String str19 = sb9 + SUFF_KEY_CARD_TAG_ICON_DARK_MODE_URL;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(sb9);
                str5 = str16;
                sb10.append(SUFF_KEY_CARD_TAG_BACKGROUND_LIGHT_MODE_COLOR);
                String sb11 = sb10.toString();
                StringBuilder sb12 = new StringBuilder();
                sb12.append(sb9);
                str7 = str17;
                sb12.append(SUFF_KEY_CARD_TAG_BACKGROUND_DARK_MODE_COLOR);
                String sb13 = sb12.toString();
                StringBuilder sb14 = new StringBuilder();
                sb14.append(sb9);
                str6 = str10;
                sb14.append(SUFF_KEY_CARD_TAG_CONTENT_LIGHT_MODE_COLOR);
                String sb15 = sb14.toString();
                dVar.f275674b = Util.nullAs(parseXml.get(str18), "");
                dVar.f275675c = Util.nullAs(parseXml.get(str19), "");
                dVar.f275676d = Util.nullAsNil(parseXml.get(sb11));
                dVar.f275677e = Util.nullAsNil(parseXml.get(sb13));
                dVar.f275678f = Util.nullAsNil(parseXml.get(sb15));
                dVar.f275679g = Util.nullAsNil(parseXml.get(sb9 + SUFF_KEY_CARD_TAG_CONTENT_DARK_MODE_COLOR));
                Log.m105925i(TAG, "Tag content = ", dVar.f275673a + ", Tag light iconUrl = " + dVar.f275674b + ", Tag dark iconUrl = " + dVar.f275675c + ", Tag background light color = " + dVar.f275676d + ", Tag background dark color = " + dVar.f275677e + ", Tag content light color = " + dVar.f275678f + ", Tag content dark color = " + dVar.f275679g);
                ((ArrayList) cVar.f82061a).add(dVar);
            } else {
                str6 = str10;
                str5 = str16;
                str7 = str17;
            }
            i4++;
            str8 = str;
            str16 = str5;
            str17 = str7;
            str10 = str6;
            i = 3;
            i2 = 1;
        }
        SnsMethodCalculate.markEndTimeMs(str17, str16);
        this.adCardTagInfo = cVar;
        this.adCard3dHeadTitle = Util.nullAsNil(parseXml.get(str11 + ".adxml.adCardInfo.adRatingCardInfo.headTitle"));
        this.adCard3dHeadUrl = Util.nullAsNil(parseXml.get(str11 + ".adxml.adCardInfo.adRatingCardInfo.headUrl"));
        String nullAs = Util.nullAs(parseXml.get(str11 + ".adxml.adSelectInfo.leftBtnTitle"), "");
        String nullAs2 = Util.nullAs(parseXml.get(str11 + ".adxml.adSelectInfo.rightBtnTitle"), "");
        if (!TextUtils.isEmpty(nullAs) && !TextUtils.isEmpty(nullAs2)) {
            C95021h hVar = new C95021h(this);
            this.adSelectInfo = hVar;
            hVar.f275705a = nullAs;
            hVar.f275706b = nullAs2;
            String str20 = str11 + ".adxml.adSelectInfo";
            SnsMethodCalculate.markStartTimeMs(str17, "com.tencent.mm.plugin.sns.storage.ADXml$AdSelectInfo");
            AdClickActionInfo b = AdClickActionInfo.m119629b(parseXml, str20 + ".leftBtnClickActionInfo");
            hVar.f275707c = b;
            b.f273639a = 5;
            AdClickActionInfo b2 = AdClickActionInfo.m119629b(parseXml, str20 + ".rightBtnClickActionInfo");
            hVar.f275708d = b2;
            b2.f273639a = 6;
            SnsMethodCalculate.markEndTimeMs(str17, "com.tencent.mm.plugin.sns.storage.ADXml$AdSelectInfo");
        }
        String nullAs3 = Util.nullAs(parseXml.get(str11 + ".adxml.adVoteInfo.componentUrl"), "");
        if (!TextUtils.isEmpty(nullAs3)) {
            C95025l lVar = new C95025l(this);
            this.adVoteInfo = lVar;
            lVar.f275731a = nullAs3;
            lVar.f275732b = Util.nullAs(parseXml.get(str11 + ".adxml.adVoteInfo.voteLabel"), "");
            String str21 = str11 + ".adxml.adVoteInfo.optionList.option";
            int i5 = 0;
            while (true) {
                if (i5 != 0) {
                    str4 = str21 + i5;
                } else {
                    str4 = str21;
                }
                if (TextUtils.isEmpty(Util.nullAs(parseXml.get(str4 + ".title"), ""))) {
                    break;
                }
                C95026m mVar = new C95026m(this);
                mVar.f275734a = Util.nullAs(parseXml.get(str4 + ".title"), "");
                mVar.f275735b = Util.nullAs(parseXml.get(str4 + ".shareTitle"), "");
                mVar.f275736c = Util.nullAs(parseXml.get(str4 + ".shareDesc"), "");
                mVar.f275737d = Util.nullAs(parseXml.get(str4 + ".shareThumb"), "");
                mVar.f275738e = Util.nullAs(parseXml.get(str4 + ".selectedTitle"), "");
                mVar.f275739f = Util.nullAs(parseXml.get(str4 + ".id"), "");
                this.adVoteInfo.f275733c.add(mVar);
                i5++;
            }
        }
        this.bTurnLandingPagesAd = parseXml.containsKey(str11 + ".adxml.adTurnCanvasInfo");
        C95023j jVar = new C95023j();
        this.adTurnInfo = jVar;
        jVar.mo131456a(str8, parseXml, str11);
        C95016e eVar = new C95016e();
        eVar.mo131453a(str8, parseXml, str11);
        this.adFeedbackInfo = eVar;
        int i6 = this.adContentStyle;
        if (i6 == i) {
            this.adFullCardInfo = new C95018g();
            this.adFullCardInfo.mo131454a(parseXml, str11 + ".adxml.adFullCardInfo");
        } else if (i6 == 4) {
            this.adSphereCardInfo = new C95022i();
            this.adSphereCardInfo.mo131455a(parseXml, str11 + ".adxml.adSphereCardInfo");
        }
        this.clientMinVersion = Util.safeParseInt(parseXml.get(str11 + ".adxml.compatible.clientVersion.androidMin"));
        this.clientMaxVersion = Util.safeParseInt(parseXml.get(str11 + ".adxml.compatible.clientVersion.androidMax"));
        this.compatibleUrl = Util.nullAsNil(parseXml.get(str11 + ".adxml.compatible.jumpUrl"));
        String str22 = str11 + ".adxml.adCardInfo.adCardButton";
        if (parseXml.containsKey(str22)) {
            AdCardActionBtnInfo adCardActionBtnInfo2 = new AdCardActionBtnInfo();
            this.adCardActionBtnInfo = adCardActionBtnInfo2;
            adCardActionBtnInfo2.parse(parseXml, str22);
            if (!TextUtils.isEmpty(this.adCardActionBtnInfo.clickActionInfo.f273675u)) {
                this.firstDownloadApkPkgName = this.adCardActionBtnInfo.clickActionInfo.f273675u;
                Log.m105924i(TAG, "findDownloadApkPkgName, adCardActionBtnInfo.pkg=" + this.adCardActionBtnInfo.clickActionInfo.f273675u);
            }
        }
        if (TextUtils.isEmpty(this.firstDownloadApkPkgName)) {
            findDownloadApkPkgName(parseXml);
        }
        this.adExtInfo = C102259p.m134828a(parseXml.get(str11 + ".adxml.adExtInfo"));
        try {
            C91098a f = C91098a.m114282f(MMApplicationContext.getContext(), str11 + ".adxml.adMarketJump.", parseXml);
            if (f != null) {
                Intent i7 = f.mo125157i();
                this.appMarketIntent = i7;
                if (i7 == null && (g = C91098a.m114283g(MMApplicationContext.getContext(), parseXml)) != null) {
                    this.appMarketIntent = g.mo125157i();
                }
            }
        } catch (Throwable unused) {
        }
        this.adScanJumpInfo = C85461b.m105464a(parseXml, str11 + ".adxml.adScanInfo");
        this.adFloatWebViewInfo = C30427n.m39085a(parseXml, str11 + ".adxml.adCanvasInfo.globalComponentItems.componentItem");
        this.adFinderInfo = C57361a.m66109a(parseXml, str11 + ".adxml.adFinderInfo");
        this.addPlayIconOnCover = Util.safeParseInt(parseXml.get(str11 + ".adxml.addPlayIconOnCover"));
        this.adTwistInfo = C95024k.m120766a(parseXml, str11 + ".adxml.adTwistInfo");
        this.adShakeInfo = C97952a.m126505a(parseXml, str11 + ".adxml.adShakeInfo");
        this.verticalVideoDisplayType = Util.safeParseInt(parseXml.get(str11 + ".adxml.verticalVideoDisplayType"));
        this.weAppInfo = C95029q.m120770a(parseXml, str11 + ".adxml.headWeAppInfo");
        StringBuilder sb16 = new StringBuilder();
        sb16.append(str11);
        sb16.append(".adxml.forbiddenCustomAnimation");
        this.forbiddenCustomAnimation = Util.safeParseInt(parseXml.get(sb16.toString())) == i2;
        this.adPromotionInfo = C92447o.m116281a(parseXml, str11 + ".adxml.adCardInfo.promotionInfo");
        this.adLiveInfo = C92445n.m116278a(parseXml, str11 + ".adxml.adLiveInfo");
        this.adRollInfo = C55058p.m62165a(parseXml, str11 + ".adxml.adRollInfo");
        this.adFinderLiveInfo = C94588a.m119632a(parseXml, str11 + ".adxml.adFinderLiveInfo");
        this.adFinderLiveStreamInfo = C55055j.m62161b(parseXml, str11 + ".adxml.adFinderLiveStreamInfo");
        this.adFinderLivePreviewInfo = new C94588a.C94589a().mo130142a(parseXml, str11 + ".adxml.adFinderLiveInfo.finderLivePreviewInfo");
        this.adHeadFinderProfile = C55057m.m62164a(parseXml, str11 + ".adxml.headFinderProfile");
        this.adFinderTopicInfo = C92443k.m116272a(parseXml, str11 + ".adxml.adFinderTopicInfo");
        this.adAvatarFinderTopicInfo = C55052b.m62154a(parseXml, str11 + ".adxml.headFinderTopicInfo");
        StringBuilder sb17 = new StringBuilder();
        sb17.append(str11);
        sb17.append(".adxml.preloadWeAppPkg");
        this.preloadWeAppPkg = Util.safeParseInt(parseXml.get(sb17.toString())) == i2;
        StringBuilder sb18 = new StringBuilder();
        sb18.append(str11);
        sb18.append(".adxml.adVideoContinuePlay");
        this.adVideoContinuePlay = Util.safeParseInt(parseXml.get(sb18.toString())) == i2;
        this.adDynamicUpdateInfo = C92433g.m116264a(parseXml, str11 + ".adxml.adDynamicUpdateInfo");
        this.feedbackWording = Util.nullAsNil(parseXml.get(str11 + ".adxml.feedbackWording"));
        this.feedbackWeAppUsername = Util.nullAsNil(parseXml.get(str11 + ".adxml.feedbackWeAppUsername"));
        this.feedbackWeAppPath = Util.nullAsNil(parseXml.get(str11 + ".adxml.feedbackWeAppPath"));
        String str23 = str11 + ".adxml.tagButtonInfo";
        if (parseXml.containsKey(str23)) {
            this.adTagBtnInfo = C92450s.m116288a(parseXml, str23);
        }
        this.appGiftPackCode = Util.nullAsNil(parseXml.get(str11 + ".adxml.appGiftPackCode"));
        this.appGiftPackCodeTips = Util.nullAsNil(parseXml.get(str11 + ".adxml.appGiftPackCodeTips"));
        this.adSliderFullCardInfo = C92449r.m116285b(parseXml, str11 + ".adxml.adSliderCardInfo");
        String str24 = str11 + ".adxml.adActionLinkClickInfo";
        if (parseXml.containsKey(str24)) {
            this.adActionLinkClickInfo = AdClickActionInfo.m119629b(parseXml, str24);
        }
        this.adSellingPointInfo = C62171i.m73036a(parseXml, str11 + ".adxml.adCardInfo.adSellPointInfo");
        this.adSocialInfo = C100409k.m131403a(parseXml, str11 + ".adxml.adSocialInfo");
        this.adInteractionLabelInfo = C54325a.m61036a(parseXml, str11 + ".adxml.interactionLabelInfo");
        String str25 = str11 + ".adxml.adBreakFrameInfo";
        if (parseXml.containsKey(str25)) {
            this.adBreakFrameInfo = C95301a.f276613c.mo132014a(parseXml, str25);
        }
        String str26 = str11 + ".adxml.touchParticle";
        if (parseXml.containsKey(str26)) {
            this.touchParticleAnimConfig = C98185c.m126858b(parseXml, str26);
        }
        String str27 = str11 + ".adxml.adCombinedGridInfo";
        if (parseXml.containsKey(str27)) {
            this.adCombinedGridInfo = C100403f.m131352c(parseXml, str27);
        }
        SnsMethodCalculate.markEndTimeMs(str10, "com.tencent.mm.plugin.sns.storage.ADXml");
        return parseXml;
    }

    public static boolean isShakeAdCanvas(String str) {
        SnsMethodCalculate.markStartTimeMs("isShakeAdCanvas", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z = str != null && str.contains("<isShakeAnimView>1</isShakeAnimView>");
        SnsMethodCalculate.markEndTimeMs("isShakeAdCanvas", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z;
    }

    public static boolean isSimpleShakeAd(String str) {
        SnsMethodCalculate.markStartTimeMs("isSimpleShakeAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z = str != null && str.contains("<simpleTransitionAnimationUrl>");
        SnsMethodCalculate.markEndTimeMs("isSimpleShakeAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z;
    }

    public static boolean isSimpleSharedShakeAd(String str) {
        SnsMethodCalculate.markStartTimeMs("isSimpleSharedShakeAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z = isSimpleShakeAd(str) && str != null && str.contains("<isInteractiveCanvas>");
        SnsMethodCalculate.markEndTimeMs("isSimpleSharedShakeAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z;
    }

    public static boolean isTwistAdCanvas(String str) {
        SnsMethodCalculate.markStartTimeMs("isTwistAdCanvas", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z = str != null && str.contains("<isTwistAnimView>1</isTwistAnimView>");
        SnsMethodCalculate.markEndTimeMs("isTwistAdCanvas", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z;
    }

    public void findDownloadApkPkgName(Map<String, String> map) {
        SnsMethodCalculate.markStartTimeMs("findDownloadApkPkgName", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (map == null || map.isEmpty()) {
            SnsMethodCalculate.markEndTimeMs("findDownloadApkPkgName", "com.tencent.mm.plugin.sns.storage.ADXml");
            return;
        }
        for (String next : map.keySet()) {
            if (next.endsWith(".pkg") || next.endsWith(".appPackage")) {
                String str = map.get(next);
                if (!TextUtils.isEmpty(str)) {
                    this.firstDownloadApkPkgName = str;
                    Log.m105924i(TAG, "findDownloadApkPkgName, key=" + next + ", pkg=" + str);
                    SnsMethodCalculate.markEndTimeMs("findDownloadApkPkgName", "com.tencent.mm.plugin.sns.storage.ADXml");
                    return;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("findDownloadApkPkgName", "com.tencent.mm.plugin.sns.storage.ADXml");
    }

    public C95021h getAdSelectInfo() {
        SnsMethodCalculate.markStartTimeMs("getAdSelectInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        C95021h hVar = this.adSelectInfo;
        SnsMethodCalculate.markEndTimeMs("getAdSelectInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        return hVar;
    }

    public String getAdVoteComponentUrl() {
        SnsMethodCalculate.markStartTimeMs("getAdVoteComponentUrl", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (hasVoteInfo()) {
            String str = this.adVoteInfo.f275731a;
            SnsMethodCalculate.markEndTimeMs("getAdVoteComponentUrl", "com.tencent.mm.plugin.sns.storage.ADXml");
            return str;
        }
        SnsMethodCalculate.markEndTimeMs("getAdVoteComponentUrl", "com.tencent.mm.plugin.sns.storage.ADXml");
        return "";
    }

    public String getCardSelectLeftTitle() {
        SnsMethodCalculate.markStartTimeMs("getCardSelectLeftTitle", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (hasSelectInfo()) {
            String str = this.adSelectInfo.f275705a;
            SnsMethodCalculate.markEndTimeMs("getCardSelectLeftTitle", "com.tencent.mm.plugin.sns.storage.ADXml");
            return str;
        } else if (hasVoteInfo()) {
            String str2 = this.adVoteInfo.f275733c.get(0).f275734a;
            SnsMethodCalculate.markEndTimeMs("getCardSelectLeftTitle", "com.tencent.mm.plugin.sns.storage.ADXml");
            return str2;
        } else {
            SnsMethodCalculate.markEndTimeMs("getCardSelectLeftTitle", "com.tencent.mm.plugin.sns.storage.ADXml");
            return "";
        }
    }

    public String getCardSelectRightTitle() {
        SnsMethodCalculate.markStartTimeMs("getCardSelectRightTitle", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (hasSelectInfo()) {
            String str = this.adSelectInfo.f275706b;
            SnsMethodCalculate.markEndTimeMs("getCardSelectRightTitle", "com.tencent.mm.plugin.sns.storage.ADXml");
            return str;
        } else if (hasVoteInfo()) {
            String str2 = this.adVoteInfo.f275733c.get(1).f275734a;
            SnsMethodCalculate.markEndTimeMs("getCardSelectRightTitle", "com.tencent.mm.plugin.sns.storage.ADXml");
            return str2;
        } else {
            SnsMethodCalculate.markEndTimeMs("getCardSelectRightTitle", "com.tencent.mm.plugin.sns.storage.ADXml");
            return "";
        }
    }

    public String getGestureCanvasInfo() {
        SnsMethodCalculate.markStartTimeMs("getGestureCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        String str = this.xml;
        String str2 = "";
        if (this.adFullCardInfo != null && str.contains("<adFullCardGestureCanvasInfo>")) {
            str2 = str.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", str2).replaceAll("adFullCardGestureCanvasInfo", "adCanvasInfo");
        }
        SnsMethodCalculate.markEndTimeMs("getGestureCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        return str2;
    }

    public String getLeftCanvasInfo() {
        SnsMethodCalculate.markStartTimeMs("getLeftCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        String str = this.xml;
        if (str.contains("<adCanvasInfoLeft>")) {
            str = str.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", "").replaceAll("(?s)<adCanvasInfoRight[^>]*>.*?</adCanvasInfoRight>", "").replaceAll("adCanvasInfoLeft", "adCanvasInfo");
        }
        SnsMethodCalculate.markEndTimeMs("getLeftCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        return str;
    }

    public String getRightCanvasInfo() {
        SnsMethodCalculate.markStartTimeMs("getRightCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        String str = this.xml;
        if (str.contains("<adCanvasInfoRight>")) {
            str = str.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", "").replaceAll("(?s)<adCanvasInfoLeft[^>]*>.*?</adCanvasInfoLeft>", "").replaceAll("adCanvasInfoRight", "adCanvasInfo");
        }
        SnsMethodCalculate.markEndTimeMs("getRightCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        return str;
    }

    public String getTurnCanvasInfo() {
        SnsMethodCalculate.markStartTimeMs("getTurnCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        String str = this.xml;
        if (str.contains("<adTurnCanvasInfo>")) {
            str = str.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", "").replaceAll("adTurnCanvasInfo", "adCanvasInfo");
        }
        SnsMethodCalculate.markEndTimeMs("getTurnCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        return str;
    }

    public boolean hasActionBtn() {
        SnsMethodCalculate.markStartTimeMs("hasActionBtn", "com.tencent.mm.plugin.sns.storage.ADXml");
        AdCardActionBtnInfo adCardActionBtnInfo2 = this.adCardActionBtnInfo;
        boolean z = adCardActionBtnInfo2 != null && adCardActionBtnInfo2.clickActionInfo.f273641b >= 0;
        SnsMethodCalculate.markEndTimeMs("hasActionBtn", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z;
    }

    public boolean hasSelectInfo() {
        SnsMethodCalculate.markStartTimeMs("hasSelectInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z = this.adSelectInfo != null;
        SnsMethodCalculate.markEndTimeMs("hasSelectInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z;
    }

    public boolean hasVoteInfo() {
        SnsMethodCalculate.markStartTimeMs("hasVoteInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        C95025l lVar = this.adVoteInfo;
        boolean z = true;
        if (lVar == null || lVar.f275733c.size() <= 1) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("hasVoteInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z;
    }

    public boolean isAdBreakFrameVideo() {
        SnsMethodCalculate.markStartTimeMs("isAdBreakFrameVideo", "com.tencent.mm.plugin.sns.storage.ADXml");
        C95301a aVar = this.adBreakFrameInfo;
        boolean z = false;
        if (aVar == null) {
            SnsMethodCalculate.markEndTimeMs("isAdBreakFrameVideo", "com.tencent.mm.plugin.sns.storage.ADXml");
            return false;
        }
        try {
            C100418s b = aVar.mo132012a().mo139877b();
            b.getClass();
            SnsMethodCalculate.markStartTimeMs("getPlayMode", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
            int i = b.f294177a;
            SnsMethodCalculate.markEndTimeMs("getPlayMode", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
            if (i == 0) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isAdBreakFrameVideo", "com.tencent.mm.plugin.sns.storage.ADXml");
            return z;
        } catch (Exception unused) {
            SnsMethodCalculate.markEndTimeMs("isAdBreakFrameVideo", "com.tencent.mm.plugin.sns.storage.ADXml");
            return false;
        }
    }

    public boolean isAdIpInteractVideo() {
        SnsMethodCalculate.markStartTimeMs("isAdIpInteractVideo", "com.tencent.mm.plugin.sns.storage.ADXml");
        C95301a aVar = this.adBreakFrameInfo;
        boolean z = false;
        if (aVar == null) {
            SnsMethodCalculate.markEndTimeMs("isAdIpInteractVideo", "com.tencent.mm.plugin.sns.storage.ADXml");
            return false;
        }
        try {
            C100418s b = aVar.mo132012a().mo139877b();
            b.getClass();
            SnsMethodCalculate.markStartTimeMs("getPlayMode", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
            int i = b.f294177a;
            SnsMethodCalculate.markEndTimeMs("getPlayMode", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
            if (i == 1) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isAdIpInteractVideo", "com.tencent.mm.plugin.sns.storage.ADXml");
            return z;
        } catch (Exception unused) {
            SnsMethodCalculate.markEndTimeMs("isAdIpInteractVideo", "com.tencent.mm.plugin.sns.storage.ADXml");
            return false;
        }
    }

    public boolean isCardAd() {
        SnsMethodCalculate.markStartTimeMs("isCardAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z = true;
        if (this.adContentStyle != 1) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isCardAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r2 = r4.adCombinedGridInfo;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isCombinedGridAD() {
        /*
            r4 = this;
            java.lang.String r0 = "isCombinedGridAD"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.ADXml"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            int r2 = r4.adContentStyle
            r3 = 7
            if (r2 != r3) goto L_0x0026
            os2.f r2 = r4.adCombinedGridInfo
            if (r2 == 0) goto L_0x0026
            java.util.List r2 = r2.mo139844b()
            if (r2 == 0) goto L_0x0026
            os2.f r2 = r4.adCombinedGridInfo
            java.util.List r2 = r2.mo139844b()
            int r2 = r2.size()
            r3 = 3
            if (r2 < r3) goto L_0x0026
            r2 = 1
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.ADXml.isCombinedGridAD():boolean");
    }

    public boolean isFinderTopicCard() {
        SnsMethodCalculate.markStartTimeMs("isFinderTopicCard", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z = this.adContentStyle == 5;
        SnsMethodCalculate.markEndTimeMs("isFinderTopicCard", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z;
    }

    public boolean isFullCardAd() {
        SnsMethodCalculate.markStartTimeMs("isFullCardAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z = this.adContentStyle == 3;
        SnsMethodCalculate.markEndTimeMs("isFullCardAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z;
    }

    public boolean isGestureAd() {
        C95018g gVar;
        C95018g.C95019a aVar;
        SnsMethodCalculate.markStartTimeMs("isGestureAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (!(!isFullCardAd() || (gVar = this.adFullCardInfo) == null || (aVar = gVar.f275690f) == null)) {
            long j = aVar.f275698a;
            if (j >= 0 && aVar.f275699b > j) {
                SnsMethodCalculate.markEndTimeMs("isGestureAd", "com.tencent.mm.plugin.sns.storage.ADXml");
                return true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("isGestureAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return false;
    }

    public boolean isLandingPagesAd() {
        SnsMethodCalculate.markStartTimeMs("isLandingPagesAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z = this.bLandingPagesAd || this.bTurnLandingPagesAd;
        SnsMethodCalculate.markEndTimeMs("isLandingPagesAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z;
    }

    public boolean isLinkAd() {
        SnsMethodCalculate.markStartTimeMs("isLinkAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z = this.adContentStyle == 2;
        SnsMethodCalculate.markEndTimeMs("isLinkAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z;
    }

    public boolean isLongPressGestureAd() {
        C95018g gVar;
        C95028p pVar;
        int i;
        SnsMethodCalculate.markStartTimeMs("isLongPressGestureAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (!isFullCardAd() || (gVar = this.adFullCardInfo) == null || (pVar = gVar.f275696l) == null || (i = pVar.f275743a) <= 0 || pVar.f275744b <= i) {
            SnsMethodCalculate.markEndTimeMs("isLongPressGestureAd", "com.tencent.mm.plugin.sns.storage.ADXml");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("isLongPressGestureAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return true;
    }

    public boolean isNewStyleVote() {
        SnsMethodCalculate.markStartTimeMs("isNewStyleVote", "com.tencent.mm.plugin.sns.storage.ADXml");
        C95025l lVar = this.adVoteInfo;
        if (lVar == null || lVar.f275733c.size() <= 1 || TextUtils.isEmpty(this.adVoteInfo.f275733c.get(0).f275739f) || TextUtils.isEmpty(this.adVoteInfo.f275733c.get(1).f275739f)) {
            SnsMethodCalculate.markEndTimeMs("isNewStyleVote", "com.tencent.mm.plugin.sns.storage.ADXml");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("isNewStyleVote", "com.tencent.mm.plugin.sns.storage.ADXml");
        return true;
    }

    public boolean isNormalAd() {
        SnsMethodCalculate.markStartTimeMs("isNormalAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (isCardAd() || isFullCardAd() || isSphereCardAd() || isFinderTopicCard() || isSlideFullCard() || isCombinedGridAD()) {
            SnsMethodCalculate.markEndTimeMs("isNormalAd", "com.tencent.mm.plugin.sns.storage.ADXml");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("isNormalAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return true;
    }

    public boolean isRecExpAd() {
        SnsMethodCalculate.markStartTimeMs("isRecExpAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z = this.recSrc == 2;
        SnsMethodCalculate.markEndTimeMs("isRecExpAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z;
    }

    public boolean isRecSrcAd() {
        SnsMethodCalculate.markStartTimeMs("isRecSrcAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z = this.recSrc == 0;
        SnsMethodCalculate.markEndTimeMs("isRecSrcAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z;
    }

    public boolean isShakeAd() {
        SnsMethodCalculate.markStartTimeMs("isShakeAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (!isFullCardAd() || this.adShakeInfo == null) {
            SnsMethodCalculate.markEndTimeMs("isShakeAd", "com.tencent.mm.plugin.sns.storage.ADXml");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("isShakeAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return true;
    }

    public boolean isShowPlayIconOnCover() {
        SnsMethodCalculate.markStartTimeMs("isShowPlayIconOnCover", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z = true;
        if (this.addPlayIconOnCover != 1) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isShowPlayIconOnCover", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z;
    }

    public boolean isSlideFullCard() {
        SnsMethodCalculate.markStartTimeMs("isSlideFullCard", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z = this.adContentStyle == 6;
        SnsMethodCalculate.markEndTimeMs("isSlideFullCard", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z;
    }

    public boolean isSphereCardAd() {
        SnsMethodCalculate.markStartTimeMs("isSphereCardAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        boolean z = this.adContentStyle == 4;
        SnsMethodCalculate.markEndTimeMs("isSphereCardAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return z;
    }

    public boolean isTwistAd() {
        SnsMethodCalculate.markStartTimeMs("isTwistAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        if (!isFullCardAd() || this.adTwistInfo == null) {
            SnsMethodCalculate.markEndTimeMs("isTwistAd", "com.tencent.mm.plugin.sns.storage.ADXml");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("isTwistAd", "com.tencent.mm.plugin.sns.storage.ADXml");
        return true;
    }

    public static String getGestureCanvasInfo(String str) {
        SnsMethodCalculate.markStartTimeMs("getGestureCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("getGestureCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
            return str2;
        }
        if (str.contains("<adFullCardGestureCanvasInfo>")) {
            str2 = str.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", str2).replaceAll("adFullCardGestureCanvasInfo", "adCanvasInfo");
        }
        SnsMethodCalculate.markEndTimeMs("getGestureCanvasInfo", "com.tencent.mm.plugin.sns.storage.ADXml");
        return str2;
    }
}
