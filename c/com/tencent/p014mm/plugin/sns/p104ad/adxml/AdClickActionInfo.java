package com.tencent.p014mm.plugin.sns.p104ad.adxml;

import co2.C55053c;
import co2.C55054d;
import co2.C55059u;
import co2.C67440e;
import co2.C92428a;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.C94588a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lo2.C99544i0;
import ps2.C100884n;
import rq2.C101425k;
import rq2.C63489a;
import vr2.C102236a0;
import vr2.C102260r;
import z04.C66731x;

/* renamed from: com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo */
public class AdClickActionInfo {

    /* renamed from: A */
    public String f273613A;

    /* renamed from: B */
    public String f273614B;

    /* renamed from: C */
    public String f273615C;

    /* renamed from: D */
    public String f273616D;

    /* renamed from: E */
    public String f273617E;

    /* renamed from: F */
    public String f273618F;

    /* renamed from: G */
    public String f273619G;

    /* renamed from: H */
    public String f273620H;

    /* renamed from: I */
    public String f273621I;

    /* renamed from: J */
    public String f273622J;

    /* renamed from: K */
    public String f273623K;

    /* renamed from: L */
    public String f273624L;

    /* renamed from: M */
    public String f273625M;

    /* renamed from: N */
    public String f273626N;

    /* renamed from: O */
    public String f273627O;

    /* renamed from: P */
    public String f273628P;

    /* renamed from: Q */
    public boolean f273629Q;

    /* renamed from: R */
    public String f273630R;

    /* renamed from: S */
    public String f273631S;

    /* renamed from: T */
    public String f273632T;

    /* renamed from: U */
    public String f273633U;

    /* renamed from: V */
    public String f273634V;

    /* renamed from: W */
    public String f273635W;

    /* renamed from: X */
    public String f273636X;

    /* renamed from: Y */
    public String f273637Y;

    /* renamed from: Z */
    public List<C94588a.C94589a.C94590a> f273638Z = new ArrayList();

    /* renamed from: a */
    public int f273639a;

    /* renamed from: a0 */
    public String f273640a0;

    /* renamed from: b */
    public int f273641b;

    /* renamed from: b0 */
    public String f273642b0;

    /* renamed from: c */
    public String f273643c;

    /* renamed from: c0 */
    public String f273644c0;

    /* renamed from: d */
    public String f273645d;

    /* renamed from: d0 */
    public String f273646d0;

    /* renamed from: e */
    public String f273647e;

    /* renamed from: e0 */
    public String f273648e0;

    /* renamed from: f */
    public int f273649f;

    /* renamed from: f0 */
    public String f273650f0;
    public String finderLiveId;
    public String finderUsername;

    /* renamed from: g */
    public int f273651g;

    /* renamed from: g0 */
    public String f273652g0;

    /* renamed from: h */
    public String f273653h;

    /* renamed from: h0 */
    public C92428a f273654h0;

    /* renamed from: i */
    public String f273655i;

    /* renamed from: i0 */
    public String f273656i0;

    /* renamed from: j */
    public String f273657j;

    /* renamed from: j0 */
    public String f273658j0;

    /* renamed from: k */
    public String f273659k;

    /* renamed from: k0 */
    public int f273660k0;

    /* renamed from: l */
    public String f273661l;

    /* renamed from: l0 */
    public long f273662l0;

    /* renamed from: m */
    public String f273663m;

    /* renamed from: m0 */
    public String f273664m0;

    /* renamed from: n */
    public String f273665n;

    /* renamed from: n0 */
    public int f273666n0;

    /* renamed from: o */
    public String f273667o;

    /* renamed from: o0 */
    public C67440e f273668o0;

    /* renamed from: p */
    public String f273669p;

    /* renamed from: p0 */
    public C55059u f273670p0;

    /* renamed from: q */
    public String f273671q;

    /* renamed from: r */
    public long f273672r;

    /* renamed from: s */
    public String f273673s;

    /* renamed from: t */
    public String f273674t;

    /* renamed from: u */
    public String f273675u;

    /* renamed from: v */
    public String f273676v;

    /* renamed from: w */
    public String f273677w;

    /* renamed from: x */
    public String f273678x;

    /* renamed from: y */
    public String f273679y;

    /* renamed from: z */
    public String f273680z;

    /* renamed from: b */
    public static AdClickActionInfo m119629b(Map<String, String> map, String str) {
        Integer e;
        Integer e2;
        C67440e eVar;
        Integer e3;
        Map<String, String> map2 = map;
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo");
        AdClickActionInfo adClickActionInfo = new AdClickActionInfo();
        adClickActionInfo.f273641b = Util.getInt(map2.get(str2 + ".clickActionType"), 0);
        adClickActionInfo.f273643c = Util.nullAsNil(map2.get(str2 + ".clickActionLink"));
        adClickActionInfo.f273645d = Util.nullAsNil(map2.get(str2 + ".weappUserName"));
        adClickActionInfo.f273647e = Util.nullAsNil(map2.get(str2 + ".weappPath"));
        adClickActionInfo.f273649f = Util.getInt(map2.get(str2 + ".weappVersion"), 0);
        adClickActionInfo.f273651g = Util.safeParseInt(map2.get(str2 + ".miniProgramType"));
        adClickActionInfo.f273653h = Util.nullAsNil(map2.get(str2 + ".tempId"));
        adClickActionInfo.f273655i = Util.nullAsNil(map2.get(str2 + ".btnTitleAfterOrder"));
        adClickActionInfo.f273657j = Util.nullAsNil(map2.get(str2 + ".subscribeTitle"));
        adClickActionInfo.f273659k = Util.nullAsNil(map2.get(str2 + ".subscribeContent"));
        adClickActionInfo.f273661l = Util.nullAsNil(map2.get(str2 + ".subscribeSubmitBtnTitle"));
        adClickActionInfo.f273663m = Util.nullAsNil(map2.get(str2 + ".subscribeFailedTip"));
        adClickActionInfo.f273665n = Util.nullAsNil(map2.get(str2 + ".subscribeSucTip"));
        adClickActionInfo.f273667o = Util.nullAsNil(map2.get(str2 + ".appType"));
        Util.nullAsNil(map2.get(str2 + ".appId"));
        adClickActionInfo.f273669p = Util.nullAsNil(map2.get(str2 + ".subscribeHeadImg"));
        adClickActionInfo.f273671q = Util.nullAsNil(map2.get(str2 + ".subscribeNickname"));
        adClickActionInfo.f273672r = C102236a0.m134706B0(map2.get(str2 + ".subscribeExpiredTime"));
        adClickActionInfo.f273673s = Util.nullAsNil(map2.get(str2 + ".subscribeExpiredTip"));
        adClickActionInfo.f273674t = Util.nullAsNil(map2.get(str2 + ".openSdkAppId"));
        adClickActionInfo.f273675u = Util.nullAsNil(map2.get(str2 + ".packageName"));
        adClickActionInfo.f273676v = Util.nullAsNil(map2.get(str2 + ".appPageUrlAndroid"));
        adClickActionInfo.f273677w = Util.nullAsNil(map2.get(str2 + ".cardTpId"));
        adClickActionInfo.f273678x = Util.nullAsNil(map2.get(str2 + ".cardExt"));
        adClickActionInfo.f273679y = Util.nullAsNil(map2.get(str2 + ".brandUsername"));
        adClickActionInfo.f273680z = Util.nullAsNil(map2.get(str2 + ".brandHead"));
        adClickActionInfo.f273613A = Util.nullAsNil(map2.get(str2 + ".brandName"));
        adClickActionInfo.f273614B = Util.nullAsNil(map2.get(str2 + ".brandDesc"));
        adClickActionInfo.f273615C = Util.nullAsNil(map2.get(str2 + ".btnTitleAfterAddBrand"));
        adClickActionInfo.f273616D = Util.nullAsNil(map2.get(str2 + ".couponAppId"));
        adClickActionInfo.f273617E = Util.nullAsNil(map2.get(str2 + ".couponStockId"));
        adClickActionInfo.f273618F = Util.nullAsNil(map2.get(str2 + ".couponSenderPhoto"));
        adClickActionInfo.f273619G = Util.nullAsNil(map2.get(str2 + ".couponSenderName"));
        adClickActionInfo.f273620H = Util.nullAsNil(map2.get(str2 + ".couponName"));
        adClickActionInfo.f273621I = Util.nullAsNil(map2.get(str2 + ".couponDesc"));
        adClickActionInfo.finderUsername = Util.nullAsNil(map2.get(str2 + ".finderUsername"));
        adClickActionInfo.f273622J = Util.nullAsNil(map2.get(str2 + ".finderLiveNoticeId"));
        adClickActionInfo.f273623K = Util.nullAsNil(map2.get(str2 + ".finderAvatar"));
        adClickActionInfo.f273624L = Util.nullAsNil(map2.get(str2 + ".finderNickname"));
        adClickActionInfo.f273625M = Util.nullAsNil(map2.get(str2 + ".finderLiveTitle"));
        adClickActionInfo.finderLiveId = Util.nullAsNil(map2.get(str2 + ".finderLiveId"));
        adClickActionInfo.f273627O = Util.nullAsNil(map2.get(str2 + ".finderLiveFeedExportId"));
        adClickActionInfo.f273628P = Util.nullAsNil(map2.get(str2 + ".finderLiveFeedNonceId"));
        String str3 = str2 + ".finderLivePreviewInfo";
        SnsMethodCalculate.markStartTimeMs("parseFinderPreviewInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo");
        String str4 = "";
        if (C101425k.m133098b(map)) {
            SnsMethodCalculate.markEndTimeMs("parseFinderPreviewInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo");
        } else {
            try {
                if (!map2.containsKey(str3)) {
                    adClickActionInfo.f273629Q = false;
                    SnsMethodCalculate.markEndTimeMs("parseFinderPreviewInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo");
                } else {
                    adClickActionInfo.f273629Q = true;
                    adClickActionInfo.f273630R = Util.nullAsNil(map2.get(str3 + ".bgImage"));
                    adClickActionInfo.f273631S = Util.nullAsNil(map2.get(str3 + ".avatar"));
                    adClickActionInfo.f273632T = Util.nullAsNil(map2.get(str3 + ".nickname"));
                    C94588a.C94589a.C94591b bVar = new C94588a.C94589a.C94591b();
                    bVar.mo130144a(map2, str3 + ".productInfo");
                    adClickActionInfo.f273633U = bVar.f273692a;
                    adClickActionInfo.f273634V = bVar.f273693b;
                    adClickActionInfo.f273635W = bVar.f273694c;
                    adClickActionInfo.f273636X = bVar.f273695d;
                    adClickActionInfo.f273637Y = bVar.f273696e;
                    String str5 = str3 + ".liveCheerIconList.iconInfo";
                    int i = 0;
                    while (true) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str5);
                        sb.append(i == 0 ? str4 : Integer.valueOf(i));
                        String sb4 = sb.toString();
                        if (!map2.containsKey(sb4)) {
                            break;
                        }
                        C94588a.C94589a.C94590a aVar = new C94588a.C94589a.C94590a();
                        aVar.mo130143a(map2, sb4);
                        ((ArrayList) adClickActionInfo.f273638Z).add(aVar);
                        i++;
                    }
                    SnsMethodCalculate.markEndTimeMs("parseFinderPreviewInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo");
                }
            } catch (Throwable unused) {
            }
        }
        adClickActionInfo.f273640a0 = Util.nullAsNil(map2.get(str2 + ".finderEncryptedTopicId"));
        adClickActionInfo.f273642b0 = Util.nullAsNil(map2.get(str2 + ".finderTopicName"));
        adClickActionInfo.f273644c0 = Util.nullAsNil(map2.get(str2 + ".finderObjectNonceId"));
        adClickActionInfo.f273646d0 = Util.nullAsNil(map2.get(str2 + ".finderExportId"));
        adClickActionInfo.f273626N = Util.nullAsNil(map2.get(str2 + ".finderDesc"));
        adClickActionInfo.f273648e0 = Util.nullAsNil(map2.get(str2 + ".finderFollowingBtnTitle"));
        adClickActionInfo.f273650f0 = Util.nullAsNil(map2.get(str2 + ".appGiftPackCode"));
        adClickActionInfo.f273652g0 = Util.nullAsNil(map2.get(str2 + ".appGiftPackCodeTips"));
        adClickActionInfo.f273654h0 = C92428a.m116256a(map2, str2 + ".appointmentInfo");
        adClickActionInfo.f273656i0 = Util.nullAsNil(map2.get(str2 + ".searchQuery"));
        adClickActionInfo.f273658j0 = Util.nullAsNil(map2.get(str2 + ".jumpKefuUrl"));
        adClickActionInfo.f273660k0 = Util.safeParseInt(map2.get(str2 + ".openVideoTab"));
        adClickActionInfo.f273662l0 = Util.safeParseLong(map2.get(str2 + ".canvasId"));
        adClickActionInfo.f273664m0 = Util.nullAsNil(map2.get(str2 + ".canvasDynamicInfo"));
        adClickActionInfo.f273666n0 = Util.safeParseInt(map2.get(str2 + ".canvasPreloadType"));
        C55059u uVar = null;
        if (adClickActionInfo.f273641b == 21) {
            SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
            SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo$Companion");
            if (str2 == null) {
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo$Companion");
                eVar = null;
            } else {
                String str6 = map2.get(str2 + ".clickActionType");
                int intValue = (str6 == null || (e3 = C66731x.m78731e(str6)) == null) ? 0 : e3.intValue();
                String str7 = map2.get(str2 + ".imageUrl");
                String str8 = str7 == null ? str4 : str7;
                String str9 = map2.get(str2 + ".iconId");
                String str10 = str9 == null ? str4 : str9;
                String str11 = map2.get(str2 + ".sourceFooterData");
                String str12 = str11 == null ? str4 : str11;
                String str13 = map2.get(str2 + ".sourceVerifyInfo");
                String str14 = str13 == null ? str4 : str13;
                String str15 = map2.get(str2 + ".desc");
                String str16 = str15 == null ? str4 : str15;
                String str17 = map2.get(str2 + ".emoticonUrl");
                String str18 = str17 == null ? str4 : str17;
                String str19 = map2.get(str2 + ".emoticonMd5");
                C67440e eVar2 = new C67440e(intValue, str8, str10, str12, str14, str16, str18, str19 == null ? str4 : str19);
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo$Companion");
                eVar = eVar2;
            }
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
            adClickActionInfo.f273668o0 = eVar;
        }
        if (adClickActionInfo.f273641b == 22) {
            SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo");
            SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo$Companion");
            if (str2 == null) {
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo$Companion");
            } else {
                String str20 = map2.get(str2 + ".clickActionType");
                int intValue2 = (str20 == null || (e2 = C66731x.m78731e(str20)) == null) ? 0 : e2.intValue();
                String str21 = map2.get(str2 + ".needUpdateQrUrl");
                int intValue3 = (str21 == null || (e = C66731x.m78731e(str21)) == null) ? 0 : e.intValue();
                String str22 = map2.get(str2 + ".qrExtInfo");
                if (str22 == null) {
                    str22 = str4;
                }
                String str23 = map2.get(str2 + ".qrUrl");
                if (str23 != null) {
                    str4 = str23;
                }
                uVar = new C55059u(intValue2, intValue3, str22, str4);
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo$Companion");
            }
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo");
            adClickActionInfo.f273670p0 = uVar;
        }
        SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo");
        return adClickActionInfo;
    }

    /* renamed from: a */
    public boolean mo130140a() {
        SnsMethodCalculate.markStartTimeMs("isWeApp", "com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo");
        boolean z = this.f273641b == 4 && !Util.isNullOrNil(this.f273645d);
        SnsMethodCalculate.markEndTimeMs("isWeApp", "com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo");
        return z;
    }

    /* renamed from: c */
    public void mo130141c(ADInfo aDInfo) {
        int i;
        SnsMethodCalculate.markStartTimeMs("preload", "com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo");
        SnsMethodCalculate.markStartTimeMs("preloadDynamicCanvas", "com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo");
        if (aDInfo != null) {
            try {
                if (this.f273641b == 20 && (i = this.f273666n0) != 0) {
                    C100884n.m132182b(this.f273662l0, i == 2, C102260r.m134878r(aDInfo.uxInfo), this.f273664m0);
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("AdClickActionInfo", th, "doPreloadDynamicLandingPage error", new Object[0]);
            }
            SnsMethodCalculate.markEndTimeMs("preloadDynamicCanvas", "com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo");
        } else {
            Log.m105920e("AdClickActionInfo", "preloadDynamicCanvas get null! ");
            SnsMethodCalculate.markEndTimeMs("preloadDynamicCanvas", "com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo");
        }
        if (aDInfo.preloadFinderFeed && !Util.isNullOrNil(this.f273646d0)) {
            C99544i0.m129921h(this.f273646d0);
        }
        SnsMethodCalculate.markStartTimeMs("preloadTextStatusInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo");
        C67440e eVar = this.f273668o0;
        if (eVar != null) {
            SnsMethodCalculate.markStartTimeMs("getEmoticonUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
            String str = eVar.f193394f;
            SnsMethodCalculate.markEndTimeMs("getEmoticonUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
            Log.m105924i("AdClickActionInfo", "preload emojiUrl " + str + " ");
            C63489a.m74828c(str, new C55053c(this, str));
            C67440e eVar2 = this.f273668o0;
            eVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
            String str2 = eVar2.f193389a;
            SnsMethodCalculate.markEndTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
            Log.m105924i("AdClickActionInfo", "preload imageUrl " + str2 + " ");
            C63489a.m74828c(str2, new C55054d(this, str2));
        }
        SnsMethodCalculate.markEndTimeMs("preloadTextStatusInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo");
        SnsMethodCalculate.markEndTimeMs("preload", "com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo");
    }
}
