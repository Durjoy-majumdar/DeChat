package d14;

import a14.C0000n0;
import c14.C54624g;
import c14.C54647v;
import c14.C54649x;
import e14.C58482g;
import e14.C58515z;
import gy3.C8480h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;
import xx3.C15911a;

/* renamed from: d14.c */
public final class C58022c<T> extends C58482g<T> {

    /* renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f165973i = AtomicIntegerFieldUpdater.newUpdater(C58022c.class, "consumed");
    private volatile /* synthetic */ int consumed;

    /* renamed from: g */
    public final C54649x<T> f165974g;

    /* renamed from: h */
    public final boolean f165975h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C58022c(C54649x xVar, boolean z, C66212f fVar, int i, C54624g gVar, int i2, C8480h hVar) {
        this(xVar, z, (i2 & 4) != 0 ? C66217g.f190253d : fVar, (i2 & 8) != 0 ? -3 : i, (i2 & 16) != 0 ? C54624g.SUSPEND : gVar);
    }

    /* renamed from: a */
    public Object mo31880a(C45253g<? super T> gVar, C15601d<? super C13598b0> dVar) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        if (this.f167474e == -3) {
            mo82819k();
            Object a = C58061m.m67219a(gVar, this.f165974g, this.f165975h, dVar);
            return a == aVar ? a : C13598b0.f38549a;
        }
        Object a2 = super.mo31880a(gVar, dVar);
        return a2 == aVar ? a2 : C13598b0.f38549a;
    }

    /* renamed from: f */
    public String mo82816f() {
        return "channel=" + this.f165974g;
    }

    /* renamed from: g */
    public Object mo82812g(C54647v<? super T> vVar, C15601d<? super C13598b0> dVar) {
        Object a = C58061m.m67219a(new C58515z(vVar), this.f165974g, this.f165975h, dVar);
        return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
    }

    /* renamed from: h */
    public C58482g<T> mo82813h(C66212f fVar, int i, C54624g gVar) {
        return new C58022c(this.f165974g, this.f165975h, fVar, i, gVar);
    }

    /* renamed from: i */
    public C45252f<T> mo82817i() {
        return new C58022c(this.f165974g, this.f165975h, (C66212f) null, 0, (C54624g) null, 28, (C8480h) null);
    }

    /* renamed from: j */
    public C54649x<T> mo82818j(C0000n0 n0Var) {
        mo82819k();
        return this.f167474e == -3 ? this.f165974g : super.mo82818j(n0Var);
    }

    /* renamed from: k */
    public final void mo82819k() {
        if (this.f165975h) {
            boolean z = true;
            if (f165973i.getAndSet(this, 1) != 0) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }

    public C58022c(C54649x<? extends T> xVar, boolean z, C66212f fVar, int i, C54624g gVar) {
        super(fVar, i, gVar);
        this.f165974g = xVar;
        this.f165975h = z;
        this.consumed = 0;
    }
}
