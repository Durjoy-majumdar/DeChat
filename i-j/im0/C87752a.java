package im0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import wt0.C91110d;

/* renamed from: im0.a */
public class C87752a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f254044d;

    /* renamed from: e */
    public final /* synthetic */ int f254045e;

    /* renamed from: f */
    public final /* synthetic */ C87753b f254046f;

    public C87752a(C87753b bVar, C81925i2 i2Var, int i) {
        this.f254046f = bVar;
        this.f254044d = i2Var;
        this.f254045e = i;
    }

    public void run() {
        C83849m0 m0Var;
        C87753b bVar = this.f254046f;
        C81925i2 i2Var = this.f254044d;
        int i = this.f254045e;
        bVar.getClass();
        try {
            m0Var = i2Var.getRuntime().mo113042Z();
        } catch (Throwable unused) {
            m0Var = null;
        }
        if (m0Var == null) {
            Log.m105920e("MicroMsg.JsApiHideToast", "hideToast uiThread NULL page");
            i2Var.mo109647a(i, bVar.mo115109j("fail:page don't exist"));
            return;
        }
        try {
            AppBrandRuntime runtime = i2Var.getRuntime();
            boolean z = false;
            if (runtime != null) {
                if (C2039g2.m1987a()) {
                    C91110d.C91113c cVar = (C91110d.C91113c) runtime.mo113032U(C91110d.C91113c.class);
                    if (cVar != null) {
                        boolean z2 = false;
                        while (!cVar.f261307d.isEmpty()) {
                            z2 |= cVar.f261307d.poll().f244570T.mo125168b(false);
                        }
                        z = z2;
                    }
                } else {
                    throw new RuntimeException("Should be called on main-thread");
                }
            }
            if (z) {
                i2Var.mo109647a(i, bVar.mo115109j("ok"));
            } else {
                i2Var.mo109647a(i, bVar.mo115109j("fail:toast can't be found"));
            }
        } catch (Throwable unused2) {
            i2Var.mo109647a(i, bVar.mo115109j("fail:internal error"));
        }
    }
}
