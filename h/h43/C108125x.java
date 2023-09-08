package h43;

import android.util.Size;
import fy3.C32224a;
import gy3.C87413o;
import l33.C109247e;
import p80.C110194c;
import rx3.C13598b0;

/* renamed from: h43.x */
public final class C108125x extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108117v f323770d;

    /* renamed from: e */
    public final /* synthetic */ int f323771e;

    /* renamed from: f */
    public final /* synthetic */ int f323772f;

    /* renamed from: g */
    public final /* synthetic */ byte[] f323773g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108125x(C108117v vVar, int i, int i2, byte[] bArr) {
        super(0);
        this.f323770d = vVar;
        this.f323771e = i;
        this.f323772f = i2;
        this.f323773g = bArr;
    }

    public Object invoke() {
        C108109r0 r0Var = this.f323770d.f323617j;
        if (r0Var != null) {
            r0Var.mo158478B(0);
        }
        C108117v vVar = this.f323770d;
        C110194c cVar = vVar.f323618k;
        if (cVar != null) {
            C108109r0 r0Var2 = vVar.f323617j;
            if (r0Var2 != null) {
                r0Var2.mo143263u(this.f323771e, this.f323772f);
            }
            C108109r0 r0Var3 = this.f323770d.f323617j;
            if (r0Var3 != null) {
                r0Var3.mo143262q(90);
            }
            C108109r0 r0Var4 = this.f323770d.f323617j;
            if (r0Var4 != null) {
                r0Var4.mo158479j(false);
            }
            C109247e.vx0().f333457q = new Size(this.f323771e, this.f323772f);
            C108109r0 r0Var5 = this.f323770d.f323617j;
            if (r0Var5 != null) {
                r0Var5.mo158481w(this.f323773g, this.f323771e, this.f323772f);
            }
            this.f323770d.mo158485h(cVar);
        }
        return C13598b0.f38549a;
    }
}
