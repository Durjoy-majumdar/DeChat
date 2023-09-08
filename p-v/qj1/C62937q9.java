package qj1;

import fy3.C32224a;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C50131kh1;

/* renamed from: qj1.q9 */
public final class C62937q9 extends C87413o implements C32229r<Integer, Integer, String, C50131kh1, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62949r8 f178584d;

    /* renamed from: e */
    public final /* synthetic */ String f178585e;

    /* renamed from: f */
    public final /* synthetic */ boolean f178586f;

    /* renamed from: g */
    public final /* synthetic */ long f178587g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62937q9(C62949r8 r8Var, String str, boolean z, long j) {
        super(4);
        this.f178584d = r8Var;
        this.f178585e = str;
        this.f178586f = z;
        this.f178587g = j;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        String str = (String) obj3;
        C50131kh1 kh12 = (C50131kh1) obj4;
        C87412m.m108594g(kh12, "resp");
        C62949r8.m74147j1(this.f178584d, intValue, intValue2, this.f178585e.toString(), kh12.f136790d, (C32224a) null, 16, (Object) null);
        if (intValue == 0 && intValue2 == 0) {
            C62949r8.m74144d1(this.f178584d, this.f178586f, this.f178587g, this.f178585e);
        }
        return C13598b0.f38549a;
    }
}
