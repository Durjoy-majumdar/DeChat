package pp3;

import com.tencent.p014mm.vfs.C75057b1;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C13604l;

/* renamed from: pp3.j3 */
public final class C77185j3 extends C87413o implements C32226l<C75057b1, C13598b0> {

    /* renamed from: d */
    public static final C77185j3 f225294d = new C77185j3();

    public C77185j3() {
        super(1);
    }

    public Object invoke(Object obj) {
        C75057b1 b1Var = (C75057b1) obj;
        C87412m.m108594g(b1Var, "$this$storage");
        b1Var.mo104651g();
        C13604l[] lVarArr = {new C13604l("noStrip", "")};
        for (int i = 0; i < 1; i++) {
            C13604l lVar = lVarArr[i];
            B b = lVar.f38556e;
            if ((b instanceof String) || !(b instanceof Object[])) {
                b1Var.f220834k.put(lVar.f38555d, b.toString());
            } else {
                b1Var.f220834k.put(lVar.f38555d, b);
            }
        }
        b1Var.mo104653i(C118121i3.f353125d);
        return C13598b0.f38549a;
    }
}
