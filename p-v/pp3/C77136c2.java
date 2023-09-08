package pp3;

import com.tencent.p014mm.vfs.C75057b1;
import com.tencent.p014mm.vfs.C75061i;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: pp3.c2 */
public final class C77136c2 extends C87413o implements C32226l<C75057b1, C13598b0> {

    /* renamed from: d */
    public static final C77136c2 f225245d = new C77136c2();

    public C77136c2() {
        super(1);
    }

    public Object invoke(Object obj) {
        C75057b1 b1Var = (C75057b1) obj;
        C87412m.m108594g(b1Var, "$this$storage");
        b1Var.f220825b = "files/xlog";
        b1Var.mo104652h("${data}/${dir}");
        b1Var.f220829f = Boolean.TRUE;
        b1Var.mo104647b(C75061i.C75062a.m90020a(b1Var, 10));
        return C13598b0.f38549a;
    }
}
