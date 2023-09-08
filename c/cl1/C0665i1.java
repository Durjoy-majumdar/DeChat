package cl1;

import cm1.C0740i2;
import com.google.android.gms.common.internal.ImagesContract;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import sk1.C63965x;

/* renamed from: cl1.i1 */
public final class C0665i1 extends C87413o implements C32226l<C0740i2, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C0740i2 f1570d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0665i1(C0740i2 i2Var) {
        super(1);
        this.f1570d = i2Var;
    }

    public Object invoke(Object obj) {
        C0740i2 i2Var = (C0740i2) obj;
        C87412m.m108594g(i2Var, ImagesContract.LOCAL);
        return Boolean.valueOf((i2Var instanceof C63965x) && ((C63965x) i2Var).f181347t == ((C63965x) this.f1570d).f181347t);
    }
}
