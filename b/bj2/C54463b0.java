package bj2;

import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import zb2.C66778l;

/* renamed from: bj2.b0 */
public final class C54463b0 extends C53996a<C67265e0> {

    /* renamed from: d */
    public final List<C67265e0> f152729d;

    /* renamed from: bj2.b0$a */
    public static final class C54464a extends C87413o implements C32226l<Integer, C67265e0> {

        /* renamed from: d */
        public final /* synthetic */ C54463b0 f152730d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54464a(C54463b0 b0Var) {
            super(1);
            this.f152730d = b0Var;
        }

        public Object invoke(Object obj) {
            return this.f152730d.f152729d.get(((Number) obj).intValue());
        }
    }

    public C54463b0(List<C67265e0> list) {
        C87412m.m108594g(list, "svgResList");
        this.f152729d = list;
    }

    /* renamed from: b */
    public C45252f<C39534d<C67265e0>> mo70650e(LifecycleScope lifecycleScope, C53998c<C67265e0> cVar) {
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C66778l.C66779a aVar = C66778l.f191877a;
        return aVar.mo90783a(lifecycleScope, aVar.mo90784b(this.f152729d.size(), cVar, new C54464a(this)));
    }
}
