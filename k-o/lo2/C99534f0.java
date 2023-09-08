package lo2;

import bp3.C79758p;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import gu2.C98214b;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import lf3.C99414b;
import org.json.JSONArray;
import org.json.JSONObject;
import rq2.C101418d;
import rq2.C101425k;
import rq2.C63505q;
import vr2.C102236a0;

/* renamed from: lo2.f0 */
public class C99534f0 {

    /* renamed from: lo2.f0$a */
    public static class C99535a extends C63505q.C63507b {

        /* renamed from: a */
        public final List<C99537c> f291778a;

        public C99535a(List<C99537c> list) {
            this.f291778a = list;
        }

        /* renamed from: a */
        public void mo75423a(JSONObject jSONObject) {
            SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
            try {
                jSONObject.putOpt("snsId", "");
                jSONObject.putOpt("uxinfo", "");
                jSONObject.putOpt("adExtInfo", "");
                jSONObject.putOpt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
        }

        /* renamed from: b */
        public void mo75424b(JSONObject jSONObject) {
            SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
            try {
                if (C101425k.m133097a(this.f291778a)) {
                    SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                jSONObject.putOpt("totalCount", Integer.valueOf(this.f291778a.size()));
                jSONObject.putOpt("reportItemList", jSONArray);
                int i = 0;
                for (C99537c c : this.f291778a) {
                    mo138927c(jSONArray, c);
                    i++;
                    if (i >= 10) {
                        break;
                    }
                }
                SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
            } catch (Throwable unused) {
            }
        }

        /* renamed from: c */
        public final void mo138927c(JSONArray jSONArray, C99537c cVar) {
            SnsMethodCalculate.markStartTimeMs("fillReportItem", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
            if (cVar == null) {
                SnsMethodCalculate.markEndTimeMs("fillReportItem", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("snsId", C102236a0.m134765q0(cVar.f291783b));
                jSONObject.putOpt("reserveSnsId", C102236a0.m134765q0(cVar.f291782a));
                jSONArray.put(jSONObject);
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("fillReportItem", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
        }

        public String getChannel() {
            SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
            SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper$AdChannel");
            return "sns_ad_remove_consecutive_ad_report";
        }
    }

    /* renamed from: lo2.f0$b */
    public static class C99536b {

        /* renamed from: a */
        public int f291779a;

        /* renamed from: b */
        public long f291780b;

        /* renamed from: c */
        public int f291781c = 0;

        public C99536b(int i, long j) {
            this.f291779a = i;
            this.f291780b = j;
        }
    }

    /* renamed from: lo2.f0$c */
    public static class C99537c {

        /* renamed from: a */
        public final long f291782a;

        /* renamed from: b */
        public final long f291783b;

        public C99537c(long j, long j2) {
            this.f291782a = j;
            this.f291783b = j2;
        }
    }

    /* renamed from: a */
    public static List<C98214b> m129892a(List<C98214b> list) {
        SnsMethodCalculate.markStartTimeMs("deleteConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        if (list == null || list.size() == 0) {
            Log.m105928w("ConsecutiveAdDataImproveHelper", "deleteConsecutiveAd, cursor==null");
            SnsMethodCalculate.markEndTimeMs("deleteConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return null;
        }
        List<C99537c> d = m129897f() ? m129895d(list) : m129894c(list);
        if (C101425k.m133097a(d)) {
            Log.m105918d("ConsecutiveAdDataImproveHelper", "empty consecutive ad list");
            SnsMethodCalculate.markEndTimeMs("deleteConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return list;
        }
        SnsMethodCalculate.markStartTimeMs("deleteConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        if (C101425k.m133097a(d)) {
            SnsMethodCalculate.markEndTimeMs("deleteConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        } else {
            HashSet hashSet = new HashSet();
            for (C99537c cVar : d) {
                long j = cVar.f291783b;
                if (j != 0) {
                    Log.m105924i("ConsecutiveAdDataImproveHelper", "delete sns id " + C102236a0.m134765q0(j));
                    hashSet.add(Long.valueOf(j));
                    C101418d.m133072b(j);
                    C115669n.INSTANCE.mo175911u(1907, 11);
                }
            }
            ArrayList arrayList = new ArrayList();
            for (C98214b next : list) {
                if (!next.isAd() || !hashSet.contains(Long.valueOf(next.mo142401p2()))) {
                    arrayList.add(next);
                }
            }
            SnsMethodCalculate.markEndTimeMs("deleteConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            list = arrayList;
        }
        C115669n.INSTANCE.mo175913w(1612, 30, (long) d.size());
        C63505q.m74843b(new C99535a(d));
        SnsMethodCalculate.markEndTimeMs("deleteConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        return list;
    }

    /* renamed from: b */
    public static List<Long> m129893b(List<C98214b> list) {
        SnsMethodCalculate.markStartTimeMs("deleteConsecutiveAdWithReturn", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        if (list == null || list.size() == 0) {
            Log.m105928w("ConsecutiveAdDataImproveHelper", "deleteConsecutiveAd, cursor==null");
            SnsMethodCalculate.markEndTimeMs("deleteConsecutiveAdWithReturn", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return null;
        }
        List<C99537c> d = m129897f() ? m129895d(list) : m129894c(list);
        if (C101425k.m133097a(d)) {
            Log.m105918d("ConsecutiveAdDataImproveHelper", "empty consecutive ad list");
            SnsMethodCalculate.markEndTimeMs("deleteConsecutiveAdWithReturn", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C99537c cVar : d) {
            long j = cVar.f291783b;
            if (j != 0) {
                Log.m105924i("ConsecutiveAdDataImproveHelper", "delete sns id " + C102236a0.m134765q0(j));
                arrayList.add(Long.valueOf(j));
                C101418d.m133072b(j);
                C115669n.INSTANCE.mo175911u(1907, 11);
            }
        }
        C115669n.INSTANCE.mo175913w(1612, 30, (long) d.size());
        C63505q.m74843b(new C99535a(d));
        SnsMethodCalculate.markEndTimeMs("deleteConsecutiveAdWithReturn", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        return arrayList;
    }

    /* renamed from: c */
    public static List<C99537c> m129894c(List<C98214b> list) {
        SnsMethodCalculate.markStartTimeMs("filterConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        if (list == null) {
            SnsMethodCalculate.markEndTimeMs("filterConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long j = 0;
        for (int i = 0; i < list.size(); i++) {
            C98214b bVar = list.get(i);
            long p2 = bVar.mo142401p2();
            if (!bVar.isAd()) {
                j = 0;
            } else if (j == 0) {
                Log.m105924i("ConsecutiveAdDataImproveHelper", "there is first ad sns id is " + p2);
                j = p2;
            } else {
                Log.m105924i("ConsecutiveAdDataImproveHelper", "there is consecutive ad sns id is " + p2);
                arrayList.add(new C99537c(j, p2));
            }
        }
        SnsMethodCalculate.markEndTimeMs("filterConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        return arrayList;
    }

    /* renamed from: d */
    public static List<C99537c> m129895d(List<C98214b> list) {
        SnsMethodCalculate.markStartTimeMs("filterConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        if (list == null) {
            SnsMethodCalculate.markEndTimeMs("filterConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                C98214b bVar = list.get(i2);
                long p2 = bVar.mo142401p2();
                if (bVar.isAd()) {
                    arrayList.add(new C99536b(i, p2));
                }
                i++;
            }
            if (arrayList.size() < 2) {
                SnsMethodCalculate.markEndTimeMs("filterConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
                return null;
            }
            List<C99537c> e = m129896e(arrayList);
            SnsMethodCalculate.markEndTimeMs("filterConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return e;
        } catch (Throwable th) {
            Log.m105920e("ConsecutiveAdDataImproveHelper", "filterConsecutiveAdByTime, exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("filterConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return null;
        }
    }

    /* renamed from: e */
    public static List<C99537c> m129896e(List<C99536b> list) {
        SnsMethodCalculate.markStartTimeMs("getDelAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        C99536b bVar = null;
        for (int i = 0; i < list.size(); i++) {
            C99536b bVar2 = list.get(i);
            AdSnsInfo jo = C94866e1.zx0().mo139864jo(bVar2.f291780b);
            String q0 = C102236a0.m134765q0(bVar2.f291780b);
            if (jo != null) {
                bVar2.f291781c = jo.field_createAdTime;
            } else {
                Log.m105920e("ConsecutiveAdDataImproveHelper", "getDelAdByTime, no ad, snsId=" + q0);
            }
            Log.m105924i("ConsecutiveAdDataImproveHelper", "getDelAdByTime, snsId=" + q0 + ", idx=" + bVar2.f291779a + ", time=" + bVar2.f291781c);
            if (bVar != null && bVar2.f291779a - bVar.f291779a == 1) {
                if (bVar2.f291781c > bVar.f291781c) {
                    arrayList.add(new C99537c(0, bVar.f291780b));
                } else {
                    arrayList.add(new C99537c(0, bVar2.f291780b));
                    bVar.f291779a = bVar2.f291779a;
                }
            }
            bVar = bVar2;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.m105924i("ConsecutiveAdDataImproveHelper", "getDelAdByTime, cost=" + (currentTimeMillis2 - currentTimeMillis) + ", adCount=" + list.size() + ", delCount=" + arrayList.size());
        SnsMethodCalculate.markEndTimeMs("getDelAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        return arrayList;
    }

    /* renamed from: f */
    public static boolean m129897f() {
        SnsMethodCalculate.markStartTimeMs("isDelConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        boolean z = true;
        try {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_consecutive_del_by_time, 0);
            Log.m105924i("ConsecutiveAdDataImproveHelper", "isDelConsecutiveAdByTime, exptValue=" + Qe);
            if (Qe <= 0) {
                z = false;
            }
            SnsMethodCalculate.markEndTimeMs("isDelConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return z;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("isDelConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return true;
        }
    }

    /* renamed from: g */
    public static boolean m129898g() {
        SnsMethodCalculate.markStartTimeMs("isFilterValue", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        SnsMethodCalculate.markStartTimeMs("isStrictDebugEnv", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z = false;
        boolean z2 = BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG;
        SnsMethodCalculate.markEndTimeMs("isStrictDebugEnv", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (z2) {
            SnsMethodCalculate.markStartTimeMs("isDebugDelConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            if (C79758p.f233760a.mo109883f(new C99414b()) == 1) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isDebugDelConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            Log.m105918d("ConsecutiveAdDataImproveHelper", "debug Env, cfg=" + z);
            SnsMethodCalculate.markEndTimeMs("isFilterValue", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return z;
        }
        SnsMethodCalculate.markEndTimeMs("isFilterValue", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        return true;
    }
}
