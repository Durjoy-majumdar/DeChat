package xn0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83108g;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.report.service.C115669n;

/* renamed from: xn0.k */
public final class C91302k implements C83108g {

    /* renamed from: a */
    public final /* synthetic */ C91304m f261896a;

    public C91302k(C91304m mVar) {
        this.f261896a = mVar;
    }

    /* renamed from: a */
    public void mo115359a(int i, int i2) {
        C115669n.INSTANCE.mo175911u(i, i2);
        try {
            C91304m mVar = this.f261896a;
            AppBrandRuntimeWC appBrandRuntimeWC = mVar.f261899d;
            C84240s.m103843i(mVar.getAppId(), appBrandRuntimeWC.mo113210l1().f234802F, appBrandRuntimeWC.f238149o.f239365g, i, i2, 1);
        } catch (NullPointerException unused) {
        }
    }
}
