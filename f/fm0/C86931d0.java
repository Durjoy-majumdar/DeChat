package fm0;

import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;

/* renamed from: fm0.d0 */
public class C86931d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83780d1 f252354d;

    /* renamed from: e */
    public final /* synthetic */ int f252355e;

    /* renamed from: f */
    public final /* synthetic */ long f252356f;

    public C86931d0(C86934e0 e0Var, C83780d1 d1Var, int i, long j) {
        this.f252354d = d1Var;
        this.f252355e = i;
        this.f252356f = j;
    }

    public void run() {
        C83797e3 e3Var = this.f252354d.f244558J;
        if (e3Var != null) {
            e3Var.mo63302N(this.f252355e, this.f252356f);
        }
    }
}
