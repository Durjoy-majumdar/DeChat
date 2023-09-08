package np1;

import a14.C53973z1;
import fy3.C32228q;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.CancellationException;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C50912q41;

/* renamed from: np1.h */
public final class C11248h extends C87413o implements C32228q<Boolean, String, C50912q41, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C53973z1 f33151d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<C89779i0> f33152e;

    /* renamed from: f */
    public final /* synthetic */ C32228q<Boolean, Integer, Integer, C13598b0> f33153f;

    /* renamed from: g */
    public final /* synthetic */ int f33154g;

    /* renamed from: h */
    public final /* synthetic */ int f33155h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11248h(C53973z1 z1Var, C8479f0<C89779i0> f0Var, C32228q<? super Boolean, ? super Integer, ? super Integer, C13598b0> qVar, int i, int i2) {
        super(3);
        this.f33151d = z1Var;
        this.f33152e = f0Var;
        this.f33153f = qVar;
        this.f33154g = i;
        this.f33155h = i2;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C87412m.m108594g((String) obj2, "errMsg");
        C87412m.m108594g((C50912q41) obj3, "<anonymous parameter 2>");
        C53973z1.C53974a.m60623a(this.f33151d, (CancellationException) null, 1, (Object) null);
        C89779i0 i0Var = (C89779i0) this.f33152e.f27484d;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        this.f33153f.invoke(Boolean.valueOf(booleanValue), Integer.valueOf(this.f33154g), Integer.valueOf(this.f33155h));
        return C13598b0.f38549a;
    }
}
