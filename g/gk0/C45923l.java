package gk0;

import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p224ra.C89909e;
import rx3.C13598b0;
import te3.C52164ys3;
import te3.C52301zs3;
import zp0.C16377l;

/* renamed from: gk0.l */
public final class C45923l extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C83780d1 f123905d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45923l(C83780d1 d1Var) {
        super(1);
        this.f123905d = d1Var;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String appId = this.f123905d.getAppId();
        C87412m.m108593f(appId, "env.appId");
        C52164ys3 ys32 = new C52164ys3();
        ys32.f145496d = appId;
        ys32.f145497e = booleanValue;
        ((C16377l) C89909e.m112436a(C16377l.class)).mo14840YQ("/cgi-bin/mmbiz-bin/wxabusiness/reportusercheckphoneprivacy", appId, ys32, C52301zs3.class).mo123061d(C45934y0.f123934a).mo123065b(C8332z0.f27293a);
        return C13598b0.f38549a;
    }
}
