package or0;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager;
import com.tencent.p014mm.plugin.report.service.C115669n;

/* renamed from: or0.q */
public final class C11735q<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f34341d;

    /* renamed from: e */
    public final /* synthetic */ C83928t1 f34342e;

    /* renamed from: f */
    public final /* synthetic */ String f34343f;

    public C11735q(AppBrandRuntimeWC appBrandRuntimeWC, C83928t1 t1Var, String str) {
        this.f34341d = appBrandRuntimeWC;
        this.f34342e = t1Var;
        this.f34343f = str;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        WxaShortLinkRiskManager.UploadResult uploadResult = (WxaShortLinkRiskManager.UploadResult) obj;
        if (uploadResult.f11880d) {
            int i = this.f34341d.f238149o.f239365g;
            C115669n.INSTANCE.mo160128e(21830, true, true, true, this.f34342e.getAppId(), Integer.valueOf(this.f34341d.mo121252j1()), Integer.valueOf(i != 0 ? i != 1 ? i != 2 ? 0 : 3 : 2 : 1), this.f34343f, uploadResult.f11881e, this.f34342e.mo116163R0(), this.f34342e.mo116156K0());
        }
    }
}
