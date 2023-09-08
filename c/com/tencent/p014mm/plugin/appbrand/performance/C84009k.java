package com.tencent.p014mm.plugin.appbrand.performance;

import android.webkit.JavascriptInterface;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C55548a;
import com.tencent.p014mm.plugin.appbrand.report.C84106b0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.xwalk.core.XWalkEnvironment;
import p206nj.C117627q;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.performance.k */
public class C84009k implements C84003h {

    /* renamed from: a */
    public final String f245258a;

    /* renamed from: b */
    public final C83928t1 f245259b;

    /* renamed from: c */
    public String f245260c;

    /* renamed from: d */
    public int f245261d = -1;

    /* renamed from: e */
    public String f245262e;

    /* renamed from: com.tencent.mm.plugin.appbrand.performance.k$a */
    public class C84010a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f245263d;

        public C84010a(long j) {
            this.f245263d = j;
        }

        public void run() {
            C84009k kVar = C84009k.this;
            long j = this.f245263d;
            String str = kVar.f245258a;
            kVar.getClass();
            int i = (j > 60 ? 1 : (j == 60 ? 0 : -1));
            int i2 = i <= 0 ? 1 : (i <= 0 || j > 80) ? (j <= 80 || j > 100) ? (j <= 100 || j > 300) ? (j <= 300 || j > 600) ? (j <= 600 || j > 1000) ? 7 : 6 : 5 : 4 : 3 : 2;
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175911u(1246, i2);
            nVar.mo175911u(1246, 0);
            String str2 = "";
            if (kVar.f245259b != null) {
                if (Util.isNullOrNil(kVar.f245260c)) {
                    ICommLibReader O1 = kVar.f245259b.getRuntime() != null ? kVar.f245259b.getRuntime().mo113184O1(false) : WxaCommLibRuntimeReader.m99498b();
                    if (O1 != null) {
                        kVar.f245260c = O1.mo113377i();
                    }
                }
                if (kVar.f245261d < 0) {
                    int ordinal = C84106b0.m103652a(kVar.f245259b).ordinal();
                    if (ordinal == 0) {
                        kVar.f245261d = 2;
                    } else if (ordinal == 1) {
                        kVar.f245261d = 4;
                    } else if (ordinal == 2) {
                        kVar.f245261d = 3;
                    } else if (ordinal != 3) {
                        kVar.f245261d = -1;
                    } else {
                        kVar.f245261d = 5;
                    }
                }
                if (kVar.f245261d == 3) {
                    kVar.f245262e = XWalkEnvironment.getAvailableVersion() + str2;
                }
            }
            C83928t1 t1Var = kVar.f245259b;
            if (!(t1Var == null || t1Var.getRuntime() == null)) {
                str2 = C117627q.m165908a(Util.nullAsNil(kVar.f245259b.getRuntime().mo113177I1()));
            }
            String format = String.format("%d,%s,%s,%s,%d,%s", new Object[]{Long.valueOf(j), str, str2, kVar.f245260c, Integer.valueOf(kVar.f245261d), kVar.f245262e});
            C55548a.f158170a.mo77078b(18794, format);
            Log.m105927v("MicroMsg.PageLongTaskReporterWC", "doReport %s", format);
        }
    }

    public C84009k(C83928t1 t1Var) {
        this.f245258a = t1Var.getAppId();
        this.f245259b = t1Var;
    }

    @JavascriptInterface
    public void notifyLongTask(long j) {
        ((C119157j) C119157j.f356862d).mo183876g(new C84010a(j), "PageLongTaskReporter");
    }
}
