package ll0;

import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104873k;
import java.lang.ref.WeakReference;
import rt0.C110653f;

/* renamed from: ll0.n */
public class C109401n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WeakReference f327492d;

    /* renamed from: e */
    public final /* synthetic */ C104873k f327493e;

    /* renamed from: f */
    public final /* synthetic */ C110653f f327494f;

    /* renamed from: g */
    public final /* synthetic */ int f327495g;

    /* renamed from: h */
    public final /* synthetic */ int f327496h;

    public C109401n(C109395k kVar, WeakReference weakReference, C104873k kVar2, C110653f fVar, int i, int i2) {
        this.f327492d = weakReference;
        this.f327493e = kVar2;
        this.f327494f = fVar;
        this.f327495g = i;
        this.f327496h = i2;
    }

    public void run() {
        C83780d1 d1Var = (C83780d1) this.f327492d.get();
        if (d1Var != null && d1Var.f244558J != null) {
            this.f327493e.mo148839q(this.f327494f, this.f327495g, this.f327496h);
        }
    }
}
