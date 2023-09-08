package gk0;

import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import gy3.C87412m;
import hp3.C87581a;
import java.util.List;
import lp3.C46888b;
import lp3.C88643g;
import zq0.C91870f;
import zq0.C91891k0;
import zq0.C91893l0;

/* renamed from: gk0.i */
public final class C87244i<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C87237e f252937a;

    /* renamed from: b */
    public final /* synthetic */ C83780d1 f252938b;

    /* renamed from: c */
    public final /* synthetic */ String f252939c;

    /* renamed from: d */
    public final /* synthetic */ boolean f252940d;

    public C87244i(C87237e eVar, C83780d1 d1Var, String str, boolean z) {
        this.f252937a = eVar;
        this.f252938b = d1Var;
        this.f252939c = str;
        this.f252940d = z;
    }

    public Object call(Object obj) {
        List list = (List) obj;
        C87237e eVar = this.f252937a;
        C83780d1 d1Var = this.f252938b;
        String str = this.f252939c;
        C87412m.m108593f(str, "apiName");
        boolean z = this.f252940d;
        C91893l0 l0Var = C91893l0.f263119a;
        String appId = this.f252938b.getAppId();
        C87412m.m108593f(appId, "env.appId");
        C91891k0 a = l0Var.mo125719a(appId);
        eVar.getClass();
        C46888b c = C88643g.m110545c();
        if (a != null) {
            a.f263093c++;
        }
        String appId2 = d1Var.getAppId();
        C87412m.m108593f(appId2, "env.appId");
        new C91870f(appId2, str, z).mo125700a(new C87240f(c, list));
        return null;
    }
}
