package v82;

import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.model.C105853x;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C101218e0;

/* renamed from: v82.o0 */
public final class C111481o0 implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C101218e0 f333772a;

    /* renamed from: b */
    public final /* synthetic */ C111456j0 f333773b;

    public C111481o0(C101218e0 e0Var, C111456j0 j0Var) {
        this.f333772a = e0Var;
        this.f333773b = j0Var;
    }

    /* renamed from: a */
    public final void mo2001a() {
        this.f333772a.mo140680z();
        C105853x.f314828f++;
        if (C105851w0.zx0().f314506t != null) {
            String str = C105851w0.zx0().f314506t.f320042d;
        }
        Log.m105924i("MicroMsg.ScreenProjectReportHelper", "markClickFileScreenProject");
        C115669n.INSTANCE.mo175913w(1538, 0, 1);
        this.f333773b.f333691a.mo150870I7();
    }
}
