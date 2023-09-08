package lo2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kr0.C88262c1;
import kr0.C88273g1;
import kr0.C88274h0;
import ps2.C100894u;
import qs2.C101255a0;
import qs2.C101263e0;
import qs2.C101277l;
import so2.C101675j;
import u24.C90599h;

/* renamed from: lo2.a0 */
public final class C99520a0 {

    /* renamed from: a */
    public static HashSet<String> f291755a = new HashSet<>();

    /* renamed from: lo2.a0$a */
    public static class C99521a {

        /* renamed from: a */
        public String f291756a;

        /* renamed from: b */
        public String f291757b;

        /* renamed from: c */
        public int f291758c;

        public C99521a(String str, String str2, int i) {
            this.f291756a = str;
            this.f291757b = str2;
            this.f291758c = i;
        }

        public boolean equals(Object obj) {
            SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$WeAppInfo");
            if (this == obj) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$WeAppInfo");
                return true;
            }
            if (obj instanceof C99521a) {
                C99521a aVar = (C99521a) obj;
                if (this.f291758c == aVar.f291758c && C90599h.m113509b(this.f291756a, aVar.f291756a) && C90599h.m113509b(this.f291757b, aVar.f291757b)) {
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$WeAppInfo");
                    return true;
                }
            }
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$WeAppInfo");
            return false;
        }

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$WeAppInfo");
            String str = this.f291756a + "|" + this.f291758c + "|" + this.f291757b;
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$WeAppInfo");
            return str;
        }
    }

    /* renamed from: a */
    public static void m129871a(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("doPreloadWeAppPkg", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("doPreloadWeAppPkg", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
            return;
        }
        String str3 = str + "_" + str2;
        synchronized (f291755a) {
            try {
                if (f291755a.contains(str3)) {
                    Log.m105928w("AdWeAppPreloader", "doPreloadWeAppPkg, already preloaded, key=" + str3);
                    SnsMethodCalculate.markEndTimeMs("doPreloadWeAppPkg", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
                    return;
                }
                f291755a.add(str3);
                Log.m105924i("AdWeAppPreloader", "doPreloadWeAppPkg, key=" + str3);
                ((C88262c1) C86312j.m106911c(C88262c1.class)).mo113581Re(str, (String) null, str2, 5);
                C115669n.INSTANCE.mo175911u(1612, 45);
                SnsMethodCalculate.markEndTimeMs("doPreloadWeAppPkg", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("doPreloadWeAppPkg", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
                    throw th;
                }
            }
        }
    }

    /* renamed from: b */
    public static C99521a m129872b(C101255a0 a0Var) {
        C101277l lVar;
        SnsMethodCalculate.markStartTimeMs("getWeAppInfoFromComponent", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        if (!(a0Var instanceof C101277l) || (lVar = (C101277l) a0Var) == null || TextUtils.isEmpty(lVar.f296649Z)) {
            SnsMethodCalculate.markEndTimeMs("getWeAppInfoFromComponent", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
            return null;
        }
        C99521a aVar = new C99521a(lVar.f296649Z, lVar.f296650a0, lVar.f296651b0);
        SnsMethodCalculate.markEndTimeMs("getWeAppInfoFromComponent", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        return aVar;
    }

    /* renamed from: c */
    public static void m129873c(C101255a0 a0Var, ArrayList<C99521a> arrayList) {
        SnsMethodCalculate.markStartTimeMs("parseComponentWeAppInfo", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        C99521a aVar = null;
        try {
            if (C100894u.m132237q(a0Var.f296505k)) {
                List<C101255a0> a = a0Var.mo140732a();
                if (a != null) {
                    for (C101255a0 c : a) {
                        m129873c(c, arrayList);
                    }
                }
            } else {
                aVar = a0Var instanceof C101263e0 ? m129872b(((C101263e0) a0Var).f296572K) : a0Var instanceof C101675j ? m129872b(((C101675j) a0Var).f297627C) : m129872b(a0Var);
            }
            if (aVar != null && !arrayList.contains(aVar)) {
                arrayList.add(aVar);
            }
            Log.m105918d("AdWeAppPreloader", "parseComponentWeAppInfo, type=" + a0Var.f296505k + ", subType=" + a0Var.f296504j + ", size=" + arrayList.size());
        } catch (Throwable th) {
            Log.m105920e("AdWeAppPreloader", "parseComponentWeAppInfo exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("parseComponentWeAppInfo", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
    }

    /* renamed from: d */
    public static void m129874d(List<C99521a> list, boolean z, boolean z2, boolean z3) {
        String str;
        Class cls = C88274h0.class;
        C88273g1 g1Var = C88273g1.SNS_AD;
        SnsMethodCalculate.markStartTimeMs("startPreloadWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        if (list == null || list.isEmpty()) {
            Log.m105928w("AdWeAppPreloader", "startPreloadWeApp, list is empty");
            SnsMethodCalculate.markEndTimeMs("startPreloadWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C99521a next : list) {
            if (!TextUtils.isEmpty(next.f291756a) && !arrayList.contains(next.f291756a)) {
                arrayList.add(next.f291756a);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("startPreloadWeApp, preloadWeAppPkg=");
        sb.append(z);
        sb.append(", hasWeGame=");
        sb.append(z2);
        sb.append(", hasWeApp=");
        sb.append(z3);
        sb.append(", weAppUserName=");
        SnsMethodCalculate.markStartTimeMs("list2Str", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        if (arrayList.size() > 0) {
            str = C90599h.m113512e(arrayList, ",");
            SnsMethodCalculate.markEndTimeMs("list2Str", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
        } else {
            SnsMethodCalculate.markEndTimeMs("list2Str", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
            str = "";
        }
        sb.append(str);
        Log.m105924i("AdWeAppPreloader", sb.toString());
        if (z3) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                ((C88274h0) C86312j.m106911c(cls)).mo113299AC(g1Var);
                Log.m105924i("AdWeAppPreloader", "startPreloadWeApp->preloadEnvForMiniProgram, timeCost=" + (System.currentTimeMillis() - currentTimeMillis));
            } catch (Throwable th) {
                Log.m105920e("AdWeAppPreloader", "startPreloadWeApp->preloadEnvForMiniProgram, exp=" + th.toString());
            }
        }
        if (z2) {
            try {
                long currentTimeMillis2 = System.currentTimeMillis();
                ((C88274h0) C86312j.m106911c(cls)).mo113303QK(g1Var);
                Log.m105924i("AdWeAppPreloader", "startPreloadWeApp->preloadEnvForMiniGame, timeCost=" + (System.currentTimeMillis() - currentTimeMillis2));
            } catch (Throwable th4) {
                Log.m105920e("AdWeAppPreloader", "startPreloadWeApp->preloadEnvForMiniGame, exp=" + th4.toString());
            }
        }
        try {
            long currentTimeMillis3 = System.currentTimeMillis();
            ((C88262c1) C86312j.m106911c(C88262c1.class)).S60(arrayList, g1Var);
            Log.m105924i("AdWeAppPreloader", "startPreloadWeApp->batchSyncWxaAttr, timeCost=" + (System.currentTimeMillis() - currentTimeMillis3));
        } catch (Throwable th5) {
            Log.m105920e("AdWeAppPreloader", "startPreloadWeApp->batchSyncWxaAttr, exp=" + th5.toString());
        }
        if (z) {
            try {
                long currentTimeMillis4 = System.currentTimeMillis();
                for (C99521a next2 : list) {
                    m129871a(next2.f291756a, next2.f291757b);
                }
                Log.m105924i("AdWeAppPreloader", "startPreloadWeApp->preloadWeAppPkg, timeCost=" + (System.currentTimeMillis() - currentTimeMillis4));
            } catch (Throwable th6) {
                Log.m105920e("AdWeAppPreloader", "startPreloadWeApp->preloadWeAppPkg, exp=" + th6.toString());
            }
        }
        SnsMethodCalculate.markEndTimeMs("startPreloadWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
    }
}
