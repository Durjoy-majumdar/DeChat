package hp2;

import android.app.Activity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import qs2.C101271i0;

/* renamed from: hp2.a */
public final class C87577a {

    /* renamed from: a */
    public final Activity f253669a;

    /* renamed from: b */
    public final C101271i0 f253670b;

    public C87577a(Activity activity, C101271i0 i0Var) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(i0Var, "pageData");
        this.f253669a = activity;
        this.f253670b = i0Var;
    }

    /* renamed from: a */
    public final Activity mo122022a() {
        SnsMethodCalculate.markStartTimeMs("getActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.JsApiEnv");
        Activity activity = this.f253669a;
        SnsMethodCalculate.markEndTimeMs("getActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.JsApiEnv");
        return activity;
    }

    /* renamed from: b */
    public final C101271i0 mo122023b() {
        SnsMethodCalculate.markStartTimeMs("getPageData", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.JsApiEnv");
        C101271i0 i0Var = this.f253670b;
        SnsMethodCalculate.markEndTimeMs("getPageData", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.JsApiEnv");
        return i0Var;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.JsApiEnv");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.JsApiEnv");
            return true;
        } else if (!(obj instanceof C87577a)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.JsApiEnv");
            return false;
        } else {
            C87577a aVar = (C87577a) obj;
            if (!C87412m.m108589b(this.f253669a, aVar.f253669a)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.JsApiEnv");
                return false;
            }
            boolean b = C87412m.m108589b(this.f253670b, aVar.f253670b);
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.JsApiEnv");
            return b;
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.JsApiEnv");
        int hashCode = (this.f253669a.hashCode() * 31) + this.f253670b.hashCode();
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.JsApiEnv");
        return hashCode;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.JsApiEnv");
        String str = "JsApiEnv(activity=" + this.f253669a + ", pageData=" + this.f253670b + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.JsApiEnv");
        return str;
    }
}
