package o24;

import gy3.C87412m;

/* renamed from: o24.m */
public abstract class C21772m implements C21760d0 {

    /* renamed from: d */
    public final C21760d0 f61702d;

    public C21772m(C21760d0 d0Var) {
        C87412m.m108594g(d0Var, "delegate");
        this.f61702d = d0Var;
    }

    /* renamed from: L0 */
    public long mo32327L0(C21766h hVar, long j) {
        C87412m.m108594g(hVar, "sink");
        return this.f61702d.mo32327L0(hVar, j);
    }

    public void close() {
        this.f61702d.close();
    }

    /* renamed from: f */
    public C21762e0 mo32328f() {
        return this.f61702d.mo32328f();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f61702d + ')';
    }
}
