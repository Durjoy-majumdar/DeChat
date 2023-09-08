package wt0;

import gy3.C87412m;
import java.lang.ref.WeakReference;

/* renamed from: wt0.f */
public final class C78651f implements Runnable {

    /* renamed from: d */
    public final WeakReference<C78650e> f230352d;

    public C78651f(C78650e eVar) {
        C87412m.m108594g(eVar, "toast");
        this.f230352d = new WeakReference<>(eVar);
    }

    public void run() {
        C78650e eVar = this.f230352d.get();
        if (eVar != null) {
            eVar.dismiss();
        }
    }
}
