package er1;

import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8808v4;
import rx3.C13598b0;

/* renamed from: er1.g3 */
public final class C7803g3 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<String, C13598b0> f26319d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7803g3(C32226l<? super String, C13598b0> lVar) {
        super(1);
        this.f26319d = lVar;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "username");
        if (!((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            this.f26319d.invoke(str);
        }
        return C13598b0.f38549a;
    }
}
