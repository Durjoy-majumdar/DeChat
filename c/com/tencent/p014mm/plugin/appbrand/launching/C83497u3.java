package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C29182a4;
import com.tencent.p014mm.plugin.appbrand.appcache.C81240e1;
import com.tencent.p014mm.plugin.appbrand.appcache.C81245g1;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.launching.C83362l1;
import com.tencent.p014mm.plugin.appbrand.launching.C83466t2;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import te3.C90422jy;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.u3 */
public class C83497u3 extends C83448q3<WxaPkgWrappingInfo> {

    /* renamed from: h */
    public final String f243966h;

    /* renamed from: i */
    public final int f243967i;

    /* renamed from: j */
    public final WxaAttributes.WxaVersionInfo f243968j;

    /* renamed from: n */
    public final C83362l1 f243969n;

    /* renamed from: o */
    public final QualitySession f243970o;

    /* renamed from: p */
    public volatile boolean f243971p = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.u3$a */
    public class C83498a extends C83399o2 {
        public C83498a(String str, int i, boolean z, String str2, String str3, WxaAttributes.WxaVersionInfo wxaVersionInfo, ICommLibReader iCommLibReader, QualitySession qualitySession, C90422jy jyVar) {
            super(str, i, z, str2, str3, wxaVersionInfo, iCommLibReader, qualitySession, jyVar);
        }

        /* renamed from: b */
        public void mo115673b(int i) {
            C83497u3.this.mo115623i(i);
        }

        /* renamed from: c */
        public void mo115674c() {
            C83497u3.this.mo115624j();
        }
    }

    public C83497u3(String str, int i, String str2, String str3, int i2, WxaAttributes.WxaVersionInfo wxaVersionInfo, boolean z, ICommLibReader iCommLibReader, QualitySession qualitySession, C80247h hVar, boolean z2) {
        this.f243966h = str;
        this.f243967i = i;
        this.f243970o = qualitySession;
        this.f243968j = wxaVersionInfo;
        C90422jy jyVar = new C90422jy();
        jyVar.f259639d = i2;
        jyVar.f259641f = z2 ? 102 : 101;
        hVar.mo111350a(jyVar);
        this.f243969n = new C83498a(str, i, z, str2, str3, wxaVersionInfo, iCommLibReader, qualitySession, jyVar);
    }

    /* renamed from: f */
    public String mo115591f() {
        return "MicroMsg.AppBrand.PrepareStepCheckAppPkgWrapper";
    }

    /* renamed from: g */
    public final void mo115733g(boolean z) {
        this.f243860g = z;
        C83362l1 l1Var = this.f243969n;
        if (l1Var instanceof C83362l1.C83363a) {
            ((C83362l1.C83363a) l1Var).mo115635a(z);
        } else if (l1Var instanceof C83448q3) {
            ((C83448q3) l1Var).mo115733g(z);
        }
    }

    /* renamed from: h */
    public WxaPkgWrappingInfo call() {
        long nowMilliSecond = Util.nowMilliSecond();
        if (C81289m.C81290a.m99664b(this.f243967i)) {
            WxaAttributes.WxaVersionInfo wxaVersionInfo = this.f243968j;
            if (wxaVersionInfo.f239449B >= 0 && wxaVersionInfo.f239452d > 0) {
                String str = this.f243966h;
                WxaAttributes.WxaVersionInfo wxaVersionInfo2 = this.f243968j;
                ((C29182a4) C81161g2.Bx0(C29182a4.class)).mo56498Lo(str, wxaVersionInfo2.f239452d, wxaVersionInfo2.f239449B);
            }
        }
        WxaPkgWrappingInfo wxaPkgWrappingInfo = (WxaPkgWrappingInfo) ((C83399o2) this.f243969n).call();
        long nowMilliSecond2 = Util.nowMilliSecond();
        if (wxaPkgWrappingInfo != null) {
            if (this.f243971p) {
                C83226n.m102129f(this.f243966h, KSProcessWeAppLaunch.stepPrepareResourceSubProcessCodePkg_Download, "", nowMilliSecond, nowMilliSecond2);
            } else {
                C83226n.m102129f(this.f243966h, KSProcessWeAppLaunch.stepPrepareResourceSubProcessCodePkg_DB, "", nowMilliSecond, nowMilliSecond2);
            }
        } else if (this.f243971p) {
            C83226n.m102127d(this.f243966h, KSProcessWeAppLaunch.stepPrepareResourceSubProcessCodePkg_Download, "", "", nowMilliSecond, nowMilliSecond2);
        } else {
            C83226n.m102127d(this.f243966h, KSProcessWeAppLaunch.stepPrepareResourceSubProcessCodePkg_DB, "", "", nowMilliSecond, nowMilliSecond2);
        }
        try {
            C83466t2.C83467b.m102429a(this.f243970o.f245832d, wxaPkgWrappingInfo != null, nowMilliSecond2 - nowMilliSecond);
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.AppBrand.PrepareStepCheckAppPkgWrapper", "call() reportUpdateResultAfterVersionFallbackIfNeed get exception %s", th);
        }
        return wxaPkgWrappingInfo;
    }

    /* renamed from: i */
    public void mo115623i(int i) {
    }

    /* renamed from: j */
    public void mo115624j() {
        this.f243971p = true;
        if (C81289m.C81290a.m99664b(this.f243967i) && !C81245g1.f238643a) {
            C81245g1.f238643a = true;
            ((C119157j) C119157j.f356862d).mo183875f(new C81240e1());
        }
    }
}
