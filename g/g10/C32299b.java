package g10;

import a14.C53916l;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Result;
import rx3.C13598b0;
import te3.fp4;

/* renamed from: g10.b */
public final class C32299b extends C87413o implements C32226l<fp4, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C53916l<fp4> f85770d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32299b(C53916l<? super fp4> lVar) {
        super(1);
        this.f85770d = lVar;
    }

    public Object invoke(Object obj) {
        fp4 fp4 = (fp4) obj;
        C87412m.m108594g(fp4, "resp");
        this.f85770d.resumeWith(Result.m168114constructorimpl(fp4));
        return C13598b0.f38549a;
    }
}
