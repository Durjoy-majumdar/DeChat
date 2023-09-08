package p658q1;

import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p410k0.C108793e;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: q1.l */
public final class C110303l extends C87413o implements C32227p<C13598b0, C65503j.C65506c, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110301j f329945d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110303l(C110301j jVar) {
        super(2);
        this.f329945d = jVar;
    }

    public Object invoke(Object obj, Object obj2) {
        T t;
        C65503j.C65506c cVar = (C65503j.C65506c) obj2;
        C87412m.m108594g((C13598b0) obj, "<anonymous parameter 0>");
        C87412m.m108594g(cVar, "mod");
        C108793e<C110324v> eVar = this.f329945d.f329921p;
        int i = eVar.f325786f;
        if (i > 0) {
            int i2 = i - 1;
            T[] tArr = eVar.f325784d;
            while (true) {
                t = tArr[i2];
                C110324v vVar = (C110324v) t;
                if (vVar.f330027I == cVar && !vVar.f330028J) {
                    break;
                }
                i2--;
                if (i2 < 0) {
                    break;
                }
            }
            t = null;
        } else {
            t = null;
        }
        C110324v vVar2 = (C110324v) t;
        if (vVar2 != null) {
            vVar2.f330028J = true;
        }
        return C13598b0.f38549a;
    }
}
