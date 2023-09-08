package er1;

import di3.C86312j;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8808v4;
import java.lang.ref.WeakReference;
import rx3.C13598b0;

/* renamed from: er1.i3 */
public final class C7811i3 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32227p<String, C7840n, C13598b0> f26332d;

    /* renamed from: e */
    public final /* synthetic */ long f26333e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7811i3(C32227p<? super String, ? super C7840n, C13598b0> pVar, long j) {
        super(1);
        this.f26332d = pVar;
        this.f26333e = j;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "topic");
        if (!((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            this.f26332d.invoke(str, new C7840n(this.f26333e, 0, (WeakReference) null, (Boolean) null, 14, (C8480h) null));
        }
        return C13598b0.f38549a;
    }
}
