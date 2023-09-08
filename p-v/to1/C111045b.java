package to1;

import ac3.C103355g1;
import com.tencent.p014mm.plugin.xlabeffect.XEffectConfig;

/* renamed from: to1.b */
public final class C111045b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C111040a f332542d;

    /* renamed from: e */
    public final /* synthetic */ boolean f332543e;

    public C111045b(C111040a aVar, boolean z) {
        this.f332542d = aVar;
        this.f332543e = z;
    }

    public final void run() {
        C103355g1 g1Var = this.f332542d.mo162728g().f331427v;
        if (g1Var != null && !this.f332543e) {
            g1Var.mo143252s(new XEffectConfig());
        }
    }
}
