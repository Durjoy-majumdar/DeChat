package sp0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import up0.C90721c;

/* renamed from: sp0.l */
public class C90306l {

    /* renamed from: b */
    public static AtomicInteger f259255b = new AtomicInteger(1);

    /* renamed from: a */
    public HashMap<String, C90302k> f259256a = new HashMap<>();

    /* renamed from: sp0.l$b */
    public static class C90308b {

        /* renamed from: a */
        public static C90306l f259257a = new C90306l((C90307a) null);
    }

    public C90306l(C90307a aVar) {
    }

    /* renamed from: a */
    public C90302k mo124542a(String str) {
        if (this.f259256a.containsKey(str)) {
            return this.f259256a.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo124543b(String str) {
        if (!this.f259256a.containsKey(str)) {
            return false;
        }
        C90302k remove = this.f259256a.remove(str);
        synchronized (remove.f259250f) {
            Iterator<C90721c> it = remove.f259250f.iterator();
            while (it.hasNext()) {
                it.next().f260568g = false;
            }
            remove.f259250f.clear();
        }
        return true;
    }
}
