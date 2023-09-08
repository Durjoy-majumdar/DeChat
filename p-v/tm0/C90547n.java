package tm0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import tm0.C90538k;
import zp0.C91831m;
import zp0.C91832n;

/* renamed from: tm0.n */
public final class C90547n extends C90538k implements C91832n {

    /* renamed from: o */
    public final AtomicReference<C90538k.C90543e> f260175o = new AtomicReference<>((Object) null);

    /* renamed from: p */
    public final AtomicBoolean f260176p = new AtomicBoolean(false);

    /* renamed from: q */
    public final AtomicBoolean f260177q = new AtomicBoolean(false);

    /* renamed from: b */
    public void mo124681b() {
        this.f260175o.set((Object) null);
    }

    /* renamed from: y */
    public C90538k.C90543e mo124676y(C82381f fVar) {
        C91831m mVar;
        C87412m.m108594g(fVar, "component");
        if (!this.f260176p.getAndSet(true) && (mVar = (C91831m) fVar.mo109668l(C91831m.class)) != null) {
            mVar.ne0(this);
            this.f260177q.set(true);
        }
        if (!this.f260177q.get()) {
            return C90538k.m113361x(fVar.getContext());
        }
        C90538k.C90543e eVar = this.f260175o.get();
        if (eVar != null) {
            return eVar;
        }
        C90538k.C90543e x = C90538k.m113361x(fVar.getContext());
        this.f260175o.set(x);
        return x;
    }
}
