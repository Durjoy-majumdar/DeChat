package zy3;

import gy3.C87412m;
import vz3.C22826c;
import wy3.C26448e0;
import wy3.C26465i0;
import wy3.C26469k;
import wy3.C26482m;
import wy3.C26521y0;
import xy3.C26571h;

/* renamed from: zy3.d0 */
public abstract class C26733d0 extends C26758n implements C26465i0 {

    /* renamed from: h */
    public final C22826c f74328h;

    /* renamed from: i */
    public final String f74329i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26733d0(C26448e0 e0Var, C22826c cVar) {
        super(e0Var, C26571h.C26572a.f73937a, cVar.mo35979g(), C26521y0.f73808a);
        C87412m.m108594g(e0Var, "module");
        C87412m.m108594g(cVar, "fqName");
        int i = C26571h.f73936P0;
        this.f74328h = cVar;
        this.f74329i = "package " + cVar + " of " + e0Var;
    }

    /* renamed from: d */
    public final C22826c mo53444d() {
        return this.f74328h;
    }

    public C26521y0 getSource() {
        return C26521y0.f73808a;
    }

    /* renamed from: h0 */
    public <R, D> R mo52621h0(C26482m<R, D> mVar, D d) {
        C87412m.m108594g(mVar, "visitor");
        return mVar.mo53454h(this, d);
    }

    public String toString() {
        return this.f74329i;
    }

    /* renamed from: b */
    public C26448e0 m34797b() {
        C26469k b = super.mo51892b();
        C87412m.m108592e(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (C26448e0) b;
    }
}
