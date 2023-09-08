package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.appbrand.task.C84331q;
import com.tencent.p014mm.plugin.appbrand.task.C84343y;
import com.tencent.p014mm.plugin.report.service.C115669n;
import junit.framework.Assert;
import kk0.C88178e;

/* renamed from: com.tencent.mm.plugin.appbrand.m1 */
public class C83606m1 {

    /* renamed from: a */
    public long[] f244175a;

    /* renamed from: b */
    public int f244176b;

    /* renamed from: c */
    public int f244177c;

    /* renamed from: d */
    public int f244178d;

    /* renamed from: e */
    public int f244179e;

    /* renamed from: f */
    public int f244180f;

    /* renamed from: g */
    public int f244181g;

    /* renamed from: h */
    public boolean f244182h;

    /* renamed from: i */
    public boolean f244183i;

    /* renamed from: j */
    public int f244184j;

    public C83606m1() {
        this.f244180f = 0;
        this.f244181g = 0;
        this.f244175a = new long[15];
        this.f244181g = C84331q.m103957l(C84343y.WAGAME) ? 1 : 0;
        this.f244180f = C84331q.m103957l(C84343y.WASERVICE) ? 1 : 0;
    }

    /* renamed from: a */
    public static void m102637a(String str, int i, WxaAttributes.WxaVersionInfo wxaVersionInfo, boolean z, int i2) {
        int i3 = 0;
        Assert.assertTrue(i2 <= 120 && i2 >= 101);
        if (C81289m.C81290a.m99664b(i)) {
            i3 = wxaVersionInfo.f239452d;
        }
        m102639c(i2, str, i3, i, z);
    }

    /* renamed from: b */
    public static void m102638b(int i, AppBrandInitConfigWC appBrandInitConfigWC) {
        if (appBrandInitConfigWC != null) {
            m102639c(i, appBrandInitConfigWC.f239362d, appBrandInitConfigWC.f234802F, appBrandInitConfigWC.f239365g, appBrandInitConfigWC.mo111300k());
        }
    }

    /* renamed from: c */
    public static void m102639c(int i, String str, int i2, int i3, boolean z) {
        int i4 = z ? C88178e.CTRL_INDEX : 369;
        try {
            C115669n.INSTANCE.idkeyStat((long) i4, (long) i, 1, false);
            C84240s.m103843i(str, i2, i3, i4, i, 1);
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public final void mo115917d(String str, int i, int i2, int i3) {
        C115669n.INSTANCE.mo160131h(13886, str, Integer.valueOf(this.f244176b), Integer.valueOf(this.f244177c), Integer.valueOf(i), "", "", Long.valueOf(this.f244175a[i2]), Integer.valueOf(this.f244178d), Integer.valueOf(this.f244184j == 1 ? this.f244181g : this.f244180f), Integer.valueOf(this.f244179e), Integer.valueOf(this.f244182h ? 1 : 0), Integer.valueOf(this.f244183i ? 1 : 0), Integer.valueOf(i3), 0, 0, 0, Integer.valueOf(this.f244184j));
    }

    /* renamed from: e */
    public void mo115918e(int i, long j) {
        long[] jArr = this.f244175a;
        if (i < jArr.length && jArr[i] == 0) {
            jArr[i] = j;
        }
    }
}
