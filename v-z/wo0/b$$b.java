package wo0;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appusage.C29362c0;
import com.tencent.p014mm.plugin.appbrand.appusage.C29384r;
import com.tencent.p014mm.plugin.appbrand.appusage.C81477d0;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.launching.cgi.CgiLaunchWxaApp;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;

public final /* synthetic */ class b$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CgiLaunchWxaApp f100997d;

    /* renamed from: e */
    public final /* synthetic */ boolean f100998e;

    public /* synthetic */ b$$b(CgiLaunchWxaApp cgiLaunchWxaApp, boolean z) {
        this.f100997d = cgiLaunchWxaApp;
        this.f100998e = z;
    }

    public final void run() {
        CgiLaunchWxaApp cgiLaunchWxaApp = this.f100997d;
        boolean z = this.f100998e;
        cgiLaunchWxaApp.getClass();
        C29384r rVar = (C29384r) C81161g2.Bx0(C29384r.class);
        String f = C81661j.m100181f(cgiLaunchWxaApp.mo115601r());
        rVar.getClass();
        rVar.mo56652qq(f, Util.nowSecond());
        if (!z) {
            C81477d0 d0Var = (C81477d0) C81161g2.Bx0(C81477d0.class);
            String r = cgiLaunchWxaApp.mo115601r();
            d0Var.getClass();
            C87412m.m108594g(r, "appId");
            long nowSecond = Util.nowSecond();
            C29362c0 c0Var = new C29362c0();
            c0Var.field_appId = r;
            boolean z2 = d0Var.get(c0Var, new String[0]);
            c0Var.field_lastLaunchTime = nowSecond;
            if (z2) {
                d0Var.update(c0Var, new String[0]);
            }
        }
    }
}
