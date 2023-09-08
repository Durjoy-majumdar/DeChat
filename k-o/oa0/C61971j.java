package oa0;

import ca0.C104344e0;
import ca0.C104353p;
import ca0.C54683f0;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55366y1;
import fy3.C32227p;
import gy3.C87413o;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: oa0.j */
public final class C61971j extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54683f0 f176161d;

    /* renamed from: e */
    public final /* synthetic */ C55366y1 f176162e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61971j(C54683f0 f0Var, C55366y1 y1Var) {
        super(2);
        this.f176161d = f0Var;
        this.f176162e = y1Var;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            C104353p.m139327f(this.f176161d.f153250b.getValue(), C104344e0.f308940k, new C61970i(this.f176162e), hVar, 56);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
