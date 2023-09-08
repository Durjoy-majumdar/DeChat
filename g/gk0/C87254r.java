package gk0;

import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import lp3.C46888b;
import rx3.C13598b0;
import zq0.C91870f;
import zq0.C91891k0;

/* renamed from: gk0.r */
public final class C87254r extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C91891k0 f252964d;

    /* renamed from: e */
    public final /* synthetic */ C83780d1 f252965e;

    /* renamed from: f */
    public final /* synthetic */ String f252966f;

    /* renamed from: g */
    public final /* synthetic */ boolean f252967g;

    /* renamed from: h */
    public final /* synthetic */ C46888b f252968h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87254r(C91891k0 k0Var, C83780d1 d1Var, String str, boolean z, C46888b bVar) {
        super(1);
        this.f252964d = k0Var;
        this.f252965e = d1Var;
        this.f252966f = str;
        this.f252967g = z;
        this.f252968h = bVar;
    }

    public Object invoke(Object obj) {
        if (((Number) obj).intValue() == -1) {
            C91891k0 k0Var = this.f252964d;
            if (k0Var != null) {
                k0Var.f263092b = 1;
            }
            if (k0Var != null) {
                Long valueOf = Long.valueOf(k0Var.f263093c);
                C87412m.m108591d(valueOf);
                k0Var.f263093c = valueOf.longValue() + 1;
            }
            String appId = this.f252965e.getAppId();
            C87412m.m108593f(appId, "env.appId");
            new C91870f(appId, this.f252966f, this.f252967g).mo125700a(new C87253q(this.f252968h));
        } else {
            Log.m105920e("MicroMsg.JsApiGetPhoneNumberNew", "bind wechat phone number fail");
            C91891k0 k0Var2 = this.f252964d;
            if (k0Var2 != null) {
                k0Var2.f263092b = 0;
            }
            this.f252968h.mo72091a("user cancel");
        }
        return C13598b0.f38549a;
    }
}
