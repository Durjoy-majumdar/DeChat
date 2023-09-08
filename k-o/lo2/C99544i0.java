package lo2;

import android.content.Context;
import android.util.ArrayMap;
import co2.C92448q;
import co2.C92449r;
import co2.C92450s;
import co2.C92451t;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.C94588a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32227p;
import ht1.C60214y3;
import ht1.C60216z4;
import ht1.C8770h2;
import io2.C98771b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ps2.C100894u;
import qs2.C101255a0;
import qs2.C101263e0;
import rq2.C101425k;
import rx3.C13598b0;
import so2.C101671f;
import so2.C101675j;
import vr2.C102236a0;
import zt3.C119157j;

/* renamed from: lo2.i0 */
public class C99544i0 {

    /* renamed from: a */
    public static List<String> f291799a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    public static Map<String, Long> f291800b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    public static C60214y3 f291801c;

    /* renamed from: lo2.i0$a */
    public class C61321a implements C32227p<String, FinderObject, C13598b0> {
        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$1");
            String str = (String) obj;
            FinderObject finderObject = (FinderObject) obj2;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$1");
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            SnsMethodCalculate.markStartTimeMs("preloadFinderFeedsResources", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            if (Util.isNullOrNil(str)) {
                Log.m105920e("FinderAdPreloadHelper", "reqFinderFeedsObjectIds, encryptedObjectId is null");
                SnsMethodCalculate.markEndTimeMs("preloadFinderFeedsResources", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            } else if (finderObject == null) {
                C99544i0.f291799a.remove(str);
                Log.m105920e("FinderAdPreloadHelper", "reqFinderFeedsObjectIds, finderObject is null");
                SnsMethodCalculate.markEndTimeMs("preloadFinderFeedsResources", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            } else if (C99544i0.f291801c == null) {
                Log.m105920e("FinderAdPreloadHelper", "finderPreloadVideoService is null");
                SnsMethodCalculate.markEndTimeMs("preloadFinderFeedsResources", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            } else {
                long j = finderObject.f164794id;
                C99544i0.f291800b.put(str, Long.valueOf(j));
                ((C119157j) C119157j.f356862d).mo183875f(new C61324j0(str, j, finderObject));
                SnsMethodCalculate.markEndTimeMs("preloadFinderFeedsResources", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            }
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$1");
            return b0Var;
        }
    }

    /* renamed from: lo2.i0$b */
    public class C61322b implements C32227p<String, FinderObject, C13598b0> {
        public Object invoke(Object obj, Object obj2) {
            C13598b0 b0Var;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$3");
            String str = (String) obj;
            FinderObject finderObject = (FinderObject) obj2;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$3");
            if (Util.isNullOrNil(str)) {
                Log.m105920e("FinderAdPreloadHelper", "onAddAppear req finderFeedsObjectIds, encryptedObjectId is null");
                b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$3");
            } else if (finderObject == null) {
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
                List<String> list = C99544i0.f291799a;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
                list.remove(str);
                Log.m105920e("FinderAdPreloadHelper", "onAddAppear req finderFeedsObjectIds, finderObject is null");
                b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$3");
            } else {
                long j = finderObject.f164794id;
                C99544i0.f291800b.put(str, Long.valueOf(j));
                Log.m105924i("FinderAdPreloadHelper", "onAddAppear req finderFeedsObjectIds received, encryptedObjectId is " + str + ", objectId is " + j);
                b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$3");
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$3");
            return b0Var;
        }
    }

    /* renamed from: lo2.i0$d */
    public static class C61323d implements C60214y3.C60215a {
        /* renamed from: a */
        public void mo86284a(long j) {
            SnsMethodCalculate.markStartTimeMs("onFailure", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$AdPreloadVideoCallback");
            Log.m105920e("FinderAdPreloadHelper", "preloadVideo onFailure, feedId is " + j);
            SnsMethodCalculate.markEndTimeMs("onFailure", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$AdPreloadVideoCallback");
        }
    }

    /* renamed from: lo2.i0$c */
    public class C99545c implements C98771b.C98772a {
        /* renamed from: a */
        public void mo130218a(String str, int i, int i2, Object obj) {
            SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$5");
            Log.m105924i("FinderAdPreloadHelper", "doCacheFinderLivingRoom, snsId=" + str + ", errCode=" + i2 + ", actionType=" + i);
            SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$5");
        }
    }

    /* renamed from: a */
    public static void m129914a(Context context, ADXml aDXml, SnsInfo snsInfo, int i) {
        AdClickActionInfo adClickActionInfo;
        AdClickActionInfo adClickActionInfo2;
        AdClickActionInfo adClickActionInfo3;
        Context context2 = context;
        ADXml aDXml2 = aDXml;
        SnsInfo snsInfo2 = snsInfo;
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        SnsMethodCalculate.markStartTimeMs("doPreloadFinderInfo", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        if (aDXml2 == null) {
            SnsMethodCalculate.markEndTimeMs("doPreloadFinderInfo", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        } else {
            C94588a aVar = aDXml2.adFinderLiveInfo;
            if (aVar != null) {
                SnsMethodCalculate.markStartTimeMs("doCacheFinderLivingRoom", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
                m129916c(snsInfo, i, 3, context, aVar.f273681a, aVar.f273682b, aVar.f273683c, aVar.f273684d);
                SnsMethodCalculate.markEndTimeMs("doCacheFinderLivingRoom", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            }
            AdClickActionInfo adClickActionInfo4 = aDXml2.adActionLinkClickInfo;
            if (adClickActionInfo4 != null) {
                m129917d(snsInfo2, i2, context2, adClickActionInfo4);
            }
            ADXml.AdCardActionBtnInfo adCardActionBtnInfo = aDXml2.adCardActionBtnInfo;
            if (!(adCardActionBtnInfo == null || (adClickActionInfo3 = adCardActionBtnInfo.clickActionInfo) == null)) {
                m129917d(snsInfo2, i2, context2, adClickActionInfo3);
            }
            C92450s sVar = aDXml2.adTagBtnInfo;
            if (!(sVar == null || (adClickActionInfo2 = sVar.f264599o) == null)) {
                m129917d(snsInfo2, i2, context2, adClickActionInfo2);
            }
            ADXml.C95021h adSelectInfo = aDXml.getAdSelectInfo();
            if (adSelectInfo != null) {
                AdClickActionInfo adClickActionInfo5 = adSelectInfo.f275707c;
                if (adClickActionInfo5 != null) {
                    m129917d(snsInfo2, i2, context2, adClickActionInfo5);
                }
                AdClickActionInfo adClickActionInfo6 = adSelectInfo.f275708d;
                if (adClickActionInfo6 != null) {
                    m129917d(snsInfo2, i2, context2, adClickActionInfo6);
                }
            }
            C92449r rVar = aDXml2.adSliderFullCardInfo;
            if (rVar != null) {
                List<C92448q> list = rVar.f264582a;
                if (!C101425k.m133097a(list)) {
                    Iterator it = ((ArrayList) list).iterator();
                    while (it.hasNext()) {
                        C92448q qVar = (C92448q) it.next();
                        if (qVar != null) {
                            AdClickActionInfo adClickActionInfo7 = qVar.f264578f;
                            if (adClickActionInfo7 != null) {
                                m129917d(snsInfo2, i2, context2, adClickActionInfo7);
                            }
                            C92451t tVar = qVar.f264579g;
                            if (!(tVar == null || (adClickActionInfo = tVar.f264603c) == null)) {
                                m129917d(snsInfo2, i2, context2, adClickActionInfo);
                            }
                        }
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("doPreloadFinderInfo", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        }
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
    }

    /* renamed from: b */
    public static void m129915b(Context context, ADInfo aDInfo, SnsInfo snsInfo, int i) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        SnsMethodCalculate.markStartTimeMs("doPreloadFinderInfo", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        if (aDInfo == null || C101425k.m133097a(aDInfo.adClickActionInfoList)) {
            SnsMethodCalculate.markEndTimeMs("doPreloadFinderInfo", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        } else {
            for (AdClickActionInfo next : aDInfo.adClickActionInfoList) {
                if (next != null) {
                    m129917d(snsInfo, i, context, next);
                }
            }
            SnsMethodCalculate.markEndTimeMs("doPreloadFinderInfo", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        }
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
    }

    /* renamed from: c */
    public static void m129916c(SnsInfo snsInfo, int i, int i2, Context context, String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        String str7;
        String str8 = str;
        String str9 = str2;
        SnsMethodCalculate.markStartTimeMs("doCacheFinderLivingRoom", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        ADInfo adInfo = snsInfo.getAdInfo(i);
        if (adInfo == null || !adInfo.preloadFinderLive) {
            SnsMethodCalculate.markEndTimeMs("doCacheFinderLivingRoom", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            return;
        }
        if (Util.isNullOrNil(str8, str9, str3, str4)) {
            Log.m105924i("FinderAdPreloadHelper", "doCacheFinderLivingRoom, username, liveId, feedExportId or feedNonceId is null");
            SnsMethodCalculate.markEndTimeMs("doCacheFinderLivingRoom", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            return;
        }
        String W = C102236a0.m134728W(snsInfo);
        String j = C99542h0.m129912j(snsInfo.getUxinfo(), W, i2);
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("is_from_ad", Boolean.TRUE);
        arrayMap.put("key_extra_info", j);
        C99545c cVar = new C99545c();
        SnsMethodCalculate.markStartTimeMs("doPreloadFinderLivingRoom", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        try {
            Log.m105924i("SnsAd.FinderLivingRequest", "doPreloadFinderLivingRoom, liveId=" + str9 + ", username=" + str8 + ", snsId=" + W);
            C60216z4 a = C98771b.m128552a();
            if (a == null) {
                Log.m105920e("SnsAd.FinderLivingRequest", "the IFinderUtilApi is null in doPreloadFinderLivingRoom, is there something wrong in wechat??!!, snsId=" + W);
                SnsMethodCalculate.markEndTimeMs("doPreloadFinderLivingRoom", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
                SnsMethodCalculate.markEndTimeMs("doCacheFinderLivingRoom", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            }
            long safeParseLong = Util.safeParseLong(str2);
            if (safeParseLong != 0) {
                C98771b.C98777e eVar = new C98771b.C98777e(W, 4, cVar);
                str6 = "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest";
                str5 = "doPreloadFinderLivingRoom";
                str7 = "SnsAd.FinderLivingRequest";
                try {
                    a.mo83770Q5(context, str, safeParseLong, str3, str4, arrayMap, eVar, new C98771b.C98775c(W, 4, cVar));
                } catch (Throwable th) {
                    th = th;
                    Log.m105920e(str7, "doPreloadFinderLivingRoom is failed! sns id = " + W + ", exp=" + th.toString());
                    try {
                        cVar.mo130218a(W, 4, -1, (Object) null);
                    } catch (Throwable unused) {
                    }
                    SnsMethodCalculate.markEndTimeMs(str5, str6);
                    SnsMethodCalculate.markEndTimeMs("doCacheFinderLivingRoom", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
                }
            } else {
                str6 = "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest";
                str5 = "doPreloadFinderLivingRoom";
                Log.m105920e("SnsAd.FinderLivingRequest", "is the liveId not number in doPreloadFinderLivingRoom????, snsId=" + W + ", livingId=" + safeParseLong);
            }
            SnsMethodCalculate.markEndTimeMs(str5, str6);
            SnsMethodCalculate.markEndTimeMs("doCacheFinderLivingRoom", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        } catch (Throwable th4) {
            th = th4;
            str6 = "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest";
            str5 = "doPreloadFinderLivingRoom";
            str7 = "SnsAd.FinderLivingRequest";
            Log.m105920e(str7, "doPreloadFinderLivingRoom is failed! sns id = " + W + ", exp=" + th.toString());
            cVar.mo130218a(W, 4, -1, (Object) null);
            SnsMethodCalculate.markEndTimeMs(str5, str6);
            SnsMethodCalculate.markEndTimeMs("doCacheFinderLivingRoom", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        }
    }

    /* renamed from: d */
    public static void m129917d(SnsInfo snsInfo, int i, Context context, AdClickActionInfo adClickActionInfo) {
        SnsMethodCalculate.markStartTimeMs("doCacheFinderLivingRoom", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        m129916c(snsInfo, i, C99542h0.m129905c(adClickActionInfo.f273639a), context, adClickActionInfo.finderUsername, adClickActionInfo.finderLiveId, adClickActionInfo.f273627O, adClickActionInfo.f273628P);
        SnsMethodCalculate.markEndTimeMs("doCacheFinderLivingRoom", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
    }

    /* renamed from: e */
    public static void m129918e(String str, int i, C101255a0 a0Var) {
        SnsMethodCalculate.markStartTimeMs("doPreloadFinderFeeds", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        if (a0Var instanceof C101671f) {
            C101671f fVar = (C101671f) a0Var;
            if (!Util.isNullOrNil(fVar.f297611Z)) {
                AdLandingPagesProxy.getInstance().preloadFinderFeeds(str, i, fVar.f297611Z);
            }
        }
        SnsMethodCalculate.markEndTimeMs("doPreloadFinderFeeds", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
    }

    /* renamed from: f */
    public static void m129919f(ADXml aDXml, String str) {
        AdClickActionInfo adClickActionInfo;
        AdClickActionInfo adClickActionInfo2;
        AdClickActionInfo adClickActionInfo3;
        SnsMethodCalculate.markStartTimeMs("doReqFinderFeedsObjectId", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        if (aDXml == null) {
            SnsMethodCalculate.markEndTimeMs("doReqFinderFeedsObjectId", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            return;
        }
        ADXml.C57361a aVar = aDXml.adFinderInfo;
        if (aVar != null) {
            m129922i(aVar.f164346c, str);
        }
        AdClickActionInfo adClickActionInfo4 = aDXml.adActionLinkClickInfo;
        if (adClickActionInfo4 != null) {
            m129922i(adClickActionInfo4.f273646d0, str);
        }
        ADXml.AdCardActionBtnInfo adCardActionBtnInfo = aDXml.adCardActionBtnInfo;
        if (!(adCardActionBtnInfo == null || (adClickActionInfo3 = adCardActionBtnInfo.clickActionInfo) == null)) {
            m129922i(adClickActionInfo3.f273646d0, str);
        }
        C92450s sVar = aDXml.adTagBtnInfo;
        if (!(sVar == null || (adClickActionInfo2 = sVar.f264599o) == null)) {
            m129922i(adClickActionInfo2.f273646d0, str);
        }
        ADXml.C95021h adSelectInfo = aDXml.getAdSelectInfo();
        if (adSelectInfo != null) {
            AdClickActionInfo adClickActionInfo5 = adSelectInfo.f275707c;
            if (adClickActionInfo5 != null) {
                m129922i(adClickActionInfo5.f273646d0, str);
            }
            AdClickActionInfo adClickActionInfo6 = adSelectInfo.f275708d;
            if (adClickActionInfo6 != null) {
                m129922i(adClickActionInfo6.f273646d0, str);
            }
        }
        C92449r rVar = aDXml.adSliderFullCardInfo;
        if (rVar != null) {
            List<C92448q> list = rVar.f264582a;
            if (!C101425k.m133097a(list)) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    C92448q qVar = (C92448q) it.next();
                    if (qVar != null) {
                        AdClickActionInfo adClickActionInfo7 = qVar.f264578f;
                        if (adClickActionInfo7 != null) {
                            m129922i(adClickActionInfo7.f273646d0, str);
                        }
                        C92451t tVar = qVar.f264579g;
                        if (!(tVar == null || (adClickActionInfo = tVar.f264603c) == null)) {
                            m129922i(adClickActionInfo.f273646d0, str);
                        }
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("doReqFinderFeedsObjectId", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
    }

    /* renamed from: g */
    public static void m129920g(String str, int i, C101255a0 a0Var) {
        SnsMethodCalculate.markStartTimeMs("preloadComponentFinderFeedsInfo", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        if (a0Var == null) {
            SnsMethodCalculate.markEndTimeMs("preloadComponentFinderFeedsInfo", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (C100894u.m132237q(a0Var.f296505k)) {
                List<C101255a0> a = a0Var.mo140732a();
                if (a != null) {
                    for (C101255a0 g : a) {
                        m129920g(str, i, g);
                    }
                }
            } else if (a0Var instanceof C101263e0) {
                m129918e(str, i, ((C101263e0) a0Var).f296572K);
            } else if (a0Var instanceof C101675j) {
                m129918e(str, i, ((C101675j) a0Var).f297627C);
            } else {
                m129918e(str, i, a0Var);
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            Log.m105918d("FinderAdPreloadHelper", "preloadComponentFinderFeedsInfo, type = " + a0Var.f296505k + ", subType = " + a0Var.f296504j + ", costTime = " + currentTimeMillis2);
        } catch (Throwable th) {
            Log.m105920e("FinderAdPreloadHelper", "preloadComponentFinderFeedsInfo exp = " + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("preloadComponentFinderFeedsInfo", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
    }

    /* renamed from: h */
    public static void m129921h(String str) {
        Class cls = C8770h2.class;
        SnsMethodCalculate.markStartTimeMs("preloadFinderFeeds", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("preloadFinderFeeds", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        } else if (f291799a.contains(str)) {
            SnsMethodCalculate.markEndTimeMs("preloadFinderFeeds", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        } else {
            Log.m105924i("FinderAdPreloadHelper", "reqFinderFeedsObjectIds start, exportId is " + str);
            f291799a.add(str);
            if (f291801c == null) {
                C60214y3 Yf = ((C8770h2) C86312j.m106911c(cls)).mo9593Yf();
                f291801c = Yf;
                Yf.mo78734a(new C61323d());
            }
            ((C8770h2) C86312j.m106911c(cls)).mo9595zM(42, str, true, (String) null, new C61321a());
            SnsMethodCalculate.markEndTimeMs("preloadFinderFeeds", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        }
    }

    /* renamed from: i */
    public static void m129922i(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("reqFinderFeedsObjectId", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("reqFinderFeedsObjectId", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        } else if (f291799a.contains(str)) {
            SnsMethodCalculate.markEndTimeMs("reqFinderFeedsObjectId", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        } else {
            Log.m105924i("FinderAdPreloadHelper", "onAddAppear req finderFeedsObjectIds start, exportId is " + str);
            f291799a.add(str);
            ((C8770h2) C86312j.m106911c(C8770h2.class)).mo9595zM(42, str, true, str2, new C61322b());
            SnsMethodCalculate.markEndTimeMs("reqFinderFeedsObjectId", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        }
    }
}
