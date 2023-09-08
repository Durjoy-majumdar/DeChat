package p170ic;

import android.util.ArrayMap;
import fy3.C32224a;
import gy3.C87412m;
import li0.C88508b;
import li0.C88509c;
import rx3.C13598b0;

/* renamed from: ic.f */
public final class C87692f implements C88509c.C88512b {

    /* renamed from: d */
    public final ArrayMap<C88508b, C32224a<C13598b0>> f253969d = new ArrayMap<>();

    /* renamed from: a */
    public final void mo122119a(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f253969d.put(C88508b.DESTROYED, aVar);
    }

    /* renamed from: b */
    public void mo113102b(String str, C88508b bVar) {
        C32224a aVar;
        if (!(str == null || str.length() == 0) && bVar != null && (aVar = this.f253969d.get(bVar)) != null) {
            aVar.invoke();
        }
    }
}
