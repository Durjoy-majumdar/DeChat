package ty3;

import fy3.C32224a;
import zy3.C26729b0;

/* renamed from: ty3.i */
public class C22557i implements C32224a<Void> {

    /* renamed from: d */
    public final /* synthetic */ C26729b0 f64871d;

    /* renamed from: e */
    public final /* synthetic */ C26336h f64872e;

    public C22557i(C26336h hVar, C26729b0 b0Var) {
        this.f64872e = hVar;
        this.f64871d = b0Var;
    }

    public Object invoke() {
        C26336h hVar = this.f64872e;
        if (hVar.f73355a == null) {
            hVar.f73355a = this.f64871d;
            return null;
        }
        throw new AssertionError("Built-ins module is already set: " + this.f64872e.f73355a + " (attempting to reset to " + this.f64871d + ")");
    }
}
