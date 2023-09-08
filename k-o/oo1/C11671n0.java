package oo1;

import er1.C7776a;
import er1.C7802g1;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import oo1.C11614d0;
import rx3.C13598b0;
import te3.C49359f1;
import te3.C51559uk1;

/* renamed from: oo1.n0 */
public final class C11671n0 extends C87413o implements C32227p<Boolean, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f34199d;

    /* renamed from: e */
    public final /* synthetic */ C11614d0.C11619d.C11620a f34200e;

    /* renamed from: f */
    public final /* synthetic */ C11614d0.C11618c f34201f;

    /* renamed from: g */
    public final /* synthetic */ C11614d0.C11619d f34202g;

    /* renamed from: h */
    public final /* synthetic */ int f34203h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11671n0(String str, C11614d0.C11619d.C11620a aVar, C11614d0.C11618c cVar, C11614d0.C11619d dVar, int i) {
        super(2);
        this.f34199d = str;
        this.f34200e = aVar;
        this.f34201f = cVar;
        this.f34202g = dVar;
        this.f34203h = i;
    }

    public Object invoke(Object obj, Object obj2) {
        C51559uk1 a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C87412m.m108594g((String) obj2, "errString");
        if (booleanValue && C87412m.m108589b(this.f34199d, this.f34200e.f34082z) && (a = C7802g1.m7949a(this.f34201f.f34065a)) != null) {
            C11614d0.C11618c cVar = this.f34201f;
            C11614d0.C11619d dVar = this.f34202g;
            int i = this.f34203h;
            C49359f1 f1Var = a.f142912z;
            if (f1Var != null) {
                C7776a.m7932b(f1Var);
            }
            C7802g1.m7951c(cVar.f34065a, a);
            dVar.notifyItemChanged(i);
        }
        return C13598b0.f38549a;
    }
}
