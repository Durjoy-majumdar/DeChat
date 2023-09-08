package g10;

import fy3.C32226l;
import gy3.C87413o;
import jp3.C46566c;
import jp3.C9486a;
import rx3.C13598b0;

/* renamed from: g10.a */
public final class C45873a extends C87413o implements C32226l<Throwable, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C46566c<C9486a> f123828d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45873a(C46566c<C9486a> cVar) {
        super(1);
        this.f123828d = cVar;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.f123828d.dead();
        return C13598b0.f38549a;
    }
}
