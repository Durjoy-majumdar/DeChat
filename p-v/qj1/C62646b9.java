package qj1;

import fh1.C45793z0;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import te3.C50131kh1;

/* renamed from: qj1.b9 */
public final class C62646b9 extends C87413o implements C32229r<Integer, Integer, String, C50131kh1, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62949r8 f177904d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62646b9(C62949r8 r8Var) {
        super(4);
        this.f177904d = r8Var;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        C45793z0 z0Var;
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        String str = (String) obj3;
        C50131kh1 kh12 = (C50131kh1) obj4;
        C87412m.m108594g(kh12, "resp");
        if (intValue == 0 && intValue2 == 0 && (z0Var = (C45793z0) this.f177904d.mo87685B0(C45793z0.class)) != null) {
            z0Var.mo71261m3();
        }
        C62949r8 r8Var = this.f177904d;
        String str2 = kh12.f136790d;
        C62634a9 a9Var = new C62634a9(r8Var);
        r8Var.getClass();
        C61926c.m72668M(new C63159z8(intValue, intValue2, r8Var, "", str2, a9Var));
        return C13598b0.f38549a;
    }
}
