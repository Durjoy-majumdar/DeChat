package p004b0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import fy3.C32227p;
import gy3.C87413o;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: b0.w0 */
public final class C54389w0 extends C87413o implements C32227p<Float, Float, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ boolean f152588d;

    /* renamed from: e */
    public final /* synthetic */ C0000n0 f152589e;

    /* renamed from: f */
    public final /* synthetic */ C103953l0 f152590f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54389w0(boolean z, C0000n0 n0Var, C103953l0 l0Var) {
        super(2);
        this.f152588d = z;
        this.f152589e = n0Var;
        this.f152590f = l0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        float floatValue2 = ((Number) obj2).floatValue();
        if (this.f152588d) {
            floatValue = floatValue2;
        }
        C53895h.m60466d(this.f152589e, (C66212f) null, (C53934p0) null, new C54388v0(this.f152590f, floatValue, (C15601d<? super C54388v0>) null), 3, (Object) null);
        return Boolean.TRUE;
    }
}
