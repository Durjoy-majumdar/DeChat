package cl1;

import cm1.C0740i2;
import com.google.android.gms.common.internal.ImagesContract;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import sk1.C63964u;

/* renamed from: cl1.j1 */
public final class C0666j1 extends C87413o implements C32226l<C0740i2, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C0740i2 f1571d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0666j1(C0740i2 i2Var) {
        super(1);
        this.f1571d = i2Var;
    }

    public Object invoke(Object obj) {
        C0740i2 i2Var = (C0740i2) obj;
        C87412m.m108594g(i2Var, ImagesContract.LOCAL);
        return Boolean.valueOf((i2Var instanceof C63964u) && ((C63964u) i2Var).f181326t == ((C63964u) this.f1571d).f181326t);
    }
}
