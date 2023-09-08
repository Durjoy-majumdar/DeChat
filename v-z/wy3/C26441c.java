package wy3;

import gy3.C87412m;
import java.util.List;
import m04.C24980n;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25176s0;
import n04.C25202z1;
import vz3.C22830f;
import xy3.C26571h;

/* renamed from: wy3.c */
public final class C26441c implements C26446d1 {

    /* renamed from: d */
    public final C26446d1 f73730d;

    /* renamed from: e */
    public final C26469k f73731e;

    /* renamed from: f */
    public final int f73732f;

    public C26441c(C26446d1 d1Var, C26469k kVar, int i) {
        C87412m.m108594g(d1Var, "originalDescriptor");
        C87412m.m108594g(kVar, "declarationDescriptor");
        this.f73730d = d1Var;
        this.f73731e = kVar;
        this.f73732f = i;
    }

    /* renamed from: b */
    public C26469k mo51892b() {
        return this.f73731e;
    }

    public C26571h getAnnotations() {
        return this.f73730d.getAnnotations();
    }

    public int getIndex() {
        return this.f73732f + this.f73730d.getIndex();
    }

    public C22830f getName() {
        return this.f73730d.getName();
    }

    public C26521y0 getSource() {
        return this.f73730d.getSource();
    }

    public List<C25143j0> getUpperBounds() {
        return this.f73730d.getUpperBounds();
    }

    /* renamed from: h0 */
    public <R, D> R mo52621h0(C26482m<R, D> mVar, D d) {
        return this.f73730d.mo52621h0(mVar, d);
    }

    /* renamed from: l */
    public C25144j1 mo36110l() {
        return this.f73730d.mo36110l();
    }

    /* renamed from: o */
    public C25202z1 mo53423o() {
        return this.f73730d.mo53423o();
    }

    /* renamed from: s */
    public C25176s0 mo36111s() {
        return this.f73730d.mo36111s();
    }

    /* renamed from: s0 */
    public C24980n mo53424s0() {
        return this.f73730d.mo53424s0();
    }

    public String toString() {
        return this.f73730d + "[inner-copy]";
    }

    /* renamed from: u */
    public boolean mo53426u() {
        return this.f73730d.mo53426u();
    }

    /* renamed from: x */
    public boolean mo53427x() {
        return true;
    }

    /* renamed from: a */
    public C26446d1 m34052a() {
        C26446d1 a = this.f73730d.mo36109a();
        C87412m.m108593f(a, "originalDescriptor.original");
        return a;
    }
}
