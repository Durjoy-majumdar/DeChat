package zy3;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import sx3.C36907w;
import wy3.C22936j0;

/* renamed from: zy3.z */
public final class C23599z extends C87413o implements C32224a<C23593l> {

    /* renamed from: d */
    public final /* synthetic */ C26729b0 f67739d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23599z(C26729b0 b0Var) {
        super(0);
        this.f67739d = b0Var;
    }

    public Object invoke() {
        C26729b0 b0Var = this.f67739d;
        C23597x xVar = b0Var.f74315j;
        if (xVar != null) {
            List<C26729b0> b = xVar.mo37076b();
            this.f67739d.mo53716U();
            b.contains(this.f67739d);
            for (C26729b0 b0Var2 : b) {
                b0Var2.getClass();
            }
            ArrayList arrayList = new ArrayList(C36907w.m41090l(b, 10));
            for (C26729b0 b0Var3 : b) {
                C22936j0 j0Var = b0Var3.f74316n;
                C87412m.m108591d(j0Var);
                arrayList.add(j0Var);
            }
            return new C23593l(arrayList, "CompositeProvider@ModuleDescriptor for " + this.f67739d.getName());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Dependencies of module ");
        String str = b0Var.getName().f65637d;
        C87412m.m108593f(str, "name.toString()");
        sb.append(str);
        sb.append(" were not set before querying module content");
        throw new AssertionError(sb.toString());
    }
}
