package qs2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import mp2.C34628a;
import vr2.C102236a0;

/* renamed from: qs2.i0 */
public class C101271i0 {

    /* renamed from: a */
    public int f296616a;

    /* renamed from: b */
    public int f296617b;

    /* renamed from: c */
    public boolean f296618c;

    /* renamed from: d */
    public String f296619d;

    /* renamed from: e */
    public String f296620e;

    /* renamed from: f */
    public String f296621f;

    /* renamed from: g */
    public int f296622g;

    /* renamed from: h */
    public String f296623h;

    /* renamed from: i */
    public String f296624i;

    /* renamed from: j */
    public String f296625j;

    /* renamed from: k */
    public boolean f296626k = false;

    /* renamed from: l */
    public String f296627l;

    /* renamed from: m */
    public String f296628m;

    /* renamed from: n */
    public String f296629n;

    /* renamed from: o */
    public String f296630o;

    /* renamed from: p */
    public String f296631p;

    /* renamed from: q */
    public long f296632q = 0;

    /* renamed from: r */
    public String f296633r = "";

    /* renamed from: s */
    public String f296634s = "";

    /* renamed from: t */
    public String f296635t;

    /* renamed from: u */
    public Map<String, String> f296636u = new HashMap();

    /* renamed from: v */
    public boolean f296637v;

    /* renamed from: w */
    public boolean f296638w;

    /* renamed from: a */
    public String mo140734a() {
        SnsMethodCalculate.markStartTimeMs("getAdExtInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        String str = this.f296631p;
        SnsMethodCalculate.markEndTimeMs("getAdExtInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        return str;
    }

    /* renamed from: b */
    public String mo140735b() {
        SnsMethodCalculate.markStartTimeMs("getAid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        String str = this.f296623h;
        SnsMethodCalculate.markEndTimeMs("getAid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        return str;
    }

    /* renamed from: c */
    public int mo140736c() {
        SnsMethodCalculate.markStartTimeMs("getBizId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        int i = this.f296622g;
        SnsMethodCalculate.markEndTimeMs("getBizId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        return i;
    }

    /* renamed from: d */
    public String mo140737d() {
        SnsMethodCalculate.markStartTimeMs("getCanvasId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        String str = this.f296625j;
        SnsMethodCalculate.markEndTimeMs("getCanvasId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        return str;
    }

    /* renamed from: e */
    public int mo140738e() {
        SnsMethodCalculate.markStartTimeMs("getOriginScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        int i = this.f296616a;
        SnsMethodCalculate.markEndTimeMs("getOriginScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        return i;
    }

    /* renamed from: f */
    public String mo140739f() {
        SnsMethodCalculate.markStartTimeMs("getPageId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        String str = this.f296635t;
        SnsMethodCalculate.markEndTimeMs("getPageId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        return str;
    }

    /* renamed from: g */
    public String mo140740g() {
        SnsMethodCalculate.markStartTimeMs("getRawSnsId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        String str = this.f296628m;
        SnsMethodCalculate.markEndTimeMs("getRawSnsId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        return str;
    }

    /* renamed from: h */
    public String mo140741h() {
        SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        String str = this.f296627l;
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
            return "";
        }
        SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        return str;
    }

    /* renamed from: i */
    public int mo140742i() {
        SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        int i = this.f296617b;
        SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        return i;
    }

    /* renamed from: j */
    public String mo140743j() {
        SnsMethodCalculate.markStartTimeMs("getTraceId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        String str = this.f296624i;
        SnsMethodCalculate.markEndTimeMs("getTraceId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        return str;
    }

    /* renamed from: k */
    public String mo140744k() {
        SnsMethodCalculate.markStartTimeMs("getUpdatedUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        if (C34628a.m40410c(mo140742i())) {
            if (TextUtils.isEmpty(this.f296620e)) {
                Log.m105920e("AdLandingPageData", "getUpdatedUxInfo is empty");
                SnsMethodCalculate.markStartTimeMs("getOutExtraParam", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                String str = this.f296633r;
                SnsMethodCalculate.markEndTimeMs("getOutExtraParam", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                C34628a.m40411d(str, 10);
            } else {
                SnsMethodCalculate.markStartTimeMs("getOutExtraParam", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                String str2 = this.f296633r;
                SnsMethodCalculate.markEndTimeMs("getOutExtraParam", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                C34628a.m40411d(str2, 9);
            }
        }
        String str3 = this.f296620e;
        SnsMethodCalculate.markEndTimeMs("getUpdatedUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        return str3;
    }

    /* renamed from: l */
    public String mo140745l() {
        SnsMethodCalculate.markStartTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        String str = this.f296619d;
        SnsMethodCalculate.markEndTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        return str;
    }

    /* renamed from: m */
    public String mo140746m() {
        SnsMethodCalculate.markStartTimeMs("getpId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        String str = this.f296634s;
        SnsMethodCalculate.markEndTimeMs("getpId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        return str;
    }

    /* renamed from: n */
    public boolean mo140747n() {
        SnsMethodCalculate.markStartTimeMs("isHalfScreenMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        boolean z = this.f296637v;
        SnsMethodCalculate.markEndTimeMs("isHalfScreenMode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        return z;
    }

    /* renamed from: o */
    public void mo140748o(String str) {
        SnsMethodCalculate.markStartTimeMs("setSnsId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        this.f296627l = str;
        try {
            if (TextUtils.isEmpty(str) || !str.startsWith("-")) {
                this.f296628m = str;
            } else {
                this.f296628m = C102236a0.m134765q0(Util.safeParseLong(str));
            }
            Log.m105924i("AdLandingPageData", "setSnsId, snsId=" + str + ", rawSnsId=" + this.f296628m);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("setSnsId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
    }
}
