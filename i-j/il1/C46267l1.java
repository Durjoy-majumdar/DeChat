package il1;

import a14.C53973z1;
import com.tencent.p014mm.p136ui.C75044y4;
import fy3.C32224a;
import gy3.C87413o;
import java.util.concurrent.CancellationException;
import rx3.C13598b0;

/* renamed from: il1.l1 */
public final class C46267l1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60413h1 f124719d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f124720e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46267l1(C60413h1 h1Var, C32224a<C13598b0> aVar) {
        super(0);
        this.f124719d = h1Var;
        this.f124720e = aVar;
    }

    public Object invoke() {
        C53973z1 z1Var = this.f124719d.f172258p;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f124719d.f172246d.setVisibility(4);
        this.f124719d.f172243a.animate().translationY((float) C75044y4.m89990b(this.f124719d.f172243a.getContext()).y).setDuration(200).setListener(new C46260j1(this.f124720e)).start();
        C60413h1 h1Var = this.f124719d;
        h1Var.f172243a.postDelayed(new C46263k1(h1Var), 200);
        C53973z1 z1Var2 = this.f124719d.f172258p;
        if (z1Var2 != null) {
            C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
