package tq0;

import android.app.Activity;
import br0.C79774c;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84545i3;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import cr0.C86127t;
import java.util.concurrent.atomic.AtomicReference;
import p1031sb.C90154a;
import tq0.C90572d;

/* renamed from: tq0.b */
public class C90570b implements C90572d {

    /* renamed from: a */
    public final C83780d1 f260228a;

    /* renamed from: b */
    public final AtomicReference<C90572d.C90573a> f260229b;

    public C90570b(C83780d1 d1Var) {
        AtomicReference<C90572d.C90573a> atomicReference = new AtomicReference<>();
        this.f260229b = atomicReference;
        atomicReference.set(C90572d.C90573a.SHOWN);
        this.f260228a = d1Var;
    }

    /* renamed from: c */
    public void mo117650c() {
        Activity w;
        C79774c cVar = this.f260228a.f244577X;
        if ((cVar instanceof C86127t) && (w = ((C86127t) cVar).mo120548w()) != null) {
            ((C90154a) this.f260228a.mo109671p(C90154a.class)).getClass();
            C84545i3.m104129f(w, false);
        }
    }

    public C90572d.C90573a getCurrentState() {
        return this.f260229b.get();
    }
}
