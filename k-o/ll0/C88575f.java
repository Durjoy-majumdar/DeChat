package ll0;

import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84947c0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84954e1;
import java.lang.ref.WeakReference;

/* renamed from: ll0.f */
public class C88575f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WeakReference f255822d;

    /* renamed from: e */
    public final /* synthetic */ int f255823e;

    /* renamed from: f */
    public final /* synthetic */ int f255824f;

    /* renamed from: g */
    public final /* synthetic */ C88576g f255825g;

    public C88575f(C88576g gVar, WeakReference weakReference, int i, int i2) {
        this.f255825g = gVar;
        this.f255822d = weakReference;
        this.f255823e = i;
        this.f255824f = i2;
    }

    public void run() {
        C83780d1 d1Var = (C83780d1) this.f255822d.get();
        if (d1Var != null) {
            if (d1Var.mo116153H0() != null) {
                d1Var.mo116153H0().hideVKB();
            }
            C84954e1<?> a = C84947c0.m104713a(d1Var, this.f255823e);
            d1Var.mo109647a(this.f255824f, this.f255825g.mo115109j(a != null && a.mo117815a() ? "ok" : "fail"));
        }
    }
}
