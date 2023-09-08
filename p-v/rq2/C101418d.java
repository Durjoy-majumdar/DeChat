package rq2;

import android.text.TextUtils;
import co2.C92448q;
import co2.C92449r;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import hd0.C98398h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lo2.C99556n;
import os2.C35299v;
import te3.C101789j00;
import te3.C101804kv2;
import vr2.C102236a0;
import vr2.C37817q;

/* renamed from: rq2.d */
public class C101418d {
    /* renamed from: a */
    public static void m133071a(AdSnsInfo adSnsInfo) {
        C92449r rVar;
        SnsMethodCalculate.markStartTimeMs("checkDeleteSlideFullCardVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        if (adSnsInfo == null) {
            Log.m105920e("AdDeleteUtils", "checkDeleteSlideFullCardVideoInfo, adSnsInfo is null");
            SnsMethodCalculate.markEndTimeMs("checkDeleteSlideFullCardVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        ADXml adXml = adSnsInfo.getAdXml();
        if (!adXml.isSlideFullCard() || (rVar = adXml.adSliderFullCardInfo) == null) {
            SnsMethodCalculate.markEndTimeMs("checkDeleteSlideFullCardVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        List<C92448q> list = rVar.f264582a;
        if (C101425k.m133097a(list)) {
            Log.m105920e("AdDeleteUtils", "checkDeleteSlideFullCardVideoInfo, resInfoList is null or empty");
            SnsMethodCalculate.markEndTimeMs("checkDeleteSlideFullCardVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C92448q qVar = (C92448q) it.next();
            SnsMethodCalculate.markStartTimeMs("deleteSlideFullCardVideoInternal", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            if (qVar != null) {
                try {
                    if (qVar.mo126435a()) {
                        String str = qVar.f264577e.f298689d;
                        if (arrayList.contains(str)) {
                            SnsMethodCalculate.markEndTimeMs("deleteSlideFullCardVideoInternal", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
                        } else {
                            m133075e(str);
                            arrayList.add(str);
                            Log.m105924i("AdDeleteUtils", "deleteSlideFullCardVideoInternal, mediaId is " + str);
                        }
                    }
                } catch (Throwable th) {
                    Log.m105920e("AdDeleteUtils", "deleteSlideFullCardVideoInternal, exp is " + th);
                }
            }
            SnsMethodCalculate.markEndTimeMs("deleteSlideFullCardVideoInternal", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        }
        SnsMethodCalculate.markEndTimeMs("checkDeleteSlideFullCardVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
    }

    /* renamed from: b */
    public static boolean m133072b(long j) {
        SnsMethodCalculate.markStartTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        try {
            boolean c = m133073c(C94866e1.zx0().mo139864jo(j));
            SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return c;
        } catch (Throwable th) {
            Log.m105920e("AdDeleteUtils", "deleteAd0, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m133073c(AdSnsInfo adSnsInfo) {
        SnsMethodCalculate.markStartTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        if (adSnsInfo == null) {
            try {
                Log.m105920e("AdDeleteUtils", "deleteAd, snsInfo==null");
                SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
                return false;
            } catch (Throwable th) {
                Log.m105920e("AdDeleteUtils", "deleteAd, exp=" + th.toString());
                SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
                return false;
            }
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            m133074d(adSnsInfo);
            long currentTimeMillis2 = System.currentTimeMillis();
            long j = adSnsInfo.field_snsId;
            boolean delete = C94866e1.zx0().delete(j);
            C94866e1.Tx0().mo139895jo(j);
            C35299v.m40633a(j);
            int i = (int) (currentTimeMillis2 - currentTimeMillis);
            int currentTimeMillis3 = (int) (System.currentTimeMillis() - currentTimeMillis);
            String q0 = C102236a0.m134765q0(adSnsInfo.field_snsId);
            Log.m105924i("AdDeleteUtils", "deleteAd, snsId=" + q0 + ", ret=" + delete + ", delVideoInfoCost=" + i + ", totalCost=" + currentTimeMillis3);
            C37817q.m41545a("del_ad_time_cost", q0, currentTimeMillis3, i, delete ? "1" : "0");
            SnsMethodCalculate.markEndTimeMs("deleteAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return delete;
        }
    }

    /* renamed from: d */
    public static void m133074d(AdSnsInfo adSnsInfo) {
        C101789j00 j002;
        boolean z;
        LinkedList<C101804kv2> linkedList;
        SnsMethodCalculate.markStartTimeMs("deleteAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        try {
            if (!m133076f()) {
                Log.m105920e("AdDeleteUtils", "deleteAdVideoInfo, expt closed!");
                SnsMethodCalculate.markEndTimeMs("deleteAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            TimeLineObject timeLine = adSnsInfo.getTimeLine();
            m133071a(adSnsInfo);
            if (!(timeLine == null || (j002 = timeLine.ContentObj) == null)) {
                int i = j002.f298424e;
                SnsMethodCalculate.markStartTimeMs("isVideoAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
                if (i != 5) {
                    if (i != 15) {
                        z = false;
                        SnsMethodCalculate.markEndTimeMs("isVideoAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
                        if (z && (linkedList = timeLine.ContentObj.f298427h) != null && linkedList.size() >= 1) {
                            C101804kv2 kv22 = timeLine.ContentObj.f298427h.get(0);
                            m133075e(kv22.f298689d);
                            Log.m105924i("AdDeleteUtils", "deleteAdVideoInfo, snsId=" + C102236a0.m134765q0(adSnsInfo.field_snsId) + ", rawMediaId=" + kv22.f298689d + ", timeCost=" + (System.currentTimeMillis() - currentTimeMillis));
                        }
                    }
                }
                z = true;
                SnsMethodCalculate.markEndTimeMs("isVideoAd", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
                C101804kv2 kv222 = timeLine.ContentObj.f298427h.get(0);
                m133075e(kv222.f298689d);
                Log.m105924i("AdDeleteUtils", "deleteAdVideoInfo, snsId=" + C102236a0.m134765q0(adSnsInfo.field_snsId) + ", rawMediaId=" + kv222.f298689d + ", timeCost=" + (System.currentTimeMillis() - currentTimeMillis));
            }
            SnsMethodCalculate.markEndTimeMs("deleteAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        } catch (Throwable th) {
            Log.m105920e("AdDeleteUtils", "deleteAdVideoInfo, exp=" + th.toString());
        }
    }

    /* renamed from: e */
    public static void m133075e(String str) {
        boolean z;
        String str2;
        SnsMethodCalculate.markStartTimeMs("doDelVideoInfoByMediaId", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("doDelVideoInfoByMediaId", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return;
        }
        SnsMethodCalculate.markStartTimeMs("isMediaIdHasH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("isMediaIdHasH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            z = false;
        } else {
            z = str.contains("_hvec");
            SnsMethodCalculate.markEndTimeMs("isMediaIdHasH265Flag", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        }
        boolean z2 = true;
        if (z) {
            str2 = C99556n.m129945h(str, false);
        } else {
            str2 = str;
            str = C99556n.m129945h(str, true);
        }
        boolean d = C98398h0.Bx0().mo137718d(str);
        m133077g(d, true);
        Log.m105924i("AdDeleteUtils", "delVideoInfoByMediaId, mediaIdHasFlag=" + str + ", ret=" + d);
        SnsMethodCalculate.markStartTimeMs("isDelNoFlagVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_del_noflag_videoinfo, 0);
            Log.m105918d("AdDeleteUtils", "isDelNoFlagVideoInfo, expt=" + Qe);
            if (Qe <= 0) {
                z2 = false;
            }
            SnsMethodCalculate.markEndTimeMs("isDelNoFlagVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        } catch (Throwable th) {
            Log.m105920e("AdDeleteUtils", "isDelNoFlagVideoInfo, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("isDelNoFlagVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            z2 = false;
        }
        if (z2) {
            boolean d2 = C98398h0.Bx0().mo137718d(str2);
            Log.m105924i("AdDeleteUtils", "delVideoInfoByMediaId, mediaIdNoFlag=" + str2 + ", ret=" + d2);
            m133077g(d2, false);
        }
        SnsMethodCalculate.markEndTimeMs("doDelVideoInfoByMediaId", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
    }

    /* renamed from: f */
    public static boolean m133076f() {
        SnsMethodCalculate.markStartTimeMs("isDeleteAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        boolean z = true;
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_del_videoinfo, 1);
            Log.m105924i("AdDeleteUtils", "isDeleteAdVideoInfo, expt=" + Qe);
            if (Qe <= 0) {
                z = false;
            }
            SnsMethodCalculate.markEndTimeMs("isDeleteAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return z;
        } catch (Throwable th) {
            Log.m105920e("AdDeleteUtils", "isDeleteAdVideoInfo, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("isDeleteAdVideoInfo", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
            return true;
        }
    }

    /* renamed from: g */
    public static void m133077g(boolean z, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("reportVideoInfoDelResult", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
        if (z2) {
            if (z) {
                C115669n.INSTANCE.mo175911u(1907, 25);
            } else {
                C115669n.INSTANCE.mo175911u(1907, 26);
            }
        } else if (z) {
            C115669n.INSTANCE.mo175911u(1907, 27);
        } else {
            C115669n.INSTANCE.mo175911u(1907, 28);
        }
        SnsMethodCalculate.markEndTimeMs("reportVideoInfoDelResult", "com.tencent.mm.plugin.sns.ad.utils.AdDeleteUtils");
    }
}
