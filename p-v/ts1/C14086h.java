package ts1;

import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: ts1.h */
public final class C14086h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C14087i f39496d;

    public C14086h(C14087i iVar) {
        this.f39496d = iVar;
    }

    public final void run() {
        C32224a<C13598b0> aVar = this.f39496d.f39498b;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
