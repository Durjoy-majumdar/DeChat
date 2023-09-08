package h43;

import android.util.Size;
import fy3.C32224a;
import gy3.C87413o;
import java.nio.ByteBuffer;
import l33.C109247e;
import p80.C110194c;
import rx3.C13598b0;

/* renamed from: h43.y */
public final class C108127y extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108117v f323779d;

    /* renamed from: e */
    public final /* synthetic */ int f323780e;

    /* renamed from: f */
    public final /* synthetic */ int f323781f;

    /* renamed from: g */
    public final /* synthetic */ ByteBuffer f323782g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108127y(C108117v vVar, int i, int i2, ByteBuffer byteBuffer) {
        super(0);
        this.f323779d = vVar;
        this.f323780e = i;
        this.f323781f = i2;
        this.f323782g = byteBuffer;
    }

    public Object invoke() {
        C108109r0 r0Var = this.f323779d.f323617j;
        if (r0Var != null) {
            r0Var.mo158478B(0);
        }
        C108117v vVar = this.f323779d;
        C110194c cVar = vVar.f323618k;
        if (cVar != null) {
            C108109r0 r0Var2 = vVar.f323617j;
            if (r0Var2 != null) {
                r0Var2.mo143263u(this.f323780e, this.f323781f);
            }
            C108109r0 r0Var3 = this.f323779d.f323617j;
            if (r0Var3 != null) {
                r0Var3.mo143262q(90);
            }
            C108109r0 r0Var4 = this.f323779d.f323617j;
            if (r0Var4 != null) {
                r0Var4.mo158479j(false);
            }
            C109247e.vx0().f333457q = new Size(this.f323780e, this.f323781f);
            C108109r0 r0Var5 = this.f323779d.f323617j;
            if (r0Var5 != null) {
                r0Var5.mo158480v(this.f323782g, this.f323780e, this.f323781f);
            }
            this.f323779d.mo158485h(cVar);
        }
        return C13598b0.f38549a;
    }
}
