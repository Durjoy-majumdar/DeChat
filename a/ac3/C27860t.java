package ac3;

import fy3.C32226l;
import gy3.C87413o;
import te3.b05;

/* renamed from: ac3.t */
public final class C27860t extends C87413o implements C32226l<b05, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ int f76998d;

    /* renamed from: e */
    public final /* synthetic */ int f76999e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27860t(int i, int i2) {
        super(1);
        this.f76998d = i;
        this.f76999e = i2;
    }

    public Object invoke(Object obj) {
        b05 b05 = (b05) obj;
        return Boolean.valueOf(b05.f130875d == this.f76998d && b05.f130876e == this.f76999e);
    }
}
