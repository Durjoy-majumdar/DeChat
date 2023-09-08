package com.tencent.p014mm.plugin.appbrand.report;

import br0.C79773b;
import com.tencent.maas.instamovie.MJTextResolver;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppVideoCastStruct;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p224ra.C12964b;
import qo0.C89727c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.report.a0 */
public final class C84099a0 implements C89727c, C12964b {

    /* renamed from: d */
    public boolean f245543d;

    /* renamed from: e */
    public String f245544e = "";

    /* renamed from: f */
    public String f245545f = "";

    /* renamed from: g */
    public String f245546g = "";

    /* renamed from: com.tencent.mm.plugin.appbrand.report.a0$a */
    public static final class C84100a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C84099a0 f245547d;

        /* renamed from: e */
        public final /* synthetic */ int f245548e;

        public C84100a(C84099a0 a0Var, int i) {
            this.f245547d = a0Var;
            this.f245548e = i;
        }

        public final void run() {
            try {
                C84099a0.m103646a(this.f245547d, this.f245548e).mo86054n();
            } catch (Exception e) {
                Log.m105918d("AppBrandVideoCastReportHelperWC", "catch: " + e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.a0$b */
    public static final class C84101b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C84099a0 f245549d;

        /* renamed from: e */
        public final /* synthetic */ int f245550e;

        /* renamed from: f */
        public final /* synthetic */ int f245551f;

        public C84101b(C84099a0 a0Var, int i, int i2) {
            this.f245549d = a0Var;
            this.f245550e = i;
            this.f245551f = i2;
        }

        public final void run() {
            try {
                WeAppVideoCastStruct a = C84099a0.m103646a(this.f245549d, this.f245550e);
                a.f237380j = (long) this.f245551f;
                a.mo86054n();
            } catch (Exception e) {
                Log.m105918d("AppBrandVideoCastReportHelperWC", "catch: " + e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.a0$c */
    public static final class C84102c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C84099a0 f245552d;

        /* renamed from: e */
        public final /* synthetic */ int f245553e;

        /* renamed from: f */
        public final /* synthetic */ boolean f245554f;

        /* renamed from: g */
        public final /* synthetic */ String f245555g;

        /* renamed from: h */
        public final /* synthetic */ String f245556h;

        public C84102c(C84099a0 a0Var, int i, boolean z, String str, String str2) {
            this.f245552d = a0Var;
            this.f245553e = i;
            this.f245554f = z;
            this.f245555g = str;
            this.f245556h = str2;
        }

        public final void run() {
            try {
                WeAppVideoCastStruct a = C84099a0.m103646a(this.f245552d, this.f245553e);
                boolean z = this.f245554f;
                String str = this.f245555g;
                String str2 = this.f245556h;
                a.f237381k = z ? 1 : 0;
                a.f237383m = a.mo86045b("ModelName", str, true);
                a.f237384n = a.mo86045b("ManuFacturer", str2, true);
                a.mo86054n();
            } catch (Exception e) {
                Log.m105918d("AppBrandVideoCastReportHelperWC", "catch: " + e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.a0$d */
    public static final class C84103d extends C79773b {

        /* renamed from: d */
        public final /* synthetic */ C84099a0 f245557d;

        public C84103d(C84099a0 a0Var) {
            this.f245557d = a0Var;
        }

        /* renamed from: e */
        public void mo109900e() {
            this.f245557d.f245543d = true;
        }

        /* renamed from: f */
        public void mo109901f() {
            this.f245557d.f245543d = false;
        }
    }

    /* renamed from: a */
    public static final WeAppVideoCastStruct m103646a(C84099a0 a0Var, int i) {
        a0Var.getClass();
        WeAppVideoCastStruct weAppVideoCastStruct = new WeAppVideoCastStruct();
        weAppVideoCastStruct.f237374d = weAppVideoCastStruct.mo86045b("AppId", a0Var.f245545f, true);
        WxaAttributes mL = C81161g2.Cx0().mo114011mL(weAppVideoCastStruct.f237374d, "appInfo");
        if (mL != null) {
            weAppVideoCastStruct.f237375e = ((long) mL.mo113940m2().f239488d) + 1000;
        }
        weAppVideoCastStruct.f237379i = (long) i;
        long currentTimeMillis = System.currentTimeMillis();
        weAppVideoCastStruct.f237376f = currentTimeMillis;
        weAppVideoCastStruct.mo86046c("EventTimeMs", currentTimeMillis);
        weAppVideoCastStruct.f237378h = weAppVideoCastStruct.mo86045b("VideoUrl", a0Var.f245544e, true);
        weAppVideoCastStruct.f237377g = weAppVideoCastStruct.mo86045b("PagePath", a0Var.f245546g, true);
        weAppVideoCastStruct.f237385o = a0Var.f245543d ? 2 : 1;
        return weAppVideoCastStruct;
    }

    /* renamed from: FG */
    public C79773b mo116771FG() {
        return new C84103d(this);
    }

    public void Wp0(int i, int i2) {
        ((C119157j) C119157j.f356862d).mo183875f(new C84101b(this, i2, i));
    }

    /* renamed from: dA */
    public void mo116773dA(boolean z, String str, String str2, int i) {
        C87412m.m108594g(str, MJTextResolver.KEY_DEVICE_NAME);
        C87412m.m108594g(str2, "manufactureName");
        ((C119157j) C119157j.f356862d).mo183875f(new C84102c(this, i, z, str, str2));
    }

    /* renamed from: es */
    public void mo116774es(int i) {
        ((C119157j) C119157j.f356862d).mo183875f(new C84100a(this, i));
    }

    public void setAppId(String str) {
        C87412m.m108594g(str, "appId");
        this.f245545f = str;
    }

    public void setVideoPath(String str) {
        C87412m.m108594g(str, "path");
        this.f245544e = str;
    }

    public void wl0(String str) {
        C87412m.m108594g(str, "pagePath");
        this.f245546g = str;
    }
}
